package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cft {
    public final cku a;
    public final cho b;
    public final CharSequence c;
    public final List d;
    private final int e;
    private final int f;
    private final long g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0184  */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cft(defpackage.cku r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cft.<init>(cku, int, int, long):void");
    }

    static /* synthetic */ cho k(cft cftVar, int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        return cftVar.n(i, i2, truncateAt, i3, i4, i5, i6, i7, cftVar.c);
    }

    private final cho n(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        float f = f();
        ckw ckwVarI = i();
        cks cksVar = ckt.a;
        cku ckuVar = this.a;
        return new cho(charSequence, f, ckwVarI, i, truncateAt, ckuVar.e, i3, i5, i6, i7, i4, i2, ckuVar.d);
    }

    public final float a() {
        return e(0);
    }

    public final float b() {
        return this.b.g();
    }

    public final float c(int i, boolean z) {
        return z ? this.b.e(i, false) : this.b.f(i, false);
    }

    public final float d() {
        return e(g() - 1);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        cho choVar = this.b;
        return choVar.f + ((i != choVar.e + (-1) || (fontMetricsInt = choVar.i) == null) ? choVar.d.getLineBaseline(i) : choVar.d(i) - fontMetricsInt.ascent);
    }

    public final float f() {
        return clv.b(this.g);
    }

    public final int g() {
        return this.b.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(defpackage.bmy r13, int r14, defpackage.cgx r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cft.h(bmy, int, cgx):long");
    }

    public final ckw i() {
        return this.a.b;
    }

    public final boolean j() {
        return this.b.c;
    }

    public final int l(int i) {
        return this.b.r(i) ? 2 : 1;
    }

    public final void m(bnp bnpVar, long j, bok bokVar, cll cllVar, brx brxVar) {
        int i = i().a;
        ckw ckwVarI = i();
        ckwVarI.c(j);
        ckwVarI.d(bokVar);
        ckwVarI.e(cllVar);
        ckwVarI.f(brxVar);
        ckwVarI.a(3);
        Canvas canvasA = bnc.a(bnpVar);
        if (j()) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, f(), b());
        }
        cho choVar = this.b;
        if (canvasA.getClipBounds(choVar.j)) {
            int i2 = choVar.f;
            if (i2 != 0) {
                canvasA.translate(0.0f, i2);
            }
            chn chnVar = chp.a;
            chnVar.a = canvasA;
            choVar.d.draw(chnVar);
            if (i2 != 0) {
                canvasA.translate(0.0f, -i2);
            }
        }
        if (j()) {
            canvasA.restore();
        }
        i().a(i);
    }
}
