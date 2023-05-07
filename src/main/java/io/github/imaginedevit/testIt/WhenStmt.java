package io.github.imaginedevit.testIt;

import io.github.imaginedevit.testIt.casefns.ThenFn;

public class WhenStmt<T,R> {

    private final TestCase<T,R> testCase;

    public WhenStmt(TestCase<T, R> testCase) {
        this.testCase = testCase;
    }


    public ThenStmt<T,R> then(String message, ThenFn<R> fn) {
        return testCase.then(message, fn);
    }

}