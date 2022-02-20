import java.util.Scanner;
//Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
//A página de cadastro exigia o preenchimento dos campos de nome e senha, 
//porém a senha precisa ser forte. O site considera uma senha forte quando ela 
//satisfaz os seguintes critérios:
//Possui no mínimo 6 caracteres.
//Contém no mínimo 1 digito.
//Contém no mínimo 1 letra em minúsculo.
//Contém no mínimo 1 letra em maiúsculo.
//Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
public class Exercicio02 {
    public static boolean validarSenha(String senha){
        if(senha.length()< 6){
            return false;
        }
        
        boolean acharNumero = false;
        boolean acharMaiuscula = false;
        boolean acharMinuscula = false;
        boolean acharSimbolo = false;
        for(char c : senha.toCharArray()){
            if(c >= '0' && c <= '9'){
                acharNumero = true;
            }else if(c >= 'a' && c <= 'z'){
                acharMinuscula = true;
            }else if(c >= 'A' && c <= 'Z'){
                acharMaiuscula = true;
            }else{
                acharSimbolo = true;
            }
        }
        
        return acharNumero && acharMinuscula && acharMaiuscula && acharSimbolo;
    }
    
    public static void main(String[] args) {
            
        try (Scanner ler = new Scanner(System.in)) {
            String nome, senha;
            System.out.println(" ===================== CADASTRO REDE SOCIAL =====================");
            System.out.println(" Requisitos Minimos:\n A senha deve conter no mínimo 6 caracteres,\n no mínimo 1 digito, no mínimo 1 letra em minúsculo,\n no mínimo 1 letra em maiúsculo e no mínimo 1 caractere especial.\n");
            System.out.print(" Informe seu nome: ");
            nome = ler.nextLine();
            System.out.print(" Informe sua senha: ");
            senha = ler.nextLine();
            ler.close();
             
            if(validarSenha(senha) == true){
                System.out.println(" Senha cadastrada com sucesso");
            }else if(senha.length() < 6){
                System.out.printf(" Senha pequena falta inserir %d digitos.\nTente novamente.\n",6 - senha.length() );
            }else{
                System.out.println(" Sua senha não atende os requisitos minimos, tente novamente.");
            }
        }
    }
}