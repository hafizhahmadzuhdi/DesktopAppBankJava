package bank;

/**
 *
 * @author Lenovo
 */
public class Akun {

    private int NomorAkun;
    private String Nama;
    private String Alamat;
    private int Saldo;
    private int IDKartu;
    private int PIN;
    private String Bank;

    public Akun() {

    }

    public Akun(int NomorAkun, int IDKartu, int PIN, String Nama, String Alamat, int Saldo, String Bank) {
        this.NomorAkun = NomorAkun;
        this.IDKartu = IDKartu;
        this.PIN = PIN;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Saldo = Saldo;
        this.Bank = Bank;
    }

    /**
     * @return the NomorAkun
     */
    public int getNomorAkun() {
        return NomorAkun;
    }

    /**
     * @param NomorAkun the NomorAkun to set
     */
    public void setNomorAkun(int NomorAkun) {
        this.NomorAkun = NomorAkun;
    }

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the Alamat
     */
    public String getAlamat() {
        return Alamat;
    }

    /**
     * @param Alamat the Alamat to set
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    /**
     * @return the Saldo
     */
    public int getSaldo() {
        return Saldo;
    }

    /**
     * @param Saldo the Saldo to set
     */
    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    /**
     * @return the IDKartu
     */
    public int getIDKartu() {
        return IDKartu;
    }

    /**
     * @param IDKartu the IDKartu to set
     */
    public void setIDKartu(int IDKartu) {
        this.IDKartu = IDKartu;
    }

    /**
     * @return the PIN
     */
    public int getPIN() {
        return PIN;
    }

    /**
     * @param PIN the PIN to set
     */
    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    /**
     * @return the bankku
     */
    public String getBank() {
        return Bank;
    }

    /**
     * @param bankku the bankku to set
     */
    public void setBank(String Bank) {
        this.Bank = Bank;
    }
    
    
}

