package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqf extends View {
    public aqk b;
    public Boolean c;
    public Runnable d;
    public yjk e;
    private Long g;
    private static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] a = new int[0];

    public aqf(Context context) {
        super(context);
    }

    public final void a() {
        this.e = null;
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.d;
            runnable2.getClass();
            runnable2.run();
        } else {
            aqk aqkVar = this.b;
            if (aqkVar != null) {
                aqkVar.setState(a);
            }
        }
        aqk aqkVar2 = this.b;
        if (aqkVar2 == null) {
            return;
        }
        aqkVar2.setVisible(false, false);
        unscheduleDrawable(aqkVar2);
    }

    public final void b(long j, int i, long j2, float f2) {
        aqk aqkVar = this.b;
        if (aqkVar == null) {
            return;
        }
        Integer num = aqkVar.b;
        if (num == null || num.intValue() != i) {
            aqkVar.b = Integer.valueOf(i);
            aqkVar.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 += f2;
        }
        long jK = bny.k(bnq.d(j2), bnq.c(j2), bnq.b(j2), ykn.h(f2, 1.0f), bnq.f(j2));
        bnq bnqVar = aqkVar.a;
        if (bnqVar == null || !a.s(bnqVar.h, jK)) {
            aqkVar.a = new bnq(jK);
            aqkVar.setColor(ColorStateList.valueOf(bny.h(jK)));
        }
        Rect rect = new Rect(0, 0, yln.v(bna.c(j)), yln.v(bna.a(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        aqkVar.setBounds(rect);
    }

    public final void c(boolean z) {
        int[] iArr;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.g;
        long jLongValue = jCurrentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z) {
            iArr = f;
        } else {
            if (jLongValue < 5) {
                bf bfVar = new bf(this, 19);
                this.d = bfVar;
                postDelayed(bfVar, 50L);
                this.g = Long.valueOf(jCurrentAnimationTimeMillis);
            }
            iArr = a;
        }
        aqk aqkVar = this.b;
        if (aqkVar != null) {
            aqkVar.setState(iArr);
        }
        this.g = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            a();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        yjk yjkVar = this.e;
        if (yjkVar != null) {
            yjkVar.a();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
