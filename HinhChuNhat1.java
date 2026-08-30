package Tuan1_baiHCN;

public class HinhChuNhat {
    private double chieudai;
    private double chieurong;

    public HinhChuNhat() {
        this.chieudai = 0;
        this.chieurong = 0;
    }

    public HinhChuNhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double cD) throws Exception {
        if (cD >= 0) {
            this.chieudai = cD;
        } else {
            throw new Exception("Chiều dài không được âm");
        }
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) throws Exception {
        if (chieurong >= 0) {
            this.chieurong = chieurong;
        } else {
            throw new Exception("Chiều rộng không được âm");
        }
    }
	public double getDT() {
        return this.chieudai * this.chieurong;
    
    }

    public double getCV() {
        return 2 * (this.chieudai + this.chieurong);
    }

    public static void main(String[] args) {
        HinhChuNhat h1= new HinhChuNhat(5, 3);
        System.out.println(h1.getChieudai());
        System.out.println(h1.chieurong);
        System.out.println("Chu vi hình chữ nhật là:");
        System.out.println(h1.getCV());
        System.out.println("Diện tích hình chữ nhật là:");
        System.out.println(h1.getDT());
    }
}
