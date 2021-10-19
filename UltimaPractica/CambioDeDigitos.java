
/**
 * Dariel tiene un alter ego, el cual se llama Danilo. Son dos personalidades 
totalmente opuestas, como si uno fuera la personalidad invertida del otro. 
Dariel observo que estotambién puede pasar en los números.  

 * Dado un numero entero N, indicar el número que resulta de invertir N.
 * 
 * Ejemplo 1
Entrada:
E1: 12345   E2: 4   
Respuesta:
“51234, 45123, 34512, 23451”
 */
public class CambioDeDigitos
{
    public String resultado(int numero, int invertir){
        int exp=contDig(numero)-1;
        String res="";
        for(int i=0;invertir>i;i++){
            int dig=numero%10;
            int aux=dig*(int)Math.pow(10,exp);
            numero=numero/10;
            numero=aux+numero; 
            res+=numero+",";//concatenar
        }
        return res;
    }

    private int contDig(int num){
        int cont=0;
        while(num!=0){
            num=num/10;
            cont++;
        }
        return cont; 
    }
}
