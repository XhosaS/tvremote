package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yki implements Serializable {
    public static final yki a = new yki();

    private yki() {
    }

    private Object readResolve() {
        return a;
    }
}
