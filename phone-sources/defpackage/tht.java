package defpackage;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.google.android.videos.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tht extends View {
    private static final ArgbEvaluator E = new ArgbEvaluator();
    protected static int a;
    protected int A;
    protected int B;
    protected final RectF C;
    protected final RectF D;
    protected int b;
    protected boolean c;
    protected boolean d;
    protected boolean e;
    protected boolean f;
    protected float g;
    protected float h;
    protected long i;
    protected boolean j;
    protected boolean k;
    protected float l;
    protected AnimationDrawable m;
    protected AnimationDrawable n;
    protected AnimationDrawable o;
    protected int p;
    protected float q;
    protected int r;
    protected int s;
    protected boolean t;
    protected int u;
    protected int v;
    protected long w;
    protected long x;
    protected long y;
    protected long z;

    public tht(Context context) {
        this(context, null, 0);
    }

    private final int b() {
        return (this.e || this.b == 2) ? this.r : this.s;
    }

    private final long c(AnimationDrawable animationDrawable, Canvas canvas, boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        animationDrawable.selectDrawable(this.p);
        animationDrawable.getFrame(this.p).draw(canvas);
        if (!z || jUptimeMillis < this.z) {
            return 0L;
        }
        long duration = animationDrawable.getDuration(this.p);
        int numberOfFrames = animationDrawable.getNumberOfFrames() - 1;
        int i = this.p;
        if (i < numberOfFrames) {
            this.p = i + 1;
        } else {
            if (animationDrawable.isOneShot()) {
                return 0L;
            }
            this.p = 0;
        }
        long j = jUptimeMillis + duration;
        this.z = j;
        return j;
    }

    private final Paint e() {
        int iIntValue;
        Paint paint = new Paint();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.t) {
            iIntValue = this.u;
        } else {
            if (jUptimeMillis < this.w) {
                iIntValue = ((Integer) E.evaluate((r3 - jUptimeMillis) / this.x, Integer.valueOf(this.v), Integer.valueOf(this.u))).intValue();
            } else {
                iIntValue = this.v;
            }
        }
        paint.setColor(iIntValue);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.q);
        return paint;
    }

    private final Paint g() {
        Paint paint = new Paint();
        paint.setColor(b());
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.q);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    private static final int h(float f, float f2, float f3) {
        return (int) (f2 + ((f2 / f3) * f));
    }

    public final void a(float f) {
        boolean z = this.j;
        if (z) {
            float f2 = this.h;
            if (f != f2) {
                this.k = f > f2;
            }
        }
        this.h = f;
        double d = f;
        if (d <= 1.0E-7d) {
            if (!z || !this.c) {
                this.b = 0;
                this.t = true;
                this.p = 0;
            }
        } else if (d < 0.9999999d) {
            if (this.b == 0) {
                this.f = true;
            }
            this.b = 1;
            this.t = false;
            if (this.p >= this.n.getNumberOfFrames()) {
                this.p = 0;
            }
            if (this.j) {
                this.i = SystemClock.uptimeMillis();
            } else {
                this.i = 0L;
            }
        } else {
            this.l = f;
            if (this.b == 1) {
                this.f = true;
            } else {
                this.p = this.o.getNumberOfFrames() - 1;
            }
            this.b = 2;
            this.t = false;
        }
        this.j = true;
        invalidate();
    }

    public final void d(boolean z) {
        boolean z2 = this.d && z != this.c;
        this.c = z;
        this.d = true;
        if (z2 && z) {
            this.b = 0;
            this.t = true;
            this.p = 0;
            this.f = true;
            invalidate();
            return;
        }
        if (z) {
            a(this.h);
            return;
        }
        if (z2) {
            this.j = false;
        }
        invalidate();
    }

    public final void f(boolean z) {
        this.e = z;
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getContentDescription() {
        Resources resources = getContext().getResources();
        int i = (int) (this.h * 100.0f);
        StringBuilder sb = new StringBuilder(String.format(Locale.US, resources.getString(R.string.play_percent_downloaded), Integer.valueOf(i)));
        if (i < 100) {
            sb.append(", ");
            sb.append(resources.getString(true != this.c ? R.string.play_download_not_requested : R.string.play_download_is_requested));
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tht.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.A, this.B);
    }

    @Override // android.view.View
    public final String toString() {
        return String.format("DSV(%s): state=%d, frac=%4.2f", null, Integer.valueOf(this.b), Float.valueOf(this.h));
    }

    public tht(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public tht(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        float f;
        float f2;
        super(context, attributeSet, i);
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = false;
        this.h = 0.0f;
        this.j = false;
        this.k = false;
        this.l = 0.0f;
        RectF rectF = new RectF();
        this.C = rectF;
        RectF rectF2 = new RectF();
        this.D = rectF2;
        a++;
        Resources resources = context.getResources();
        int integer = resources.getInteger(R.integer.play_download_arc_min_percent);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tdk.a, 0, 0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, R.color.play_default_download_arc_color_offline);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, R.color.play_default_download_arc_color_offline);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(3, R.color.play_download_arc_background_color_press);
            int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(0, R.color.play_download_arc_background_color_download);
            int i2 = typedArrayObtainStyledAttributes.getInt(5, integer);
            int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
            int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(7, 0);
            int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(8, 0);
            int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(4, R.dimen.play_download_button_arc_inset);
            int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(6, R.dimen.play_download_button_progress_arc_width_medium);
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId5 != 0 && resourceId6 != 0 && resourceId7 != 0) {
                this.b = 0;
                this.p = 0;
                this.f = false;
                this.m = (AnimationDrawable) resources.getDrawable(resourceId5);
                this.n = (AnimationDrawable) resources.getDrawable(resourceId6);
                this.o = (AnimationDrawable) resources.getDrawable(resourceId7);
                this.r = resources.getColor(resourceId);
                this.s = resources.getColor(resourceId2);
                this.u = resources.getColor(resourceId3);
                this.v = resources.getColor(resourceId4);
                this.q = resources.getDimension(resourceId9);
                this.t = true;
                this.w = 0L;
                this.x = resources.getInteger(R.integer.play_download_arc_background_transition_interval_ms);
                this.y = resources.getInteger(R.integer.play_download_arc_background_transition_step_ms);
                float dimension = resources.getDimension(resourceId8);
                float f3 = (this.q / 2.0f) + dimension;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                int paddingRight = getPaddingRight() + paddingLeft;
                int paddingBottom = getPaddingBottom() + paddingTop;
                Drawable frame = this.m.getFrame(0);
                int intrinsicWidth = frame.getIntrinsicWidth();
                int intrinsicHeight = frame.getIntrinsicHeight();
                float f4 = intrinsicWidth;
                float f5 = intrinsicHeight;
                float f6 = f3 + f3;
                float f7 = f4 - f6;
                if (f7 > f4) {
                    f = dimension;
                    f2 = f3;
                    this.A = ((int) f7) + paddingRight;
                    paddingLeft = h(f7 - f4, paddingLeft, paddingRight);
                } else {
                    f = dimension;
                    f2 = f3;
                    this.A = paddingRight + intrinsicWidth;
                }
                float f8 = f5 - f6;
                if (f8 > f5) {
                    this.B = ((int) f8) + paddingBottom;
                    paddingTop = h(f8 - f5, paddingTop, paddingBottom);
                } else {
                    this.B = paddingBottom + intrinsicHeight;
                }
                Rect rect = new Rect(paddingLeft, paddingTop, intrinsicWidth + paddingLeft, intrinsicHeight + paddingTop);
                this.m.setBounds(rect);
                this.n.setBounds(rect);
                this.o.setBounds(rect);
                float f9 = paddingLeft;
                float f10 = f9 + f2;
                float f11 = paddingTop;
                float f12 = f11 + f2;
                rectF.set(f10, f12, f7 + f10, f8 + f12);
                float f13 = f9 + f;
                float f14 = f11 + f;
                float f15 = f + f;
                rectF2.set(f13, f14, (f4 - f15) + f13, (f5 - f15) + f14);
                this.g = i2 / 100.0f;
                this.z = 0L;
                return;
            }
            Log.wtf("DSV", "missing animation resource");
            return;
        }
        Log.wtf("DSV", "missing attributeSet");
    }
}
