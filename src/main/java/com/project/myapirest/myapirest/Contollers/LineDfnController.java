package com.project.myapirest.myapirest.Contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.myapirest.myapirest.Repositories.LineDfnRepository;
import com.project.myapirest.myapirest.Entities.LineDfn;
import com.project.myapirest.myapirest.Entities.Producto;

@RestController
@RequestMapping("/lines")
public class LineDfnController {

    @Autowired
    private LineDfnRepository lineDfnRepository;

    @GetMapping
    public List<LineDfn> obtenerProductos() {
        return lineDfnRepository.findAll();
    }

    @GetMapping("/{id}")
    public LineDfn obtenerProductoPorId(@PathVariable Long id) {
        return lineDfnRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el producto con el ID: " + id));
    }

    @PostMapping
    public LineDfn crearProducto(@RequestBody LineDfn lineDfn) {
        return lineDfnRepository.save(lineDfn);
    }
    @DeleteMapping("/{id}")
  
    public String LineDfn(@PathVariable Long id) {
        LineDfn lineDfn = lineDfnRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el producto con el ID: " + id));

                lineDfnRepository.delete(lineDfn);
        return "El producto con el ID: " + id + " fue eliminado correctamente";
    }


}