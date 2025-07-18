package com.google.android.libraries.onegoogle.common;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import defpackage.nuh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CirclePulseDrawable extends Drawable implements Drawable.Callback {
    public final Drawable a;
    public int b;
    private final RectF c;
    private final int d;
    private final int e;
    private final nuh f;
    private final nuh g;

    public CirclePulseDrawable(Drawable drawable, int i, int i2) {
        this.a = drawable;
        RectF rectF = new RectF(drawable.getBounds());
        this.c = rectF;
        this.b = (int) rectF.width();
        drawable.setCallback(this);
        this.f = new nuh(i);
        this.d = Color.alpha(i);
        this.g = new nuh(i2);
        this.e = Color.alpha(i2);
    }

    private final void b(nuh nuhVar, int i) {
        nuhVar.a = i;
        c(nuhVar, this.c);
        this.a.invalidateSelf();
    }

    private static void c(nuh nuhVar, RectF rectF) {
        float f = nuhVar.a;
        RectF rectF2 = new RectF(rectF.left - f, rectF.top - f, rectF.right + f, rectF.bottom + f);
        Path path = (Path) nuhVar.b;
        path.reset();
        path.addOval(rectF2, Path.Direction.CW);
        path.addOval(rectF, Path.Direction.CCW);
    }

    public final void a() {
        Rect bounds = getBounds();
        int iWidth = getBounds().width() - this.b;
        int iHeight = getBounds().height() - this.b;
        int i = iWidth / 2;
        int i2 = bounds.left + i;
        int i3 = iHeight / 2;
        int i4 = bounds.top + i3;
        int i5 = bounds.right - i;
        int i6 = bounds.bottom - i3;
        Drawable drawable = this.a;
        drawable.setBounds(i2, i4, i5, i6);
        RectF rectF = this.c;
        rectF.set(drawable.getBounds());
        c(this.f, rectF);
        c(this.g, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
        nuh nuhVar = this.f;
        canvas.drawPath((Path) nuhVar.b, (Paint) nuhVar.c);
        nuh nuhVar2 = this.g;
        canvas.drawPath((Path) nuhVar2.b, (Paint) nuhVar2.c);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.getAlpha();
    }

    public int getFirstPulseSize() {
        return this.f.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.a.getOpacity();
    }

    public int getSecondPulseSize() {
        return this.g.a;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ((Paint) this.f.c).setAlpha((this.d * i) / 255);
        ((Paint) this.g.c).setAlpha((this.e * i) / 255);
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setFirstPulseSize(int i) {
        b(this.f, i);
    }

    public void setSecondPulseSize(int i) {
        b(this.g, i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
