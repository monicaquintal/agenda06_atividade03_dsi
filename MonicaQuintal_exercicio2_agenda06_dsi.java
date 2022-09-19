package monicaquintal_exercicio2_agenda06_dsi;

import java.util.Scanner;

public class MonicaQuintal_exercicio2_agenda06_dsi {

    public static void main(String[] args) {
        // atribuição das variáveis
        String numeroVoo;
        float peso1;
        float peso2;
        float peso3;
        float peso4;
        float peso5;
        float peso6;
        float peso7;
        float peso8;
        float peso9;
        float peso10;
        float pesoTotal;
        float mediaPeso;
        
        //habilitando o leitor
        Scanner leitor = new Scanner(System.in);
        
        //início do programa
        System.out.println("Cálculo das bagagens a serem despachadas:");
        
        System.out.println("Insira o número do seu voo: ");
        //leitura do número do voo (como String)
        numeroVoo = leitor.next();
        
        System.out.println("Digite o peso da bagagem 1: ");
        //leitura do primeiro valor (todos permitirão o uso de casas decimais)
        peso1 = leitor.nextFloat();
        
        System.out.println("Digite o peso da bagagem 2: ");
        //leitura do segundo valor
        peso2 = leitor.nextFloat();
        
        System.out.println("Digite o peso da bagagem 3: ");
        //leitura do terceiro valor
        peso3 = leitor.nextFloat();
        
        System.out.println("Digite o peso da bagagem 4: ");
        //leitura do quarto valor
        peso4 = leitor.nextFloat();
        
        System.out.println("Digite o peso da bagagem 5: ");
        //leitura do quinto valor
        peso5 = leitor.nextFloat();
        
        System.out.println("Digite o peso da bagagem 6: ");
        //leitura do sexto valor
        peso6 = leitor.nextFloat();
        
        System.out.println("Digite o peso da bagagem 7: ");
        //leitura do sétimo valor
        peso7 = leitor.nextFloat();
        
        System.out.println("Digite o peso da bagagem 8: ");
        //leitura do oitavo valor
        peso8 = leitor.nextFloat();
        
        System.out.println("Digite o peso da bagagem 9: ");
        //leitura do nono valor
        peso9 = leitor.nextFloat();
        
        System.out.println("Digite o peso da bagagem 10: ");
        //leitura do décimo valor
        peso10 = leitor.nextFloat();
                
        //processamento
        pesoTotal = peso1 + peso2 + peso3 + peso4 + peso5 + peso6 + peso7 + peso8 + peso9 + peso10;
        mediaPeso = pesoTotal/10;
        
        //saída de dados
        System.out.println("O peso total das bagagens é: " + pesoTotal);
        System.out.println("O peso médio das bagagens é: " + mediaPeso);
        System.out.println("O número do seu voo é: " + numeroVoo);
        
    }
    
}
