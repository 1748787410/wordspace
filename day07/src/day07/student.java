package day07;
//���Է�װ
//һ����java�ļ���������������࣬����ֻ����һ�����public����
//�ܽ᣺
//1.������Ҫ���ص���Ϣ ��һ��private ����
//2.private�����Դ��ֻ���ڱ����з��ʣ��������ṩ������set() get()
//3.����set()����ֵ������get()��ȡֵ

public class student {

	
		private String name;
		private int Years;
		//7.ʹ��eclipse�Զ��ṩset()  get()
		//�ʼ� - Source - generate getters and setters
		//--select all - OK
		
		private char gender;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getYears() {
			return Years;
		}
		public void setYears(int years) {
			Years = years;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		//4.ͨ��privateʵ�ַ�װ����
		private int id;
		//6.�ṩ������getXxx() - ��ȡid���Ե�ֵ
		public int getId( ){
			return id;
		}
		public void setId(int a ){
			id = a;
			//5.�ṩ������setXxx()-����ID���Ե�ֵ
		}
		
//1,ͨ��privateʵ�ַ�װ	,private֮��ֻ���ڱ����пɼ�	
		private void study() {
			System.out.println("ѧϰ");
		}//2.private��װ���޷��������ʣ�����ʹ��public�ķ���������
		public void sleep() {
			study();//3.����ṩstudy()
			System.out.println("˯��");
		}
	}