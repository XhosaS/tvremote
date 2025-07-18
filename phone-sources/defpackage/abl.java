package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abl extends adg {
    public final abc a;
    final /* synthetic */ abw b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ long e;
    final /* synthetic */ adc f;
    private final int g;
    private final adc h;

    public abl(abc abcVar, adc adcVar, int i, abw abwVar, int i2, int i3, long j) {
        this.f = adcVar;
        this.b = abwVar;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.a = abcVar;
        this.h = adcVar;
        this.g = i;
    }

    @Override // defpackage.adg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final abk b(int i, int i2, int i3, long j) {
        return c(i, j, i2, i3, this.g);
    }

    public final abk c(int i, long j, int i2, int i3, int i4) {
        int iC;
        abc abcVar = this.a;
        Object objD = abcVar.d(i);
        abcVar.c(i);
        boolean zJ = clv.j(j);
        List listE = e(this.h, i, j);
        if (zJ) {
            iC = clv.d(j);
        } else {
            if (!clv.i(j)) {
                wv.c("does not have fixed height");
            }
            iC = clv.c(j);
        }
        int i5 = iC;
        adc adcVar = this.f;
        abw abwVar = this.b;
        return new abk(i, objD, i5, i4, adcVar.n(), this.c, this.d, listE, this.e, abwVar.i, j, i2, i3);
    }

    public final eph d() {
        return this.a.b;
    }
}
