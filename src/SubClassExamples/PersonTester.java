package SubClassExamples;

import java.util.*;

public class PersonTester {
    public static void main(String[] args) {
//        Person peep1 = new Person("Fred","Flintstone","705-555-1234");

        //what is the difference between a TreeSet and an
        //ArrayList
        HashSet<Person> friends = new HashSet<>();
        ArrayList<Person> arrayList = new ArrayList<>();

//        friends.add(peep1);
//        friends.add(peep1);
//        friends.add(peep1);
//        friends.add(peep1);
        //how many Person objects are in this set?

//        arrayList.add(peep1);
//        arrayList.add(peep1);
//        arrayList.add(peep1);
//        arrayList.add(peep1);
        //how many Person objects are in this list?

        Student sky1 = new Student("Sleepy","Guy","705-555-1234",1001);
        Student jacob = new Student("Quick","Thinker","426-455-8763", 999);
        Student stella = new Student("Ella","OneHundred","905-455-8763", 998);
        sky1.addCourse("COMP 1011", 78);
        stella.addCourse("COMP 1030", 100);
        stella.addCourse("COMP 1008", 100);
        stella.addCourse("COMP 1011", 99);

        friends.add(sky1);
        arrayList.add(sky1);

        ArrayList<Student> underGrads = new ArrayList<>();
        underGrads.add(sky1);
        underGrads.add(jacob);
        underGrads.add(stella);

        UnderGradCompator ugc = new UnderGradCompator();
        System.out.println(underGrads);
        Collections.sort(underGrads, ugc);
        System.out.println(underGrads);

        //anonymous inner class - we do not give the class a name
        Collections.sort(underGrads, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getLastName().compareTo(s2.getLastName());
            }
        });
        System.out.println(underGrads);

        //lamba expression IS an anonymous inner class, but with removal
        //of the redundant pieces.  These only work for functional interfaces.
        //a Functional interface has only 1 method
        Collections.sort(underGrads, (s1, s2) -> {
            return s1.getCourses().keySet().size() -
                    s2.getCourses().keySet().size();});
        System.out.println(underGrads);


        TreeSet<Student> classList = new TreeSet<>();
        classList.add(sky1);
        classList.add(jacob);


    }
}
