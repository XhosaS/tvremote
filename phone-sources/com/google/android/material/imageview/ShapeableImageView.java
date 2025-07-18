package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.sin;
import defpackage.stv;
import defpackage.stw;
import defpackage.szk;
import defpackage.szq;
import defpackage.szr;
import defpackage.szs;
import defpackage.tab;
import defpackage.tde;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements tab {
    public final RectF a;
    public szk b;
    public szq c;
    private final szs d;
    private final RectF e;
    private final Paint f;
    private final Paint g;
    private final Path h;
    private ColorStateList i;
    private float j;
    private Path k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private final void e(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.a;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        Path path = this.h;
        this.d.a(this.c, rectF, path);
        this.k.rewind();
        this.k.addPath(path);
        RectF rectF2 = this.e;
        rectF2.set(0.0f, 0.0f, i, i2);
        this.k.addRect(rectF2, Path.Direction.CCW);
    }

    private final boolean f() {
        return (this.p == Integer.MIN_VALUE && this.q == Integer.MIN_VALUE) ? false : true;
    }

    private final boolean g() {
        return getLayoutDirection() == 1;
    }

    public final int a() {
        int i = this.q;
        return i != Integer.MIN_VALUE ? i : g() ? this.l : this.n;
    }

    public final int b() {
        int i;
        int i2;
        if (f()) {
            if (g() && (i2 = this.q) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!g() && (i = this.p) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.l;
    }

    public final int c() {
        int i;
        int i2;
        if (f()) {
            if (g() && (i2 = this.p) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!g() && (i = this.q) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.n;
    }

    public final int d() {
        int i = this.p;
        return i != Integer.MIN_VALUE ? i : g() ? this.n : this.l;
    }

    @Override // android.view.View
    public final int getPaddingBottom() {
        return super.getPaddingBottom() - this.o;
    }

    @Override // android.view.View
    public final int getPaddingEnd() {
        return super.getPaddingEnd() - a();
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return super.getPaddingLeft() - b();
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return super.getPaddingRight() - c();
    }

    @Override // android.view.View
    public final int getPaddingStart() {
        return super.getPaddingStart() - d();
    }

    @Override // android.view.View
    public final int getPaddingTop() {
        return super.getPaddingTop() - this.m;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.k, this.g);
        if (this.i == null) {
            return;
        }
        Paint paint = this.f;
        paint.setStrokeWidth(this.j);
        int colorForState = this.i.getColorForState(getDrawableState(), this.i.getDefaultColor());
        if (this.j <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.h, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.r && isLayoutDirectionResolved()) {
            this.r = true;
            if (isPaddingRelative() || f()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e(i, i2);
    }

    @Override // defpackage.tab
    public final void p(szq szqVar) {
        this.c = szqVar;
        szk szkVar = this.b;
        if (szkVar != null) {
            szkVar.p(szqVar);
        }
        e(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + b(), i2 + this.m, i3 + c(), i4 + this.o);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + d(), i2 + this.m, i3 + a(), i4 + this.o);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.d = szr.a;
        this.h = new Path();
        this.r = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.a = new RectF();
        this.e = new RectF();
        this.k = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, stv.a, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.i = sin.h(context2, typedArrayObtainStyledAttributes, 9);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.l = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.o = dimensionPixelSize;
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.c = new szq(szq.c(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView));
        setOutlineProvider(new stw(this));
    }
}
