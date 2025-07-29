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
  console.log(datosListosEnviar)

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

  buscarTodos().then(personajes =>{

    personajes.forEach(personaje => {
      console.log(personaje.nombre)
      console.log(personaje.categoria)
    })
  })
    
})

