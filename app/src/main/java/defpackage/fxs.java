package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxs {
    public static final fxr a(MessageLite messageLite, int i) {
        return new fxr(messageLite.getClass().getName() + "." + i);
    }

    public static final fxr b(fxr fxrVar, int i) {
        return new fxr(fxrVar.a + "." + i);
    }
}
