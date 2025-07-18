package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SeekBar extends View {
    private final RectF a;
    private final RectF b;
    private final RectF c;
    private final Paint d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        Paint paint4 = new Paint(1);
        this.g = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(-3355444);
        paint2.setColor(-65536);
        paint4.setColor(-1);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_bar_height);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_bar_height);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_radius);
    }

    private final void a() {
        int i = isFocused() ? this.n : this.m;
        int width = getWidth();
        int height = getHeight();
        int i2 = (height - i) / 2;
        int i3 = height - i2;
        float f = i2;
        float f2 = i3;
        this.c.set(this.m / 2, f, width - r4, f2);
        int i4 = isFocused() ? this.l : this.m / 2;
        float f3 = this.h;
        float f4 = this.j;
        RectF rectF = this.a;
        float f5 = this.m / 2;
        float f6 = width - (i4 + i4);
        float f7 = (f3 / f4) * f6;
        rectF.set(f5, f, f5 + f7, f2);
        this.b.set(rectF.right, f, (this.m / 2) + ((this.i / this.j) * f6), f2);
        this.k = i4 + ((int) f7);
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.j;
    }

    public int getProgress() {
        return this.h;
    }

    public int getSecondProgress() {
        return this.i;
    }

    public int getSecondaryProgressColor() {
        return this.d.getColor();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = isFocused() ? this.l : this.m / 2;
        canvas.drawRoundRect(this.c, f, f, this.f);
        RectF rectF = this.b;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f, f, this.d);
        }
        canvas.drawRoundRect(this.a, f, f, this.e);
        canvas.drawCircle(this.k, getHeight() / 2, f, this.g);
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        a();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    public void setActiveBarHeight(int i) {
        this.n = i;
        a();
    }

    public void setActiveRadius(int i) {
        this.l = i;
        a();
    }

    public void setBarHeight(int i) {
        this.m = i;
        a();
    }

    public void setMax(int i) {
        this.j = i;
        a();
    }

    public void setProgress(int i) {
        int i2 = this.j;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.h = i;
        a();
    }

    public void setProgressColor(int i) {
        this.e.setColor(i);
    }

    public void setSecondaryProgress(int i) {
        int i2 = this.j;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.i = i;
        a();
    }

    public void setSecondaryProgressColor(int i) {
        this.d.setColor(i);
    }
}
