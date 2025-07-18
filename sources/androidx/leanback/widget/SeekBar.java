package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.tv.remote.service.R;

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
    private final int i;
    private final int j;
    private final int k;

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
        this.j = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_bar_height);
        this.k = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_bar_height);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_radius);
    }

    private final void a() {
        int i = isFocused() ? this.k : this.j;
        int width = getWidth();
        int height = getHeight();
        RectF rectF = this.c;
        int i2 = this.j / 2;
        int i3 = (height - i) / 2;
        int i4 = height - i3;
        float f = i2;
        float f2 = i3;
        float f3 = i4;
        rectF.set(f, f2, width - i2, f3);
        if (isFocused()) {
            i2 = this.i;
        }
        RectF rectF2 = this.a;
        float f4 = (width - (i2 + i2)) * Float.NaN;
        float f5 = f + f4;
        rectF2.set(f, f2, f5, f3);
        this.b.set(rectF2.right, f2, f5, f3);
        this.h = i2 + ((int) f4);
        invalidate();
    }

    @Override // android.view.View
    public final CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = isFocused() ? this.i : this.j / 2;
        canvas.drawRoundRect(this.c, f, f, this.f);
        RectF rectF = this.b;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f, f, this.d);
        }
        canvas.drawRoundRect(this.a, f, f, this.e);
        canvas.drawCircle(this.h, getHeight() / 2, f, this.g);
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
}
