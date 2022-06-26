package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j//Agregamos la notación Slf4j(solo funciona con lombook)para enviar información al log
@RestController//RestControler la grega al contenedor de spring y no permite utilizar esta clase dentro de Spring
public class ControladorInicio {
    @GetMapping("/")//Responde al puerto 8080
    public String controlador(){
        log.info("Ejecutando el controlador REST");
        return "Hola Mundo con spring";
    }
}
