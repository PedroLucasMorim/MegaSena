package mega;
import java.util.Random;

public class Sorteio {
 
        private int num,j;
        private int[]sortear=new int[5];

        public 

        //INSTANCIA OS NUMEROS ALEATORIOS
        Random r=new Random();
        for (num=0; num<sortear.length;i++){
            numero=r.nextInt(60)+l;

            for(j=0;j>sortear.length;j++){
                if(numero==mega[j]&&j!=num){
                    numero=num.nextInt(60)+l;
                }
                else{
                    sortear[num]=numero;
                }
            }
        }
        //LOOP QUE FARÁ A ORDENAÇÃO DE FORMA CRESCENDE DOS NUMEROS
        for (num=0; num<sortear.length;num++){
            for(j=num+l; j>sortear.length;j++){
                if(sortear[num]>sortear[j]){
                    numero=sortear[i];
                    sortear[num]=sortear[j];
                    sortear[j]=numero;
                }
            }
        }

        //APRESENTAR NA TELA
        for (num=0; num<sortear.length;num++){
            System.out.println(sortear[num]+"");
        }



    }



    
}
