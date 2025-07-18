package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zs {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public zs(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private final boolean b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void a(yn ynVar, yx yxVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        int i;
        int i2;
        if (ynVar == null) {
            return;
        }
        if (ynVar.ai == 8) {
            yxVar.c = 0;
            yxVar.d = 0;
            yxVar.e = 0;
            return;
        }
        if (ynVar.V != null) {
            int i3 = yxVar.i;
            int i4 = yxVar.j;
            int i5 = yxVar.a;
            int i6 = yxVar.b;
            int i7 = this.b + this.c;
            int i8 = this.d;
            Object obj = ynVar.ah;
            int i9 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i9 == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i9 == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
            } else if (i9 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
                int i10 = ynVar.t;
                int i11 = yxVar.h;
                if (i11 == 1 || i11 == 2) {
                    int measuredHeight = ((View) obj).getMeasuredHeight();
                    int iG = ynVar.g();
                    if (yxVar.h == 2 || i10 != 1 || measuredHeight == iG || (obj instanceof aae) || ynVar.e()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(ynVar.h(), 1073741824);
                    }
                }
            } else if (i9 != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i12 = this.f;
                ym ymVar = ynVar.K;
                int i13 = ymVar != null ? ymVar.f : 0;
                ym ymVar2 = ynVar.M;
                if (ymVar2 != null) {
                    i13 += ymVar2.f;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i8 + i13, -1);
            }
            int i14 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i14 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (i14 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
            } else if (i14 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i7, -2);
                int i15 = ynVar.u;
                int i16 = yxVar.h;
                if (i16 == 1 || i16 == 2) {
                    int measuredWidth = ((View) obj).getMeasuredWidth();
                    int iH = ynVar.h();
                    if (yxVar.h == 2 || i15 != 1 || measuredWidth == iH || (obj instanceof aae) || ynVar.f()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(ynVar.g(), 1073741824);
                    }
                }
            } else if (i14 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i17 = this.g;
                int i18 = ynVar.K != null ? ynVar.L.f : 0;
                if (ynVar.M != null) {
                    i18 += ynVar.N.f;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i7 + i18, -1);
            }
            yn ynVar2 = ynVar.V;
            if (ynVar2 != null && yt.b(this.h.e, 256)) {
                View view = (View) obj;
                if (view.getMeasuredWidth() == ynVar.h() && view.getMeasuredWidth() < ynVar2.h() && view.getMeasuredHeight() == ynVar.g() && view.getMeasuredHeight() < ynVar2.g() && view.getBaseline() == ynVar.ac && !ynVar.J() && b(ynVar.I, iMakeMeasureSpec, ynVar.h()) && b(ynVar.J, iMakeMeasureSpec2, ynVar.g())) {
                    yxVar.c = ynVar.h();
                    yxVar.d = ynVar.g();
                    yxVar.e = ynVar.ac;
                    return;
                }
            }
            boolean z = i3 == 3;
            boolean z2 = i4 == 3;
            boolean z3 = i4 == 4 || i4 == 1;
            boolean z4 = i3 == 4 || i3 == 1;
            boolean z5 = z && ynVar.Y > 0.0f;
            boolean z6 = z2 && ynVar.Y > 0.0f;
            if (obj != null) {
                View view2 = (View) obj;
                zr zrVar = (zr) view2.getLayoutParams();
                boolean z7 = z4;
                int i19 = yxVar.h;
                if (i19 != 1 && i19 != 2 && z && ynVar.t == 0 && z2 && ynVar.u == 0) {
                    i = -1;
                    baseline = 0;
                    iMax = 0;
                    iMax2 = 0;
                } else {
                    if ((obj instanceof aai) && (ynVar instanceof yu)) {
                        throw null;
                    }
                    view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    ynVar.y(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth2 = view2.getMeasuredWidth();
                    int measuredHeight2 = view2.getMeasuredHeight();
                    baseline = view2.getBaseline();
                    int i20 = ynVar.w;
                    iMax = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
                    int i21 = ynVar.x;
                    if (i21 > 0) {
                        iMax = Math.min(i21, iMax);
                    }
                    int i22 = ynVar.z;
                    iMax2 = i22 > 0 ? Math.max(i22, measuredHeight2) : measuredHeight2;
                    int i23 = ynVar.A;
                    if (i23 > 0) {
                        iMax2 = Math.min(i23, iMax2);
                    }
                    if (!yt.b(this.h.e, 1)) {
                        if (z5 && z3) {
                            iMax = (int) ((iMax2 * ynVar.Y) + 0.5f);
                        } else if (z6 && z7) {
                            iMax2 = (int) ((iMax / ynVar.Y) + 0.5f);
                        }
                    }
                    if (measuredWidth2 != iMax || measuredHeight2 != iMax2) {
                        if (measuredWidth2 != iMax) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                        }
                        if (measuredHeight2 != iMax2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                        }
                        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        ynVar.y(iMakeMeasureSpec, iMakeMeasureSpec2);
                        iMax = view2.getMeasuredWidth();
                        iMax2 = view2.getMeasuredHeight();
                        baseline = view2.getBaseline();
                    }
                    i = -1;
                }
                boolean z8 = baseline != i;
                yxVar.g = (iMax == yxVar.a && iMax2 == yxVar.b) ? false : true;
                boolean z9 = z8 | zrVar.ag;
                if (!z9) {
                    i2 = baseline;
                } else if (baseline != -1) {
                    if (ynVar.ac != baseline) {
                        yxVar.g = true;
                    }
                    i2 = baseline;
                } else {
                    i2 = -1;
                }
                yxVar.c = iMax;
                yxVar.d = iMax2;
                yxVar.f = z9;
                yxVar.e = i2;
            }
        }
    }
}
