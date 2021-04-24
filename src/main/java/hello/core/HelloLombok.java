package hello.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok hl = new HelloLombok();
        hl.setName("hongyeon");
        hl.setAge(12);
        System.out.println(hl.getAge());
    }

}
