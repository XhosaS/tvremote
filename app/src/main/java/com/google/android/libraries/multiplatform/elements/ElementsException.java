package com.google.android.libraries.multiplatform.elements;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ElementsException extends ExecutionException {

    /* compiled from: PG */
    public class SharedRuntimeException extends ElementsException {
        public SharedRuntimeException(int i, String str) {
            super(str);
        }
    }

    public ElementsException() {
    }

    public ElementsException(String str) {
        super(str);
    }
}
