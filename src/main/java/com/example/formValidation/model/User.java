package com.example.formValidation.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 32, message="Name must be between 2 and 32 characters")
    private String name;

    @Email(message = "Must be a valid email")
    private String email;

    @Min(value = 1, message = "Age cannot be less than 1 ")
    @Max(value = 100, message = "Age cannot be more than 100")
    private Integer age;

    @Past(message = "Date of birth cannot be in the future")
    @NotNull(message = "Please enter a date of birth")
    private LocalDate dateOfBirth;

    @NotEmpty(message = "Please enter a hobby")
    @Size(min = 1, message = "Must have at least one hobby")
    private List<String> hobbies;

    public String getLastName() {
        return name;
    }
    public void setLastName(String lastName) {
        this.name = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public List<String> getHobbies() {
        return hobbies;
    }
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
