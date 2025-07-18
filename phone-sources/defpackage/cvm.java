package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvm {
    public boolean a;
    private Object b;
    private Object c;
    private final Object d;
    private Object e;

    public cvm(View view) {
        this.d = view;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.ViewParent, java.lang.Object] */
    private final ViewParent r(int i) {
        if (i == 0) {
            return this.b;
        }
        if (i != 1) {
            return null;
        }
        return this.c;
    }

    private final void s(int i, ViewParent viewParent) {
        if (i == 0) {
            this.b = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.c = viewParent;
        }
    }

    private final int[] t() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return (int[]) this.e;
    }

    public final void a(boolean z) {
        if (this.a) {
            Object obj = this.d;
            int[] iArr = cww.a;
            cwm.n((View) obj);
        }
        this.a = z;
    }

    public final void b() {
        c(0);
    }

    public final void c(int i) {
        ViewParent viewParentR = r(i);
        if (viewParentR != null) {
            cwm.r(viewParentR, (View) this.d, i);
            s(i, null);
        }
    }

    public final boolean d(float f, float f2, boolean z) {
        ViewParent viewParentR;
        if (!this.a || (viewParentR = r(0)) == null) {
            return false;
        }
        return cwm.s(viewParentR, (View) this.d, f, f2, z);
    }

    public final boolean e(float f, float f2) {
        ViewParent viewParentR;
        if (!this.a || (viewParentR = r(0)) == null) {
            return false;
        }
        return cwm.t(viewParentR, (View) this.d, f, f2);
    }

    public final boolean f(int i, int i2, int[] iArr, int[] iArr2) {
        return g(i, i2, iArr, iArr2, 0);
    }

    public final boolean g(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentR;
        int i4;
        int i5;
        int i6;
        if (!this.a || (viewParentR = r(i3)) == null) {
            return false;
        }
        if (i != 0) {
            i4 = i;
        } else {
            if (i2 == 0) {
                if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
                return false;
            }
            i4 = 0;
        }
        if (iArr2 != null) {
            ((View) this.d).getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            iArr2 = null;
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = t();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = (View) this.d;
        cwm.o(viewParentR, view, i4, i2, iArr3, i3);
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean h(int i, int i2, int i3, int i4, int[] iArr) {
        return i(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean i(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentR;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.a || (viewParentR = r(i5)) == null) {
            return false;
        }
        if (i != 0) {
            i6 = i;
            i7 = i2;
            i8 = i3;
        } else if (i2 != 0) {
            i7 = i2;
            i8 = i3;
            i6 = 0;
        } else if (i3 != 0) {
            i8 = i3;
            i6 = 0;
            i7 = 0;
        } else {
            if (i4 == 0) {
                if (iArr4 != null) {
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                }
                return false;
            }
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (iArr4 != null) {
            ((View) this.d).getLocationInWindow(iArr4);
            i9 = iArr4[0];
            i10 = iArr4[1];
        } else {
            iArr4 = null;
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] iArrT = t();
            iArrT[0] = 0;
            iArrT[1] = 0;
            iArr3 = iArrT;
        } else {
            iArr3 = iArr2;
        }
        View view = (View) this.d;
        cwm.p(viewParentR, view, i6, i7, i8, i4, i5, iArr3);
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i9;
            iArr4[1] = iArr4[1] - i10;
        }
        return true;
    }

    public final boolean j() {
        return k(0);
    }

    public final boolean k(int i) {
        return r(i) != null;
    }

    public final boolean l(int i) {
        return m(i, 0);
    }

    public final boolean m(int i, int i2) {
        if (k(i2)) {
            return true;
        }
        if (!this.a) {
            return false;
        }
        Object obj = this.d;
        View view = (View) obj;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            View view2 = (View) obj;
            if (cwm.u(parent, view2, view, i, i2)) {
                s(i2, parent);
                cwm.q(parent, view2, view, i, i2);
                return true;
            }
            if (parent instanceof View) {
                obj = (View) parent;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [eam, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ekm, java.lang.Object] */
    public final ExoPlayer n() {
        Object obj = this.d;
        eil eilVar = new eil((Context) obj, new eij(obj, 2), new eij(obj, 3));
        a.H(true);
        a.ab(!eilVar.w);
        eilVar.q = 10000L;
        a.H(true);
        a.ab(!eilVar.w);
        eilVar.r = 10000L;
        Object obj2 = this.c;
        boolean z = this.a;
        a.ab(true ^ eilVar.w);
        obj2.getClass();
        eilVar.k = (dyo) obj2;
        eilVar.l = z;
        ExoPlayer exoPlayerA = eilVar.a();
        ?? r1 = this.b;
        if (r1 != 0) {
            exoPlayerA.S(r1);
        }
        ?? r12 = this.e;
        if (r12 != 0) {
            exoPlayerA.aq(r12);
        }
        exoPlayerA.S(new ovn());
        exoPlayerA.aq(new fav());
        return exoPlayerA;
    }

    public final void o(ekm ekmVar) {
        ekmVar.getClass();
        this.e = ekmVar;
    }

    public final void p(dyo dyoVar) {
        this.c = dyoVar;
        this.a = true;
    }

    public final void q(eam eamVar) {
        eamVar.getClass();
        this.b = eamVar;
    }

    public cvm(Context context) {
        context.getClass();
        this.d = context;
        this.c = dyo.a;
    }
}
