public class practicle4 {
    
    // Make Student class static so it can be used in the static main method
    static class Student {
        int roll;
        String name;
        float age;

        public Student(int roll, String name, float age) {
            this.roll = roll;
            this.name = name;
            this.age = age;
        }

        public void printDetails() {
            System.out.println("Student Name = " + this.name);
            System.out.println("Student Roll = " + this.roll);
            System.out.println("Student Age = " + this.age);
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        // Array of 3 Student objects
        Student[] students = new Student[3];

        // Initializing the first student
        students[0] = new Student(150, "Vishal Banjara", 18.5f);

        // Initializing the remaining students
        students[1] = new Student(59, "Dipak Jadhav", 19.2f);
        students[2] = new Student(5, "Rajesh Banjara", 18.8f);

        // Printing student details
        for (Student student : students) {
            student.printDetails();
        }
    }
}
