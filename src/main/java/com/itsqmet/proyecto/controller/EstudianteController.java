package com.itsqmet.proyecto.controller;

import com.itsqmet.proyecto.model.Estudiante;
import com.itsqmet.proyecto.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping("/estudiantes")
    public String mostrarTodosLosEstudiantes(Model model){
        model.addAttribute("estudiantes", estudianteService.mostrarEstudiantes());
        return "/Estudiante/listar_estudiante";
    }

    @GetMapping("/estudiantes/nuevo")
    public String obtenerTodosLosEstudiante(Model model){
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudianteService.guardarEstudiante(estudiante));
        return "/Estudiante/agregar_estudiante";
    }

    @PostMapping("/estudiantes")
    public String guardarEstudiantes(@ModelAttribute("estudiantes") Estudiante estudiante){
        estudianteService.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/editar/{id}")
    public String editarEstudiantes(@PathVariable Integer id, Model model){
        estudianteService.obtenerPorId(id);
        return "/Estudiante/editar_estudiante";
    }

    @PostMapping("estudiantes/editar/{id}")
    public String actualizarEstudiantes(@PathVariable Integer id, @ModelAttribute("estudiante") Estudiante estudiante, Model model){
        estudianteService.obtenerPorId(id);
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre(estudiante1.getNombre());
        estudiante1.setApellido(estudiante1.getApellido());
        estudiante1.setCorreo(estudiante1.getCorreo());
        estudiante1.setFecha_nacimiento(estudiante1.getFecha_nacimiento());
        estudianteService.actualizarEstudiante(estudiante1);
        return "redirect/:estudiantes";
    }

    @GetMapping("/estudiantes/{id}")
    public String eliminarEstudiantes(@PathVariable Integer id){
        estudianteService.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }


}
