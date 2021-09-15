public class Impressora {

    private DocumentoGenerico[]  documentos = new DocumentoGenerico[10];


    public void adicionarDocumento(DocumentoGenerico imprimivel) {
        for (int i = 0; i < documentos.length; i++) {
            if (documentos[i] == null) {
                documentos[i] = imprimivel;
                break;
            }
        }
    }

    public void imprimitTodos() {
        for (int i = 0; i < documentos.length; i++) {
            if (documentos[i] == null) {
                break;
            } else {
                documentos[i].imprimir();
            }
        }
    }

}
