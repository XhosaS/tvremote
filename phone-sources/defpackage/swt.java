package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.videos.R;
import defpackage.swu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class swt<S extends swu> extends ProgressBar {
    public final swu a;
    public int b;
    public boolean c;
    public boolean d;
    public final int e;
    private final boolean f;
    private final int g;
    private final Runnable h;
    private final Runnable i;
    private final gku j;
    private final gku k;

    protected swt(Context context, AttributeSet attributeSet, int i, int i2) {
        super(tde.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.d = false;
        this.e = 4;
        this.h = new slt(this, 8, null);
        this.i = new slt(this, 9, null);
        this.j = new swr(this);
        this.k = new sws(this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray typedArrayA = suy.a(context2, attributeSet, sya.a, i, i2, new int[0]);
        typedArrayA.getInt(7, -1);
        this.g = Math.min(typedArrayA.getInt(5, -1), 1000);
        typedArrayA.recycle();
        this.f = true;
    }

    private final sxo h() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().a;
        }
        if (getProgressDrawable() != null) {
            return getProgressDrawable().a;
        }
        return null;
    }

    public abstract swu a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sxi getProgressDrawable() {
        return (sxi) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final sxq getIndeterminateDrawable() {
        return (sxq) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (this.f) {
            ((sxm) getCurrentDrawable()).l(g(), false, z);
        }
    }

    public final void e() {
        if (this.g > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    public void f(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.c = false;
            this.d = true;
            if (!getIndeterminateDrawable().isVisible() || sim.h(getContext().getContentResolver()) == 0.0f) {
                this.j.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().b.c();
            }
        }
    }

    final boolean g() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.b(this.j);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().h(this.k);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().h(this.k);
        }
        if (g()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.i);
        removeCallbacks(this.h);
        ((sxm) getCurrentDrawable()).n();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().o(this.k);
            getIndeterminateDrawable().b.f();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().o(this.k);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        sxo sxoVarH = h();
        if (sxoVarH == null) {
            return;
        }
        setMeasuredDimension(sxoVarH.b() < 0 ? getDefaultSize(getSuggestedMinimumWidth(), i) : sxoVarH.b() + getPaddingLeft() + getPaddingRight(), sxoVarH.a() < 0 ? getDefaultSize(getSuggestedMinimumHeight(), i2) : sxoVarH.a() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d(i == 0);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((sxm) currentDrawable).n();
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((sxm) currentDrawable2).l(g(), false, false);
        }
        if ((currentDrawable2 instanceof sxq) && g()) {
            ((sxq) currentDrawable2).b.e();
        }
        this.d = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof sxq)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((sxm) drawable).n();
            super.setIndeterminateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        f(i, false);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof sxi)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            sxi sxiVar = (sxi) drawable;
            sxiVar.n();
            super.setProgressDrawable(sxiVar);
            sxiVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }
}
