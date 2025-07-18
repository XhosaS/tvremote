package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nz extends pz implements qh {
    private static final int[] r = {R.attr.state_pressed};
    private static final int[] s = new int[0];
    private final Runnable D;
    private final qi E;
    public final int a;
    final StateListDrawable b;
    final Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public RecyclerView l;
    final ValueAnimator p;
    int q;
    private final int t;
    private final int u;
    private final int v;
    private final StateListDrawable w;
    private final Drawable x;
    private final int y;
    private final int z;
    public int j = 0;
    public int k = 0;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];

    public nz(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = valueAnimatorOfFloat;
        this.q = 0;
        this.D = new nv(this);
        nw nwVar = new nw(this);
        this.E = nwVar;
        this.b = stateListDrawable;
        this.c = drawable;
        this.w = stateListDrawable2;
        this.x = drawable2;
        this.u = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.v = Math.max(i, drawable.getIntrinsicWidth());
        this.y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.z = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.t = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new nx(this));
        valueAnimatorOfFloat.addUpdateListener(new ny(this));
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.aa(this);
            this.l.ab(this);
            this.l.ac(nwVar);
            l();
        }
        this.l = recyclerView;
        if (recyclerView != null) {
            recyclerView.aw(this);
            this.l.r.add(this);
            this.l.y(nwVar);
        }
    }

    private final int k(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    private final void l() {
        this.l.removeCallbacks(this.D);
    }

    private final void m(int i) {
        l();
        this.l.postDelayed(this.D, i);
    }

    private final boolean n() {
        return this.l.getLayoutDirection() == 1;
    }

    final void b(int i) {
        if (i == 2 && this.o != 2) {
            this.b.setState(r);
            l();
        }
        if (i == 0) {
            this.l.invalidate();
        } else {
            c();
        }
        if (this.o == 2 && i != 2) {
            this.b.setState(s);
            m(1200);
        } else if (i == 1) {
            m(1500);
        }
        this.o = i;
    }

    public final void c() {
        int i = this.q;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.p.cancel();
            }
        }
        this.q = 1;
        ValueAnimator valueAnimator = this.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    final boolean d(float f, float f2) {
        if (f2 < this.k - this.y) {
            return false;
        }
        int i = this.h;
        int i2 = this.g / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
    }

    final boolean e(float f, float f2) {
        if (n()) {
            if (f > this.u) {
                return false;
            }
        } else if (f < this.j - this.u) {
            return false;
        }
        int i = this.e;
        int i2 = this.d / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    @Override // defpackage.qh
    public final boolean f(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.o;
        if (i != 1) {
            return i == 2;
        }
        boolean zE = e(motionEvent.getX(), motionEvent.getY());
        boolean zD = d(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (zE) {
            if (!zD) {
                this.A = 2;
                this.f = (int) motionEvent.getY();
            }
            b(2);
            return true;
        }
        if (!zD) {
            return false;
        }
        this.A = 1;
        this.i = (int) motionEvent.getX();
        b(2);
        return true;
    }

    @Override // defpackage.pz
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        if (this.j != this.l.getWidth() || this.k != this.l.getHeight()) {
            this.j = this.l.getWidth();
            this.k = this.l.getHeight();
            b(0);
            return;
        }
        if (this.q != 0) {
            if (this.m) {
                int i = this.j;
                int i2 = this.u;
                int i3 = i - i2;
                int i4 = this.e;
                int i5 = this.d;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.b;
                stateListDrawable.setBounds(0, 0, i2, i5);
                Drawable drawable = this.c;
                drawable.setBounds(0, 0, this.v, this.k);
                float f = i6;
                float f2 = -i6;
                if (n()) {
                    drawable.draw(canvas);
                    canvas.translate(i2, f);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, f2);
                } else {
                    canvas.translate(i3, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, f);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, f2);
                }
            }
            if (this.n) {
                int i7 = this.k;
                int i8 = this.y;
                int i9 = i7 - i8;
                int i10 = this.h;
                int i11 = this.g;
                StateListDrawable stateListDrawable2 = this.w;
                stateListDrawable2.setBounds(0, 0, i11, i8);
                Drawable drawable2 = this.x;
                drawable2.setBounds(0, 0, this.j, this.z);
                canvas.translate(0.0f, i9);
                drawable2.draw(canvas);
                canvas.translate(i10 - (i11 / 2), 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-r3, -i9);
            }
        }
    }

    @Override // defpackage.qh
    public final void h(MotionEvent motionEvent) {
        if (this.o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zE = e(motionEvent.getX(), motionEvent.getY());
            boolean zD = d(motionEvent.getX(), motionEvent.getY());
            if (zE) {
                if (!zD) {
                    this.A = 2;
                    this.f = (int) motionEvent.getY();
                }
                b(2);
                return;
            }
            if (!zD) {
                return;
            }
            this.A = 1;
            this.i = (int) motionEvent.getX();
            b(2);
            return;
        }
        if (motionEvent.getAction() == 1 && this.o == 2) {
            this.f = 0.0f;
            this.i = 0.0f;
            b(1);
            this.A = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.o == 2) {
            c();
            if (this.A == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.C;
                int i = this.t;
                iArr[0] = i;
                int i2 = this.j - i;
                iArr[1] = i2;
                float fMax = Math.max(i, Math.min(i2, x));
                if (Math.abs(this.h - fMax) >= 2.0f) {
                    int iK = k(this.i, fMax, iArr, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                    if (iK != 0) {
                        this.l.scrollBy(iK, 0);
                    }
                    this.i = fMax;
                }
            }
            if (this.A == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.B;
                int i3 = this.t;
                iArr2[0] = i3;
                int i4 = this.k - i3;
                iArr2[1] = i4;
                float fMax2 = Math.max(i3, Math.min(i4, y));
                if (Math.abs(this.e - fMax2) >= 2.0f) {
                    int iK2 = k(this.f, fMax2, iArr2, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
                    if (iK2 != 0) {
                        this.l.scrollBy(0, iK2);
                    }
                    this.f = fMax2;
                }
            }
        }
    }

    @Override // defpackage.qh
    public final void a(boolean z) {
    }
}
