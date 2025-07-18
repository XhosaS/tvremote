package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmc implements Serializable {
    private static final long serialVersionUID = 1;
    public final int a;
    private final byte[] b;

    public dmc(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final byte[] a() {
        return dnx.l(this.b);
    }
}
