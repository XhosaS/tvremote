package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iw {
    public int a;
    public RecyclerView b;
    public in c;
    public boolean d;
    public boolean e;
    public View f;
    public boolean g;
    protected final LinearInterpolator h;
    protected final DecelerateInterpolator i;
    protected PointF j;
    protected int k;
    protected int l;
    private final iu m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public iw() {
        this.a = -1;
        this.m = new iu();
    }

    public static int j(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public static final int k(View view) {
        ja jaVarF = RecyclerView.f(view);
        if (jaVarF != null) {
            return jaVarF.b();
        }
        return -1;
    }

    private static int m(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public final int a() {
        return this.b.m.al();
    }

    public PointF b(int i) {
        Object obj = this.c;
        if (obj instanceof iv) {
            return ((iv) obj).J(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(iv.class.getCanonicalName())));
        return null;
    }

    public final View c(int i) {
        return this.b.m.M(i);
    }

    final void d(int i, int i2) {
        PointF pointFB;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            e();
        }
        if (this.d && this.f == null && this.c != null && (pointFB = b(this.a)) != null && (pointFB.x != 0.0f || pointFB.y != 0.0f)) {
            recyclerView.O((int) Math.signum(pointFB.x), (int) Math.signum(pointFB.y), null);
        }
        this.d = false;
        View view = this.f;
        if (view != null) {
            if (k(view) == this.a) {
                View view2 = this.f;
                ix ixVar = recyclerView.K;
                iu iuVar = this.m;
                l(view2, iuVar);
                iuVar.a(recyclerView);
                e();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            ix ixVar2 = recyclerView.K;
            iu iuVar2 = this.m;
            if (a() == 0) {
                e();
            } else {
                int iM = m(this.k, i);
                this.k = iM;
                int iM2 = m(this.l, i2);
                this.l = iM2;
                if (iM == 0 && iM2 == 0) {
                    PointF pointFB2 = b(this.a);
                    if (pointFB2 == null || (pointFB2.x == 0.0f && pointFB2.y == 0.0f)) {
                        iuVar2.a = this.a;
                        e();
                    } else {
                        float fSqrt = (float) Math.sqrt((pointFB2.x * pointFB2.x) + (pointFB2.y * pointFB2.y));
                        pointFB2.x /= fSqrt;
                        pointFB2.y /= fSqrt;
                        this.j = pointFB2;
                        this.k = (int) (pointFB2.x * 10000.0f);
                        this.l = (int) (pointFB2.y * 10000.0f);
                        iuVar2.b((int) (this.k * 1.2f), (int) (this.l * 1.2f), (int) (h(10000) * 1.2f), this.h);
                    }
                }
            }
            int i3 = iuVar2.a;
            iuVar2.a(recyclerView);
            if (i3 < 0 || !this.e) {
                return;
            }
            this.d = true;
            recyclerView.H.b();
        }
    }

    public final void e() {
        if (this.e) {
            this.e = false;
            i();
            this.b.K.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            in inVar = this.c;
            if (inVar.t == this) {
                inVar.t = null;
            }
            this.c = null;
            this.b = null;
        }
    }

    protected float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected final int g(int i) {
        return (int) Math.ceil(h(i) / 0.3356d);
    }

    protected int h(int i) {
        float fAbs = Math.abs(i);
        if (!this.o) {
            this.p = f(this.n);
            this.o = true;
        }
        return (int) Math.ceil(fAbs * this.p);
    }

    protected void i() {
        this.l = 0;
        this.k = 0;
        this.j = null;
    }

    protected void l(View view, iu iuVar) {
        int iJ;
        PointF pointF = this.j;
        int i = 1;
        int iJ2 = 0;
        int i2 = (pointF == null || pointF.x == 0.0f) ? 0 : this.j.x > 0.0f ? 1 : -1;
        in inVar = this.c;
        if (inVar == null || !inVar.V()) {
            iJ = 0;
        } else {
            io ioVar = (io) view.getLayoutParams();
            iJ = j(inVar.ao(view) - ioVar.leftMargin, inVar.ap(view) + ioVar.rightMargin, inVar.aw(), inVar.C - inVar.ax(), i2);
        }
        PointF pointF2 = this.j;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i = 0;
        } else if (this.j.y <= 0.0f) {
            i = -1;
        }
        in inVar2 = this.c;
        if (inVar2 != null && inVar2.W()) {
            io ioVar2 = (io) view.getLayoutParams();
            iJ2 = j(inVar2.aq(view) - ioVar2.topMargin, inVar2.an(view) + ioVar2.bottomMargin, inVar2.ay(), inVar2.D - inVar2.av(), i);
        }
        int iG = g((int) Math.sqrt((iJ * iJ) + (iJ2 * iJ2)));
        if (iG > 0) {
            iuVar.b(-iJ, -iJ2, iG, this.i);
        }
    }

    public iw(Context context) {
        this.a = -1;
        this.m = new iu();
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.o = false;
        this.k = 0;
        this.l = 0;
        this.n = context.getResources().getDisplayMetrics();
    }
}
