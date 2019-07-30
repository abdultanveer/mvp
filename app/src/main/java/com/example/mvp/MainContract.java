package com.example.mvp;

//3
public interface MainContract {

    /**
     * this will contain methods that presenter will invoke
     * in other words -- presenter's commands to view
     */
    interface View{
        void showToast(String abdul);
    }

    /**
     * this will contain methods that view will invoke
     * in other words -- view's commands to presenter
     */
    interface Presenter{
        void onButtonClicked();
    }
}
