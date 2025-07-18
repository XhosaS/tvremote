package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yg extends bko implements byl {
    public float a;
    public int b;

    public yg(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        int iD;
        int iB;
        int iA;
        int iA2;
        if (!clv.h(j) || this.b == 1) {
            iD = clv.d(j);
            iB = clv.b(j);
        } else {
            float fB = clv.b(j) * this.a;
            int iD2 = clv.d(j);
            iD = clv.b(j);
            int iRound = Math.round(fB);
            if (iRound >= iD2) {
                iD2 = iRound;
            }
            if (iD2 <= iD) {
                iD = iD2;
            }
            iB = iD;
        }
        if (!clv.g(j) || this.b == 2) {
            int iC = clv.c(j);
            iA = clv.a(j);
            iA2 = iC;
        } else {
            float fA = clv.a(j) * this.a;
            int iC2 = clv.c(j);
            iA2 = clv.a(j);
            int iRound2 = Math.round(fA);
            if (iRound2 >= iC2) {
                iC2 = iRound2;
            }
            if (iC2 <= iA2) {
                iA2 = iC2;
            }
            iA = iA2;
        }
        bwj bwjVarU = bvsVar.u(clw.d(iD, iB, iA2, iA));
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new kb(bwjVarU, 19));
    }

    @Override // defpackage.byl
    public final /* synthetic */ int e(buz buzVar, buy buyVar, int i) {
        return fh.x(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int f(buz buzVar, buy buyVar, int i) {
        return fh.y(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int g(buz buzVar, buy buyVar, int i) {
        return fh.z(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int h(buz buzVar, buy buyVar, int i) {
        return fh.A(this, buzVar, buyVar, i);
    }
}
