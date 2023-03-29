package com.vogella.tasks.ui.parts;

import javax.inject.Inject;

public class ACustomClass {
    @Inject
    public String string;
//
    @Override
    public String toString() {
        return string;
    }
}
