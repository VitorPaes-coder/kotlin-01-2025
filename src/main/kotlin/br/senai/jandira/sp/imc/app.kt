package br.senai.jandira.sp.imc

import br.senai.jandira.sp.imc.model.Medico
import br.senai.jandira.sp.imc.model.Paciente
import java.time.LocalDate

fun main() {

    //CRIAR PACIENTE ANA MARIA
//    var paciente1 = Paciente()
//    paciente1.id = 1
//    paciente1.nome = "AnaMaria"
//    paciente1.email = "ana@gmail.com"
//    paciente1.altura = 1.67
//    paciente1.peso = 59
//    paciente1.dataNascimento = LocalDate.of(2001, 8, 13)
//    paciente1.calcularImc()
//    paciente1.mostrarDadosBiometricos()

    //CRIAR PACIENTE PEDRO DE OLIVEIRA
    var paciente2 = Paciente()
    paciente2.id = 2
    paciente2.nome = "SigmaBoy"
    paciente2.email = "whospaes@gmail.com"
    paciente2.altura = 1.94
    paciente2.peso = 70
    paciente2.dataNascimento = LocalDate.of(2007, 12, 23)
    paciente2.calcularImc()
    paciente2.classificarImc()
    paciente2.calcularIdade()
    paciente2.mostrarDadosBiometricos()

    //CRIAR UM OBJETO MÉDICO
    var medico1 = Medico()
    var medico2 = Medico()

    medico1.id = 1
    medico1.nome = "Ronalda Berta"
    medico1.email = "beberta@email.com"
    medico1.especialidade.add("Nutricionista")
    medico1.especialidade.add("Gastroenteologista")
    medico1.exibirFichaMedico()

//    medico2.id = 2
//    medico2.nome = "Thales Magno"
//    medico2.email = "bagre@email.com"
//    medico2.especialidade.addAll("Nutricionista")
}

