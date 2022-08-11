package pro.sky.java.course2.lists.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends ServiceException {
    public EmployeeNotFoundException() {
        super("Сотрудник не найден в списке");
    }
}
