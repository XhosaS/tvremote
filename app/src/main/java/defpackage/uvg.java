package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvg implements uvo {
    private static uvg a;
    private final Paint b;

    private uvg(Resources resources) {
        Paint paint = new Paint();
        this.b = paint;
        paint.setShader(new BitmapShader(((BitmapDrawable) resources.getDrawable(R.drawable.scrim_noise_overlay, null)).getBitmap(), Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        paint.setDither(true);
    }

    public static synchronized uvg g(Resources resources) {
        if (a == null) {
            a = new uvg(resources);
        }
        return a;
    }

    public final Paint a(ColorFilter colorFilter) {
        if (colorFilter == null) {
            return this.b;
        }
        Paint paint = new Paint(this.b);
        paint.setColorFilter(colorFilter);
        return paint;
    }

    @Override // defpackage.uvo
    public final /* synthetic */ uvq b() {
        return new uuy(this);
    }

    @Override // defpackage.uvo
    public final /* synthetic */ void c(Canvas canvas, bho bhoVar) {
        canvas.drawPaint(this.b);
    }

    @Override // defpackage.uvo
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.uvo
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj instanceof uvg;
    }

    @Override // defpackage.uvo
    public final boolean f() {
        return false;
    }

    @Override // defpackage.uvo
    public final /* synthetic */ djg h(int i, int i2, Bitmap.Config config) {
        return new uvh(this, null, null, i, i2, config);
    }

    public final int hashCode() {
        return 137;
    }

    @Override // defpackage.uvo
    public final /* synthetic */ void i(Canvas canvas) {
        canvas.drawPaint(this.b);
    }

    @Override // defpackage.uvo
    public final void j(Canvas canvas, ColorFilter colorFilter) {
        canvas.drawPaint(a(colorFilter));
    }

    @Override // defpackage.uvo
    public final void k(Canvas canvas, bho bhoVar) {
        canvas.drawPaint(this.b);
    }

    public final String toString() {
        return "NoiseScrim";
    }
}
