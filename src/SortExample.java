import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(12);
        marks.add(146);
        marks.add(34);
        marks.add(15);
        marks.add(58);
        marks.add(19);
        marks.add(25);
        marks.add(180);
        marks.add(89);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        System.out.println("---------------------------------------------------");
        //Emp Sort Example

        ArrayList<Emp> empArrayList = new ArrayList<>();
        empArrayList.add(new Emp("Amit","8896547382",1));
        empArrayList.add(new Emp("Pankaj","8896234582",3));
        empArrayList.add(new Emp("Rahul","8896584429",2));
        empArrayList.add(new Emp("Pushpendra","88984349382",5));
        empArrayList.add(new Emp("Puneet","88337497382",4));
        empArrayList.forEach(System.out::println);

        // applying Comparable
        Collections.sort(empArrayList);
        System.out.println("\nsorting after applying comparable----------------------------------");
        empArrayList.forEach(System.out::println);

//Using Comperitor on Student to sort
        ArrayList<Student> studentArrayList=new ArrayList<>();
        studentArrayList.add(new Student("Amit","8896547382",1));
        studentArrayList.add(new Student("Pankaj","8896234582",3));
        studentArrayList.add(new Student("Rahul","8896584429",2));
        studentArrayList.add(new Student("Pushpendra","88984349382",5));
        studentArrayList.add(new Student("Puneet","88337497382",4));

        System.out.println("\nstudents ----------------------------------------------------");
        studentArrayList.forEach(System.out::println);
// sort by sId using
        System.out.println("\nsorting after applying Comparator on Id----------------------------------");
        Collections.sort(studentArrayList,new StuIdComaprator());
        studentArrayList.forEach(System.out::println);

        System.out.println("\nsorting after applying Comparator on Name----------------------------------");
        Collections.sort(studentArrayList,new StuNameComparator());
        studentArrayList.forEach(System.out::println);




    }
}
