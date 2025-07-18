package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agvn implements Serializable {
    public static final agvn a = new agvn();

    private agvn() {
    }

    private Object readResolve() {
        return a;
    }
}
