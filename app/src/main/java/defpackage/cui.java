package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cui extends cug {
    private final Paint j;
    private final Rect k;
    private final Rect l;
    private final cqe m;
    private crt n;
    private crt o;

    public cui(cqd cqdVar, cuk cukVar) {
        super(cqdVar, cukVar);
        this.j = new cqs(3);
        this.k = new Rect();
        this.l = new Rect();
        String str = cukVar.f;
        cph cphVar = cqdVar.a;
        this.m = cphVar == null ? null : (cqe) cphVar.c.get(str);
    }

    @Override // defpackage.cug, defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        this.g.e(obj, cxbVar);
        if (obj == cqi.K) {
            this.n = new csl(cxbVar, null);
        } else if (obj == cqi.N) {
            this.o = new csl(cxbVar, null);
        }
    }

    @Override // defpackage.cug, defpackage.cqy
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        cqe cqeVar = this.m;
        if (cqeVar != null) {
            float f = cqeVar.a;
            float fA = cwy.a();
            rectF.set(0.0f, 0.0f, f * fA, cqeVar.b * fA);
            this.a.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    @Override // defpackage.cug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.graphics.Canvas r11, android.graphics.Matrix r12, int r13) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cui.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
