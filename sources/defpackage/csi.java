package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csi extends csj implements RandomAccess {
    private final csj a;
    private final int b;
    private final int c;

    public csi(csj csjVar, int i, int i2) {
        this.a = csjVar;
        this.b = i;
        dnx.be(i, i2, csjVar.a());
        this.c = i2 - i;
    }

    @Override // defpackage.csf
    public final int a() {
        return this.c;
    }

    @Override // defpackage.csj, java.util.List
    public final Object get(int i) {
        dnx.bc(i, this.c);
        return this.a.get(this.b + i);
    }
}
