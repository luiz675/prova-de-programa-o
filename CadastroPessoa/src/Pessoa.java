import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Pessoa {
    public long id;
    public String nome;
    public String dataNascimento;
    public String sexo;
    public String mae;
    public String pai;
    public String enderecoCompleto;
    private String email;
    private String telefone;
    public String foto;

    public Pessoa(long id, String nome, String dataNascimento, String sexo, String mae, String pai, String enderecoCompleto, String Email, String telefone, String foto) {

        this.setId(id);
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setSexo(sexo);
        this.setMae(mae);
        this.setPai(pai);
        this.setEnderecoCompleto(enderecoCompleto);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setFoto(foto);
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompeleto) {
        this.enderecoCompleto = enderecoCompeleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;

    }

    public String listPessoa() {
        return "ID='" + this.getId() + '\'' +
                "\nNome='" + this.getNome() + '\'' +
                "\nDataNascimento=" + this.getDataNascimento() +
                "\nSexo=" + this.getSexo() +
                "\nMae='" + this.getMae() + '\'' +
                "\nPai='" + this.getPai() + '\'';


    }

    public void listarPessoa(ArrayList<Pessoa> pessoa) {
        for (int i = 0; i < pessoa.size(); i++) {
            System.out.println("\n");
            System.out.println(pessoa.get(i).listPessoa());
        }
    }
    public void buscaTelefone(ArrayList<Pessoa> pessoa, String telefone){
        for (int i = 0; i < pessoa.size(); i++) {
            if (Objects.equals(pessoa.get(i).getTelefone(), telefone)) {
                System.out.println(pessoa.get(i).getNome());
                break;
            }else {
                System.out.println("Não encontrou.");
            }
        }
    }
}



