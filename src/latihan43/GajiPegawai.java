/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan43;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
class GajiPegawai {
    private String nama, alamat;
    private int uangTransport, uangTunjangan, gajiPokok, totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        this.totalGaji = uangTunjangan+uangTransport+gajiPokok;
        return this.totalGaji;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok){
        this.nama = nama;
        System.out.println("Nama Karyawan : "+nama);
        this.alamat = alamat;
        System.out.println("Alamat : "+alamat);
        this.uangTransport = uangTransport;
        System.out.println("Uang Transport : Rp. "+uangTransport);
        System.out.println("Uang Tunjangan : Rp. "+uangTunjangan);
        System.out.println("Gaji Pokok : Rp. "+gajiPokok);
        totalGaji(uangTunjangan, uangTransport, gajiPokok);
        System.out.println("Total Gaji : Rp. "+this.totalGaji);
    }
}
