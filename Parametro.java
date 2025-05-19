public class Parametro {
    private int sementePilula;
    
    public Parametro() {
        sementePilula = 0;
    }
    sdsadsdsa
    public void atualizarParametro(int val) {
        int calc = val/30000;
        if(calc >= 1) {
            sementePilula = sementePilula + calc;
            System.out.print(calc + " semente(s) adicionada.");
        } else {
            System.out.print("Nenhuma semente adicionada.");
        }
    }
    
    public int pegarSemente() {
        return sementePilula;
    }
}
