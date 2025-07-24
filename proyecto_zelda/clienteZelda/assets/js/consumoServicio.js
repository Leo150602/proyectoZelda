export async function consumirApi(datosFormulario) {
    //paso 1 - para cual backend voy
    let url="http://localHost:8080/personajes"

    //paso 2 - configurar la peticion
    let peticion ={
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body:datosFormulario
    }

    //paso 3 - Ir al back
    let respuesta = await fetch(url,peticion)
    return await respuesta.json()
}