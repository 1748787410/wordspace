package Xltm;

public class Teacher2 {

	public static void main(String[] args) {
		teacher a = new CGB();
		teacher b = new Scala();
		a.tre();
		b.tre();
		
	}
	
}
class teacher{
	public void tre() {
		String t = "��ʦ";
		String BK = "���η�ʽ";
	}
}
class CGB extends teacher{
	public void tre() {
		String ta = "CGB��ʦ";
		String BK = "���ӿμ�";
		System.out.println("CGB��ʦϲ���õ��ӿμ�����");
	}
}
class Scala extends teacher{
	public void tre() {
		String tb = "Scala��ʦ";
		String BK = "��д�ʼ�";
		System.out.println("Scala��ʦϲ����д�ʼǱ���");
	}
}