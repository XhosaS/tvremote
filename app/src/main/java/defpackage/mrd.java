package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mrd extends mjb {
    private static final zdy m = zdy.h("com/google/android/libraries/elements/converters/imageprocessor/BorderImageProcessorDrawable");
    public boolean i;
    mre j;
    nmj k;
    public Paint l;
    private final Paint n;
    private final float o;
    private final float p;
    private final boolean q;
    private final int r;
    private final Path s;

    public mrd(Bitmap bitmap, ImageView.ScaleType scaleType, float f, int i, float f2, boolean z, oco ocoVar, yqt yqtVar) {
        super(bitmap, scaleType, ocoVar, yqtVar);
        this.i = false;
        this.s = new Path();
        this.q = z;
        this.o = f;
        this.p = f2;
        Paint paint = new Paint();
        this.n = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(f);
        this.r = (int) (f * 0.5f);
        this.e = bitmap;
    }

    @Override // defpackage.mjb
    protected final void a(Rect rect) {
        Rect rect2 = new Rect(rect);
        int i = this.r;
        rect2.inset(i, i);
        super.a(rect2);
        mre mreVar = this.j;
        if (mreVar != null) {
            mreVar.d(this.c, c(), this.f);
        }
        if (d()) {
            return;
        }
        b();
    }

    public final void b() {
        if (this.k == null) {
            return;
        }
        float[] fArr = new float[8];
        boolean zC = c();
        Path path = this.s;
        path.reset();
        if (this.k.l() || ((!zC && this.k.n()) || (zC && this.k.k()))) {
            float f = this.p;
            fArr[0] = f;
            fArr[1] = f;
        }
        if (this.k.m() || ((!zC && this.k.k()) || (zC && this.k.n()))) {
            float f2 = this.p;
            fArr[2] = f2;
            fArr[3] = f2;
        }
        if (this.k.i() || ((!zC && this.k.g()) || (zC && this.k.j()))) {
            float f3 = this.p;
            fArr[4] = f3;
            fArr[5] = f3;
        }
        if (this.k.h() || ((!zC && this.k.j()) || (zC && this.k.g()))) {
            float f4 = this.p;
            fArr[6] = f4;
            fArr[7] = f4;
        }
        path.addRoundRect(this.c, fArr, Path.Direction.CW);
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    final boolean d() {
        nmj nmjVar = this.k;
        if (nmjVar == null) {
            return true;
        }
        if (!nmjVar.t() && !this.k.u() && !this.k.q() && !this.k.p() && !this.k.v() && !this.k.s() && !this.k.r() && !this.k.o()) {
            return true;
        }
        if (this.k.l() && this.k.m() && this.k.i() && this.k.h()) {
            return true;
        }
        return this.k.n() && this.k.k() && this.k.j() && this.k.g();
    }

    @Override // defpackage.mjb, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Shader shader;
        Shader shader2;
        Shader shader3;
        Shader shader4;
        boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
        if (this.i && !zIsHardwareAccelerated && this.e.getConfig() == Bitmap.Config.HARDWARE) {
            Bitmap bitmapCopy = this.e.copy(this.h ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565, false);
            if (bitmapCopy != null) {
                this.e = bitmapCopy;
            } else {
                ((zdv) ((zdv) m.d()).q("com/google/android/libraries/elements/converters/imageprocessor/BorderImageProcessorDrawable", "maybeReplaceHardwareBitmap", 352, "BorderImageProcessorDrawable.java")).u("draw: copy failed");
            }
        }
        BitmapShader bitmapShader = new BitmapShader(this.e, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(this.a);
        Paint paint = this.b;
        paint.setShader(bitmapShader);
        if (this.q) {
            RectF rectF = this.c;
            float fMin = Math.min(rectF.width() * 0.5f, rectF.height() * 0.5f);
            Paint paint2 = this.l;
            if (paint2 != null) {
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), fMin, paint2);
            }
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), fMin, paint);
            mre mreVar = this.j;
            if (mreVar != null && (shader4 = mreVar.a) != null) {
                paint.setShader(shader4);
                canvas.drawCircle(rectF.centerX(), rectF.centerY(), fMin, paint);
            }
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), fMin, this.n);
            return;
        }
        float f = this.p;
        if (f <= 0.5f) {
            Paint paint3 = this.l;
            if (paint3 != null) {
                canvas.drawRect(this.c, paint3);
            }
            RectF rectF2 = this.c;
            canvas.drawRect(rectF2, paint);
            mre mreVar2 = this.j;
            if (mreVar2 != null && (shader = mreVar2.a) != null) {
                paint.setShader(shader);
                canvas.drawRect(rectF2, paint);
            }
            if (this.o > 0.5f) {
                canvas.drawRect(rectF2, this.n);
                return;
            }
            return;
        }
        if (d()) {
            Paint paint4 = this.l;
            if (paint4 != null) {
                canvas.drawRoundRect(this.c, f, f, paint4);
            }
            RectF rectF3 = this.c;
            canvas.drawRoundRect(rectF3, f, f, paint);
            mre mreVar3 = this.j;
            if (mreVar3 != null && (shader3 = mreVar3.a) != null) {
                paint.setShader(shader3);
                canvas.drawRoundRect(rectF3, f, f, paint);
            }
            if (this.o > 0.5f) {
                canvas.drawRoundRect(rectF3, f, f, this.n);
                return;
            }
            return;
        }
        Paint paint5 = this.l;
        if (paint5 != null) {
            canvas.drawPath(this.s, paint5);
        }
        Path path = this.s;
        canvas.drawPath(path, paint);
        mre mreVar4 = this.j;
        if (mreVar4 != null && (shader2 = mreVar4.a) != null) {
            paint.setShader(shader2);
            canvas.drawPath(path, paint);
        }
        if (this.o > 0.5f) {
            canvas.drawPath(path, this.n);
        }
    }

    @Override // defpackage.mjb, android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.p > 0.0f) {
            return -3;
        }
        return super.getOpacity();
    }
}
