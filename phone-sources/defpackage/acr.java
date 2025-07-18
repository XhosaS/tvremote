package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acr {
    public clv b;
    public int c;
    public int d;
    public int f;
    public int g;
    public acp[] a = acu.a;
    public int e = 1;

    public static /* synthetic */ void b(acr acrVar, add addVar, yow yowVar, bnf bnfVar, int i, int i2) {
        long jG = addVar.g(0);
        acrVar.a(addVar, yowVar, bnfVar, i, i2, !addVar.m() ? cmf.b(jG) : cmf.a(jG));
    }

    public final void a(add addVar, yow yowVar, bnf bnfVar, int i, int i2, int i3) {
        for (acp acpVar : this.a) {
        }
        this.f = i;
        this.g = i2;
        int length = this.a.length;
        for (int iD = addVar.d(); iD < length; iD++) {
            acp acpVar2 = this.a[iD];
            if (acpVar2 != null) {
                acpVar2.d();
            }
        }
        if (this.a.length != addVar.d()) {
            Object[] objArrCopyOf = Arrays.copyOf(this.a, addVar.d());
            objArrCopyOf.getClass();
            this.a = (acp[]) objArrCopyOf;
        }
        this.b = new clv(addVar.f());
        this.c = i3;
        this.d = addVar.b();
        this.e = addVar.e();
        int iD2 = addVar.d();
        for (int i4 = 0; i4 < iD2; i4++) {
            if (acu.a(addVar.i(i4)) != null) {
                if (this.a[i4] != null) {
                    throw null;
                }
                this.a[i4] = new acp(yowVar, bnfVar);
                throw null;
            }
            acp acpVar3 = this.a[i4];
            if (acpVar3 != null) {
                acpVar3.d();
            }
            this.a[i4] = null;
        }
    }
}
