package BaiTap01.service;

import BaiTap01.exception.NotFoundEmployeeException;

public interface Service {
    void add();

    void display();

    void remove();

    void search() throws NotFoundEmployeeException;
}
