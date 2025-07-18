package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcv implements hdb, hcr, hct {
    private final String c;
    private final boolean d;
    private final hbv e;
    private final hdg f;
    private final hdg g;
    private final hdg h;
    private boolean j;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final hfw k = new hfw((byte[]) null);
    private hdg i = null;

    public hcv(hbv hbvVar, hfk hfkVar, hfa hfaVar) {
        this.c = hfaVar.a;
        this.d = hfaVar.e;
        this.e = hbvVar;
        hdg hdgVarA = hfaVar.b.a();
        this.f = hdgVarA;
        hdg hdgVarA2 = hfaVar.c.a();
        this.g = hdgVarA2;
        hdg hdgVarA3 = hfaVar.d.a();
        this.h = hdgVarA3;
        hfkVar.i(hdgVarA);
        hfkVar.i(hdgVarA2);
        hfkVar.i(hdgVarA3);
        hdgVarA.h(this);
        hdgVarA2.h(this);
        hdgVarA3.h(this);
    }

    @Override // defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        hdg hdgVar;
        if (obj == hca.l) {
            hdgVar = this.g;
        } else if (obj == hca.n) {
            hdgVar = this.f;
        } else if (obj != hca.m) {
            return;
        } else {
            hdgVar = this.h;
        }
        hdgVar.d = hhuVar;
    }

    @Override // defpackage.hdb
    public final void d() {
        this.j = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.hee
    public final void e(hed hedVar, int i, List list, hed hedVar2) {
        hhm.d(hedVar, i, list, hedVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    @Override // defpackage.hcj
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
            hcj r0 = (defpackage.hcj) r0
            boolean r1 = r0 instanceof defpackage.hda
            if (r1 == 0) goto L22
            r1 = r0
            hda r1 = (defpackage.hda) r1
            int r2 = r1.e
            r3 = 1
            if (r2 != r3) goto L22
            hfw r0 = r4.k
            r0.d(r1)
            r1.a(r4)
            goto L2c
        L22:
            boolean r1 = r0 instanceof defpackage.hcx
            if (r1 == 0) goto L2c
            hcx r0 = (defpackage.hcx) r0
            hdg r0 = r0.a
            r4.i = r0
        L2c:
            int r6 = r6 + 1
            goto L1
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hcv.f(java.util.List, java.util.List):void");
    }

    @Override // defpackage.hcj
    public final String g() {
        return this.c;
    }

    @Override // defpackage.hct
    public final Path i() {
        hdg hdgVar;
        if (this.j) {
            return this.a;
        }
        Path path = this.a;
        path.reset();
        if (this.d) {
            this.j = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float fK = ((hdk) this.h).k();
        if (fK == 0.0f && (hdgVar = this.i) != null) {
            fK = Math.min(((Float) hdgVar.e()).floatValue(), Math.min(f, f2));
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
        this.k.e(path);
        this.j = true;
        return path;
    }
}
