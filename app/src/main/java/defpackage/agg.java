package defpackage;

import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agg {
    public boolean a;
    private ViewParent b;
    private ViewParent c;
    private final View d;
    private int[] e;

    public agg(View view) {
        this.d = view;
    }

    private final ViewParent i(int i) {
        return i != 0 ? this.c : this.b;
    }

    private final void j(int i, ViewParent viewParent) {
        if (i != 0) {
            this.c = viewParent;
        } else {
            this.b = viewParent;
        }
    }

    private final int[] k() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public final void a(boolean z) {
        if (this.a) {
            View view = this.d;
            int[] iArr = ahj.a;
            ahc.n(view);
        }
        this.a = z;
    }

    public final void b(int i) {
        ViewParent viewParentI = i(i);
        if (viewParentI != null) {
            aht.d(viewParentI, this.d, i);
            j(i, null);
        }
    }

    public final boolean c(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.a || (viewParent = this.b) == null) {
            return false;
        }
        return aht.e(viewParent, this.d, f, f2, z);
    }

    public final boolean d(float f, float f2) {
        ViewParent viewParent;
        if (!this.a || (viewParent = this.b) == null) {
            return false;
        }
        return aht.f(viewParent, this.d, f, f2);
    }

    public final boolean e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentI;
        int i4;
        int i5;
        int i6;
        if (!this.a || (viewParentI = i(i3)) == null) {
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
            this.d.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            iArr2 = null;
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = k();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.d;
        aht.a(viewParentI, view, i4, i2, iArr3, i3);
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentI;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.a || (viewParentI = i(i5)) == null) {
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
            this.d.getLocationInWindow(iArr4);
            i9 = iArr4[0];
            i10 = iArr4[1];
        } else {
            iArr4 = null;
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] iArrK = k();
            iArrK[0] = 0;
            iArrK[1] = 0;
            iArr3 = iArrK;
        } else {
            iArr3 = iArr2;
        }
        View view = this.d;
        aht.b(viewParentI, view, i6, i7, i8, i4, i5, iArr3);
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i9;
            iArr4[1] = iArr4[1] - i10;
        }
        return true;
    }

    public final boolean g(int i) {
        return i(i) != null;
    }

    public final boolean h(int i, int i2) {
        if (g(i2)) {
            return true;
        }
        if (!this.a) {
            return false;
        }
        View view = this.d;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (aht.g(parent, view2, view, i, i2)) {
                j(i2, parent);
                aht.c(parent, view2, view, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view2 = (View) parent;
            }
        }
        return false;
    }
}
