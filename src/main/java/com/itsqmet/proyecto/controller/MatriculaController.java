package com.itsqmet.proyecto.controller;

import com.itsqmet.proyecto.model.Matricula;
import com.itsqmet.proyecto.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MatriculaController {

    @Autowired
    private IMatriculaService matriculaService;

    @GetMapping("/matriculas")
    public String listarMatriculas(Model model){
        model.addAttribute("matriculas", matriculaService.mostrarMatriculas());
        return "/Matricula/listar_matricula";
    }

    @GetMapping("/matriculas/nuevo")
    public String mostrarMatriculas(Model model){
        Matricula matricula = new Matricula();
        model.addAttribute("matricula", matricula);
        return "/Aula/agregar_aula";
    }

    @PostMapping("/matriculas")
    public String guardarMatricula(@ModelAttribute("matriculas") Matricula matricula){
        matriculaService.guardarMatricula(matricula);
        return "redirect:/matriculas";
    }

    @GetMapping("/matriculas/editar/{id}")
    public String editarMatricula(@PathVariable Integer id, Model model){
        model.addAttribute("matricula", matriculaService.obtenerPorId(id));
        return "/Matricula/editar_matricula";
    }

    @PostMapping("/matriculas/{id}")
    public String actualizarMatricula(@PathVariable Integer id, @ModelAttribute("matricula") Matricula matricula, Model model){
        Matricula matricula1 = new Matricula();
        matricula1.setFechaMatricula(matricula1.getFechaMatricula());
        matricula1.setEstudiante(matricula1.getEstudiante());
        return "redirect:/matriculas";

    }

    @GetMapping("/matriculas/{id}")
    public String eliminarMatricula(@PathVariable Integer id){
        matriculaService.eliminarMatricula(id);
        return "redirect:/matriculas";
    }
}
