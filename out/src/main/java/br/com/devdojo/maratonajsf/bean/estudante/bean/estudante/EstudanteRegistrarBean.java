package br.com.devdojo.maratonajsf.bean.estudante.bean.estudante;

import br.com.devdojo.maratonajsf.bean.estudante.model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"DevDojo", "e", "foda"};
    private boolean renderizar;
    private boolean link;

    public void executar(){
        //System.out.println("Fazendo uma busca no BD");
    }

    public void executar(String param){
        //System.out.println("Fazendo uma busca no BD com Parametro : " + param);
    }

    public String executarRetorno(String param){
        return "Quem é o lindao? " + param;
    }

    public String irParaIndex2(){
        return "index2?faces-redirect=true";
    }

    public String exibirNotas(){
        this.renderizar = true;
        return "index";
    }

    public String esconderNotas(){
        this.renderizar = false;
        return "index";
    }

    public String exibirLink(){
        this.link = true;
        System.out.println(this.link);
        return "index";
    }

    public String esconderLink(){
        this.link = false;
        System.out.println(this.link);
        return "index";
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public void setRenderizar(boolean renderizar) {
        this.renderizar = renderizar;
    }

    public boolean isRenderizar() {
        return renderizar;
    }

    public void setLink(boolean link) {
        this.link = link;
    }

    public boolean isLink() {
        return link;
    }
}
