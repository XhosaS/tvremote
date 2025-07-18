package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfm extends hfk {
    private final Paint j;
    private final Rect k;
    private final Rect l;
    private final hbw m;
    private hdg n;
    private hdg o;

    public hfm(hbv hbvVar, hfn hfnVar) {
        super(hbvVar, hfnVar);
        this.j = new hch(3);
        this.k = new Rect();
        this.l = new Rect();
        String str = hfnVar.f;
        hbk hbkVar = hbvVar.a;
        this.m = hbkVar == null ? null : (hbw) hbkVar.b.get(str);
    }

    @Override // defpackage.hfk, defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        super.a(obj, hhuVar);
        if (obj == hca.K) {
            this.n = new hdx(hhuVar);
        } else if (obj == hca.N) {
            this.o = new hdx(hhuVar);
        }
    }

    @Override // defpackage.hfk, defpackage.hcl
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        hbw hbwVar = this.m;
        if (hbwVar != null) {
            float f = hbwVar.a;
            float fA = hhr.a();
            rectF.set(0.0f, 0.0f, f * fA, hbwVar.b * fA);
            this.a.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    @Override // defpackage.hfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r11, android.graphics.Matrix r12, int r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfm.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
