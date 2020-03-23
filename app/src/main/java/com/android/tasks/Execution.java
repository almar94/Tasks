package com.android.tasks;

public enum Execution {
    TO_DO, IN_PROGRESS, COMPLETED, UNKNOWN;

    public static Execution getExecution(String input) {
        Execution selectStatus;
        switch (input.toLowerCase()) {
            case "to do":
                selectStatus = TO_DO;
                break;
            case "completed":
                selectStatus = COMPLETED;
                break;
            case "in progress":
                selectStatus = IN_PROGRESS;
                break;
            default:
                selectStatus = UNKNOWN;
        }

        return selectStatus;
    }
}
