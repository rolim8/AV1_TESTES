package Modulo2;

public class Calculadora {

    public int somar(String exprressao){
        int soma =0;
        for (String valorSomar: exprressao.split("\\+"))
            soma+= Integer.valueOf(valorSomar);

        return soma;
    }

    public int somar02(String exprressao){
        int soma1 = 1;
        for (String valSomar: exprressao.split("\\+"))
            soma1+= Integer.valueOf(valSomar);

        return soma1;

    }

    public int somar03(String exprressao){
        int soma3 = 5*5;
        for (String valSomar: exprressao.split("\\+"))
            soma3+= Integer.valueOf(valSomar);

        return soma3;

    }

    public int somar04(String exprressao){
        int soma4 = (100/5)+25;
        for (String valSomar: exprressao.split("\\+"))
            soma4+= Integer.valueOf(valSomar);

        return soma4;

    }


}
