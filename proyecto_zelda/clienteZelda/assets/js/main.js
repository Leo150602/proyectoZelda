import {consumirApi} from "./consumoServicio.js"

let nombre = document.getElementById("nombre")
let cantidadVida = document.getElementById("vida")
let poderDeDefensa = document.getElementById("defensa")
let poderDeAtaque = document.getElementById("ataque")
let fotografia = document.getElementById("fotografia")
let fechaCreacion = document.getElementById("fecha")

let btnFormulario = document.getElementById("btnFormulario")

btnFormulario.addEventListener("click",(evento)=>{
evento.preventDefault()

  


let datosEnviarBack ={
    "nombre":nombre.value,
    "cantidadVida":cantidadVida.value,
    "cantidadAtaque":poderDeAtaque.value,
    "cantidadDefensa":poderDeDefensa.value,
    "fotografia":fotografia.value,
    "fechaCreacion":fechaCreacion.value
}

let datosListosEnviar = JSON.stringify(datosEnviarBack)
let nombreCampo
let v0=true
if (nombre.value != ""){
  if (cantidadVida.value != "") {
    if (poderDeAtaque.value != "") {
      if (poderDeDefensa.value != "") {
        if (fotografia.value != "") {
          if (fechaCreacion.value != "") {
            v0 = false
            consumirApi(datosListosEnviar)
            .then(function (respuesta) {
              Swal.fire({
                title: "Good job!",
                text: "You clicked the button!",
                icon: "success"
              })
              
            })
          } else nombreCampo = "fecha de creacion del personaje"
        } else nombreCampo = "fotografia del personaje"
      } else nombreCampo = "defensa del personaje"
    }else nombreCampo = "ataque del personaje"
  }else nombreCampo = "vida del personaje"
}else nombreCampo = "nombre del personaje"
  if (v0) {
    
    Swal.fire({
      icon: "error",
      title: "Oops...",
      text: "te falta rellenar el campo - "+ nombreCampo,
      footer: '<a href="#">Why do I have this issue?</a>'
    });
  }
})

