package bicicleta.bicicleta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/bicicletas")
public class BicicletaControler {


    @Autowired
    private BicicletaService bicicletaService;


    // Obtener todas las bicicletas (GET)
    @GetMapping
    public ResponseEntity<List<Bicicleta>> getAllBicicletas() {
        List<Bicicleta> bicicletas = bicicletaService.findAll();
        return new ResponseEntity<>(bicicletas, HttpStatus.OK);
    }


    // Obtener una bicicleta por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Bicicleta> getBicicletaById(@PathVariable Long id) {
        Bicicleta bicicleta = bicicletaService.findById(id);
        return new ResponseEntity<>(bicicleta, HttpStatus.OK);
    }


    // Crear una nueva bicicleta (POST) com retorno de datos
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
public ResponseEntity<Bicicleta> createBicicleta(@ModelAttribute Bicicleta bicicleta) {
    Bicicleta newBicicleta = bicicletaService.save(bicicleta);
    return new ResponseEntity<>(newBicicleta, HttpStatus.CREATED);
}  


    // Actualizar una bicicleta existente (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Bicicleta> updateBicicleta(@PathVariable Long id, @RequestBody Bicicleta bicicleta) {
        Bicicleta updatedBicicleta = bicicletaService.update(id, bicicleta);
        return new ResponseEntity<>(updatedBicicleta, HttpStatus.OK);
    }


    // Eliminar una bicicleta por ID (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBicicleta(@PathVariable Long id) {
        bicicletaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    // Creando la interfaz web
    public BicicletaControler(BicicletaService bicicletaService) {
        this.bicicletaService = bicicletaService;
    }


    @GetMapping("/listado-bicicletas")
    public String listarBicicletas(Model model) {
        List<Bicicleta> bicicletas = bicicletaService.findAll();
        model.addAttribute("bicicletas", bicicletas);
        model.addAttribute("bicicleta", new Bicicleta()); // Añade esta línea
        return "listado-bicicletas";
    }


}
