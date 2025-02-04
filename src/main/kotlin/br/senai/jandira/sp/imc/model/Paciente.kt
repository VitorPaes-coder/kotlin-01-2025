package br.senai.jandira.sp.imc.model

import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {

    var id: Int = 0
    var nome: String = ""
    var dataNascimento: LocalDate? = null
    var email: String = ""
    var peso: Int = 0
    var altura: Double = 0.0
    var imc: Double = 0.0
    var classicacaoImc: String = ""
    fun calcularImc(){
        imc = peso / altura.pow(2)
    }

    fun mostrarDadosBiometricos(){
        println("//------------------------------------- ")
        println("  DADOS DO PACIENTE")
        println(" -------------------------------------")
        println("  Nome: $nome")
        println("  Idade: ${calcularIdade()}")
        println("  Peso: $peso")
        println("  Altura: $altura")
        println("  IMC: $imc")
        println("  Classificação IMC: $classicacaoImc")
        println("--------------------------------------// ")

    }

    fun classificarImc(){
        if (imc <= 18.5) {
            classicacaoImc = "Abaixo do peso"
        }else if(imc > 18.5 && imc < 25){
            classicacaoImc = "Peso ideal"
        }else{
            classicacaoImc = "Acima do peso"
        }
    }

    fun calcularIdade(): Int{

        return Period.between(dataNascimento, LocalDate.now()).years
    }
}
