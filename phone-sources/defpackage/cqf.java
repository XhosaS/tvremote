package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqf {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public cqf(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean b(int i, int i2, int i3) {
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

    public final void a(cpd cpdVar, cpm cpmVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int baseline;
        int iMax;
        int iMax2;
        int i;
        int i2;
        if (cpdVar == null) {
            return;
        }
        if (cpdVar.ai == 8) {
            cpmVar.c = 0;
            cpmVar.d = 0;
            cpmVar.e = 0;
            return;
        }
        if (cpdVar.V != null) {
            int i3 = cpmVar.i;
            int i4 = cpmVar.j;
            int i5 = cpmVar.a;
            int i6 = cpmVar.b;
            int i7 = this.b + this.c;
            int i8 = this.d;
            Object obj = cpdVar.ah;
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
                int i10 = cpdVar.t;
                int i11 = cpmVar.h;
                if (i11 == 1 || i11 == 2) {
                    int measuredHeight = ((View) obj).getMeasuredHeight();
                    int iH = cpdVar.h();
                    if (cpmVar.h == 2 || i10 != 1 || measuredHeight == iH || (obj instanceof cqp) || cpdVar.e()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(cpdVar.j(), 1073741824);
                    }
                }
            } else if (i9 != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i12 = this.f;
                cpc cpcVar = cpdVar.K;
                int i13 = cpcVar != null ? cpcVar.f : 0;
                cpc cpcVar2 = cpdVar.M;
                if (cpcVar2 != null) {
                    i13 += cpcVar2.f;
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
                int i15 = cpdVar.u;
                int i16 = cpmVar.h;
                if (i16 == 1 || i16 == 2) {
                    int measuredWidth = ((View) obj).getMeasuredWidth();
                    int iJ = cpdVar.j();
                    if (cpmVar.h == 2 || i15 != 1 || measuredWidth == iJ || (obj instanceof cqp) || cpdVar.f()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(cpdVar.h(), 1073741824);
                    }
                }
            } else if (i14 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i17 = this.g;
                int i18 = cpdVar.K != null ? cpdVar.L.f : 0;
                if (cpdVar.M != null) {
                    i18 += cpdVar.N.f;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i7 + i18, -1);
            }
            cpd cpdVar2 = cpdVar.V;
            if (cpdVar2 != null && cpj.b(this.h.g, 256)) {
                View view = (View) obj;
                if (view.getMeasuredWidth() == cpdVar.j() && view.getMeasuredWidth() < cpdVar2.j() && view.getMeasuredHeight() == cpdVar.h() && view.getMeasuredHeight() < cpdVar2.h() && view.getBaseline() == cpdVar.ac && !cpdVar.L() && b(cpdVar.I, iMakeMeasureSpec, cpdVar.j()) && b(cpdVar.J, iMakeMeasureSpec2, cpdVar.h())) {
                    cpmVar.c = cpdVar.j();
                    cpmVar.d = cpdVar.h();
                    cpmVar.e = cpdVar.ac;
                    return;
                }
            }
            boolean z = i3 == 3;
            boolean z2 = i4 == 3;
            boolean z3 = i4 == 4 || i4 == 1;
            boolean z4 = i3 == 4 || i3 == 1;
            boolean z5 = z && cpdVar.Y > 0.0f;
            boolean z6 = z2 && cpdVar.Y > 0.0f;
            if (obj != null) {
                View view2 = (View) obj;
                cqe cqeVar = (cqe) view2.getLayoutParams();
                boolean z7 = z4;
                int i19 = cpmVar.h;
                if (i19 != 1 && i19 != 2 && z && cpdVar.t == 0 && z2 && cpdVar.u == 0) {
                    i = -1;
                    baseline = 0;
                    iMax = 0;
                    iMax2 = 0;
                } else {
                    if ((obj instanceof cqs) && (cpdVar instanceof cpk)) {
                        ((cqs) obj).b((cpk) cpdVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    cpdVar.B(iMakeMeasureSpec, iMakeMeasureSpec2);
                    int measuredWidth2 = view2.getMeasuredWidth();
                    int measuredHeight2 = view2.getMeasuredHeight();
                    baseline = view2.getBaseline();
                    int i20 = cpdVar.w;
                    iMax = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
                    int i21 = cpdVar.x;
                    if (i21 > 0) {
                        iMax = Math.min(i21, iMax);
                    }
                    int i22 = cpdVar.z;
                    iMax2 = i22 > 0 ? Math.max(i22, measuredHeight2) : measuredHeight2;
                    int i23 = cpdVar.A;
                    if (i23 > 0) {
                        iMax2 = Math.min(i23, iMax2);
                    }
                    if (!cpj.b(this.h.g, 1)) {
                        if (z5 && z3) {
                            iMax = (int) ((iMax2 * cpdVar.Y) + 0.5f);
                        } else if (z6 && z7) {
                            iMax2 = (int) ((iMax / cpdVar.Y) + 0.5f);
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
                        cpdVar.B(iMakeMeasureSpec, iMakeMeasureSpec2);
                        iMax = view2.getMeasuredWidth();
                        iMax2 = view2.getMeasuredHeight();
                        baseline = view2.getBaseline();
                    }
                    i = -1;
                }
                boolean z8 = baseline != i;
                cpmVar.g = (iMax == cpmVar.a && iMax2 == cpmVar.b) ? false : true;
                boolean z9 = z8 | cqeVar.ag;
                if (!z9) {
                    i2 = baseline;
                } else if (baseline != -1) {
                    if (cpdVar.ac != baseline) {
                        cpmVar.g = true;
                    }
                    i2 = baseline;
                } else {
                    i2 = -1;
                }
                cpmVar.c = iMax;
                cpmVar.d = iMax2;
                cpmVar.f = z9;
                cpmVar.e = i2;
            }
        }
    }
}
