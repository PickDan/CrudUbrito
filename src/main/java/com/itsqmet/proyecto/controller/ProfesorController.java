package com.itsqmet.proyecto.controller;

import com.itsqmet.proyecto.model.Matricula;
import com.itsqmet.proyecto.model.Profesor;
import com.itsqmet.proyecto.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfesorController {

    @Autowired
    private IProfesorService profesorService;

    @GetMapping("/profesores")
    public String listarProfesores(Model model){
        model.addAttribute("profesores", profesorService.mostrarProfesor());
        return "/Profesor/listar_profesor";
    }

    @GetMapping("/profesores/nuevo")
    public String mostrarProfesores(Model model){
        Profesor profesor = new Profesor();
        model.addAttribute("profesor", profesor);
        return "/Profesor/agregar_profesor";
    }

    @PostMapping("/profesores")
    public String guardarProfesores(@ModelAttribute("profesores") Profesor profesor){
        profesorService.guardarProfesor(profesor);
        return "redirect:/profesores";
    }

    @GetMapping("/profesores/editar/{id}")
    public String editarProfesor(@PathVariable Integer id, Model model){
        model.addAttribute("profesor", profesorService.obtenerPorId(id));
        return "/Matricula/editar_profesor";
    }

    @PostMapping("/profesores/{id}")
    public String actualizarProfesor(@PathVariable Integer id, @ModelAttribute("profesor") Profesor profesor, Model model){
        Profesor profesor1 = new Profesor();
        profesor1.setNombre(profesor1.getNombre());
        profesor1.setApellido(profesor1.getApellido());
        profesor1.setCorreo(profesor1.getCorreo());
        profesor1.setEspecializacion(profesor1.getEspecializacion());
        return "redirect:/profesores";

    }

    @GetMapping("/profesores/{id}")
    public String eliminarProfesor(@PathVariable Integer id){
        profesorService.eliminarProfesor(id);
        return "redirect:/profesores";
    }
}
