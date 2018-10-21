package br.com.patrickgiacomo.projetofilme;

import java.util.ArrayList;

public class Filme {

    private int id;
    private String titulo;
    private String descricao;
    private String anoLancamento;
    private String direcao;
    private int popularidade;
    private Genero genero;

    private ArrayList<Filme> list = new ArrayList<>();

    public Filme(){}
    public Filme(int id, String titulo, String descricao, String anoLancamento, String direcao, int popularidade, Genero genero) {

        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.anoLancamento = anoLancamento;
        this.direcao = direcao;
        this.popularidade = popularidade;
        this.genero = genero;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public String getAnoLancamento() {

        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {

        this.anoLancamento = anoLancamento;
    }

    public String getDirecao() {

        return direcao;
    }

    public void setDirecao(String direcao) {

        this.direcao = direcao;
    }

    public int getPopularidade() {

        return popularidade;
    }

    public void setPopularidade(int popularidade) {

        this.popularidade = popularidade;
    }

    public Genero getGenero() {

        return genero;
    }

    public void setGenero(Genero genero) {

        this.genero = genero;
    }

    public ArrayList<Filme> getList() {

        return list;
    }

    public void setList(ArrayList<Filme> list) {

        this.list = list;
    }

    public ArrayList<Filme> gerarLista(){
        Filme f1 = new Filme(1, "Harry Potter e a Pedra Filosofal", "Conheça Harry Potter, um menino que soube em seu aniversário de onze anos que é filho órfão de dois bruxos e possui poderes mágicos únicos. De filho indesejado, passa a ser um estudante de Hogwarts, uma escola inglesa para bruxos. Lá ele conhece vários amigos que o ajudam a descobrir a verdade sobre as mortes misteriosas de seus pais.",
                "23/11/2001", "Chris Columbus", 96, new Genero(1, "Fantasia"));

        Filme f2 = new Filme(2, "Harry Potter e a Câmara Secreta", "Após as sofríveis férias na casa dos tios, Harry Potter se prepara para voltar a Hogwarts e começar seu segundo ano na escola de bruxos. Na véspera do início das aulas, a estranha criatura Dobby aparece em seu quarto e o avisa de que voltar é um erro e que algo muito ruim pode acontecer se Harry insistir em continuar os estudos de bruxaria. O garoto, no entanto, está disposto a correr o risco e se livrar do lar problemático.",
                "22/11/2002", "Chris Columbus", 98, new Genero(2, "Aventura"));

        Filme f3 = new Filme(3, "Harry Potter e o Prisioneiro de Azkaban", "O terceiro ano de Harry Potter em Hogwarts começa mal quando ele descobre que o assassino Sirius Black escapou da prisão de Azkaban e está empenhado em matá-lo. Enquanto o gato de Hermione atormenta o rato doente de Ron, um bando de dementadores são enviados para proteger a escola de Sirius Black. Um professor misterioso ajuda Harry a aprender a se defender.",
                "04/006/2004", "Alfonso Cuarón", 100, new Genero(3, "Magia"));

        getList().add(f1);
        getList().add(f2);
        getList().add(f3);
        return this.list;
    }

    public ArrayList<String> getListaNomes(String genero){
        ArrayList<String> lista = new ArrayList<String>();
        setList(gerarLista());
        for (Filme filme: list) {
            if(genero.equals("Todos"))
                lista.add(filme.getTitulo());

            if(filme.getGenero().getNome().equals(genero))
                lista.add(filme.getTitulo());
        }

        return lista;
    }

    public Filme buscaFilme(String nomeFilme){
        setList(gerarLista());

        for (Filme filme:list) {
            if(filme.getTitulo().equals(nomeFilme))
                return filme;
        }

        return null;
    }
}
