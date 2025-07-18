package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzx implements idf {
    private final idf a;
    private final idf b;
    private final idf c;
    private final idf d;
    private final idf e;
    private final idf f;
    private final idf g;

    public kzx(idf idfVar, kta ktaVar) {
        ktaVar.getClass();
        this.a = new lbq(new jxt(ktaVar, 13), new jxt(ktaVar, 14));
        ktaVar.getClass();
        this.b = new lcj(new jxt(ktaVar, 19), new jxt(ktaVar, 20));
        ktaVar.getClass();
        this.c = new lcf(idfVar, new jxt(ktaVar, 17), new jxt(ktaVar, 18));
        ktaVar.getClass();
        this.d = new lax(idfVar, new jxt(ktaVar, 10), new jxt(ktaVar, 11), new jxt(ktaVar, 12));
        ktaVar.getClass();
        this.e = new lbs(new jxt(ktaVar, 15), new jxt(ktaVar, 16));
        this.f = las.a;
        ktaVar.getClass();
        this.g = new lbj(new jxt(ktaVar, 9), 1);
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        xax xaxVar = (xax) obj;
        xaz xazVar = xaxVar.c;
        if (xazVar == null) {
            xazVar = xaz.a;
        }
        if ((xazVar.b & 8) == 0) {
            return ieg.a;
        }
        xay xayVarB = xay.b(xazVar.f);
        if (xayVarB == null) {
            xayVarB = xay.ANDROID_APP;
        }
        int iOrdinal = xayVarB.ordinal();
        if (iOrdinal == 0) {
            ieg iegVar = (ieg) this.g.b(xaxVar);
            if (!iegVar.m()) {
                return ieg.a;
            }
            vtw vtwVarM = kzw.a.m();
            kzi kziVar = (kzi) iegVar.g();
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            kzw kzwVar = (kzw) vtwVarM.b;
            kzwVar.c = kziVar;
            kzwVar.b = 10;
            return ieg.f((kzw) vtwVarM.r());
        }
        if (iOrdinal == 5) {
            ieg iegVar2 = (ieg) this.a.b(xaxVar);
            if (!iegVar2.m()) {
                return ieg.a;
            }
            vtw vtwVarM2 = kzw.a.m();
            lbl lblVar = (lbl) iegVar2.g();
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            kzw kzwVar2 = (kzw) vtwVarM2.b;
            kzwVar2.c = lblVar;
            kzwVar2.b = 1;
            return ieg.f((kzw) vtwVarM2.r());
        }
        if (iOrdinal == 13) {
            ieg iegVar3 = (ieg) this.f.b(xaxVar);
            if (!iegVar3.m()) {
                return ieg.a;
            }
            vtw vtwVarM3 = kzw.a.m();
            laq laqVar = (laq) iegVar3.g();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            kzw kzwVar3 = (kzw) vtwVarM3.b;
            kzwVar3.c = laqVar;
            kzwVar3.b = 6;
            return ieg.f((kzw) vtwVarM3.r());
        }
        if (iOrdinal == 17) {
            ieg iegVar4 = (ieg) this.e.b(xaxVar);
            if (!iegVar4.m()) {
                return ieg.a;
            }
            vtw vtwVarM4 = kzw.a.m();
            lbr lbrVar = (lbr) iegVar4.g();
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            kzw kzwVar4 = (kzw) vtwVarM4.b;
            kzwVar4.c = lbrVar;
            kzwVar4.b = 5;
            return ieg.f((kzw) vtwVarM4.r());
        }
        switch (iOrdinal) {
            case 8:
                ieg iegVar5 = (ieg) this.b.b(xaxVar);
                if (!iegVar5.m()) {
                    return ieg.a;
                }
                vtw vtwVarM5 = kzw.a.m();
                lcg lcgVar = (lcg) iegVar5.g();
                if (!vtwVarM5.b.A()) {
                    vtwVarM5.u();
                }
                kzw kzwVar5 = (kzw) vtwVarM5.b;
                kzwVar5.c = lcgVar;
                kzwVar5.b = 2;
                return ieg.f((kzw) vtwVarM5.r());
            case 9:
                ieg iegVar6 = (ieg) this.c.b(xaxVar);
                if (!iegVar6.m()) {
                    return ieg.a;
                }
                vtw vtwVarM6 = kzw.a.m();
                lcd lcdVar = (lcd) iegVar6.g();
                if (!vtwVarM6.b.A()) {
                    vtwVarM6.u();
                }
                kzw kzwVar6 = (kzw) vtwVarM6.b;
                kzwVar6.c = lcdVar;
                kzwVar6.b = 3;
                return ieg.f((kzw) vtwVarM6.r());
            case 10:
                ieg iegVar7 = (ieg) this.d.b(xaxVar);
                if (!iegVar7.m()) {
                    return ieg.a;
                }
                vtw vtwVarM7 = kzw.a.m();
                lau lauVar = (lau) iegVar7.g();
                if (!vtwVarM7.b.A()) {
                    vtwVarM7.u();
                }
                kzw kzwVar7 = (kzw) vtwVarM7.b;
                kzwVar7.c = lauVar;
                kzwVar7.b = 4;
                return ieg.f((kzw) vtwVarM7.r());
            default:
                return ieg.a;
        }
    }
}
