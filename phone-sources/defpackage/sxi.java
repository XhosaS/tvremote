package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxi extends sxm {
    public static final /* synthetic */ int h = 0;
    private static final dhc q = new sxh();
    public final sxo a;
    public final sxn b;
    public float c;
    public ValueAnimator d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public TimeInterpolator g;
    private final dhe r;
    private boolean s;
    private final ValueAnimator t;
    private final dhb u;

    public sxi(Context context, swu swuVar, sxo sxoVar) {
        super(context, swuVar);
        this.s = false;
        this.a = sxoVar;
        sxn sxnVar = new sxn();
        this.b = sxnVar;
        sxnVar.h = true;
        dhe dheVar = new dhe();
        this.r = dheVar;
        dheVar.c(1.0f);
        dheVar.e(50.0f);
        dhb dhbVar = new dhb(this, q);
        this.u = dhbVar;
        dhbVar.r = dheVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.t = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new gio(this, swuVar, 5));
        if (swuVar.c(true) && swuVar.m != 0) {
            valueAnimator.start();
        }
        i(1.0f);
    }

    public final float a(int i) {
        float f = i;
        return (f < 1000.0f || f > 9000.0f) ? 0.0f : 1.0f;
    }

    public final float b() {
        return this.b.b;
    }

    public final void c(float f) {
        this.b.e = f;
        invalidateSelf();
    }

    public final void d(float f) {
        this.b.b = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.o)) {
            canvas.save();
            sxo sxoVar = this.a;
            sxoVar.h(canvas, getBounds(), f(), k(), j());
            sxn sxnVar = this.b;
            sxnVar.f = g();
            Paint paint = this.m;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            swu swuVar = this.j;
            sxnVar.c = swuVar.e[0];
            int iK = swuVar.i;
            if (iK > 0) {
                if (!(sxoVar instanceof sxr)) {
                    iK = (int) ((iK * cmq.k(b(), 0.0f, 0.01f)) / 0.01f);
                }
                sxoVar.f(canvas, paint, b(), 1.0f, swuVar.f, this.n, iK);
            } else {
                sxoVar.f(canvas, paint, 0.0f, 1.0f, swuVar.f, this.n, 0);
            }
            sxoVar.e(canvas, paint, sxnVar, this.n);
            sxoVar.d(canvas, paint, swuVar.e[0], this.n);
            canvas.restore();
        }
    }

    @Override // defpackage.sxm
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Context context = this.i;
        boolean zE = super.e(z, z2, z3);
        float fH = sim.h(context.getContentResolver());
        if (fH == 0.0f) {
            this.s = true;
            return zE;
        }
        this.s = false;
        this.r.e(50.0f / fH);
        return zE;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.sxm, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.u.e();
        d(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        float f = i;
        if (!this.s) {
            dhb dhbVar = this.u;
            dhbVar.c(b() * 10000.0f);
            dhbVar.d(f);
            return true;
        }
        float fA = a(i);
        this.u.e();
        d(f / 10000.0f);
        c(fA);
        return true;
    }
}
