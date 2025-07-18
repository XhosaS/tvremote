package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzo extends hzp {
    float a;
    final float b;
    final RectF c = new RectF();
    final /* synthetic */ hzr d;

    public hzo(hzr hzrVar, float f, float f2) {
        this.d = hzrVar;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.hzp
    public final void a(String str) {
        hzr hzrVar = this.d;
        if (hzrVar.i()) {
            Rect rect = new Rect();
            hzrVar.d.d.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.a, this.b);
            this.c.union(rectF);
        }
        this.a += hzrVar.d.d.measureText(str);
    }

    @Override // defpackage.hzp
    public final boolean b(hza hzaVar) {
        if (!(hzaVar instanceof hzb)) {
            return true;
        }
        hzb hzbVar = (hzb) hzaVar;
        hyp hypVarA = hzaVar.t.a(hzbVar.a);
        if (hypVarA == null) {
            hzr.e("TextPath path reference '%s' not found", hzbVar.a);
            return false;
        }
        hxx hxxVar = (hxx) hypVarA;
        Path path = new hzj(hxxVar.a).a;
        Matrix matrix = hxxVar.e;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.c.union(rectF);
        return false;
    }
}
