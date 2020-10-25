# -第三次实验
1、实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

2、业务要求
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象示例：	
人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
学生（编号、姓名、性别、所选课程、……）
课程（编号、课程名称、上课地点、时间、授课教师、……）

3、实验要求
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。

4、核心代码
 int x = in.nextInt();
            if (x == 1) {
                a = e;
                System.out.println("已选课: " + e);
                System.out.println(b);
            } else if (x == 2) {
                a = f;
                System.out.println("已选课: " + f);
                System.out.println(c);
            } else if (x == 3) {
                a = g;
                System.out.println("已选课: " + g);
                System.out.println(d);
            } else {
                System.out.println("未查到课程");  
            }
5、流程图

如图。
          
6、实验过程

1.确定父类与子类， 用extends函数进行连接。

2.确定每个类所拥有的属性并进行定义。

3.利用super函数调用父类的构造方法，实例化子类，用this关键字给每一个变量传递它们的值。

5.在父类Personnel和Courses类里利用toString来返回字符串本身。

6..输入所需要的信息。

7、实验结果

8、编程感想
进行了super(),to String的练习，编写过程中继承方面出现问题，在查询课本仍未得到解决，后在百度找到解决方案；对super访问父类属性和extends继承父类构造方法有了较深的体会。