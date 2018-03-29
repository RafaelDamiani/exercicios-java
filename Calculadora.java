public class Calculadora {
    public static void main (String[] args) {
        float num1 = Float.parseFloat(args[0]);
        String operador = args[1];
        float num2 = Float.parseFloat(args[2]);
        switch (operador)
        {
            case "+":
                  System.out.println (num1+num2);
                  break;
            case "-":
                  System.out.println (num1-num2);
                  break;
            case "x":
                  System.out.println (num1*num2);
                  break;
            case "/":
                  System.out.printf ("%.2f",num1/num2);
                  break;
        }
    }
}
