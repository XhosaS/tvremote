package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yyo {
    private final ynu a;
    public final int b;
    public final yns c;
    private final ynt d;
    private final ynu e;
    private final ynt f;
    private final yka g;

    public yyo(int i) {
        this.b = i;
        ynv ynvVar = ynv.a;
        this.d = new ynt(0L, ynvVar);
        this.f = new ynt(0L, ynvVar);
        yyq yyqVar = new yyq(0L, null, 2);
        this.a = new ynu(yyqVar, ynvVar);
        this.e = new ynu(yyqVar, ynvVar);
        this.c = new yns(i, ynvVar);
        this.g = new age(this, 6);
    }

    public final int e() {
        int andDecrement;
        do {
            andDecrement = yns.a.getAndDecrement(this.c);
        } while (andDecrement > this.b);
        return andDecrement;
    }

    public final void f(yoe yoeVar) {
        while (e() <= 0) {
            if (i((yri) yoeVar)) {
                return;
            }
        }
        yoeVar.c(ygi.a, this.g);
    }

    public final void g() {
        yns ynsVar;
        int i;
        int i2;
        do {
            ynsVar = this.c;
            i = this.b;
            i2 = ynsVar.b;
            if (i2 <= i) {
                return;
            }
        } while (!ynsVar.d(i2, i));
    }

    public final void h() {
        Object objA;
        long j;
        yyq yyqVar;
        while (true) {
            yns ynsVar = this.c;
            int i = this.b;
            int iB = ynsVar.b();
            if (iB >= i) {
                g();
                throw new IllegalStateException(a.cf(i, "The number of released permits cannot be greater than "));
            }
            if (iB >= 0) {
                return;
            }
            ynu ynuVar = this.a;
            yyq yyqVar2 = (yyq) ynuVar.a;
            long jB = this.d.b();
            long j2 = yyp.f;
            long j3 = jB / j2;
            yyn yynVar = yyn.a;
            while (true) {
                objA = ywo.a(yyqVar2, j3, yynVar);
                if (yxm.a(objA)) {
                    j = jB;
                    break;
                }
                ywp ywpVarB = yxm.b(objA);
                while (true) {
                    ywp ywpVar = (ywp) ynuVar.a;
                    yyqVar = yyqVar2;
                    j = jB;
                    if (ywpVar.b >= ywpVarB.b) {
                        break;
                    }
                    if (ywpVarB.v()) {
                        if (!ynuVar.d(ywpVar, ywpVarB)) {
                            if (ywpVarB.t()) {
                                ywpVarB.q();
                            }
                            yyqVar2 = yyqVar;
                            jB = j;
                        } else if (ywpVar.t()) {
                            ywpVar.q();
                        }
                    }
                }
                yyqVar2 = yyqVar;
                jB = j;
            }
            yyq yyqVar3 = (yyq) yxm.b(objA);
            yyqVar3.p();
            if (yyqVar3.b <= j3) {
                int i2 = (int) (j % j2);
                upq upqVar = yyqVar3.c;
                yxo yxoVar = yyp.b;
                Object objA2 = upqVar.C(i2).a(yxoVar);
                if (objA2 == null) {
                    int i3 = yyp.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (upqVar.C(i2).a == yyp.c) {
                            return;
                        }
                    }
                    if (!upqVar.C(i2).d(yxoVar, yyp.d)) {
                        return;
                    }
                } else if (objA2 == yyp.e) {
                    continue;
                } else {
                    if (!(objA2 instanceof yoe)) {
                        if (objA2 instanceof yyi) {
                            throw null;
                        }
                        Objects.toString(objA2);
                        throw new IllegalStateException("unexpected: ".concat(objA2.toString()));
                    }
                    yoe yoeVar = (yoe) objA2;
                    Object objH = yoeVar.h(ygi.a, this.g);
                    if (objH != null) {
                        yoeVar.a(objH);
                        return;
                    }
                }
            }
        }
    }

    public final boolean i(yri yriVar) {
        Object objA;
        long j;
        yyq yyqVar;
        ynu ynuVar = this.e;
        yyq yyqVar2 = (yyq) ynuVar.a;
        long jB = this.f.b();
        yym yymVar = yym.a;
        long j2 = yyp.f;
        long j3 = jB / j2;
        loop0: while (true) {
            objA = ywo.a(yyqVar2, j3, yymVar);
            if (!yxm.a(objA)) {
                ywp ywpVarB = yxm.b(objA);
                while (true) {
                    ywp ywpVar = (ywp) ynuVar.a;
                    yyqVar = yyqVar2;
                    j = jB;
                    if (ywpVar.b >= ywpVarB.b) {
                        break loop0;
                    }
                    if (ywpVarB.v()) {
                        if (!ynuVar.d(ywpVar, ywpVarB)) {
                            if (ywpVarB.t()) {
                                ywpVarB.q();
                            }
                            yyqVar2 = yyqVar;
                            jB = j;
                        } else if (ywpVar.t()) {
                            ywpVar.q();
                        }
                    }
                }
            } else {
                j = jB;
                break;
            }
            yyqVar2 = yyqVar;
            jB = j;
        }
        yyq yyqVar3 = (yyq) yxm.b(objA);
        int i = (int) (j % j2);
        upq upqVar = yyqVar3.c;
        if (upqVar.C(i).d(null, yriVar)) {
            yriVar.A(yyqVar3, i);
            return true;
        }
        if (!upqVar.C(i).d(yyp.b, yyp.c)) {
            boolean z = yoy.a;
            return false;
        }
        if (yriVar instanceof yoe) {
            ((yoe) yriVar).c(ygi.a, this.g);
            return true;
        }
        if (yriVar instanceof yyi) {
            throw null;
        }
        Objects.toString(yriVar);
        throw new IllegalStateException("unexpected: ".concat(yriVar.toString()));
    }
}
