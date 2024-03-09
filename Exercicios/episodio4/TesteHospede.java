package Exercicios.episodio4;

import java.util.Date;

public class TesteHospede {

    public static void main(String[] args) {
        Hospede felipe = new Hospede();
        felipe.setNome("Felipe");
        felipe.setSobrenome("Correia");
        String nome_e_sobrenome = felipe.getNome() + " " + felipe.getSobrenome();

        System.out.println(nome_e_sobrenome);

        Date data = new Date();
    }
}
