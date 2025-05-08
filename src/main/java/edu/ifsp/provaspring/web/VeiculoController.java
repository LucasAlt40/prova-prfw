package edu.ifsp.provaspring.web;

import edu.ifsp.provaspring.model.Veiculo;
import edu.ifsp.provaspring.persistence.VeiculoRepositorio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/veiculo")
public class VeiculoController {

    private VeiculoRepositorio veiculoRepositorio;

    public VeiculoController(VeiculoRepositorio veiculoRepositorio) {
        this.veiculoRepositorio = veiculoRepositorio;
    }

    @ModelAttribute(name = "veiculo")
    public Veiculo veiculo(){
        return new Veiculo();
    }

//    @GetMapping("/listar")


    @GetMapping("/cadastrar")
    public String cadastrar(Model model){

        Veiculo veiculo = new Veiculo();
        model.addAttribute("veiculo", veiculo);

        return "cadastrar_veiculo";

    }




}

