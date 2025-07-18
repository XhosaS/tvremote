package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cur implements Serializable {
    public static final cur a = new cur();
    private static final long serialVersionUID = 0;

    private cur() {
    }

    private final Object readResolve() {
        return cut.a;
    }
}
