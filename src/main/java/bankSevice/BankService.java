package bankSevice;

import model.Account;
import model.AccountBuilder;
import java.math.BigDecimal;
import java.util.List;

public interface BankService {
    void join(List<String> account);
    void generalJoin(List<String> account);
    void savingsJoin(List<String> account);
    AccountBuilder setUpAccountBuilder(List<String> account);
    void deposit(String accountNumber, BigDecimal depositAmount);
    void withdraw(String accountNumber, BigDecimal withdrawAmount);
    void disableAccount(String accountNumber);
    Account getAccountInfo(String accountNumber);
}
