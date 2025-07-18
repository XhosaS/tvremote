package com.google.android.apps.play.movies.mobile.usecase.watch;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScrubbingIndicator extends View implements ValueAnimator.AnimatorUpdateListener {
    private static final float d = (float) Math.cos(0.5235987755982988d);
    public final TimeInterpolator a;
    public boolean b;
    public ValueAnimator c;
    private final float[] e;
    private final Paint f;
    private final Paint g;
    private final Path h;
    private final Path i;
    private final float j;
    private final int k;
    private float l;
    private float m;

    public ScrubbingIndicator(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.e = new float[6];
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-1);
        float dimension = getResources().getDimension(R.dimen.fine_grained_scrubbing_indicator_thickness);
        this.j = dimension;
        paint.setStrokeWidth(dimension);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        this.k = r0.getInteger(R.integer.fine_grained_scrubbing_indicator_max_triangles) - 1;
        Paint paint2 = new Paint();
        this.g = paint2;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        this.h = new Path();
        this.i = new Path();
        this.a = new LinearInterpolator();
    }

    private final void d(Canvas canvas, float f, float f2) {
        Path path = this.h;
        path.reset();
        PointF pointF = new PointF();
        e(f, pointF);
        path.moveTo(pointF.x, pointF.y);
        int i = (int) (1.0f + f);
        while (true) {
            float f3 = f + f2;
            if (i >= f3) {
                e(f3, pointF);
                path.lineTo(pointF.x, pointF.y);
                canvas.drawPath(path, this.f);
                return;
            } else {
                int i2 = i % 3;
                float[] fArr = this.e;
                int i3 = i2 + i2;
                path.lineTo(fArr[i3], fArr[i3 + 1]);
                i++;
            }
        }
    }

    private final void e(float f, PointF pointF) {
        float f2 = f < 0.0f ? f + (((int) ((f / (-3.0f)) + 1.0f)) * 3.0f) : f % 3.0f;
        float[] fArr = this.e;
        int i = (int) f2;
        int i2 = i + i;
        float f3 = fArr[i2];
        float f4 = fArr[i2 + 1];
        int i3 = (i + 1) % 3;
        int i4 = i3 + i3;
        float f5 = f2 - i;
        float f6 = f3 + ((fArr[i4] - f3) * f5);
        float f7 = fArr[i4 + 1];
        pointF.x = f6;
        pointF.y = f4 + ((f7 - f4) * f5);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.c.cancel();
        this.c = null;
    }

    public final void b(int i) {
        this.l = (i / 1000.0f) * 0.16f;
        invalidate();
    }

    public final void c() {
        float f = this.l;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 1000.0f + f);
        this.c = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1500000L);
        this.c.setInterpolator(this.a);
        this.c.addUpdateListener(this);
        this.c.start();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f7 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDraw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.usecase.watch.ScrubbingIndicator.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f = i2 * 0.8f;
        this.m = f;
        float f2 = d * f;
        float[] fArr = this.e;
        fArr[0] = f2;
        fArr[1] = 0.5f * f;
        fArr[3] = f;
        Path path = this.i;
        path.reset();
        path.moveTo(fArr[0], fArr[1]);
        path.lineTo(fArr[2], fArr[3]);
        path.lineTo(fArr[4], fArr[5]);
        path.close();
    }
}
