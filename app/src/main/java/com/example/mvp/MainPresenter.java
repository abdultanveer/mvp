package com.example.mvp;
//2
public class MainPresenter implements MainContract.Presenter {//5
    MainContract.View view;//9

    public MainPresenter(MainActivity mainActivity) {
        view = mainActivity;//10--wiring
    }

    @Override
    public void onButtonClicked() {//8
        //presenter : hey mr view show a toast
        view.showToast("abdul");//11

    }
}
