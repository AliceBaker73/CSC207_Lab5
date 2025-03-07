package interface_adapter.clear_users;

// TODO: Complete me

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData response) {
        ClearState clearState = clearViewModel.getState();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        clearState.setUsers(response.getUsers());
        clearViewModel.firePropertyChanged();
        viewManagerModel.firePropertyChanged();

    }
    @Override
    public void prepareFailView() {

    }

}
