package entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Account {
    private int id;
    private boolean active;
    private List<AccountType> accountTypeList = new ArrayList<>();
}
