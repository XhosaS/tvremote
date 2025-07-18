package com.google.android.libraries.onegoogle.account.disc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.cuh;
import defpackage.cww;
import defpackage.ehq;
import defpackage.quq;
import defpackage.quu;
import defpackage.qvu;
import defpackage.rrx;
import defpackage.sij;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AvatarView extends AppCompatImageView {
    public int a;
    public Drawable b;
    public float c;
    public cuh d;
    public boolean e;
    public Runnable f;
    public boolean g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final RectF l;
    private final Path m;
    private final Path n;
    private final int o;
    private final quq p;
    private Drawable q;
    private float r;
    private Drawable s;
    private int t;
    private final RectF u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;

    public AvatarView(Context context) {
        this(context, null);
    }

    public static void b(float f, Drawable drawable) {
        boolean z = true;
        if (f != 1.0f && drawable != null && !(drawable instanceof quu)) {
            z = false;
        }
        sij.x(z, "Scaling is not allowed when there is a ring drawable and it's not scalable.");
    }

    private static void n(Drawable drawable, Drawable drawable2, boolean z) {
        boolean z2 = true;
        if ((drawable != null || drawable2 != null) && !z) {
            z2 = false;
        }
        sij.x(z2, "setting ring/badge is only allowed with allowDecorations");
    }

    private final void o(Canvas canvas) {
        Path path = this.n;
        if (path.isEmpty() || !this.g) {
            return;
        }
        canvas.drawPath(path, this.j);
    }

    private final void p() {
        if (getLayerType() != 2) {
            setLayerType(2, null);
        }
    }

    private final void q() {
        Path path = this.n;
        path.rewind();
        Rect rect = new Rect();
        if (Math.min(this.x, this.y) != Integer.MIN_VALUE && this.a != Integer.MIN_VALUE) {
            RectF rectF = this.l;
            if (!rectF.isEmpty() && this.r != 0.0f) {
                p();
                float fA = a(this.a) * this.r;
                a.ab((this.a == Integer.MIN_VALUE || rectF.isEmpty()) ? false : true);
                int[] iArr = cww.a;
                int layoutDirection = getLayoutDirection();
                float f = rectF.left;
                Paint paint = this.i;
                float strokeWidth = f - (paint.getStrokeWidth() / 2.0f);
                float strokeWidth2 = rectF.right + (paint.getStrokeWidth() / 2.0f);
                float fA2 = a(this.a);
                float f2 = this.o;
                float f3 = (fA2 / 2.0f) - f2;
                float f4 = layoutDirection == 1 ? strokeWidth + f3 : strokeWidth2 - f3;
                float f5 = fA / 2.0f;
                a.ab((this.a == Integer.MIN_VALUE || rectF.isEmpty()) ? false : true);
                float strokeWidth3 = (rectF.bottom + (paint.getStrokeWidth() / 2.0f)) - (a(this.a) / 2.0f);
                path.addCircle(f4, strokeWidth3, (f2 * this.r) + f5, Path.Direction.CW);
                new RectF(f4 - f5, strokeWidth3 - f5, f4 + f5, strokeWidth3 + f5).round(rect);
            }
        }
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        l();
        invalidate();
    }

    private final void r(int i, int i2, int i3) {
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE) {
            return;
        }
        int iMin = Math.min(i, i2);
        int i4 = (iMin - i3) / 2;
        setPadding(i4, i4, (i + i4) - iMin, (i2 + i4) - iMin);
    }

    private final void s(Drawable drawable, int i) {
        if (drawable == null || i == Integer.MIN_VALUE) {
            return;
        }
        int iC = this.p.c(this.a);
        p();
        Paint paint = this.k;
        Rect rectCopyBounds = drawable.copyBounds();
        int strokeWidth = (iC - i) - ((int) (paint.getStrokeWidth() / 2.0f));
        rectCopyBounds.inset(strokeWidth, strokeWidth);
        this.u.set(rectCopyBounds);
        invalidate();
    }

    final int a(int i) {
        Context context = getContext();
        return i > context.getResources().getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_medium_badge) ? context.getResources().getDimensionPixelSize(R.dimen.og_apd_large_badge_size) : i > context.getResources().getDimensionPixelSize(R.dimen.og_apd_max_avatar_size_for_small_badge) ? context.getResources().getDimensionPixelSize(R.dimen.og_apd_medium_badge_size) : context.getResources().getDimensionPixelSize(R.dimen.og_apd_small_badge_size);
    }

    public final void c(int i) {
        if (i != Integer.MIN_VALUE) {
            this.d.accept(Integer.valueOf(this.p.c(i)));
        }
    }

    public final void d() {
        if (this.v) {
            return;
        }
        this.v = true;
        invalidate();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(int i) {
        int i2 = this.a;
        this.a = i;
        if (i2 == Integer.MIN_VALUE) {
            this.f.run();
        }
        r(this.x, this.y, i);
        m();
        c(i);
    }

    public final void f(Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.s = drawable;
        n(this.b, drawable, this.v);
        Drawable drawable3 = this.s;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        q();
    }

    public final void g(boolean z) {
        this.w = z;
        invalidate();
    }

    public final void h(boolean z) {
        Resources resources = getResources();
        int i = R.color.google_grey100;
        int i2 = z ? R.color.google_grey900 : R.color.google_grey100;
        Paint paint = this.i;
        paint.setColor(resources.getColor(i2));
        paint.setAlpha(30);
        Drawable drawable = this.q;
        Resources resources2 = getResources();
        if (true != z) {
            i = R.color.google_grey800;
        }
        rrx.am(drawable, resources2.getColor(i));
        this.q = drawable;
        this.h.setColor(getResources().getColor(true != z ? R.color.og_elevation_dark_5 : R.color.google_white));
    }

    public final void i() {
        setImageDrawable(this.q);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable.equals(this.s) || drawable.equals(this.b)) {
            invalidate();
        }
    }

    public final void j(Drawable drawable) {
        b(this.c, drawable);
        n(drawable, this.s, this.v);
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        m();
    }

    public final void k(int i) {
        setTag(R.id.og_avatar_size_hint, Integer.valueOf(i));
    }

    public final void l() {
        Path path = this.m;
        if (!path.isEmpty()) {
            path.rewind();
        }
        Path path2 = this.n;
        if (path2.isEmpty()) {
            return;
        }
        RectF rectF = this.l;
        if (rectF.isEmpty() || !this.g) {
            return;
        }
        path.addOval(rectF, Path.Direction.CW);
        path.op(path, path2, Path.Op.DIFFERENCE);
    }

    public final void m() {
        int i;
        if (Math.min(this.x, this.y) == Integer.MIN_VALUE || (i = this.a) == Integer.MIN_VALUE) {
            this.l.setEmpty();
        } else {
            RectF rectF = this.l;
            float f = i;
            rectF.set(0.0f, 0.0f, f, f);
            float f2 = (int) ((r0 - this.a) / 2.0f);
            rectF.offset(f2, f2);
            rectF.inset(1.0f, 1.0f);
            quq quqVar = this.p;
            int iC = quqVar.c(this.a);
            this.k.setStrokeWidth(iC + iC);
            if (this.b != null) {
                RectF rectF2 = new RectF(rectF);
                int iB = quqVar.b(this.a);
                int i2 = iC + 1;
                float fRound = ((iB - Math.round(this.c * iB)) / 2) - (i2 + i2);
                rectF2.inset(fRound, fRound);
                Rect rect = new Rect();
                rectF2.roundOut(rect);
                this.b.setBounds(rect);
                s(this.b, this.t);
            }
        }
        q();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDraw(android.graphics.Canvas r14) {
        /*
            r13 = this;
            android.graphics.drawable.Drawable r0 = r13.b
            if (r0 == 0) goto L1a
            r0.draw(r14)
            android.graphics.RectF r2 = r13.u
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1a
            r5 = 0
            android.graphics.Paint r6 = r13.k
            r3 = 0
            r4 = 1135869952(0x43b40000, float:360.0)
            r1 = r14
            r1.drawArc(r2, r3, r4, r5, r6)
            goto L1b
        L1a:
            r1 = r14
        L1b:
            boolean r14 = r13.v
            if (r14 == 0) goto L3e
            int r14 = r13.a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 != r0) goto L26
            goto L3e
        L26:
            float r0 = r13.c
            quq r2 = r13.p
            int r14 = r2.b(r14)
            float r14 = (float) r14
            float r0 = r0 * r14
            int r14 = java.lang.Math.round(r0)
            int r14 = r2.a(r14)
            float r14 = (float) r14
            int r0 = r13.a
            float r0 = (float) r0
            float r14 = r14 / r0
            goto L40
        L3e:
            float r14 = r13.c
        L40:
            int r0 = r13.x
            int r2 = r13.y
            int r0 = java.lang.Math.min(r0, r2)
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            r1.scale(r14, r14, r0, r0)
            super.onDraw(r1)
            boolean r14 = r13.w
            if (r14 == 0) goto Lb6
            android.graphics.Path r14 = r13.m
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L67
            r13.o(r1)
            android.graphics.Paint r0 = r13.i
            r1.drawPath(r14, r0)
            goto L7c
        L67:
            android.graphics.RectF r8 = r13.l
            boolean r14 = r8.isEmpty()
            if (r14 != 0) goto L7c
            r11 = 0
            android.graphics.Paint r12 = r13.i
            r9 = 0
            r10 = 1135869952(0x43b40000, float:360.0)
            r7 = r1
            r7.drawArc(r8, r9, r10, r11, r12)
            r13.o(r1)
        L7c:
            android.graphics.drawable.Drawable r14 = r13.s
            if (r14 == 0) goto Lb6
            android.graphics.Rect r14 = r14.getBounds()
            int r0 = r14.height()
            float r0 = (float) r0
            android.graphics.Paint r3 = r13.i
            float r4 = r3.getStrokeWidth()
            float r0 = r0 - r4
            float r0 = r0 / r2
            int r2 = r14.centerX()
            float r2 = (float) r2
            int r4 = r14.centerY()
            float r4 = (float) r4
            android.graphics.Paint r5 = r13.h
            r1.drawCircle(r2, r4, r0, r5)
            android.graphics.drawable.Drawable r2 = r13.s
            r2.draw(r1)
            boolean r2 = r13.g
            if (r2 == 0) goto Lb6
            int r2 = r14.centerX()
            float r2 = (float) r2
            int r14 = r14.centerY()
            float r14 = (float) r14
            r1.drawCircle(r2, r14, r0, r3)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.account.disc.AvatarView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.x = i;
        this.y = i2;
        r(i, i2, this.a);
        m();
        if (this.e) {
            return;
        }
        int iMin = Math.min(i, i2);
        if (this.v) {
            iMin = this.p.a(iMin);
        }
        if (((Integer) rrx.X(this).e(0)).intValue() < iMin) {
            k(iMin);
        }
        e(iMin);
    }

    public void setBadgeScale(float f) {
        this.r = f;
        q();
    }

    void setCurrRingThickness(int i) {
        if (i == this.t) {
            return;
        }
        this.t = i;
        s(this.b, i);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.i = paint2;
        Paint paint3 = new Paint();
        this.j = paint3;
        Paint paint4 = new Paint();
        this.k = paint4;
        this.l = new RectF();
        this.m = new Path();
        this.n = new Path();
        this.o = getResources().getDimensionPixelSize(R.dimen.og_apd_badge_wrapper_padding);
        this.p = new quq(getResources());
        this.a = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.u = new RectF();
        this.c = 1.0f;
        this.d = new qvu(1);
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.f = new ehq(9);
        this.g = true;
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.og_border_ring_thickness));
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setStyle(Paint.Style.FILL);
        paint4.setAntiAlias(true);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint4.setStyle(Paint.Style.STROKE);
        this.q = AppCompatResources.getDrawable(context, R.drawable.disc_oval);
    }
}
