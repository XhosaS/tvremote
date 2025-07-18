package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfq extends hfk {
    private final RectF j;
    private final Paint k;
    private final float[] l;
    private final Path m;
    private final hfn n;
    private hdg o;

    public hfq(hbv hbvVar, hfn hfnVar) {
        super(hbvVar, hfnVar);
        this.j = new RectF();
        hch hchVar = new hch();
        this.k = hchVar;
        this.l = new float[8];
        this.m = new Path();
        this.n = hfnVar;
        hchVar.setAlpha(0);
        hchVar.setStyle(Paint.Style.FILL);
        hchVar.setColor(hfnVar.k);
    }

    @Override // defpackage.hfk, defpackage.hee
    public final void a(Object obj, hhu hhuVar) {
        super.a(obj, hhuVar);
        if (obj == hca.K) {
            this.o = new hdx(hhuVar);
        }
    }

    @Override // defpackage.hfk, defpackage.hcl
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        hfn hfnVar = this.n;
        float f = hfnVar.i;
        float f2 = hfnVar.j;
        RectF rectF2 = this.j;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.a.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.hfk
    public final void j(Canvas canvas, Matrix matrix, int i) {
        hfn hfnVar = this.n;
        int iAlpha = Color.alpha(hfnVar.k);
        if (iAlpha == 0) {
            return;
        }
        hdg hdgVar = this.g.e;
        int iIntValue = hdgVar == null ? 100 : ((Integer) hdgVar.e()).intValue();
        Paint paint = this.k;
        int i2 = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * iIntValue) / 100.0f) * 255.0f);
        paint.setAlpha(i2);
        hdg hdgVar2 = this.o;
        if (hdgVar2 != null) {
            paint.setColorFilter((ColorFilter) hdgVar2.e());
        }
        if (i2 > 0) {
            float[] fArr = this.l;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = hfnVar.i;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = hfnVar.j;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.m;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, paint);
        }
    }
}
