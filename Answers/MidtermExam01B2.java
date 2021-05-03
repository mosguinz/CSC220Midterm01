package midtermExam01;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

abstract class Person {

    private final String name;

    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        // this.name = name;
    }
}

class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Student stu = new Student("Mickey");
        System.out.println(stu.getName());
        stu.setName("Super Mouse");
        System.out.println(stu.getName());
    }
}

/* NETBEANS 9.x
run:
Mickey
Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - cannot assign a value to final variable name
	at midterm01Answers.Person.setName(MidtermAnswerB3.java:20)
	at midterm01Answers.Student.main(MidtermAnswerB3.java:33)
C:\Users\ducta\AppData\Local\NetBeans\Cache\9.0\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\ducta\AppData\Local\NetBeans\Cache\9.0\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)
*/

/* NETBEANS 10.x 
E:\Box Sync\IDEs\NetBeansProjects\2020SP_CSC220_JAVA\src\midterm01Answers\MidtermAnswerB3.java:20: error: cannot assign a value to final variable name
        this.name = name;
1 error
BUILD FAILED (total time: 1 second)
*/

/* NETBEANS 11.x 
C:\Users\ducta\Box Sync\IDEs\NetBeansProjects\2020SP_CSC220_JAVA\src\MidtermAnswerB3.java:20: error: cannot assign a value to final variable name
        this.name = name;
1 error
BUILD FAILED (total time: 0 seconds)
*/