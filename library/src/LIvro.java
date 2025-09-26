public class LIvro {
    String titulo = "Unknow";
    String autor = "Eel";
    int anodepublicação = 2000;
    boolean disponivel = true;
    @Override
    public String toString() {
        return "LIvro [titulo=" + titulo + ", autor=" + autor + ", anodepublicação=" + anodepublicação + ", disponivel="
                + disponivel + "]";
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnodepublicação() {
        return anodepublicação;
    }
    public void setAnodepublicação(int anodepublicação) {
        this.anodepublicação = anodepublicação;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public LIvro(String titulo, String autor, int anodepublicação, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anodepublicação = anodepublicação;
        this.disponivel = disponivel;
    }
    
}
