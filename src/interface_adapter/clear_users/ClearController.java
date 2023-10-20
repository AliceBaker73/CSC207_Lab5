package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInteractor;
import use_case.signup.SignupInputData;

// TODO Complete me
public class ClearController {

    ClearInputBoundary userClearUseCaseInteractor;

    public ClearController (ClearInputBoundary userClearUseCaseInteractor) {
        this.userClearUseCaseInteractor = userClearUseCaseInteractor;
    }

    public void execute() {
        ClearInputData clearInputData = new ClearInputData();
        userClearUseCaseInteractor.execute(clearInputData);
    }
}
