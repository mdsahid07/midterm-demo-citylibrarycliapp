package edu.miu.cs.cs425.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Publisher {
    private int id;
    private String name;
    private String email;
    private String phone;
}
