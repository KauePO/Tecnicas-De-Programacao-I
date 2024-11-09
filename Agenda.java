import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Agenda{
    public static void salvar(String arquivo, String conteudo, boolean adicionar) throws IOException {
        FileWriter fw = new FileWriter(arquivo, adicionar);
        fw.write(conteudo);
        fw.close();
    }
    public static String ler(String arquivo) throws FileNotFoundException, IOException{
        File file = new File(arquivo);
        if (!file.exists()) return null;
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String saida= "";
        String linha;
        while((linha = br.readLine()) != null) {
            saida += linha+"\n";
        }
        br.close();
        return saida;
    }
    public static void alterar(String arquivo, String nomeAntigo, String nomeNovo, String telefoneNovo) throws FileNotFoundException, IOException{
        File file = new File(arquivo);
        if (!file.exists()){
            System.out.println ("Arquivo não encontrado");
        };
        BufferedReader br2 = new BufferedReader(new FileReader(arquivo));
        ArrayList<String> linhas = new ArrayList<>();
        String temp;
        while((temp = br2.readLine()) !=null) {
            if (temp.contains(nomeAntigo)) {
                linhas.add(nomeNovo + "\n" + telefoneNovo+ "\n");
                br2.readLine();
            } else {
                linhas.add(temp+"\n");
            }
        }
        br2.close(); 
        
        FileWriter fw = new FileWriter(file);
        for (String l : linhas){
            fw.write(l);
        }
        fw.close();
    }
    public static void excluir(String arquivo, String nomeE) throws FileNotFoundException, IOException{
        File file = new File(arquivo);
        if (!file.exists()){
            System.out.println ("Arquivo não encontrado");
        };
        BufferedReader br2 = new BufferedReader(new FileReader(arquivo));
        ArrayList<String> linhas = new ArrayList<>();
        String temp;
        while((temp = br2.readLine()) !=null) {
            if (temp.contains(nomeE)) {
                br2.readLine();
                br2.readLine();
            } else {
                linhas.add(temp+"\n");
            }
        }
        br2.close(); 
        
        FileWriter fw = new FileWriter(file);
        for (String l : linhas){
            fw.write(l);
        }
        fw.close();
    }
    

    public static void main (String args[]){
        Scanner t = new Scanner(System.in);
        System.out.println("Agenda:\n");
        System.out.println("1- Adicionar Entrada");
        System.out.println("2- Consultar Entradas");
        System.out.println("3- Alterar Entrada");
        System.out.println("4- Excluir Entrada");
        int escolha = t.nextInt();
        t.nextLine();
        
        switch(escolha){
            
            case 1:
                try{
            String entradaN, entradaT;
            
            System.out.println("Insira o nome");
            entradaN = t.nextLine()+"\n";
            
            System.out.println("Insira o telefone");
            entradaT = t.nextLine()+"\n\n";
            
            salvar("Cadastros.txt", entradaN, true);
            salvar("Cadastros.txt", entradaT, true);
                 
        } catch (Exception e){
            e.printStackTrace();
        }
            break;
            
            case 2:
                try{
                String conteudo = ler("Cadastros.txt");
                System.out.println(conteudo);
            }catch (Exception e){
                e.printStackTrace();
            }
            break;
            
            case 3:
                try{
                    System.out.println("Insira o nome da entrada que deseja alterar");
                    String nomeAntigo = t.nextLine();
                    
                    System.out.println("Insira o novo nome:");
                    String nomeNovo = t.nextLine();
                    
                    System.out.println("Insira o novo telefone:");
                    String telefoneNovo = t.nextLine();
                    
                    alterar("Cadastros.txt", nomeAntigo, nomeNovo, telefoneNovo);
                }catch (Exception e){
                    e.printStackTrace();
                }
            break;
            
            case 4:
                try{
                    System.out.println("Insira o nome da entrada que deseja excluir");
                    String nomeE = t.nextLine();
                    
                    excluir("Cadastros.txt", nomeE);
                }catch (Exception e){
                    e.printStackTrace();
                }
                
                
            break;
            default:
                System.out.println("Escolha Invalida");
        }
        
    }
}