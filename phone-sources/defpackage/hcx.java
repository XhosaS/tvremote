package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcx implements hdb, hcj {
    public final hdg a;
    public hfd b;
    private final hbv c;

    public hcx(hbv hbvVar, hfk hfkVar, hfc hfcVar) {
        this.c = hbvVar;
        hdg hdgVarA = hfcVar.a.a();
        this.a = hdgVarA;
        hfkVar.i(hdgVarA);
        hdgVarA.h(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.hdb
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.hcj
    public final String g() {
        throw null;
    }

    @Override // defpackage.hcj
    public final void f(List list, List list2) {
    }
}
