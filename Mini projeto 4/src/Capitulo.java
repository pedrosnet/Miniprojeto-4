import java.util.Scanner; 

public class Capitulo{

    Personagem perso;
    int alterarEnergia1;
	Personagem vilao;
	int alterarEnergia2;
    String texto;
    String[] escolhas;
    Scanner input;

    Capitulo(Personagem perso, 
             int alterarEnergia1, 
             Personagem vilao, 
             int alterarEnergia2, 
             String texto, 
             String[] escolhas,
             Scanner input){

        this.perso = perso;
        this.alterarEnergia1 = alterarEnergia1;
		this.vilao = vilao;
        this.alterarEnergia2 = alterarEnergia2;
        this.texto = texto;
        this.escolhas = escolhas;
        this.input = input;
    }

    void mostrar(){
        perso.alterarEnergia(alterarEnergia1);
		vilao.alterarEnergia(alterarEnergia2);
        System.out.println(this.texto);
        if (this.escolhas != null) {
            for(String idescolha : escolhas){
                System.out.println(idescolha);
            }
        }
    }

    int escolher(){
        int idescolha = -1;
        String receba = input.nextLine();

        for (int i = 0; i < escolhas.length; i++) {
            if(receba.equals(escolhas[i])){
                idescolha = i;
            }
        }
        return idescolha;
    }
}