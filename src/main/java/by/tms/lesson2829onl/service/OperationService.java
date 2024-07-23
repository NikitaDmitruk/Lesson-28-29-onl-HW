package by.tms.lesson2829onl.service;


import by.tms.lesson2829onl.model.Operation;
import by.tms.lesson2829onl.storage.JsonFileOperationStorage;
import by.tms.lesson2829onl.storage.OperationStorage;

import java.util.List;

public class OperationService {

    private final OperationStorage operationStorage = new JsonFileOperationStorage();

    public Operation execute(Operation operation) {
        switch (operation.getType()) {
            case "SUM":
                operation.setResult(operation.getNum1() + operation.getNum2());
                operationStorage.save(operation);
                return operation;
            case "SUB":
                operation.setResult(operation.getNum1() - operation.getNum2());
                operationStorage.save(operation);
                return operation;
            case "MUL":
                operation.setResult(operation.getNum1() * operation.getNum2());
                operationStorage.save(operation);
                return operation;
            case "DIV":
                operation.setResult(operation.getNum1() / operation.getNum2());
                operationStorage.save(operation);
                return operation;
        }
        throw new IllegalArgumentException("by.tms.lesson25.calculator.model.Operation type not supported");
    }

    public List<Operation> getAllOperations() {
        return operationStorage.findAll();
    }
}
