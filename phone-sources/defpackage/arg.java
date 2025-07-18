package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arg implements yjz {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public arg(long j, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = j;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        arb arbVar;
        int i = this.d;
        if (i == 0) {
            bao baoVar = (bao) obj;
            int iIntValue = ((Number) obj2).intValue();
            int i2 = iIntValue & 3;
            if (baoVar.L(i2 != 2, iIntValue & 1)) {
                zy.x(this.a, wv.N(baoVar).m, bga.k(417635459, new acv(this.b, this.c, 16, null), baoVar), baoVar, 384);
            } else {
                baoVar.t();
            }
            return ygi.a;
        }
        if (i == 1) {
            bao baoVar2 = (bao) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && baoVar2.K()) {
                baoVar2.t();
            } else {
                float f = ann.a;
                int i3 = 5;
                any anyVarA = ann.a(this.a, baoVar2, 5);
                Object obj3 = this.b;
                boolean zH = baoVar2.H(obj3);
                Object objG = baoVar2.g();
                if (zH || objG == ban.a) {
                    objG = new aoe(obj3, i3);
                    baoVar2.A(objG);
                }
                kv.I((yjk) objG, anyVarA, bga.k(-929149933, new ro(this.c, 8), baoVar2), baoVar2, 382);
            }
            return ygi.a;
        }
        if (i == 2) {
            bao baoVar3 = (bao) obj;
            int iIntValue2 = ((Number) obj2).intValue();
            if (baoVar3.L((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                yy yyVar = arc.a;
                long j = this.a;
                long j2 = bnq.g;
                arl arlVarK = wv.K(baoVar3);
                arb arbVar2 = arlVarK.X;
                if (arbVar2 == null) {
                    long j3 = bnq.f;
                    long jE = arm.e(arlVarK, 26);
                    long jE2 = arm.e(arlVarK, 19);
                    arb arbVar3 = new arb(j3, jE, j3, bny.k(bnq.d(jE2), bnq.c(jE2), bnq.b(jE2), 0.38f, bnq.f(jE2)));
                    arlVarK.X = arbVar3;
                    arbVar = arbVar3;
                } else {
                    arbVar = arbVar2;
                }
                arb arbVarC = arbVar.c(j2, j, j2, j2);
                Object obj4 = this.b;
                boolean zF = baoVar3.F(obj4);
                Object objG2 = baoVar3.g();
                if (zF || objG2 == ban.a) {
                    objG2 = new awa(obj4, false ? 1 : 0);
                    baoVar3.A(objG2);
                }
                og.D((yjk) objG2, null, false, null, arbVarC, null, bga.k(521110564, new ro(this.c, 11), baoVar3), baoVar3, 805306368);
            } else {
                baoVar3.t();
            }
            return ygi.a;
        }
        if (i == 3) {
            bao baoVar4 = (bao) obj;
            int iIntValue3 = ((Number) obj2).intValue();
            if (baoVar4.L((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                zy.x(this.a, wv.N(baoVar4).m, bga.k(-772984570, new awh(this.b, this.c, 1), baoVar4), baoVar4, 384);
            } else {
                baoVar4.t();
            }
            return ygi.a;
        }
        bao baoVar5 = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar5.K()) {
            baoVar5.t();
        } else {
            Object objG3 = baoVar5.g();
            if (objG3 == ban.a) {
                objG3 = dmo.a;
                baoVar5.A(objG3);
            }
            yjk yjkVar = (yjk) ((ymj) objG3);
            long j4 = this.a;
            Object obj5 = this.b;
            ?? r7 = this.c;
            baoVar5.y(-683746039);
            baoVar5.y(-548224868);
            if (!(baoVar5.c() instanceof dio)) {
                zy.n();
            }
            baoVar5.w();
            if (baoVar5.J()) {
                baoVar5.k(yjkVar);
            } else {
                baoVar5.B();
            }
            beb.a(baoVar5, new cmc(j4), new diw(9));
            beb.a(baoVar5, obj5, new diw(10));
            r7.a(baoVar5, 0);
            baoVar5.o();
            baoVar5.q();
            baoVar5.q();
        }
        return ygi.a;
    }

    public arg(yjz yjzVar, long j, dms dmsVar, int i) {
        this.d = i;
        this.c = yjzVar;
        this.a = j;
        this.b = dmsVar;
    }
}
