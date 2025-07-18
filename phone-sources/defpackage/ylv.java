package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ylv implements Serializable {
    public static final ylv a = new ylv();
    private static final long serialVersionUID = 0;

    private ylv() {
    }

    private final Object readResolve() {
        return ylx.a;
    }
}
