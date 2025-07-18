package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agws implements Serializable {
    public static final agws a = new agws();
    private static final long serialVersionUID = 0;

    private agws() {
    }

    private final Object readResolve() {
        return agwu.a;
    }
}
