package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aiz implements yjv {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ aiz(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        int i = this.c;
        int i2 = 0;
        if (i == 0) {
            ahw ahwVar = (ahw) obj;
            int i3 = this.b;
            int i4 = this.a;
            if (i4 < 0 || i3 < 0) {
                wv.c(a.cn(i3, i4, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively."));
            }
            int iA = chb.a(ahwVar.b);
            int iA2 = iA + i3;
            if (((i3 ^ iA2) & (iA ^ iA2)) < 0) {
                iA2 = ahwVar.a();
            }
            hu.A(ahwVar, chb.a(ahwVar.b), Math.min(iA2, ahwVar.a()));
            int iE = chb.e(ahwVar.b);
            int i5 = iE - i4;
            if (((iE ^ i5) & (iE ^ i4)) < 0) {
                i5 = 0;
            }
            hu.A(ahwVar, Math.max(0, i5), chb.e(ahwVar.b));
            return ygi.a;
        }
        if (i != 1) {
            ahw ahwVar2 = (ahw) obj;
            if (ahwVar2.c != null) {
                ahwVar2.d();
            }
            int i6 = this.b;
            int iL = ykn.l(this.a, 0, ahwVar2.a());
            int iL2 = ykn.l(i6, 0, ahwVar2.a());
            if (iL != iL2) {
                if (iL < iL2) {
                    ahwVar2.f(iL, iL2, null);
                } else {
                    ahwVar2.f(iL2, iL, null);
                }
            }
            return ygi.a;
        }
        ahw ahwVar3 = (ahw) obj;
        int i7 = this.b;
        int i8 = this.a;
        if (i8 < 0 || i7 < 0) {
            wv.c(a.cn(i7, i8, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", " and ", " respectively."));
        }
        int i9 = 0;
        int iE2 = 0;
        while (true) {
            if (i9 < i8) {
                int i10 = iE2 + 1;
                if (chb.e(ahwVar3.b) <= i10) {
                    iE2 = chb.e(ahwVar3.b);
                    break;
                }
                ajb ajbVar = ahwVar3.a;
                iE2 = hu.D(ajbVar.a((chb.e(ahwVar3.b) - i10) + (-1)), ajbVar.a(chb.e(ahwVar3.b) - i10)) ? iE2 + 2 : i10;
                i9++;
            } else {
                break;
            }
        }
        int iA3 = 0;
        while (true) {
            if (i2 >= i7) {
                break;
            }
            int i11 = iA3 + 1;
            if (chb.a(ahwVar3.b) + i11 >= ahwVar3.a()) {
                iA3 = ahwVar3.a() - chb.a(ahwVar3.b);
                break;
            }
            ajb ajbVar2 = ahwVar3.a;
            iA3 = hu.D(ajbVar2.a((chb.a(ahwVar3.b) + i11) + (-1)), ajbVar2.a(chb.a(ahwVar3.b) + i11)) ? iA3 + 2 : i11;
            i2++;
        }
        hu.A(ahwVar3, chb.a(ahwVar3.b), chb.a(ahwVar3.b) + iA3);
        long j = ahwVar3.b;
        hu.A(ahwVar3, chb.e(j) - iE2, chb.e(j));
        return ygi.a;
    }
}
