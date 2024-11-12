package Practica02.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    int id;
    String firstName;
    String lastName;
    int age;
    String gender;
    String departmentName;

    String city;
    int rank;

}
