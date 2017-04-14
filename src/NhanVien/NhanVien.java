package NhanVien;

public class NhanVien {

	private String mName, mAdr;
	private float mSal;
	private int mNgay, mSdt;
	
	
	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}
	
	public int getmSdt() {
		return mSdt;
	}

	public void setmSdt(int mSdt) {
		this.mSdt = mSdt;
	}
	
	public String getmAdr() {
		return mAdr;
	}

	public void setmAdr(String mAdr) {
		this.mAdr = mAdr;
	}

	public float getmSal() {
		return mSal;
	}

	public void setmSal(float mSal) {
		this.mSal = mSal;
	}

	public int getmNgay() {
		return mNgay;
	}

	public void setmNgay(int mNgay) {
		this.mNgay = mNgay;
	}
	

	public void Intro(){
		System.out.println("Tên nhân viên : " + mName);
		System.out.println("Số điện thoại : " + mSdt);
		System.out.println("Địa chỉ : " +mAdr);
		System.out.println("Số ngày làm : "+ mNgay);
		System.out.println("Lương của nhân viên đó : " +mSal);
	}
	
}
