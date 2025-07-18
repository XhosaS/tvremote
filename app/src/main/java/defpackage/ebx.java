package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebx extends Drawable implements ebz {
    private static final RectF a = new RectF();
    private static final RectF b = new RectF();
    private static final RectF c = new RectF();
    private final ebw d;
    private Paint e;
    private Path f;
    private Path g;
    private boolean h;

    public ebx(ebw ebwVar) {
        this.d = ebwVar;
    }

    private final Path b() {
        if (this.h) {
            return this.f;
        }
        return null;
    }

    private static void c(Canvas canvas, RectF rectF, Path path, float[] fArr, Paint paint) {
        float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
        if (path == null) {
            float fMin2 = Math.min(fMin, fArr[0]);
            canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        } else {
            if (path.isEmpty()) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            canvas.drawPath(path, paint);
        }
    }

    private final void d(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.e.setStrokeWidth(f);
        this.e.setColor(i);
        RectF rectF = a;
        rectF.set(f2, f3, f4, f5);
        RectF rectF2 = b;
        rectF2.set(getBounds());
        if (z) {
            rectF2.inset(rectF.centerX() - rectF.left, 0.0f);
        } else {
            rectF2.inset(0.0f, rectF.centerY() - rectF.top);
        }
        int iSave = canvas.save();
        canvas.clipRect(rectF);
        c(canvas, rectF2, b(), this.d.j, this.e);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.ebz
    public final boolean a(ebz ebzVar) {
        return equals(ebzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebx.draw(android.graphics.Canvas):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ebx) {
            return drm.a(this.d, ((ebx) obj).d);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Paint paint = this.e;
        if (paint != null) {
            return paint.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.e;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.e;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }
}
