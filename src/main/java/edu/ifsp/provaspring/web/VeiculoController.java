package edu.ifsp.provaspring.web;

import edu.ifsp.provaspring.model.Veiculo;
import edu.ifsp.provaspring.persistence.VeiculoRepositorio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/veiculo")
public class VeiculoController {

    private VeiculoRepositorio veiculoRepositorio;

    public VeiculoController(VeiculoRepositorio veiculoRepositorio) {
        this.veiculoRepositorio = veiculoRepositorio;
    }



    @GetMapping("/cadastrar")
    public String cadastrar(Model model){

        return "cadastrar_veiculo";

    }

    @PostMapping
    public String addVeiculo(Veiculo veiculo){

        veiculoRepositorio.save(veiculo);
        return "cadastrar_veiculo";
    }





}

