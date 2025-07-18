package defpackage;

import org.chromium.net.CallbackException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zyw extends CallbackException {
    public zyw(android.net.http.CallbackException callbackException) {
        super(callbackException.getMessage(), callbackException.getCause());
    }
}
