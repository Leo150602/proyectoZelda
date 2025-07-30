import {consumirApi, mirarDatos, buscarYMostrar, buscarTodos} from "./consumoServicio.js"

let campos = document.querySelectorAll(".campos")

let btnFormulario = document.getElementById("btnFormulario")

btnFormulario.addEventListener("click",(evento)=>{

  evento.preventDefault()

  let datosEnviarBack = {}
  campos.forEach(campo => {
    
    if (campo.type === "radio") {
      if (campo.checked) {
        if (campo.value === "si"){
          datosEnviarBack[campo.name] = "true"
        } else {datosEnviarBack[campo.name] = "false"}
        
      }
    } else {
      datosEnviarBack[campo.name] = campo.value
    }
  });
  
  let datosListosEnviar = JSON.stringify(datosEnviarBack)

  let v0 = false
  let faltantes =[]
  campos.forEach(campo => {

    if (campo.value != ""){
      
    

    }else{
      v0 = true
      faltantes.push(campo.placeholder)
    }
    
  });

  if (v0) {

    let texto = (faltantes.length == 1)? "te falta rellenar el campos campo -> "+ faltantes[0] : "te falta rellenar los campos campo -> "+ faltantes.join(", ")
    Swal.fire({
      icon: "error",
      title: "Oops...",
      text: texto,
      footer: '<a href="#">Why do I have this issue?</a>'
    }); 
  }else{
    Swal.fire({
      title: "Good job!",
      text: "You clicked the button!",
      icon: "success"
    });
    consumirApi(datosListosEnviar).then(function (respuesta){
      
    })
  }

  
 
})

let listaP = document.getElementById("listaPersonajes")
let btnNavbar = document.getElementById("btnNavbar")

btnNavbar.addEventListener("click", ()=>{

  listaP.innerHTML = ""

  buscarTodos().then(personajes =>{

    personajes.forEach(personaje =>{

      let divPersonaje = document.createElement("div")
      divPersonaje.textContent = personaje.nombre
      divPersonaje.classList.add("divPersonaje")
      listaP.appendChild(divPersonaje)

    })
    let seleccionPersonaje = document.querySelectorAll(".divPersonaje")

    seleccionPersonaje.forEach(divPersonaje =>{
      divPersonaje.addEventListener("click", ()=>{
  
        let contenedorInformacion = document.getElementById("contenedorInformacion")
        let informacionPersonaje = document.getElementById("informacionPersonaje")

        contenedorInformacion.style.display = "block"

        personajes.forEach(personaje =>{
        
          if(personaje.nombre == divPersonaje.textContent){

            document.getElementById("fotoPersonaje").textContent = personaje.fotografia
            document.getElementById("infoNombre").textContent = personaje.nombre
            document.getElementById("infoVida").textContent = "vida: " + personaje.cantidadVida
            document.getElementById("infoAtaque").textContent = "ataque: " + personaje.cantidadAtaque
            document.getElementById("infoDefensa").textContent = "defensa: " + personaje.cantidadDefensa
            document.getElementById("infoCategoria").textContent = "categoria: " + personaje.categoria
            if(personaje.continuaVivo){
              document.getElementById("infoEstado").textContent = "continua con vida"

            }else{
              document.getElementById("infoEstado").textContent = "se murioooo"
            }

          }

        })

        document.getElementById("btnSalir").addEventListener("click", ()=>{
          contenedorInformacion.style.display = "none"
        })
  
      })
    })


  })
   
  

  

})



