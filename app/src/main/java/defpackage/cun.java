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
public class cun extends cug {
    private final RectF j;
    private final Paint k;
    private final float[] l;
    private final Path m;
    private final cuk n;
    private crt o;

    public cun(cqd cqdVar, cuk cukVar) {
        super(cqdVar, cukVar);
        this.j = new RectF();
        cqs cqsVar = new cqs();
        this.k = cqsVar;
        this.l = new float[8];
        this.m = new Path();
        this.n = cukVar;
        cqsVar.setAlpha(0);
        cqsVar.setStyle(Paint.Style.FILL);
        cqsVar.setColor(cukVar.k);
    }

    @Override // defpackage.cug, defpackage.cst
    public final void a(Object obj, cxb cxbVar) {
        this.g.e(obj, cxbVar);
        if (obj == cqi.K) {
            this.o = new csl(cxbVar, null);
        }
    }

    @Override // defpackage.cug, defpackage.cqy
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        cuk cukVar = this.n;
        float f = cukVar.i;
        float f2 = cukVar.j;
        RectF rectF2 = this.j;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.a.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.cug
    public final void l(Canvas canvas, Matrix matrix, int i) {
        cuk cukVar = this.n;
        int iAlpha = Color.alpha(cukVar.k);
        if (iAlpha == 0) {
            return;
        }
        crt crtVar = this.g.e;
        int iIntValue = crtVar == null ? 100 : ((Integer) crtVar.e()).intValue();
        Paint paint = this.k;
        int i2 = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * iIntValue) / 100.0f) * 255.0f);
        paint.setAlpha(i2);
        crt crtVar2 = this.o;
        if (crtVar2 != null) {
            paint.setColorFilter((ColorFilter) crtVar2.e());
        }
        if (i2 > 0) {
            float[] fArr = this.l;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = cukVar.i;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = cukVar.j;
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
