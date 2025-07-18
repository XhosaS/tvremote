package com.google.android.libraries.elements.converters.layout;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import defpackage.msd;
import defpackage.mse;
import defpackage.msf;
import defpackage.msh;
import defpackage.msi;
import defpackage.msj;
import defpackage.msk;
import defpackage.msl;
import defpackage.msm;
import defpackage.oe;
import defpackage.ogm;
import defpackage.or;
import defpackage.pg;
import defpackage.pq;
import defpackage.qd;
import defpackage.qe;
import defpackage.ql;
import defpackage.qq;
import defpackage.qs;
import defpackage.sy;
import defpackage.yqw;
import defpackage.zag;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FlowLayoutManager extends qd implements sy, qq {
    public final int a;
    public pg b;
    public final msh h;
    public final int i;
    public int j;
    public boolean k;
    private msl l;
    boolean c = false;
    private final boolean m = true;
    int d = -1;
    int e = Integer.MIN_VALUE;
    SavedState f = null;
    final msi g = new msi(this);
    private final msk n = new msk();
    private final int o = 2;

    /* compiled from: PG */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new msm();
        int a;
        int b;
        boolean c;

        public SavedState() {
        }

        final boolean a() {
            return this.a >= 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
            this.c = savedState.c;
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt() == 1;
        }
    }

    public FlowLayoutManager(msj msjVar) {
        this.j = -1;
        this.k = false;
        int i = msjVar.b;
        this.a = i;
        int iA = ogm.a(msjVar.c, msjVar.a);
        this.i = iA;
        int iA2 = ogm.a(msjVar.d, msjVar.a);
        int i2 = msjVar.e;
        this.j = i2;
        this.k = false;
        msd msdVar = new msd();
        msdVar.a = i;
        msdVar.b = iA;
        msdVar.c = iA2;
        msdVar.d = i2;
        msdVar.e = 4;
        Boolean bool = false;
        bool.getClass();
        this.h = new msh(msdVar);
    }

    private final int M(qs qsVar) {
        if (at() == 0) {
            return 0;
        }
        w();
        boolean z = this.m;
        boolean z2 = !z;
        View viewBB = bB(z2);
        View viewBA = bA(z2);
        if (viewBB != null && viewBA != null) {
            pg pgVar = this.b;
            if (at() != 0 && qsVar.a() != 0) {
                if (!z) {
                    return Math.abs(aD(viewBB) - aD(viewBA)) + 1;
                }
                return Math.min(pgVar.k(), pgVar.a(viewBA) - pgVar.d(viewBB));
            }
        }
        return 0;
    }

    private final int N(qs qsVar) {
        if (at() == 0) {
            return 0;
        }
        w();
        boolean z = this.m;
        boolean z2 = !z;
        View viewBB = bB(z2);
        View viewBA = bA(z2);
        if (viewBB != null && viewBA != null) {
            pg pgVar = this.b;
            boolean z3 = this.c;
            if (at() != 0 && qsVar.a() != 0) {
                int iMax = z3 ? Math.max(0, (qsVar.a() - Math.max(aD(viewBB), aD(viewBA))) - 1) : Math.max(0, Math.min(aD(viewBB), aD(viewBA)));
                if (z) {
                    return Math.round((iMax * (Math.abs(pgVar.a(viewBA) - pgVar.d(viewBB)) / (Math.abs(aD(viewBB) - aD(viewBA)) + 1))) + (pgVar.j() - pgVar.d(viewBB)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private final int O(qs qsVar) {
        if (at() == 0) {
            return 0;
        }
        w();
        boolean z = this.m;
        boolean z2 = !z;
        View viewBB = bB(z2);
        View viewBA = bA(z2);
        if (viewBB != null && viewBA != null) {
            pg pgVar = this.b;
            if (at() != 0 && qsVar.a() != 0) {
                if (!z) {
                    return qsVar.a();
                }
                return (int) (((pgVar.a(viewBA) - pgVar.d(viewBB)) / (Math.abs(aD(viewBB) - aD(viewBA)) + 1)) * qsVar.a());
            }
        }
        return 0;
    }

    private final int R(int i, ql qlVar, qs qsVar, boolean z) {
        int iF;
        int iF2 = this.b.f() - i;
        if (iF2 <= 0) {
            return 0;
        }
        int i2 = -r(-iF2, qlVar, qsVar);
        int i3 = i + i2;
        if (!z || (iF = this.b.f() - i3) <= 0) {
            return i2;
        }
        this.b.n(iF);
        return iF + i2;
    }

    private final int S(int i, ql qlVar, qs qsVar, boolean z) {
        int iJ;
        int iJ2 = i - this.b.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i2 = -r(iJ2, qlVar, qsVar);
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.b.j()) <= 0) {
            return i2;
        }
        this.b.n(-iJ);
        return i2 - iJ;
    }

    private final View V() {
        View viewAI = aI(this.c ? 0 : at() - 1);
        viewAI.getClass();
        return viewAI;
    }

    private final View W() {
        View viewAI = aI(this.c ? at() - 1 : 0);
        viewAI.getClass();
        return viewAI;
    }

    private final void aa(ql qlVar, msl mslVar, qs qsVar) {
        if (!mslVar.a || mslVar.l) {
            return;
        }
        if (mslVar.f != -1) {
            int i = mslVar.g;
            if (i >= 0) {
                int iAt = at();
                if (!this.c) {
                    for (int i2 = 0; i2 < iAt; i2++) {
                        View viewAI = aI(i2);
                        viewAI.getClass();
                        msh mshVar = this.h;
                        int iAD = aD(viewAI);
                        msl mslVar2 = this.l;
                        J();
                        if (this.b.a(viewAI) + mshVar.f(viewAI, iAD, qsVar, mslVar2) > i || this.b.l(viewAI) > i) {
                            ab(qlVar, 0, i2);
                            return;
                        }
                    }
                    return;
                }
                int i3 = iAt - 1;
                for (int i4 = i3; i4 >= 0; i4--) {
                    View viewAI2 = aI(i4);
                    viewAI2.getClass();
                    msh mshVar2 = this.h;
                    int iAD2 = aD(viewAI2);
                    msl mslVar3 = this.l;
                    J();
                    if (this.b.a(viewAI2) + mshVar2.f(viewAI2, iAD2, qsVar, mslVar3) > i || this.b.l(viewAI2) > i) {
                        ab(qlVar, i3, i4);
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i5 = mslVar.g;
        int iAt2 = at();
        if (i5 >= 0) {
            int iE = this.b.e() - i5;
            if (this.c) {
                for (int i6 = 0; i6 < iAt2; i6++) {
                    View viewAI3 = aI(i6);
                    viewAI3.getClass();
                    msh mshVar3 = this.h;
                    int iAD3 = aD(viewAI3);
                    msl mslVar4 = this.l;
                    J();
                    if (this.b.d(viewAI3) < mshVar3.f(viewAI3, iAD3, qsVar, mslVar4) + iE || this.b.m(viewAI3) < iE) {
                        ab(qlVar, 0, i6);
                        return;
                    }
                }
                return;
            }
            int i7 = iAt2 - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View viewAI4 = aI(i8);
                viewAI4.getClass();
                msh mshVar4 = this.h;
                int iAD4 = aD(viewAI4);
                msl mslVar5 = this.l;
                J();
                if (this.b.d(viewAI4) < mshVar4.f(viewAI4, iAD4, qsVar, mslVar5) + iE || this.b.m(viewAI4) < iE) {
                    ab(qlVar, i7, i8);
                    return;
                }
            }
        }
    }

    private final void ab(ql qlVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                bc(i, qlVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    bc(i2, qlVar);
                }
            }
        }
    }

    private final void ac() {
        boolean z = false;
        if (this.a != 1 && J()) {
            z = true;
        }
        this.c = z;
    }

    private final void ag(int i, int i2, boolean z, qs qsVar) {
        int i3;
        int iB;
        int iB2;
        int iJ;
        this.l.l = K();
        this.l.h = l(qsVar);
        msl mslVar = this.l;
        mslVar.f = i;
        if (i == 1) {
            mslVar.h += this.b.g();
            View viewV = V();
            msl mslVar2 = this.l;
            mslVar2.e = true != this.c ? 1 : -1;
            mslVar2.d = aD(viewV) + this.l.e;
            msh mshVar = this.h;
            int iAD = aD(viewV);
            msl mslVar3 = this.l;
            J();
            iB2 = mshVar.f(viewV, iAD, qsVar, mslVar3);
            this.l.b = this.b.a(viewV) + iB2;
            iJ = this.b.a(viewV) - this.b.f();
        } else {
            View viewW = W();
            this.l.h += this.b.j();
            msl mslVar4 = this.l;
            mslVar4.e = true != this.c ? -1 : 1;
            int iAD2 = aD(viewW);
            int i4 = this.l.e;
            mslVar4.d = iAD2 + i4;
            if (i4 == 1) {
                msh mshVar2 = this.h;
                int iAD3 = aD(viewW);
                msl mslVar5 = this.l;
                J();
                iB2 = mshVar2.f(viewW, iAD3, qsVar, mslVar5);
            } else {
                msh mshVar3 = this.h;
                int iAD4 = aD(viewW);
                J();
                int i5 = this.l.f;
                msf msfVarB = mshVar3.b(iAD4);
                if (msfVarB == null) {
                    iB2 = 0;
                } else {
                    ArrayList arrayList = msfVarB.e;
                    yqw.L(!arrayList.isEmpty());
                    int i6 = ((mse) zag.e(arrayList)).a;
                    int iA = qsVar.a() - 1;
                    boolean z2 = mshVar3.d;
                    int i7 = i6 == iA ? 0 : mshVar3.a;
                    pg pgVar = mshVar3.i;
                    pgVar.getClass();
                    int i8 = mshVar3.l;
                    int i9 = i8 - 1;
                    if (i8 == 0) {
                        throw null;
                    }
                    if (i9 == 1) {
                        if (i5 != -1) {
                            i3 = msfVarB.a - i7;
                            iB = pgVar.b(viewW);
                            iB2 = i3 - iB;
                        }
                        iB2 = 0;
                    } else if (i9 != 2) {
                        iB2 = ((msfVarB.a - i7) - pgVar.b(viewW)) / 2;
                    } else {
                        if (i5 == -1) {
                            i3 = msfVarB.a - i7;
                            iB = pgVar.b(viewW);
                            iB2 = i3 - iB;
                        }
                        iB2 = 0;
                    }
                }
            }
            this.l.b = this.b.d(viewW) - iB2;
            iJ = (-this.b.d(viewW)) + this.b.j();
        }
        int i10 = iJ + iB2;
        msl mslVar6 = this.l;
        mslVar6.c = i2;
        if (z) {
            mslVar6.c = i2 - i10;
        }
        mslVar6.g = i10;
    }

    private final void ai(msi msiVar) {
        am(msiVar.a, msiVar.b);
    }

    private final void am(int i, int i2) {
        this.l.c = this.b.f() - i2;
        msl mslVar = this.l;
        mslVar.e = true != this.c ? 1 : -1;
        mslVar.d = i;
        mslVar.f = 1;
        mslVar.b = i2;
        mslVar.g = Integer.MIN_VALUE;
    }

    private final void an(msi msiVar) {
        bz(msiVar.a, msiVar.b);
    }

    private final View bA(boolean z) {
        return this.c ? s(0, at(), z, true) : s(at() - 1, -1, z, true);
    }

    private final View bB(boolean z) {
        return this.c ? s(at() - 1, -1, z, true) : s(0, at(), z, true);
    }

    private final View bC(qs qsVar) {
        return L(0, at(), qsVar.a());
    }

    private final View bD(qs qsVar) {
        return L(at() - 1, -1, qsVar.a());
    }

    private final View bE(qs qsVar) {
        return this.c ? bC(qsVar) : bD(qsVar);
    }

    private final View bF(qs qsVar) {
        return this.c ? bD(qsVar) : bC(qsVar);
    }

    private final void bz(int i, int i2) {
        this.l.c = i2 - this.b.j();
        msl mslVar = this.l;
        mslVar.d = i;
        mslVar.e = true != this.c ? -1 : 1;
        mslVar.f = -1;
        mslVar.b = i2;
        mslVar.g = Integer.MIN_VALUE;
    }

    @Override // defpackage.qd
    public final void A(int i, int i2) {
        this.h.d(i);
    }

    @Override // defpackage.qd
    public final int C(qs qsVar) {
        return M(qsVar);
    }

    @Override // defpackage.qd
    public final int D(qs qsVar) {
        return N(qsVar);
    }

    @Override // defpackage.qd
    public final int E(qs qsVar) {
        return O(qsVar);
    }

    @Override // defpackage.qd
    public final int F(qs qsVar) {
        return M(qsVar);
    }

    @Override // defpackage.qd
    public final int G(qs qsVar) {
        return N(qsVar);
    }

    @Override // defpackage.qd
    public final int H(qs qsVar) {
        return O(qsVar);
    }

    public final void I(int i, int i2) {
        this.d = i;
        this.e = i2;
        SavedState savedState = this.f;
        if (savedState != null) {
            savedState.a = -1;
        }
        be();
    }

    protected final boolean J() {
        return this.u.getLayoutDirection() == 1;
    }

    final boolean K() {
        return this.b.h() == 0 && this.b.e() == 0;
    }

    final View L(int i, int i2, int i3) {
        w();
        int iJ = this.b.j();
        int iF = this.b.f();
        View view = null;
        int i4 = i;
        View view2 = null;
        while (i4 != i2) {
            View viewAI = aI(i4);
            viewAI.getClass();
            int iAD = aD(viewAI);
            if (iAD >= 0 && iAD < i3) {
                qe qeVar = (qe) viewAI.getLayoutParams();
                qeVar.getClass();
                if (qeVar.c.s()) {
                    if (view2 == null) {
                        view2 = viewAI;
                    }
                } else {
                    if (this.b.d(viewAI) < iF && this.b.a(viewAI) >= iJ) {
                        return viewAI;
                    }
                    if (view == null) {
                        view = viewAI;
                    }
                }
            }
            i4 += i2 > i ? 1 : -1;
        }
        return view != null ? view : view2;
    }

    @Override // defpackage.qq
    public final PointF P(int i) {
        if (at() == 0) {
            return null;
        }
        View viewAI = aI(0);
        viewAI.getClass();
        float f = (i < aD(viewAI)) != this.c ? -1 : 1;
        return this.a == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    @Override // defpackage.qd
    public final Parcelable Q() {
        SavedState savedState = this.f;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (at() <= 0) {
            savedState2.a = -1;
            return savedState2;
        }
        w();
        boolean z = this.c;
        savedState2.c = z;
        if (z) {
            View viewV = V();
            savedState2.b = this.b.f() - this.b.a(viewV);
            savedState2.a = aD(viewV);
            return savedState2;
        }
        View viewW = W();
        savedState2.a = aD(viewW);
        savedState2.b = this.b.d(viewW) - this.b.j();
        return savedState2;
    }

    @Override // defpackage.qd
    public final View T(int i) {
        int iAt = at();
        if (iAt == 0) {
            return null;
        }
        View viewAI = aI(0);
        viewAI.getClass();
        int iAD = i - aD(viewAI);
        if (iAD >= 0 && iAD < iAt) {
            View viewAI2 = aI(iAD);
            viewAI2.getClass();
            if (aD(viewAI2) == i) {
                return viewAI2;
            }
        }
        return super.T(i);
    }

    @Override // defpackage.qd
    public final void U(String str) {
        if (this.f == null) {
            super.U(str);
        }
    }

    @Override // defpackage.qd
    public final void X(AccessibilityEvent accessibilityEvent) {
        super.X(accessibilityEvent);
        if (at() > 0) {
            accessibilityEvent.setFromIndex(i());
            accessibilityEvent.setToIndex(k());
        }
    }

    @Override // defpackage.qd
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f = (SavedState) parcelable;
            be();
        }
    }

    @Override // defpackage.qd
    public final void Z(int i) {
        this.h.k = i;
        this.d = i;
        this.e = Integer.MIN_VALUE;
        SavedState savedState = this.f;
        if (savedState != null) {
            savedState.a = -1;
        }
        be();
    }

    @Override // defpackage.qd
    public final void aU(pq pqVar, pq pqVar2) {
        msh mshVar = this.h;
        mshVar.e();
        mshVar.d(aB());
    }

    @Override // defpackage.qd
    public final boolean ad() {
        return this.a == 0;
    }

    @Override // defpackage.qd
    public final boolean ae() {
        return this.a == 1;
    }

    @Override // defpackage.qd
    public final boolean af() {
        return true;
    }

    @Override // defpackage.qd
    public final void ak(int i, int i2, qs qsVar, oe oeVar) {
        if (at() != 0) {
            if (1 == this.a) {
                i = i2;
            }
            if (i == 0) {
                return;
            }
            ag(i > 0 ? 1 : -1, Math.abs(i), true, qsVar);
            msl mslVar = this.l;
            int i3 = mslVar.d;
            if (i3 < 0 || i3 >= qsVar.a()) {
                return;
            }
            oeVar.a(i3, Math.max(0, mslVar.g));
        }
    }

    @Override // defpackage.qd
    public final void al(int i, oe oeVar) {
        boolean z;
        int i2;
        SavedState savedState = this.f;
        if (savedState == null || !savedState.a()) {
            ac();
            z = this.c;
            i2 = this.d;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.c;
            i2 = savedState.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.o && i2 >= 0 && i2 < i; i4++) {
            oeVar.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.sy
    public final void ap(View view, View view2) {
        U("Cannot drop a view during a scroll or layout calculation");
        w();
        ac();
        int iAD = aD(view);
        int iAD2 = aD(view2);
        boolean z = this.c;
        char c = iAD < iAD2 ? (char) 1 : (char) 65535;
        if (z) {
            if (c == 1) {
                I(iAD2, this.b.f() - (this.b.d(view2) + this.b.b(view)));
                return;
            } else {
                I(iAD2, this.b.f() - this.b.a(view2));
                return;
            }
        }
        if (c == 65535) {
            I(iAD2, this.b.d(view2));
        } else {
            I(iAD2, this.b.a(view2) - this.b.b(view));
        }
    }

    @Override // defpackage.qd
    public final void aq(RecyclerView recyclerView, int i) {
        or orVar = new or(recyclerView.getContext());
        orVar.g = i;
        bk(orVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0167, code lost:
    
        r0 = r1;
        r14 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016c, code lost:
    
        if (r20.d < r13) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016e, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0170, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0171, code lost:
    
        r0.b(r18.l, r18, J(), r12);
        r14.a = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017f, code lost:
    
        r14 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int c(defpackage.ql r19, defpackage.msl r20, defpackage.qs r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.converters.layout.FlowLayoutManager.c(ql, msl, qs, boolean):int");
    }

    @Override // defpackage.qd
    public final int d(int i, ql qlVar, qs qsVar) {
        if (this.a == 1) {
            return 0;
        }
        return r(i, qlVar, qsVar);
    }

    @Override // defpackage.qd
    public final int e(int i, ql qlVar, qs qsVar) {
        if (this.a == 0) {
            return 0;
        }
        return r(i, qlVar, qsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View eI(android.view.View r7, int r8, defpackage.ql r9, defpackage.qs r10) {
        /*
            r6 = this;
            r6.ac()
            int r7 = r6.at()
            r0 = 0
            if (r7 == 0) goto L98
            r7 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            if (r8 == r2) goto L46
            r3 = 2
            if (r8 == r3) goto L39
            r3 = 17
            if (r8 == r3) goto L34
            r3 = 33
            if (r8 == r3) goto L2f
            r3 = 66
            if (r8 == r3) goto L2a
            r3 = 130(0x82, float:1.82E-43)
            if (r8 == r3) goto L25
        L23:
            r8 = r1
            goto L53
        L25:
            int r8 = r6.a
            if (r8 != r2) goto L23
            goto L3d
        L2a:
            int r8 = r6.a
            if (r8 != 0) goto L23
            goto L3d
        L2f:
            int r8 = r6.a
            if (r8 != r2) goto L23
            goto L4a
        L34:
            int r8 = r6.a
            if (r8 != 0) goto L23
            goto L4a
        L39:
            int r8 = r6.a
            if (r8 != r2) goto L3f
        L3d:
            r8 = r2
            goto L53
        L3f:
            boolean r8 = r6.J()
            if (r8 == 0) goto L3d
            goto L4a
        L46:
            int r8 = r6.a
            if (r8 != r2) goto L4c
        L4a:
            r8 = r7
            goto L53
        L4c:
            boolean r8 = r6.J()
            if (r8 == 0) goto L4a
            goto L3d
        L53:
            if (r8 != r1) goto L56
            return r0
        L56:
            r6.w()
            if (r8 != r7) goto L60
            android.view.View r3 = r6.bF(r10)
            goto L64
        L60:
            android.view.View r3 = r6.bE(r10)
        L64:
            if (r3 != 0) goto L67
            return r0
        L67:
            r6.w()
            pg r4 = r6.b
            int r4 = r4.k()
            float r4 = (float) r4
            r5 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r4 = r4 * r5
            int r4 = (int) r4
            r5 = 0
            r6.ag(r8, r4, r5, r10)
            msl r4 = r6.l
            r4.g = r1
            r4.a = r5
            r6.c(r9, r4, r10, r2)
            if (r8 != r7) goto L8a
            android.view.View r7 = r6.W()
            goto L8e
        L8a:
            android.view.View r7 = r6.V()
        L8e:
            if (r7 == r3) goto L98
            boolean r8 = r7.isFocusable()
            if (r8 != 0) goto L97
            goto L98
        L97:
            return r7
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.converters.layout.FlowLayoutManager.eI(android.view.View, int, ql, qs):android.view.View");
    }

    @Override // defpackage.qd
    public final qe f() {
        return new qe(-2, -2);
    }

    public final int i() {
        View viewS = s(0, at(), false, true);
        if (viewS == null) {
            return -1;
        }
        return aD(viewS);
    }

    public final int k() {
        View viewS = s(at() - 1, -1, false, true);
        if (viewS == null) {
            return -1;
        }
        return aD(viewS);
    }

    protected final int l(qs qsVar) {
        if (qsVar.c()) {
            return this.b.k();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0187  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.ql r17, defpackage.qs r18) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.converters.layout.FlowLayoutManager.o(ql, qs):void");
    }

    @Override // defpackage.qd
    public final void p(qs qsVar) {
        this.f = null;
        this.d = -1;
        this.e = Integer.MIN_VALUE;
        this.g.c();
    }

    final int r(int i, ql qlVar, qs qsVar) {
        if (at() != 0 && i != 0) {
            this.l.a = true;
            w();
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            ag(i2, iAbs, true, qsVar);
            msl mslVar = this.l;
            int iC = mslVar.g + c(qlVar, mslVar, qsVar, false);
            if (iC >= 0) {
                if (iAbs > iC) {
                    i = i2 * iC;
                }
                this.b.n(-i);
                this.l.j = i;
                return i;
            }
        }
        return 0;
    }

    public final View s(int i, int i2, boolean z, boolean z2) {
        w();
        int iJ = this.b.j();
        int iF = this.b.f();
        View view = null;
        int i3 = i;
        while (i3 != i2) {
            View viewAI = aI(i3);
            if (viewAI != null) {
                int iD = this.b.d(viewAI);
                int iA = this.b.a(viewAI);
                if (iD < iF && iA > iJ) {
                    if (!z || (iD >= iJ && iA <= iF)) {
                        return viewAI;
                    }
                    if (z2 && view == null) {
                        view = viewAI;
                    }
                }
            }
            i3 += i2 > i ? 1 : -1;
        }
        return view;
    }

    @Override // defpackage.qd
    public final boolean v() {
        return this.f == null;
    }

    final void w() {
        if (this.l == null) {
            this.l = new msl();
        }
        if (this.b == null) {
            this.b = pg.p(this, this.a);
        }
        msh mshVar = this.h;
        if (mshVar.i == null) {
            mshVar.i = pg.p(this, mshVar.j);
        }
    }

    @Override // defpackage.qd
    public final void x(int i, int i2) {
        this.h.d(i);
    }

    @Override // defpackage.qd
    public final void y() {
        msh mshVar = this.h;
        mshVar.e();
        mshVar.d(aB());
    }

    @Override // defpackage.qd
    public final void ao(RecyclerView recyclerView) {
    }

    @Override // defpackage.qd
    public final void bu(int i, int i2) {
    }

    @Override // defpackage.qd
    public final void z(int i, int i2) {
    }
}
