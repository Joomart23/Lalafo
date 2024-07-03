package aa;

import datadava.Datadava;
import servic.servicimpl.Announementimpl;
import servic.servisddao.servisimpldao.Announementimldao;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Datadava datadava =  new Datadava();
        Announementimldao announementimldao = new Announementimldao(datadava);
        Announementimpl announementimpl =  new Announementimpl(datadava,announementimldao);
        while (true){
            System.out.println("""
                   1: Announcement
                   2: Faverite
                   3: User""");
            switch (new Scanner(System.in).nextInt()){
                case 1->{
                    System.out.println("""
                           1: getAll
                           2: deleteByPrice
                           3: updateById
                           4: updateByAnnouncement
                           5: addAnnouncement                          
                            """);
                    switch (new Scanner(System.in).nextInt()){
                        case 1->{
                            System.out.println(announementimpl.getAll());
                        }
                        case 2->{
                            System.out.println("басын очуруп салсаныз болот");
                            int price = new Scanner(System.in).nextInt();
                            System.out.println(announementimpl.deleteByPrice(price));
                        }
                        case 3->{
                            System.out.println("жарияны озгортуу");


                        }
                    }
                }
            }

        }


    }
}