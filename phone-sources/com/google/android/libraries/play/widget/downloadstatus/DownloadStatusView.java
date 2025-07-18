package com.google.android.libraries.play.widget.downloadstatus;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.videos.R;
import defpackage.gky;
import defpackage.sdp;
import defpackage.sdq;
import defpackage.sdr;
import defpackage.sdt;
import defpackage.sdu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DownloadStatusView extends FrameLayout {
    private final int a;
    private final Paint b;
    private final Paint c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final gky k;
    private final gky l;
    private final gky m;
    private final gky n;
    private final gky o;
    private final Drawable p;
    private final ImageView q;
    private final ImageView r;
    private final RectF s;
    private gky t;
    private int u;
    private int v;
    private int w;

    public DownloadStatusView(Context context) {
        this(context, null);
    }

    private final void e() {
        this.w = 5;
        h();
        this.q.setColorFilter(this.j);
        this.r.setVisibility(4);
        i(this.n);
    }

    private final void f() {
        this.w = 6;
        h();
        this.q.setColorFilter(this.j);
        this.r.setVisibility(4);
        i(this.o);
    }

    private final void g() {
        this.w = 3;
        h();
        Paint paint = this.b;
        int i = this.h;
        paint.setColor(i);
        this.q.setColorFilter(i);
        ImageView imageView = this.r;
        imageView.setVisibility(0);
        imageView.setColorFilter(this.f);
        i(this.m);
        invalidate();
    }

    private final void h() {
        gky gkyVar = this.t;
        if (gkyVar == null || !gkyVar.isRunning()) {
            return;
        }
        this.t.stop();
    }

    private final void i(gky gkyVar) {
        this.t = gkyVar;
        ImageView imageView = this.q;
        imageView.setImageDrawable(gkyVar);
        imageView.setVisibility(0);
        this.t.start();
    }

    private static final Paint j(float f) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setStrokeCap(Paint.Cap.BUTT);
        return paint;
    }

    public final void a(sdt sdtVar) {
        b(sdtVar.a);
        c(sdtVar.b);
    }

    public final void b(int i) {
        this.u = i;
        if (this.w != 2) {
            invalidate();
        }
    }

    public final void c(int i) {
        if (this.w == 0 || this.v != i) {
            this.v = i;
            d();
        }
    }

    public final void d() {
        int i = this.v;
        if (i == 0) {
            this.w = 1;
            this.u = 0;
            h();
            this.q.setColorFilter(this.d);
            this.r.setVisibility(4);
            i(this.k);
            return;
        }
        if (i == 2) {
            this.w = 4;
            h();
            Paint paint = this.b;
            int i2 = this.i;
            paint.setColor(i2);
            this.t = this.m;
            ImageView imageView = this.q;
            imageView.setColorFilter(i2);
            imageView.setVisibility(4);
            ImageView imageView2 = this.r;
            imageView2.setVisibility(0);
            imageView2.setColorFilter(this.e);
            invalidate();
            return;
        }
        if (i == 3) {
            int i3 = this.w;
            if (i3 == 3) {
                e();
                return;
            } else {
                if (i3 != 5) {
                    f();
                    return;
                }
                return;
            }
        }
        int i4 = this.w;
        if (i4 == 0) {
            if (this.u == 100) {
                f();
                return;
            } else {
                g();
                return;
            }
        }
        if (i4 == 1) {
            this.w = 2;
            h();
            this.q.setColorFilter(this.d);
            this.r.setVisibility(4);
            i(this.l);
            return;
        }
        if (i4 != 2) {
            if (i4 == 3) {
                if (this.u == 100) {
                    e();
                    return;
                } else {
                    this.t.start();
                    return;
                }
            }
            if (i4 != 4) {
                return;
            }
        }
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.w;
        if (i == 3 || i == 4) {
            RectF rectF = this.s;
            canvas.drawArc(rectF, 270.0f, 360.0f, false, this.c);
            canvas.drawArc(rectF, 270.0f, ((this.u * 360.0f) / 100.0f) % 361.0f, false, this.b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.s.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
    }

    public DownloadStatusView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.downloadStatusStyle);
        this.s = new RectF();
        this.t = null;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sdu.a, R.attr.downloadStatusStyle, 0);
        this.d = typedArrayObtainStyledAttributes.getColor(15, 0);
        int color = typedArrayObtainStyledAttributes.getColor(10, 0);
        this.e = color;
        this.f = typedArrayObtainStyledAttributes.getColor(11, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(12, 0);
        this.g = color2;
        this.h = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.i = typedArrayObtainStyledAttributes.getColor(16, 0);
        this.j = typedArrayObtainStyledAttributes.getColor(13, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, getResources().getDimensionPixelSize(R.dimen.replay__downloadstatus__default_size));
        this.a = dimensionPixelSize;
        typedArrayObtainStyledAttributes.recycle();
        this.b = j(getResources().getDimension(R.dimen.replay__downloadstatus__arc_width));
        Paint paintJ = j(getResources().getDimension(R.dimen.replay__downloadstatus__arc_background_width));
        this.c = paintJ;
        paintJ.setColor(color);
        this.k = gky.a(context, R.drawable.replay__downloadstatus__not_started);
        gky gkyVarA = gky.a(context, R.drawable.replay__downloadstatus__not_started_to_downloading);
        this.l = gkyVarA;
        gkyVarA.c(new sdp(this));
        gky gkyVarA2 = gky.a(context, R.drawable.replay__downloadstatus__downloading);
        this.m = gkyVarA2;
        gkyVarA2.c(new sdq(this));
        gky gkyVarA3 = gky.a(context, R.drawable.replay__downloadstatus__downloading_to_completed);
        this.n = gkyVarA3;
        gkyVarA3.c(new sdr(this));
        this.o = gky.a(context, R.drawable.replay__downloadstatus__completed);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setLayoutParams(layoutParams);
        Drawable drawable = AppCompatResources.getDrawable(context, R.drawable.replay__downloadstatus__arrow_background);
        this.p = drawable;
        imageView.setImageDrawable(drawable);
        imageView.setColorFilter(color);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        this.q = imageView2;
        imageView2.setLayoutParams(layoutParams);
        addView(imageView2);
        Drawable drawable2 = AppCompatResources.getDrawable(context, R.drawable.replay__downloadstatus__background);
        drawable2.mutate().setTint(color2);
        setBackground(drawable2);
    }
}
