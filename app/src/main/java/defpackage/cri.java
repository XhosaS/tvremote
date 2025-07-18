package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cri implements cro, cre, crg {
    private final String c;
    private final boolean d;
    private final cqd e;
    private final crt f;
    private final crt g;
    private final crt h;
    private boolean k;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final cqv i = new cqv();
    private crt j = null;

    public cri(cqd cqdVar, cug cugVar, ctu ctuVar) {
        this.c = ctuVar.a;
        this.d = ctuVar.e;
        this.e = cqdVar;
        crt crtVarA = ctuVar.b.a();
        this.f = crtVarA;
        crt crtVarA2 = ctuVar.c.a();
        this.g = crtVarA2;
        crt crtVarA3 = ctuVar.d.a();
        this.h = crtVarA3;
        cugVar.k(crtVarA);
        cugVar.k(crtVarA2);
        cugVar.k(crtVarA3);
        crtVarA.h(this);
        crtVarA2.h(this);
        crtVarA3.h(this);
    }

    @Override // defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        crt crtVar;
        if (obj == cqi.l) {
            crtVar = this.g;
        } else if (obj == cqi.n) {
            crtVar = this.f;
        } else if (obj != cqi.m) {
            return;
        } else {
            crtVar = this.h;
        }
        crtVar.d = cxbVar;
    }

    @Override // defpackage.cro
    public final void d() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.cst
    public final void e(css cssVar, int i, List list, css cssVar2) {
        cwt.c(cssVar, i, list, cssVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    @Override // defpackage.cqw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L2f
            java.lang.Object r0 = r5.get(r6)
            cqw r0 = (defpackage.cqw) r0
            boolean r1 = r0 instanceof defpackage.crn
            if (r1 == 0) goto L22
            r1 = r0
            crn r1 = (defpackage.crn) r1
            int r2 = r1.e
            r3 = 1
            if (r2 != r3) goto L22
            cqv r0 = r4.i
            r0.a(r1)
            r1.a(r4)
            goto L2c
        L22:
            boolean r1 = r0 instanceof defpackage.crk
            if (r1 == 0) goto L2c
            crk r0 = (defpackage.crk) r0
            crt r0 = r0.a
            r4.j = r0
        L2c:
            int r6 = r6 + 1
            goto L1
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cri.f(java.util.List, java.util.List):void");
    }

    @Override // defpackage.cqw
    public final String g() {
        return this.c;
    }

    @Override // defpackage.crg
    public final Path i() {
        crt crtVar;
        if (this.k) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float fK = ((crx) this.h).k();
        if (fK == 0.0f && (crtVar = this.j) != null) {
            fK = Math.min(((Float) crtVar.e()).floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fK > fMin) {
            fK = fMin;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f, (pointF2.y - f2) + fK);
        path.lineTo(pointF2.x + f, (pointF2.y + f2) - fK);
        if (fK > 0.0f) {
            float f3 = fK + fK;
            RectF rectF = this.b;
            rectF.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f) + fK, pointF2.y + f2);
        if (fK > 0.0f) {
            float f4 = fK + fK;
            RectF rectF2 = this.b;
            rectF2.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
            path.arcTo(rectF2, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f, (pointF2.y - f2) + fK);
        if (fK > 0.0f) {
            float f5 = fK + fK;
            RectF rectF3 = this.b;
            rectF3.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
            path.arcTo(rectF3, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f) - fK, pointF2.y - f2);
        if (fK > 0.0f) {
            float f6 = fK + fK;
            RectF rectF4 = this.b;
            rectF4.set((pointF2.x + f) - f6, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f6);
            path.arcTo(rectF4, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.b(path);
        this.k = true;
        return path;
    }
}
