package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awv implements ahy {
    final /* synthetic */ aid a;
    final /* synthetic */ aic b;
    final /* synthetic */ yjz c;
    final /* synthetic */ yjz d;
    final /* synthetic */ yjz e;
    final /* synthetic */ boolean f;
    final /* synthetic */ yy g;
    final /* synthetic */ awu h;
    final /* synthetic */ yjz i;
    final /* synthetic */ kw j;
    final /* synthetic */ a k;

    public awv(aid aidVar, aic aicVar, a aVar, yjz yjzVar, yjz yjzVar2, yjz yjzVar3, boolean z, kw kwVar, yy yyVar, awu awuVar, yjz yjzVar4) {
        this.a = aidVar;
        this.b = aicVar;
        this.k = aVar;
        this.c = yjzVar;
        this.d = yjzVar2;
        this.e = yjzVar3;
        this.f = z;
        this.j = kwVar;
        this.g = yyVar;
        this.h = awuVar;
        this.i = yjzVar4;
    }

    @Override // defpackage.ahy
    public final void a(yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-94654579);
        if (i3 == 0) {
            i2 = i | (true != baoVarD.H(yjzVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(this) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            zy.D(this.a.c(), yjzVar, this.k, this.c, this.d, this.e, yks.e(this.b, aib.a), this.f, this.j, this.g, this.h, this.i, baoVarD, ((i2 << 6) & 896) | 6, 0);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(this, yjzVar, i, 18);
        }
    }
}
