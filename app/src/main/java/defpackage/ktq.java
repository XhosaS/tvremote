package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ktq extends ktp {
    final /* synthetic */ ktr a;
    private final lja b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ktq(ktr ktrVar, String str, int i, lja ljaVar) {
        super(str, i);
        this.a = ktrVar;
        this.b = ljaVar;
    }

    @Override // defpackage.ktp
    public final int a() {
        return this.b.c;
    }

    @Override // defpackage.ktp
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ktp
    public final boolean c() {
        return true;
    }

    final boolean j(Long l, Long l2, llu lluVar, boolean z) {
        aeub.a.eV();
        lbk lbkVar = this.a.y;
        boolean zT = lbkVar.d.t(this.c, kzg.aD);
        lja ljaVar = this.b;
        boolean z2 = ljaVar.f;
        boolean z3 = ljaVar.g;
        boolean z4 = ljaVar.h;
        boolean z5 = z2 || z3 || z4;
        Boolean boolI = null;
        boolI = null;
        boolI = null;
        boolI = null;
        boolI = null;
        boolean z6 = z5;
        if (z) {
            if (!z5) {
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.k.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.d), (ljaVar.b & 1) != 0 ? Integer.valueOf(ljaVar.c) : null);
                return true;
            }
            z6 = true;
        }
        liu liuVar = ljaVar.e;
        if (liuVar == null) {
            liuVar = liu.a;
        }
        boolean z7 = liuVar.e;
        int i = lluVar.b;
        if ((i & 8) != 0) {
            if ((liuVar.b & 2) != 0) {
                long j = lluVar.f;
                liy liyVar = liuVar.d;
                if (liyVar == null) {
                    liyVar = liy.a;
                }
                boolI = i(g(j, liyVar), z7);
            } else {
                lab labVar2 = lbkVar.f;
                lbkVar.o(labVar2);
                labVar2.f.b("No number filter for long property. property", lbkVar.j.e(lluVar.d));
            }
        } else if ((i & 32) != 0) {
            if ((liuVar.b & 2) != 0) {
                double d = lluVar.h;
                liy liyVar2 = liuVar.d;
                if (liyVar2 == null) {
                    liyVar2 = liy.a;
                }
                boolI = i(f(d, liyVar2), z7);
            } else {
                lab labVar3 = lbkVar.f;
                lbkVar.o(labVar3);
                labVar3.f.b("No number filter for double property. property", lbkVar.j.e(lluVar.d));
            }
        } else if ((i & 4) != 0) {
            int i2 = liuVar.b;
            if ((i2 & 1) != 0) {
                String str = lluVar.e;
                lje ljeVar = liuVar.c;
                if (ljeVar == null) {
                    ljeVar = lje.a;
                }
                lab labVar4 = lbkVar.f;
                lbkVar.o(labVar4);
                boolI = i(e(str, ljeVar, labVar4), z7);
            } else if ((i2 & 2) == 0) {
                lab labVar5 = lbkVar.f;
                lbkVar.o(labVar5);
                labVar5.f.b("No string or number filter defined. property", lbkVar.j.e(lluVar.d));
            } else if (lik.H(lluVar.e)) {
                String str2 = lluVar.e;
                liy liyVar3 = liuVar.d;
                if (liyVar3 == null) {
                    liyVar3 = liy.a;
                }
                boolI = i(h(str2, liyVar3), z7);
            } else {
                lab labVar6 = lbkVar.f;
                lbkVar.o(labVar6);
                labVar6.f.c("Invalid user property value for Numeric number filter. property, value", lbkVar.j.e(lluVar.d), lluVar.e);
            }
        } else {
            lab labVar7 = lbkVar.f;
            lbkVar.o(labVar7);
            labVar7.f.b("User property has no value, property", lbkVar.j.e(lluVar.d));
        }
        lab labVar8 = lbkVar.f;
        lbkVar.o(labVar8);
        labVar8.k.b("Property filter result", boolI == null ? "null" : boolI);
        if (boolI == null) {
            return false;
        }
        this.e = true;
        if (z4 && !boolI.booleanValue()) {
            return true;
        }
        if (!z || ljaVar.f) {
            this.f = boolI;
        }
        if (boolI.booleanValue() && z6 && (lluVar.b & 1) != 0) {
            long jLongValue = lluVar.c;
            if (l != null) {
                jLongValue = l.longValue();
            }
            if (zT && ljaVar.f && !ljaVar.g && l2 != null) {
                jLongValue = l2.longValue();
            }
            if (ljaVar.g) {
                this.h = Long.valueOf(jLongValue);
            } else {
                this.g = Long.valueOf(jLongValue);
            }
        }
        return true;
    }
}
