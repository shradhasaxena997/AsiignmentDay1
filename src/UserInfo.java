import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.stream.Collectors;

class User {
    int stuId;
    int stuAge;
    String stuName;
    String stuAddress;

    User(int id, int age, String name, String address) {
        this.stuId = id;
        this.stuAge = age;
        this.stuName = name;
        this.stuAddress = address;
    }

    public int getStuId() {
        return stuId;
    }

    public int getStuAge() {
        return stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuAddress() {
        return stuAddress;
    }

}

public class UserInfo {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(11, 27, "Lucy", "bareilly"));
        list.add(new User(28, 27, "Kiku", "agra"));
        list.add(new User(32, 19, "Dani", "delhi"));
        list.add(new User(49, 27, "Steve", "delhi"));



           /*   list.stream()
                      .filter(pair-> pair.stuName.startsWith("s"))

                      .forEach(pair->System.out.println(pair.getStuName()));*/

        Predicate<User> p1 = s -> s.stuName.startsWith("S");
        Predicate<User> p2 = s -> s.stuAge > 18 && s.stuAddress == "delhi";
        Predicate<User> p3 = s -> s.stuId > 10 && s.stuAge < 20;
        Predicate<User> p4 = s -> (s.stuAge % 2) == 0;
        Predicate<User> p5 = s -> s.stuAge == 18 && s.stuAddress == "delhi";


        boolean b1 = list.stream().anyMatch(p1);
        System.out.println(b1);
        if (b1) {
            //list.stream().forEach(s-> System.out.println(s.getStuName()));

        }
        boolean b2 = list.stream().anyMatch(p2);
        System.out.println(b2);
        boolean b3 = list.stream().anyMatch(p3);
        System.out.println(b3);
        boolean b4 = list.stream().anyMatch(p4);
        System.out.println(b4);
        boolean b5 = list.stream().anyMatch(p5);
        System.out.println(b5);

    }
}