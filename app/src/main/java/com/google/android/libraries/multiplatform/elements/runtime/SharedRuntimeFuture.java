package com.google.android.libraries.multiplatform.elements.runtime;

import com.google.android.libraries.multiplatform.elements.ElementsException;
import defpackage.zum;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class SharedRuntimeFuture extends zum {
    private SharedRuntimeFuture() {
    }

    private void resolve(ElementsException.SharedRuntimeException sharedRuntimeException) {
        if (sharedRuntimeException == null) {
            p(null);
        } else {
            q(sharedRuntimeException);
        }
    }
}
