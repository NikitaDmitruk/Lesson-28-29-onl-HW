package by.tms.lesson2829onl.storage;


import by.tms.lesson2829onl.model.Operation;

import java.util.List;

public interface OperationStorage {
    void save(Operation operation);
    List<Operation> findAll();
}
