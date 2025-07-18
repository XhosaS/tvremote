package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ym implements yjv {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ym(int i, bwj bwjVar, int i2, int i3) {
        this.d = i3;
        this.a = i;
        this.c = bwjVar;
        this.b = i2;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        int i = this.d;
        if (i == 0) {
            ((bwi) obj).r((bwj) this.c, this.a, this.b, 0.0f);
            return ygi.a;
        }
        if (i == 1) {
            bwi.z((bwi) obj, (bwj) this.c, this.a, this.b);
            return ygi.a;
        }
        if (i == 2) {
            ((bwi) obj).r((bwj) this.c, this.a, this.b, 0.0f);
            return ygi.a;
        }
        if (i == 3) {
            ahw ahwVar = (ahw) obj;
            long jN = ccf.N(0, ahwVar.a());
            aiv aivVar = ((aik) this.c).a;
            long j = chb.a;
            akb akbVar = aivVar.a;
            long jC = akbVar.c(jN);
            int iD = chb.d(jC);
            int iC = chb.c(jC);
            int i2 = this.a;
            if (i2 >= iD) {
                iD = i2;
            }
            if (iD <= iC) {
                iC = iD;
            }
            int iD2 = chb.d(jC);
            int iC2 = chb.c(jC);
            int i3 = this.b;
            if (i3 >= iD2) {
                iD2 = i3;
            }
            if (iD2 <= iC2) {
                iC2 = iD2;
            }
            ahwVar.g(akbVar.b(ccf.N(iC, iC2)));
            return ygi.a;
        }
        if (i == 4) {
            ((bwi) obj).r((bwj) this.c, yln.v((this.a - r0.a) / 2.0f), yln.v((this.b - r0.b) / 2.0f), 0.0f);
            return ygi.a;
        }
        if (i == 5) {
            ((bwi) obj).r((bwj) this.c, yln.v((this.a - r0.a) / 2.0f), yln.v((this.b - r0.b) / 2.0f), 0.0f);
            return ygi.a;
        }
        cgj cgjVar = (cgj) obj;
        cft cftVar = cgjVar.g;
        int iE = cgjVar.e(this.a);
        int iE2 = cgjVar.e(this.b);
        if (iE < 0 || iE > iE2 || iE2 > cftVar.c.length()) {
            cko.a("start(" + iE + ") or end(" + iE2 + ") is out of range [0.." + cftVar.c.length() + "], or start > end!");
        }
        Path path = new Path();
        cho choVar = cftVar.b;
        choVar.d.getSelectionPath(iE, iE2, path);
        int i4 = choVar.f;
        if (i4 != 0 && !path.isEmpty()) {
            path.offset(0.0f, i4);
        }
        Object obj2 = this.c;
        bni bniVar = new bni(path);
        float f = cgjVar.e;
        bniVar.n((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        ((bni) obj2).p(bniVar);
        return ygi.a;
    }

    public /* synthetic */ ym(Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }
}
