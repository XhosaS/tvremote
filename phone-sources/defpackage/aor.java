package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aor implements yjz {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aor(long j, Object obj, int i) {
        this.c = i;
        this.a = j;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r13v13, types: [bkp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r5v1, types: [bkp, java.lang.Object] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            bao baoVar = (bao) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
                baoVar.t();
            } else {
                bcm.i(anv.a.c(Float.valueOf(bnq.a(this.a))), bga.k(-1072292694, new aoq(this.b, 3), baoVar), baoVar, 56);
            }
            return ygi.a;
        }
        if (i != 1) {
            if (i == 2) {
                bao baoVar2 = (bao) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (baoVar2.L((iIntValue & 3) != 2, iIntValue & 1)) {
                    zy.t(this.a, this.b, baoVar2, 0);
                } else {
                    baoVar2.t();
                }
                return ygi.a;
            }
            if (i != 3) {
                bao baoVar3 = (bao) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && baoVar3.K()) {
                    baoVar3.t();
                } else {
                    jyv.z((kow) this.b, null, this.a, baoVar3, 0);
                }
                return ygi.a;
            }
            bao baoVar4 = (bao) obj;
            int iIntValue2 = ((Number) obj2).intValue();
            if (baoVar4.L((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                zy.t(this.a, this.b, baoVar4, 0);
            } else {
                baoVar4.t();
            }
            return ygi.a;
        }
        bao baoVar5 = (bao) obj;
        int iIntValue3 = ((Number) obj2).intValue();
        int i2 = iIntValue3 & 3;
        if (baoVar5.L(i2 != 2, iIntValue3 & 1)) {
            long j = this.a;
            if (j != 9205357640488583168L) {
                baoVar5.x(-1244013944);
                bkp bkpVarL = zi.l(this.b, cmc.b(j), cmc.a(j), 0.0f, 0.0f, 12);
                bvt bvtVarA = xo.a(bkb.b, false);
                int iK = a.k(zy.p(baoVar5));
                bhu bhuVarO = baoVar5.O();
                bkp bkpVarC = bdi.C(baoVar5, bkpVarL);
                yjk yjkVar = bxt.a;
                baoVar5.c();
                baoVar5.z();
                if (baoVar5.J()) {
                    baoVar5.k(yjkVar);
                } else {
                    baoVar5.B();
                }
                beb.a(baoVar5, bvtVarA, bxt.d);
                beb.a(baoVar5, bhuVarO, bxt.c);
                yjz yjzVar = bxt.e;
                if (baoVar5.J() || !yks.e(baoVar5.g(), Integer.valueOf(iK))) {
                    Integer numValueOf = Integer.valueOf(iK);
                    baoVar5.A(numValueOf);
                    baoVar5.i(numValueOf, yjzVar);
                }
                beb.a(baoVar5, bkpVarC, bxt.b);
                hp.q(null, baoVar5, 0, 1);
                baoVar5.o();
                baoVar5.p();
            } else {
                baoVar5.x(-1243644858);
                hp.q(this.b, baoVar5, 0, 0);
                baoVar5.p();
            }
        } else {
            baoVar5.t();
        }
        return ygi.a;
    }

    public aor(kow kowVar, long j, int i) {
        this.c = i;
        this.b = kowVar;
        this.a = j;
    }
}
