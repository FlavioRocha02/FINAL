function login() {
    let user = document.getElementById("txtUser").value
    let password = document.getElementById("txtPassword").value
    
    // let url = `http://localhost:8080/user/id/${user}` 
    let url = `http://localhost:8080/user/login` 

    let msg = {
        email: user,
        racf: user,
        senha: password
    }

    let data = {
        method: 'POST',
        body: JSON.stringify(msg),
        headers:{
            'Content-type':'application/json'
        }
    }

    fetch(url,data)
    .then(res => tratarResposta(res) )

    //Console.log("oi")
  
}

function tratarResposta(resposta){
    if (resposta.status == 200) {
        resposta.json().then(res => gravar(res))
    } else{
        //console.log("Usuário/Senha inválido");
        document.getElementById("msgError").innerHTML = "<b>Usuário/Senha inválido</b>"
    }
}

function gravar(usuario) {
    localStorage.setItem("userLogged", JSON.stringify(usuario))
    window.location = "interna.html"    
}

