package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfz implements tgb {
    private static final jp o = new jp(10);
    private static final jp p = new jp(10);
    private static final jp q = new jp(10);
    private static int r;
    private static tfz s;
    private static tfz t;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final RectF d;
    public final Paint e;
    public final Paint f;
    public final int g;
    public final int h;
    public final Paint i;
    public final Rect j;
    public final Rect k;
    public final int l;
    public final int m;
    public final boolean n;
    private final Paint u;
    private final int v;
    private final int w;
    private final float x;
    private final float y;

    static {
        new jp(10);
    }

    private tfz(Resources resources, boolean z, int i) throws Resources.NotFoundException {
        this.l = resources.getDimensionPixelSize(R.dimen.play_avatar_decoration_threshold_min);
        this.m = resources.getDimensionPixelSize(R.dimen.play_avatar_decoration_threshold_max);
        this.v = resources.getDimensionPixelSize(R.dimen.play_avatar_ring_size_min);
        this.w = resources.getDimensionPixelSize(R.dimen.play_avatar_ring_size_max);
        int color = resources.getColor(R.color.play_avatar_ring_color);
        this.x = resources.getDimensionPixelSize(R.dimen.play_avatar_drop_shadow_min) * 0.5f;
        this.y = resources.getDimensionPixelSize(R.dimen.play_avatar_drop_shadow_max) * 0.5f;
        int color2 = resources.getColor(R.color.play_avatar_outline);
        float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.play_avatar_noring_outline);
        Paint paint = new Paint();
        this.u = paint;
        paint.setColor(color2);
        float f = dimensionPixelSize * 0.5f;
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.a = paint2;
        paint2.setColor(color);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint(2);
        this.b = paint3;
        paint3.setAntiAlias(true);
        this.c = new Paint(2);
        this.d = new RectF();
        Paint paint4 = new Paint();
        this.e = paint4;
        paint4.setColor(resources.getColor(R.color.play_avatar_pressed_fill));
        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.FILL);
        this.g = resources.getColor(R.color.play_avatar_pressed_outline);
        this.h = resources.getColor(R.color.play_avatar_focused_outline);
        Paint paint5 = new Paint();
        this.f = paint5;
        paint5.setAntiAlias(true);
        paint5.setStrokeWidth(f);
        paint5.setStyle(Paint.Style.STROKE);
        Paint paint6 = new Paint();
        this.i = paint6;
        paint6.setColor(i);
        paint6.setStyle(Paint.Style.FILL);
        this.j = new Rect();
        this.k = new Rect();
        this.n = z;
    }

    public static synchronized tfz d(Resources resources) {
        i(resources.getConfiguration());
        if (s == null) {
            s = new tfz(resources, true, resources.getColor(R.color.play_white));
        }
        return s;
    }

    public static synchronized tfz e(Resources resources) {
        i(resources.getConfiguration());
        if (t == null) {
            t = new tfz(resources, false, resources.getColor(R.color.play_white));
        }
        return t;
    }

    public static final float h(float f, float f2, float f3, float f4, float f5) {
        if (f5 > f) {
            if (f5 >= f2) {
                return f4;
            }
            if (f != f2) {
                return f3 + (((f5 - f) * (f4 - f3)) / (f2 - f));
            }
        }
        return f3;
    }

    private static synchronized void i(Configuration configuration) {
        int iHashCode = configuration.hashCode();
        if (r != iHashCode) {
            j();
            r = iHashCode;
        }
    }

    private static synchronized void j() {
        s = null;
        t = null;
        o.evictAll();
        p.evictAll();
        q.evictAll();
    }

    public final float a(int i, int i2) {
        int iMax = Math.max(i, i2);
        int i3 = this.l;
        if (iMax < i3) {
            return 0.0f;
        }
        return h(i3, this.m, this.x, this.y, iMax);
    }

    public final float b(int i, int i2) {
        float fMax = Math.max(i, i2);
        int i3 = this.w;
        return h(this.l, this.m, this.v, i3, fMax);
    }

    @Override // defpackage.tgb
    public final int c(int i, int i2) {
        if (Math.max(i, i2) < this.l) {
            return 0;
        }
        float fB = b(i, i2);
        return (int) (fB + fB + a(i, i2));
    }

    public final void f(Canvas canvas, int i, float f, float f2, float f3) {
        RectF rectF = this.d;
        float f4 = rectF.left;
        float f5 = rectF.right;
        float f6 = rectF.top;
        float f7 = rectF.bottom;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        float f8 = i;
        rectF.right = f8;
        rectF.bottom = f8;
        canvas.save();
        canvas.scale(f3, f3);
        canvas.translate(f2, f2);
        canvas.drawRoundRect(rectF, f, f, this.b);
        canvas.restore();
        rectF.left = f4;
        rectF.right = f5;
        rectF.top = f6;
        rectF.bottom = f7;
    }

    public final void g(Canvas canvas, float f, int i) {
        RectF rectF = this.d;
        Paint paint = this.u;
        float f2 = rectF.left;
        float f3 = rectF.right;
        float f4 = rectF.top;
        float f5 = rectF.bottom;
        paint.setStrokeWidth(f + f);
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f6 = strokeWidth - (f / 3.0f);
        rectF.left += f6;
        rectF.top += strokeWidth + f;
        rectF.right -= f6;
        rectF.bottom -= strokeWidth - f;
        paint.setColor(i);
        canvas.drawOval(rectF, paint);
        rectF.left = f2;
        rectF.right = f3;
        rectF.top = f4;
        rectF.bottom = f5;
    }
}
