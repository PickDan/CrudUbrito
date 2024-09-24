package com.itsqmet.proyecto.controller;


import com.itsqmet.proyecto.model.Aula;
import com.itsqmet.proyecto.service.IAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AulaController {
    @Autowired
    private IAulaService aulaService;

    @GetMapping("/aulas")
    public String listarAulas(Model model){
        model.addAttribute("aulas", aulaService.mostrarAulas());
        return "/Aula/listar_aula";
    }

    @GetMapping("/aulas/nuevo")
    public String mostrarAulas(Model model){
        Aula aula = new Aula();
        model.addAttribute("aula", aula);
        return "/Aula/agregar_aula";
    }

    @PostMapping("/aulas")
    public String guardarAula(@ModelAttribute("aulas") Aula aula){
        aulaService.guardarAula(aula);
        return "redirect:/aulas";
    }

    @GetMapping("/aulas/editar/{id}")
    public String editarAula(@PathVariable Integer id, Model model){
        model.addAttribute("aula", aulaService.obtenerPorId(id));
        return "/Aula/formulario_aula";
    }

    @PostMapping("/aulas/{id}")
    public String actualizarAula(@PathVariable Integer id, @ModelAttribute("aula") Aula aula, Model model){
        Aula aula1 = aulaService.obtenerPorId(id);
        aula1.setId(id);
        aula1.setNombreAula(aula.getNombreAula());
        aula1.setCapacidad(aula.getCapacidad());
        aulaService.actualizarAula(aula1);
        return "redirect:/aulas";

    }

    @GetMapping("/aulas/{id}")
    public String eliminarAula(@PathVariable Integer id){
        aulaService.eliminarAula(id);
        return "redirect:/aulas";
    }



    //@PostMapping("/aulas/{id}")
}
