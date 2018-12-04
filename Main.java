package com.ocr.gaelle;

import java.util.Random;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner reader = new Scanner (System.in);
            int i,chosen,counter=0;
            Random gen = new Random();
            int name[]={1,2,3,4,5,6,7,8,9,10};
            int name2[]={1,2,3,4,5,6,7,8,9,10};

            boolean use1 []={false,false,false,false,false,false,false,false,false,false};
            boolean use2 []={false,false,false,false,false,false,false,false,false,false};
            while(counter != 10){
                boolean x = false;
                while(!x){
                    chosen = gen.nextInt(10);
                    if(use1[chosen]==false){
                        System.out.println(name[chosen]);
                        use1[chosen]=true;
                        use2[chosen]=true;
                        chosen = gen.nextInt(10);
                        x = true;
                    }
                }

                boolean f = false;
                while(!f){
                    chosen = gen.nextInt(10);
                    if(use2[chosen]==false){
                        System.out.println("with ");

                        System.out.println(name2[chosen]);
                        System.out.println("--------------- ");
                        use1[chosen]=true;
                        use2[chosen]=true;
                        counter++;
                        chosen = gen.nextInt(10);
                        f = true;
                    }


                }
            }
        }
}

