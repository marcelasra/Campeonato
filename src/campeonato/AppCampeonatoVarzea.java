package campeonato;

import java.util.Scanner;

public class AppCampeonatoVarzea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time time = new Time();
        System.out.println("BEM VINDO AO MENU \n");
        System.out.println("O que vocÊ deseja fazer?\n[1] - cadastrar times\n[2] - ver status do time\n[3] - ver apresentação de um time\n[4] - ver a execução um jogo\n[5] - sair");
        int op = sc.nextInt();
        switch (op) {

            case 1:
               
                System.out.println("Quantos times você deseja cadastrar? ");
                int timesCadastro = sc.nextInt();
                Time t[] = new Time[timesCadastro];
                time.CadastrarTime(t);

            case 2:
                System.out.println("Qual status vc deseja buscar? ");
                
                time.CadastrarTime(t);
        }

        //t[0] = new Time("Santa Peba", "Sao Paulo", "SP", 1998, 0, 0, 0, 11);
        //t[1] = new Time("Cumbitas", "Osasco", "SP", 2001, 0, 0, 0, 12);
        //t[2] = new Time("Belisco", "Itú", "SP", 2003, 0, 0, 0, 8);
        //t[3] = new Time("Bazucas", "Cunha", "SP", 2010, 0, 0, 0, 10);
        //Jogo jg = new Jogo();
        //jg.marcarJogo(t[0], t[3]);
        //jg.jogar();
        //for (Time time : t) {
        //    time.status();
        //}
    }

}
