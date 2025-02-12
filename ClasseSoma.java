package Soma;
 
public class ClasseSoma {
    public ClasseSoma() {super();}
    public int soma(int N2)
    {
         //Condição de parada
         if (N2 <= 0)// irá verificar se o número solicitado é menor ou igual ao mínimo para solucionar o problema proposto.
         {
              return 0;
         }
         else
         {
             return N2 + soma(N2 - 1);//Irá somar o valor atribuído em N2 com seus números anteriores
         }
    }
}