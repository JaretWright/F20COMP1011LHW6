package SubClassExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

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
        sky1.addCourse("COMP 1011", 78);

        friends.add(sky1);
        arrayList.add(sky1);
    }
}
