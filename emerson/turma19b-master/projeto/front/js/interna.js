
function validaLogin() {
    let userTxt = localStorage.getItem("userLogged")

    if(!userTxt) {
        window.location = "index.html"
    }

    let user = JSON.parse(userTxt)

    document.getElementById("dadosUser").innerHTML = `${user.nome} (${user.racf})`

    listarUser()
}

function logout() {
    localStorage.removeItem("userLogged")
    window.location = "index.html"
}

function listarUser() {
    let url = `http://localhost:8080/user/all` 

    fetch(url)
    .then(res => res.json())
    .then(res => exibirLista(res))
}


function exibirLista(lista) {
    let tabela = "<table> <tr> <th>Nome</th> <th>email</th> </tr>"

    for(i=0; i < lista.length ; i++) {
        tabela += `<tr> <td>${lista[i].nome}</td> <td>${lista[i].email}</td> </tr>`
    }

    tabela += "</table>"
    document.getElementById("tabela").innerHTML = tabela
}

function gerarRelatorioEventos(pg) {

    let dataini = document.getElementById("dtinicio").value;
    let datafim = document.getElementById("dtfinal").value;

    let dataMsg = {
        dt1: dataini,
        dt2: datafim,
        pg: pg
    }

    let msg = {
        method: 'POST',
        body: JSON.stringify(dataMsg),
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch("http://localhost:8080/evento/data", msg)
        .then(res => res.json())
        .then(res => preencheEventos(res));
}


function preencheEventos(res) {
    // console.log(res);
    let tabelaEventos = '<table class="table table-sm"> <tr> <th>ID</th> <th>Data</th> </tr>';

    for (i = 0; i < res.length; i++) {
        let dataAtual = new Date(res[i].dataevt).toLocaleDateString("pt-BR", { timeZone: 'UTC' })

        tabelaEventos = tabelaEventos + `<tr> 
                            <td> ${res[i].id} </td> 
                            <td> ${dataAtual} </td> 
                        </tr>`;
    }

    tabelaEventos += '</table>';
    document.getElementById("tabelaEV").innerHTML = tabelaEventos;

}