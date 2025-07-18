package defpackage;

import org.chromium.net.CallbackException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ahyy extends CallbackException {
    protected ahyy(android.net.http.CallbackException callbackException) {
        super(callbackException.getMessage(), callbackException.getCause());
    }
}
