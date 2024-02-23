package Priority_Queues;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PyQs 
{
    private static class Student
    {
        Integer roll,marks;
        String name;

    }
    private static class StudentComparator implements Comparator<Student>
    {
        public int compare(Student s1, Student s2)
        {
            if(s1.marks > s2.marks)
            {
                return -1;
            }
            else if(s1.marks < s2.marks)
            {
                return 1;
            }
            else
            {
                if(s1.roll < s2.roll)
                {
                    return -1;
                }
                else if(s1.roll > s2.roll)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());
        Student obj1 = new Student();
        obj1.roll = 8;
        obj1.marks = 0;
        obj1.name = "A";
        pq.add(obj1);
        Student obj2 = new Student();
        obj2.roll = 2;
        obj2.marks = 0;
        obj2.name = "B";
        pq.add(obj2);
        Student obj3 = new Student();
        obj3.roll = 3;
        obj3.marks = 0;
        obj3.name = "C";
        pq.add(obj3);
        Student obj4 = new Student();
        obj4.roll = 4;
        obj4.marks = 0;
        obj4.name = "D";
        pq.add(obj4);
        Student obj5 = new Student();
        obj5.roll = 5;
        obj5.marks = 0;
        obj5.name = "E";
        pq.add(obj5);
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(obj1);
        arr.add(obj2);
        arr.add(obj3);
        arr.add(obj4);
        arr.add(obj5);

        arr.sort(new StudentComparator());
        while(!arr.isEmpty())
        {
            System.out.printf("My name is %s and my marks is %d and my roll no is %d",arr.get(0).name,arr.get(0).marks,arr.get(0).roll);
            arr.remove(0);
            System.out.println();
        }
        // while(!pq.isEmpty())
        // {
        //     System.out.println(pq.peek().name);
        //     pq.remove();
        // }
    }
}
