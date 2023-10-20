package use_case.clear_users;

import entity.User;
import entity.UserFactory;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {

        ClearOutputData clearOutputData = new ClearOutputData(userDataAccessObject.getAll());
        userDataAccessObject.clear();
        userPresenter.prepareSuccessView(clearOutputData);

    }

}
