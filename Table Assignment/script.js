let tableContainer = document.querySelector("#table-container");

let table = document.createElement("table");

tableContainer.appendChild(table);

let tableHeadings = ["Title","Año","Genero"];

let arrayOfMovies = [

    {
        title: "Pritatas del Caribe",
        año: 2003,
        genero: "Misterio"

    },

    {
        title: "Titanic",
        año: 2001,
        genero: "Drama"
    },

    {
        title: "Lalalan",
        año: 2011,
        genero: "Drama"
    },

    {
        title: "Avengers",
        año: 2008,
        genero: "Ciencia-Ficion"
    },

    {
        title: "Yo antes de ti",
        año: 2016,
        genero: "Drama-Romance"
    }
];

function createHeading(){
    let tr = document.createElement("tr");
    for (let i = 0 ;  i < tableHeadings.length; i++){
        let th = document.createElement("th");
        th.textContent = tableHeadings[i];
        tr.appendChild(th);
    }

    table.appendChild(tr);
}

createHeading();

function createData(){
    for (let i = 0; i < arrayOfMovies.length; i++){

        let tr = document.createElement("tr");

        let td1 = document.createElement("td");

        tr.appendChild(td1);

        td1.textContent = arrayOfMovies[i].title;

        let td2 = document.createElement("td");

        tr.appendChild(td2);

        td2.textContent = arrayOfMovies[i].año;

        let td3 = document.createElement("td");

        td3.textContent = arrayOfMovies[i].genero;

        tr.appendChild(td3);

        table.appendChild(tr);
    }
}

createData();