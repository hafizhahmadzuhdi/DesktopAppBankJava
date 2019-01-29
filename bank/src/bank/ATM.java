package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class ATM {

    private int ATMCode;
    private int Cash;
    Connection connection;
    Statement stmt;
    ResultSet rsAkun, rsATM;
    public static Akun Kartu;
    public int ID;
    public String Nama;
    public int Saldo;

    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm");

    public ATM() {
        try {
            connection = DriverManager.getConnection("jdbc:ucanaccess://"
                    + "A:/kuliah/smst3/PBO/backupBank/real/bankpbo.accdb;", "", "");

            stmt = connection.createStatement();
            rsATM = stmt.executeQuery("SELECT * FROM ATM");
            rsATM.next();
            this.ATMCode = rsATM.getInt("ATMCode");
            this.Cash = rsATM.getInt("Cash");

        } catch (SQLException errMSG) {
            System.out.println("Gagal Konek" + errMSG.getMessage());
        }
    }

    public ATM(int ATMCode, int Cash) {
        this.ATMCode = ATMCode;
        this.Cash = Cash;
    }

    /**
     * @return the ATMCode
     */
    public int getATMCode() {
        return ATMCode;
    }

    /**
     * @param ATMCode the ATMCode to set
     */
    public void setATMCode(int ATMCode) {
        this.ATMCode = ATMCode;
    }

    /**
     * @return the Cash
     */
    public int getCash() {
        return Cash;
    }

    /**
     * @param Cash the Cash to set
     */
    public void setCash(int Cash) {
        this.Cash = Cash;
    }

    public void InsertCard() {

    }

    public String EnterAmount(int Amount) {
        String hasil = "";
        int IDWithdrawal = 0;
        try {
            rsAkun = stmt.executeQuery("SELECT Count(WithdrawalID) as total FROM Withdrawal");
            rsAkun.next();

            IDWithdrawal = rsAkun.getInt("total") + 1;
        } catch (Exception e) {

        }

        if (getCash() >= Amount) {
            if (Kartu.getSaldo() >= Amount) {
                int sal = Kartu.getSaldo() - Amount;
                System.out.println(sal);
                Kartu.setSaldo(sal);
                String sql = "Update Akun set Saldo='" + sal + "' where NomorAkun='" + Kartu.getNomorAkun() + "';";
                try {
                    int berhasil = stmt.executeUpdate(sql);
                    hasil = "Penarikan berhasil";
                } catch (SQLException errMsg) {
                    System.out.println(errMsg.getMessage());
                }
                String sql3 = "INSERT INTO Transaction VALUES(0,'" + sdf.format(date) + "','" + sdf2.format(date) + "','" + IDWithdrawal + "',0);";
                try {
                    int berhasil = stmt.executeUpdate(sql3);
                    hasil = "Penarikan berhasil";
                } catch (SQLException errMsg) {
                    System.out.println(errMsg.getMessage());
                }
                String sql4 = "Insert into Withdrawal Values('" + Amount + "','" + Kartu.getNomorAkun() + "','" + getATMCode() + "','" + IDWithdrawal + "');";
                try {
                    int berhasil = stmt.executeUpdate(sql4);
                    hasil = "Penarikan berhasil";
                } catch (SQLException errMsg) {
                    System.out.println(errMsg.getMessage());
                }

                String sql2 = "Update ATM set Cash='" + CheckSufficient(Amount) + "' ;";
                try {
                    int berhasil = stmt.executeUpdate(sql2);
                } catch (SQLException errMsg) {
                    System.out.println(errMsg.getMessage());
                }
            } else {
                hasil = "Saldo anda tidak mencukupi";
            }

        } else {
            hasil = "Uang di ATM tidak cukup";
        }
        return hasil;
    }

    public int CheckSufficient(int isi) {
        int cek = 0;
        if (getCash() >= isi) {
            cek = getCash() - isi;
            setCash(cek);
        } else {
            cek = getCash();
        }
        System.out.println(getCash());
        return cek;
    }

    public String Setor(int Amount) {
        String hasil = "";
        int IDSetor = 0;
        try {
            ResultSet rsSetor = stmt.executeQuery("SELECT Count(SetorID) as total FROM Setor");
            rsSetor.next();

            IDSetor = rsSetor.getInt("total") + 1;
        } catch (Exception e) {

        }

        int total = Kartu.getSaldo() + Amount;
        Kartu.setSaldo(total);

        String sql = "Update Akun set Saldo='" + total + "' where NomorAkun='" + Kartu.getNomorAkun() + "';";
        try {
            int berhasil = stmt.executeUpdate(sql);
            hasil = "Saldo anda telah di tambahkan";
        } catch (SQLException errMsg) {
            System.out.println(errMsg.getMessage());
        }
        String sql3 = "INSERT INTO Transaction VALUES(0,'" + sdf.format(date) + "','" + sdf2.format(date) + "',0,'" + IDSetor + "');";
        try {
            int berhasil = stmt.executeUpdate(sql3);
            hasil = "Saldo anda telah di tambahkan";
        } catch (SQLException errMsg) {
            System.out.println(errMsg.getMessage());
        }
        String sql4 = "Insert into Setor Values('" + Amount + "','" + Kartu.getNomorAkun() + "','" + getATMCode() + "','" + IDSetor + "');";
        try {
            int berhasil = stmt.executeUpdate(sql4);
            hasil = "Saldo anda telah di tambahkan";
        } catch (SQLException errMsg) {
            System.out.println(errMsg.getMessage());
        }

        return hasil;
    }

    public void EjectCard() {

    }

    public void DispenseCard() {

    }

    public int EnterPin(int PIN) {
        return PIN;
    }

    public boolean ValidateCard(String ID) {
        boolean gitu = false;
        try {
            rsAkun = stmt.executeQuery("SELECT * FROM Akun WHERE IDKartu = " + "'" + ID + "'");
            if (rsAkun.next()) {
                Kartu = new Akun(rsAkun.getInt("NomorAkun"),
                        rsAkun.getInt("IDKartu"),
                        rsAkun.getInt("PIN"),
                        rsAkun.getString("Nama"),
                        rsAkun.getString("Alamat"),
                        rsAkun.getInt("Saldo"),
                        rsAkun.getString("Bank"));

                gitu = true;
            } else {
                //JOptionPane.showMessageDialog(this, "ID tidak ditemukan", "Inforamsi", JOptionPane.INFORMATION_MESSAGE);
                gitu = false;
            }
        } catch (Exception e) {

        }
        return gitu;
    }

    public boolean ValidatePIN(int PIN) {

        boolean gini;

        if (PIN == Kartu.getPIN()) {
            gini = true;

        } else {
            //JOptionPane.showMessageDialog(this, "PIN salah", "Inforamsi", JOptionPane.INFORMATION_MESSAGE);
            gini = false;
        }

        return gini;
    }

}
