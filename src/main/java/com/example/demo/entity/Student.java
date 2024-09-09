package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.*;


//Entity class aka database table.
//I had boilerplate  code before because we are using too many codes instead of it writing short and
//sweet code using given/able features/dependency like lombok.
//@Data: @Getter, @Setter, @ToString, @RequiredArgConstructor, @EqualAndHashCode.
//We can use @Data instead of using all the lines below from 13-17.

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "student_id")
    private long id;

    private String fullName;

    @Column(name = "email_address")
    private String email;

    private String gender;

    private String phone;

    private String address;

    //I am using lombok to beautify the code. However, I have also used regular getter, setter, default and parameterised constructors and
    //ran the code to achieve the goal. It is now inside comment section.

  /*  public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address='" + address + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Student(String address, String email, String fullName, long id, String gender, String phone) {
        this.address = address;
        this.email = email;
        this.fullName = fullName;
        this.id = id;
        this.gender = gender;
        this.phone = phone;
    }

    public Student() {
    }*/
}
