let nombre = document.getElementById("nombre")
let cantidadVida = document.getElementById("vida")
let poderDeDefensa = document.getElementById("defensa")
let poderDeAtaque = document.getElementById("ataque")
let fotografia = document.getElementById("fotografia")
let fechaCreacion = document.getElementById("fecha")

let btnFormulario = document.getElementById("btnFormulario")

btnFormulario.addEventListener("click",(evento)=>{
evento.preventDefault()
/*Swal.fire({
  title: "Good job!",
  text: "You clicked the button!",
  icon: "success"
})
  
Swal.fire({
  icon: "error",
  title: "Oops...",
  text: "Something went wrong!",
  footer: '<a href="#">Why do I have this issue?</a>'
});*/

let datosEnviarBack ={
    "nombre":nombre.value,
    "cantidadVida":cantidadVida.value,
    "poderAtaque":poderDeAtaque.value,
    "poderDefensa":poderDeDefensa.value,
    "fotografia":fotografia.value,
    "fechaCreacion":fechaCreacion.value
}

let datosListosEnviar = JSON.stringify(datosEnviarBack)
})