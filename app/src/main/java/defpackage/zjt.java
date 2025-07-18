package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zjt implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;
    private final String c;

    public zjt(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    private Object readResolve() {
        return new zju(this.a, this.b, this.c);
    }
}
