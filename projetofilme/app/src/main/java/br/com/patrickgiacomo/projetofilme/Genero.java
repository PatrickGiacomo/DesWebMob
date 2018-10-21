/*
Nome: Patrick Giacomo
RA: 816117777
*/

package br.com.patrickgiacomo.projetofilme;

import java.util.ArrayList;

public class Genero {
    private int id;
    private String nome;
    private ArrayList<Genero> list;

    public Genero(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public ArrayList<Genero> getList() {

        return list;
    }

    public void setList(ArrayList<Genero> list)
    {
        this.list = list;
    }

    public ArrayList<Genero> gerarLista(){
        Genero g1 = new Genero(1, "Fantasia");
        Genero g2 = new Genero(2, "Aventura");
        Genero g3 = new Genero(3, "Magia");

        this.list.add(g1);
        this.list.add(g2);
        this.list.add(g3);

        return list;
    }
}
