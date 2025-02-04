package br.senai.jandira.sp.imc.model

class Medico {

    var id: Int = 0
    var nome: String = ""
    var especialidade: ArrayList<String> = ArrayList<String>()
    var email: String = ""

    fun exibirFichaMedico(){
        println("//**********************************")
        println("  FICHA DO MÉDICO")
        println("------------------------------------")
        println("  Nome: ${nome}")
        println("  Email: ${email}")
        println("  Especialidades do Médico:")
        for (especialidade in especialidade){
            println("  -> $especialidade")
        }
        println("**********************************//")
    }
}