package �ڶ����ϻ�;

import java.util.Scanner;     
public class Test {
    public static void main(String[] args) {
        int flag = 1;
        Course s = null;
        while (flag == 1) {
            Scanner in = new Scanner(System.in);
            try {
            Course a = s;  
            Student w = new Student(2019311319, "�ĳ۷�", '��',a);
            System.out.println("ѧ����Ϣ");
            System.out.println(w);
            Teacher b = new Teacher(1, "��", '��', "java");
            Teacher c = new Teacher(2, "��", '��', "�ߴ�");
            Teacher d = new Teacher(3, "κ", 'Ů', "��ɢ");
            System.out.println("��ʦ��Ϣ");
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            Course e = new Course("java", 1, "300", 2, 2);
            Course f = new Course("�ߴ�", 2, "202", 2, 2);
            Course g = new Course("��ɢ", 3, "300", 2, 4);
            System.out.println("�γ���Ϣ");
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println("������1,2,3����ѡ��: ");
            int x = in.nextInt();
            if (x == 1) {
                a = e;
                System.out.println("��ѡ��: " + e);
                System.out.println(b);
            } else if (x == 2) {
                a = f;
                System.out.println("��ѡ��: " + f);
                System.out.println(c);
            } else if (x == 3) {
                a = g;
                System.out.println("��ѡ��: " + g);
                System.out.println(d);
            } else {
                System.out.println("δ�鵽�γ�");
            }
            Student n = new Student(2019311319, "�ĳ۷�", '��',a);
            System.out.println(n);

            System.out.println("������1,2,3�����˿�: ");
            int y = in.nextInt();
            while (x == 1)  
                if (y == 1) {
                    a = null;
                    System.out.println("���˿�: " + e);
                    System.out.println(b);
                    break;
                } else {
                    System.out.println("δ�鵽��ѡ�ÿγ̣��޷��˿�");
                    s = e;
                    break;
                }

            while (x == 2)
                if (y == 2) {
                    a = null;
                    System.out.println("���˿�: " + f);
                    System.out.println(c);
                    break;
                } else {
                    System.out.println("δ�鵽��ѡ�ÿγ̣��޷��˿�");
                    s = f;
                    break;
                }

            while (x == 3)
                if (y == 3) {
                    a = null;
                    System.out.println("���˿�: " + g);
                    System.out.println(d);
                    break;
                } else {
                    System.out.println("δ�鵽��ѡ�ÿγ̣��޷��˿�");
                    s = g;
                    break;
                }
            Student o = new Student(2019311319, "�ĳ۷�", '��',a);
            System.out.println(o);

            System.out.println("����1����2ѡ�����ѡ�˿λ����˳�");
            int z = in.nextInt();
            while (z == 1) {
                System.out.println("����ѡ��");
                break;

            }
            while (z == 2) {
                flag = 0;
                System.out.println("�˳�");
                break;
            }
            }finally {
                in.close();
            }
        }
    }
}