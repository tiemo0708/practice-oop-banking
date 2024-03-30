package controller;

import view.InputView;
import view.OutputView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class BankController {

    private final InputView inputView;
    private final OutputView outputView;

    public BankController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }
    private static final Map<Integer, Runnable> menuOptions = new HashMap<>();
    {
        menuOptions.put(1, this::createAccount);
        menuOptions.put(2, this::withdraw);
        menuOptions.put(3, this::deposit);
        menuOptions.put(4, this::transfer);
        menuOptions.put(5, this::terminateAccount);
        menuOptions.put(0,this::exitProgram);
    }
    public void run()  {
        menuOptionChoice(InputView.askCategory());

    }
    private void exitProgram() {
    }

    private void terminateAccount() {
    }

    private void transfer() {
    }

    private void deposit() {
    }

    private void withdraw() {
    }

    private void createAccount() {

    }


    private void menuOptionChoice(int input) {
        Runnable action = menuOptions.getOrDefault(input, this::throwException);
        action.run();
    }

    private void throwException(){
        throw new IllegalStateException();//예외처리 나중에(해당하는 숫자가 없는경우)
    }
}