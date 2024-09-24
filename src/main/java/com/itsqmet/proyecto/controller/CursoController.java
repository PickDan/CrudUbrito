package com.itsqmet.proyecto.controller;

import com.itsqmet.proyecto.model.Aula;
import com.itsqmet.proyecto.model.Curso;
import com.itsqmet.proyecto.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CursoController {

    @Autowired
    private ICursoService cursoService;

    @GetMapping("/cursos")
    public String listarLosCursos(Model model){
        model.addAttribute("cursos", cursoService.mostrarCursos());
        return "/Cursos/listar_curso";
    }

    @GetMapping("/curso/nuevo")
    public String mostrarTodosCursos(Model model){
        Curso curso = new Curso();
        model.addAttribute("curso", curso);
        return "/Curso/agregar_curso";
    }

    @PostMapping("/cursos")
    public String guardarCurso(@ModelAttribute("cursos") Curso curso){
        cursoService.guardarCurso(curso);
        return "redirect:/cursos";
    }

    @GetMapping("/cursos/editar/{id}")
    public String editarCurso(@PathVariable Integer id, Model model){
        model.addAttribute("curso", cursoService.obtenerPorId(id));
        return "/Aula/editar_curso";
    }

    @PostMapping("/cursos/{id}")
    public String actualizarCurso(@PathVariable Integer id, @ModelAttribute("curso") Curso curso, Model model){
        Curso curso1 = cursoService.obtenerPorId(id);
        curso1.setId(id);
        curso1.setCursoNombre(curso1.getCursoNombre());
        curso1.setDescripcion(curso1.getDescripcion());
        cursoService.actualizarCurso(curso1);
        return "redirect:/aulas";

    }

    @GetMapping("/cursos/{id}")
    public String eliminarCursp(@PathVariable Integer id){
        cursoService.eliminarCurso(id);
        return "redirect:/aulas";
    }
}
