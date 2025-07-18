package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crk implements cro, cqw {
    public final crt a;
    public ctx b;
    private final cqd c;

    public crk(cqd cqdVar, cug cugVar, ctw ctwVar) {
        this.c = cqdVar;
        crt crtVarA = ctwVar.a.a();
        this.a = crtVarA;
        cugVar.k(crtVarA);
        crtVarA.h(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    @Override // defpackage.cro
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.cqw
    public final String g() {
        throw null;
    }

    @Override // defpackage.cqw
    public final void f(List list, List list2) {
    }
}
