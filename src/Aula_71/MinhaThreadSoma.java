package Aula_71;

public class MinhaThreadSoma implements Runnable{

    private String nome;
    private int[] nums;
    private static Calculadora calc = new Calculadora();

    public MinhaThreadSoma(String nome, int[] nums){
        this.nome = nome;
        this.nums = nums;
        // Thread t = new Thread(this,nome);
        // t.start();
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        
        System.out.println(this.nome + " iniciada");

        int soma = calc.somaArray(this.nums);

        System.out.println("Resultado da soma para thread " + 
                            this.nome + " é: " + soma);
        
    }
    
}
