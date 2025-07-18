package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zo extends bko implements byl {
    public float a;
    public float b;

    public zo(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        int iD;
        int iC;
        int i = 0;
        if (Float.isNaN(this.a) || clv.d(j) != 0) {
            iD = clv.d(j);
        } else {
            int iCu = bvvVar.cu(this.a);
            iD = clv.b(j);
            if (iCu < 0) {
                iCu = 0;
            }
            if (iCu <= iD) {
                iD = iCu;
            }
        }
        int iB = clv.b(j);
        if (Float.isNaN(this.b) || clv.c(j) != 0) {
            iC = clv.c(j);
        } else {
            int iCu2 = bvvVar.cu(this.b);
            iC = clv.a(j);
            if (iCu2 < 0) {
                iCu2 = 0;
            }
            if (iCu2 <= iC) {
                iC = iCu2;
            }
        }
        bwj bwjVarU = bvsVar.u(clw.d(iD, iB, iC, clv.a(j)));
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new zn(bwjVarU, i));
    }

    @Override // defpackage.byl
    public final int e(buz buzVar, buy buyVar, int i) {
        int iC = buyVar.c(i);
        int iCu = !Float.isNaN(this.b) ? buzVar.cu(this.b) : 0;
        return iC < iCu ? iCu : iC;
    }

    @Override // defpackage.byl
    public final int f(buz buzVar, buy buyVar, int i) {
        int iD = buyVar.d(i);
        int iCu = !Float.isNaN(this.a) ? buzVar.cu(this.a) : 0;
        return iD < iCu ? iCu : iD;
    }

    @Override // defpackage.byl
    public final int g(buz buzVar, buy buyVar, int i) {
        int iE = buyVar.e(i);
        int iCu = !Float.isNaN(this.b) ? buzVar.cu(this.b) : 0;
        return iE < iCu ? iCu : iE;
    }

    @Override // defpackage.byl
    public final int h(buz buzVar, buy buyVar, int i) {
        int iF = buyVar.f(i);
        int iCu = !Float.isNaN(this.a) ? buzVar.cu(this.a) : 0;
        return iF < iCu ? iCu : iF;
    }
}
