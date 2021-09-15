public class Main {

    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNome("Contrato 1");
        contrato.setTipo("Tipo X");

        Documento documento= new Documento();
        documento.setNome("Documento 1");
        documento.setTipo("Tipo X");

        Foto foto = new Foto();
        foto.setNome("Foto 1");
        foto.setTipo("Tipo X");

        Impressora impressora = new Impressora();

        impressora.adicionarDocumento(contrato);
        impressora.adicionarDocumento(documento);
        impressora.adicionarDocumento(foto);

        impressora.imprimitTodos();
    }

}
