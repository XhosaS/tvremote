package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a;
import defpackage.ajo;
import defpackage.ajr;
import defpackage.oe;
import defpackage.on;
import defpackage.oo;
import defpackage.op;
import defpackage.oq;
import defpackage.or;
import defpackage.pg;
import defpackage.pq;
import defpackage.qc;
import defpackage.qd;
import defpackage.qe;
import defpackage.ql;
import defpackage.qq;
import defpackage.qs;
import defpackage.rd;
import defpackage.sy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutManager extends qd implements sy, qq {
    private op a;
    private boolean b;
    private final boolean c;
    private final oo d;
    private final int e;
    private final int[] f;
    public int k;
    pg l;
    public boolean m;
    boolean n;
    public boolean o;
    int p;
    int q;
    SavedState r;
    final on s;

    /* compiled from: PG */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new oq();
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

    public LinearLayoutManager(int i) {
        this.k = 1;
        this.m = false;
        this.n = false;
        this.o = false;
        this.c = true;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.r = null;
        this.s = new on();
        this.d = new oo();
        this.e = 2;
        this.f = new int[2];
        ab(i);
        ac(false);
    }

    private final int bA(int i, ql qlVar, qs qsVar, boolean z) {
        int iF;
        int iF2 = this.l.f() - i;
        if (iF2 <= 0) {
            return 0;
        }
        int i2 = -O(-iF2, qlVar, qsVar);
        int i3 = i + i2;
        if (!z || (iF = this.l.f() - i3) <= 0) {
            return i2;
        }
        this.l.n(iF);
        return iF + i2;
    }

    private final int bB(int i, ql qlVar, qs qsVar, boolean z) {
        int iJ;
        int iJ2 = i - this.l.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i2 = -O(iJ2, qlVar, qsVar);
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.l.j()) <= 0) {
            return i2;
        }
        this.l.n(-iJ);
        return i2 - iJ;
    }

    private final View bC() {
        return R(0, at());
    }

    private final View bD() {
        return R(at() - 1, -1);
    }

    private final View bE() {
        return aI(this.n ? 0 : at() - 1);
    }

    private final View bF() {
        return aI(this.n ? at() - 1 : 0);
    }

    private final void bG(ql qlVar, op opVar) {
        if (!opVar.a || opVar.m) {
            return;
        }
        int i = opVar.g;
        int i2 = opVar.i;
        if (opVar.f == -1) {
            int iAt = at();
            if (i >= 0) {
                int iE = (this.l.e() - i) + i2;
                if (this.n) {
                    for (int i3 = 0; i3 < iAt; i3++) {
                        View viewAI = aI(i3);
                        if (this.l.d(viewAI) < iE || this.l.m(viewAI) < iE) {
                            bH(qlVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = iAt - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View viewAI2 = aI(i5);
                    if (this.l.d(viewAI2) < iE || this.l.m(viewAI2) < iE) {
                        bH(qlVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int iAt2 = at();
            if (!this.n) {
                for (int i7 = 0; i7 < iAt2; i7++) {
                    View viewAI3 = aI(i7);
                    if (this.l.a(viewAI3) > i6 || this.l.l(viewAI3) > i6) {
                        bH(qlVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iAt2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View viewAI4 = aI(i9);
                if (this.l.a(viewAI4) > i6 || this.l.l(viewAI4) > i6) {
                    bH(qlVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bH(ql qlVar, int i, int i2) {
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

    private final void bI() {
        this.n = (this.k == 1 || !ag()) ? this.m : !this.m;
    }

    private final void bJ(int i, int i2, boolean z, qs qsVar) {
        int iJ;
        this.a.m = ai();
        this.a.f = i;
        int[] iArr = this.f;
        iArr[0] = 0;
        iArr[1] = 0;
        V(qsVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        int i3 = i == 1 ? iMax2 : iMax;
        op opVar = this.a;
        opVar.h = i3;
        if (i != 1) {
            iMax = iMax2;
        }
        opVar.i = iMax;
        if (i == 1) {
            opVar.h = i3 + this.l.g();
            View viewBE = bE();
            op opVar2 = this.a;
            opVar2.e = true == this.n ? -1 : 1;
            int iAD = aD(viewBE);
            op opVar3 = this.a;
            opVar2.d = iAD + opVar3.e;
            opVar3.b = this.l.a(viewBE);
            iJ = this.l.a(viewBE) - this.l.f();
        } else {
            View viewBF = bF();
            this.a.h += this.l.j();
            op opVar4 = this.a;
            opVar4.e = true != this.n ? -1 : 1;
            int iAD2 = aD(viewBF);
            op opVar5 = this.a;
            opVar4.d = iAD2 + opVar5.e;
            opVar5.b = this.l.d(viewBF);
            iJ = (-this.l.d(viewBF)) + this.l.j();
        }
        op opVar6 = this.a;
        opVar6.c = i2;
        if (z) {
            opVar6.c = i2 - iJ;
        }
        opVar6.g = iJ;
    }

    private final void bK(on onVar) {
        bL(onVar.b, onVar.c);
    }

    private final void bL(int i, int i2) {
        this.a.c = this.l.f() - i2;
        op opVar = this.a;
        opVar.e = true != this.n ? 1 : -1;
        opVar.d = i;
        opVar.f = 1;
        opVar.b = i2;
        opVar.g = Integer.MIN_VALUE;
    }

    private final void bM(on onVar) {
        bN(onVar.b, onVar.c);
    }

    private final void bN(int i, int i2) {
        this.a.c = i2 - this.l.j();
        op opVar = this.a;
        opVar.d = i;
        opVar.e = true != this.n ? -1 : 1;
        opVar.f = -1;
        opVar.b = i2;
        opVar.g = Integer.MIN_VALUE;
    }

    private final int bz(qs qsVar) {
        if (at() == 0) {
            return 0;
        }
        W();
        pg pgVar = this.l;
        boolean z = this.c;
        boolean z2 = !z;
        return rd.c(qsVar, pgVar, an(z2), am(z2), this, z);
    }

    private final int c(qs qsVar) {
        if (at() == 0) {
            return 0;
        }
        W();
        pg pgVar = this.l;
        boolean z = this.c;
        boolean z2 = !z;
        return rd.a(qsVar, pgVar, an(z2), am(z2), this, z);
    }

    private final int r(qs qsVar) {
        if (at() == 0) {
            return 0;
        }
        W();
        pg pgVar = this.l;
        boolean z = this.c;
        boolean z2 = !z;
        return rd.b(qsVar, pgVar, an(z2), am(z2), this, z, this.n);
    }

    @Override // defpackage.qd
    public final int C(qs qsVar) {
        return c(qsVar);
    }

    @Override // defpackage.qd
    public final int D(qs qsVar) {
        return r(qsVar);
    }

    @Override // defpackage.qd
    public final int E(qs qsVar) {
        return bz(qsVar);
    }

    @Override // defpackage.qd
    public final int F(qs qsVar) {
        return c(qsVar);
    }

    @Override // defpackage.qd
    public final int G(qs qsVar) {
        return r(qsVar);
    }

    @Override // defpackage.qd
    public final int H(qs qsVar) {
        return bz(qsVar);
    }

    final int I(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.k != 1 && ag()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.k != 1 && ag()) ? -1 : 1;
        }
        if (i == 17) {
            i3 = 0;
        } else if (i != 33) {
            if (i != 66) {
                return (i == 130 && this.k == 1) ? 1 : Integer.MIN_VALUE;
            }
            i2 = 1;
            i3 = 0;
        }
        if (this.k == i3) {
            return i2;
        }
        return Integer.MIN_VALUE;
    }

    final int J(ql qlVar, op opVar, qs qsVar, boolean z) {
        int i = opVar.c;
        int i2 = opVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                opVar.g = i2 + i;
            }
            bG(qlVar, opVar);
        }
        int i3 = opVar.c + opVar.h;
        oo ooVar = this.d;
        while (true) {
            if ((!opVar.m && i3 <= 0) || !opVar.c(qsVar)) {
                break;
            }
            ooVar.a = 0;
            ooVar.b = false;
            ooVar.c = false;
            ooVar.d = false;
            k(qlVar, qsVar, opVar, ooVar);
            if (!ooVar.b) {
                int i4 = opVar.b;
                int i5 = ooVar.a;
                opVar.b = i4 + (opVar.f * i5);
                if (!ooVar.c || opVar.l != null || !qsVar.g) {
                    opVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = opVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    opVar.g = i7;
                    int i8 = opVar.c;
                    if (i8 < 0) {
                        opVar.g = i7 + i8;
                    }
                    bG(qlVar, opVar);
                }
                if (z && ooVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - opVar.c;
    }

    public final int K() {
        View viewS = S(0, at(), true, false);
        if (viewS == null) {
            return -1;
        }
        return aD(viewS);
    }

    public final int L() {
        View viewS = S(0, at(), false, true);
        if (viewS == null) {
            return -1;
        }
        return aD(viewS);
    }

    public final int M() {
        View viewS = S(at() - 1, -1, true, false);
        if (viewS == null) {
            return -1;
        }
        return aD(viewS);
    }

    public final int N() {
        View viewS = S(at() - 1, -1, false, true);
        if (viewS == null) {
            return -1;
        }
        return aD(viewS);
    }

    final int O(int i, ql qlVar, qs qsVar) {
        if (at() != 0 && i != 0) {
            W();
            this.a.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            bJ(i2, iAbs, true, qsVar);
            op opVar = this.a;
            int iJ = opVar.g + J(qlVar, opVar, qsVar, false);
            if (iJ >= 0) {
                if (iAbs > iJ) {
                    i = i2 * iJ;
                }
                this.l.n(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.qq
    public final PointF P(int i) {
        if (at() == 0) {
            return null;
        }
        float f = (i < aD(aI(0))) != this.n ? -1 : 1;
        return this.k == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    @Override // defpackage.qd
    public final Parcelable Q() {
        SavedState savedState = this.r;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (at() <= 0) {
            savedState2.a = -1;
            return savedState2;
        }
        W();
        boolean z = this.b ^ this.n;
        savedState2.c = z;
        if (z) {
            View viewBE = bE();
            savedState2.b = this.l.f() - this.l.a(viewBE);
            savedState2.a = aD(viewBE);
            return savedState2;
        }
        View viewBF = bF();
        savedState2.a = aD(viewBF);
        savedState2.b = this.l.d(viewBF) - this.l.j();
        return savedState2;
    }

    final View R(int i, int i2) {
        W();
        if (i2 <= i && i2 >= i) {
            return aI(i);
        }
        int iD = this.l.d(aI(i));
        int iJ = this.l.j();
        int i3 = iD < iJ ? 16388 : 4097;
        int i4 = iD < iJ ? 16644 : 4161;
        return this.k == 0 ? this.v.a(i, i2, i4, i3) : this.w.a(i, i2, i4, i3);
    }

    final View S(int i, int i2, boolean z, boolean z2) {
        W();
        int i3 = this.k;
        int i4 = true != z ? 320 : 24579;
        int i5 = true != z2 ? 0 : 320;
        return i3 == 0 ? this.v.a(i, i2, i4, i5) : this.w.a(i, i2, i4, i5);
    }

    @Override // defpackage.qd
    public final View T(int i) {
        int iAt = at();
        if (iAt == 0) {
            return null;
        }
        int iAD = i - aD(aI(0));
        if (iAD >= 0 && iAD < iAt) {
            View viewAI = aI(iAD);
            if (aD(viewAI) == i) {
                return viewAI;
            }
        }
        return super.T(i);
    }

    @Override // defpackage.qd
    public final void U(String str) {
        if (this.r == null) {
            super.U(str);
        }
    }

    protected final void V(qs qsVar, int[] iArr) {
        int iK = qsVar.c() ? this.l.k() : 0;
        int i = this.a.f;
        int i2 = i == -1 ? 0 : iK;
        if (i != -1) {
            iK = 0;
        }
        iArr[0] = iK;
        iArr[1] = i2;
    }

    final void W() {
        if (this.a == null) {
            this.a = new op();
        }
    }

    @Override // defpackage.qd
    public final void X(AccessibilityEvent accessibilityEvent) {
        super.X(accessibilityEvent);
        if (at() > 0) {
            accessibilityEvent.setFromIndex(L());
            accessibilityEvent.setToIndex(N());
        }
    }

    @Override // defpackage.qd
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.r = savedState;
            if (this.p != -1) {
                savedState.a = -1;
            }
            be();
        }
    }

    @Override // defpackage.qd
    public final void Z(int i) {
        this.p = i;
        this.q = Integer.MIN_VALUE;
        SavedState savedState = this.r;
        if (savedState != null) {
            savedState.a = -1;
        }
        be();
    }

    public final void aa(int i, int i2) {
        this.p = i;
        this.q = i2;
        SavedState savedState = this.r;
        if (savedState != null) {
            savedState.a = -1;
        }
        be();
    }

    public final void ab(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.b(i, "invalid orientation:"));
        }
        U(null);
        if (i != this.k || this.l == null) {
            pg pgVarP = pg.p(this, i);
            this.l = pgVarP;
            this.s.a = pgVarP;
            this.k = i;
            be();
        }
    }

    public final void ac(boolean z) {
        U(null);
        if (z == this.m) {
            return;
        }
        this.m = z;
        be();
    }

    @Override // defpackage.qd
    public final boolean ad() {
        return this.k == 0;
    }

    @Override // defpackage.qd
    public final boolean ae() {
        return this.k == 1;
    }

    @Override // defpackage.qd
    public final boolean af() {
        return true;
    }

    protected final boolean ag() {
        return this.u.getLayoutDirection() == 1;
    }

    @Override // defpackage.qd
    public final boolean ah() {
        return this.m;
    }

    final boolean ai() {
        return this.l.h() == 0 && this.l.e() == 0;
    }

    @Override // defpackage.qd
    public final boolean aj() {
        if (this.G != 1073741824 && this.F != 1073741824) {
            int iAt = at();
            for (int i = 0; i < iAt; i++) {
                ViewGroup.LayoutParams layoutParams = aI(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qd
    public final void ak(int i, int i2, qs qsVar, oe oeVar) {
        if (1 == this.k) {
            i = i2;
        }
        if (at() == 0 || i == 0) {
            return;
        }
        W();
        bJ(i > 0 ? 1 : -1, Math.abs(i), true, qsVar);
        w(qsVar, this.a, oeVar);
    }

    @Override // defpackage.qd
    public final void al(int i, oe oeVar) {
        boolean z;
        int i2;
        SavedState savedState = this.r;
        if (savedState == null || !savedState.a()) {
            bI();
            z = this.n;
            i2 = this.p;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.c;
            i2 = savedState.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.e && i2 >= 0 && i2 < i; i4++) {
            oeVar.a(i2, 0);
            i2 += i3;
        }
    }

    final View am(boolean z) {
        return this.n ? S(0, at(), z, true) : S(at() - 1, -1, z, true);
    }

    final View an(boolean z) {
        return this.n ? S(at() - 1, -1, z, true) : S(0, at(), z, true);
    }

    @Override // defpackage.sy
    public final void ap(View view, View view2) {
        U("Cannot drop a view during a scroll or layout calculation");
        W();
        bI();
        int iAD = aD(view);
        int iAD2 = aD(view2);
        boolean z = this.n;
        char c = iAD < iAD2 ? (char) 1 : (char) 65535;
        if (z) {
            if (c == 1) {
                aa(iAD2, this.l.f() - (this.l.d(view2) + this.l.b(view)));
                return;
            } else {
                aa(iAD2, this.l.f() - this.l.a(view2));
                return;
            }
        }
        if (c == 65535) {
            aa(iAD2, this.l.d(view2));
        } else {
            aa(iAD2, this.l.a(view2) - this.l.b(view));
        }
    }

    @Override // defpackage.qd
    public final void aq(RecyclerView recyclerView, int i) {
        or orVar = new or(recyclerView.getContext());
        orVar.g = i;
        bk(orVar);
    }

    @Override // defpackage.qd
    public int d(int i, ql qlVar, qs qsVar) {
        if (this.k == 1) {
            return 0;
        }
        return O(i, qlVar, qsVar);
    }

    @Override // defpackage.qd
    public int e(int i, ql qlVar, qs qsVar) {
        if (this.k == 0) {
            return 0;
        }
        return O(i, qlVar, qsVar);
    }

    @Override // defpackage.qd
    public View eI(View view, int i, ql qlVar, qs qsVar) {
        int I;
        View viewBC;
        bI();
        if (at() == 0 || (I = I(i)) == Integer.MIN_VALUE) {
            return null;
        }
        W();
        bJ(I, (int) (this.l.k() * 0.33333334f), false, qsVar);
        op opVar = this.a;
        opVar.g = Integer.MIN_VALUE;
        opVar.a = false;
        J(qlVar, opVar, qsVar, true);
        if (I == -1) {
            viewBC = this.n ? bD() : bC();
            I = -1;
        } else {
            viewBC = this.n ? bC() : bD();
        }
        View viewBF = I == -1 ? bF() : bE();
        if (!viewBF.hasFocusable()) {
            return viewBC;
        }
        if (viewBC == null) {
            return null;
        }
        return viewBF;
    }

    @Override // defpackage.qd
    public void eJ(ql qlVar, qs qsVar, ajr ajrVar) {
        super.eJ(qlVar, qsVar, ajrVar);
        pq pqVar = this.u.n;
        if (pqVar == null || pqVar.a() <= 0) {
            return;
        }
        ajrVar.c(ajo.f);
    }

    @Override // defpackage.qd
    public qe f() {
        return new qe(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View i(defpackage.ql r17, defpackage.qs r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.W()
            int r1 = r0.at()
            r2 = 1
            r3 = 0
            if (r20 == 0) goto L15
            int r1 = r0.at()
            r4 = -1
            int r1 = r1 + r4
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r5 = r2
            r1 = r3
        L18:
            int r6 = r18.a()
            pg r7 = r0.l
            int r7 = r7.j()
            pg r8 = r0.l
            int r8 = r8.f()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.aI(r1)
            int r13 = r0.aD(r12)
            pg r14 = r0.l
            int r14 = r14.d(r12)
            pg r15 = r0.l
            int r15 = r15.a(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            qe r13 = (defpackage.qe) r13
            qv r13 = r13.c
            boolean r13 = r13.s()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r2
            goto L5e
        L5d:
            r13 = r3
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r2
            goto L65
        L64:
            r14 = r3
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.i(ql, qs, boolean, boolean):android.view.View");
    }

    public void k(ql qlVar, qs qsVar, op opVar, oo ooVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int iC;
        int i5;
        int i6;
        View viewA = opVar.a(qlVar);
        if (viewA == null) {
            ooVar.b = true;
            return;
        }
        qe qeVar = (qe) viewA.getLayoutParams();
        if (opVar.l == null) {
            if (this.n == (opVar.f == -1)) {
                super.aL(viewA, -1, false);
            } else {
                super.aL(viewA, 0, false);
            }
        } else {
            if (this.n == (opVar.f == -1)) {
                super.aL(viewA, -1, true);
            } else {
                super.aL(viewA, 0, true);
            }
        }
        by(viewA, 0);
        ooVar.a = this.l.b(viewA);
        if (this.k == 1) {
            if (ag()) {
                iC = this.H - getPaddingRight();
                paddingLeft = iC - this.l.c(viewA);
            } else {
                paddingLeft = getPaddingLeft();
                iC = this.l.c(viewA) + paddingLeft;
            }
            if (opVar.f == -1) {
                i6 = opVar.b;
                i5 = i6 - ooVar.a;
            } else {
                i5 = opVar.b;
                i6 = ooVar.a + i5;
            }
            int i7 = paddingLeft;
            i4 = i5;
            i3 = i7;
            i2 = i6;
            i = iC;
        } else {
            int paddingTop = getPaddingTop();
            int iC2 = this.l.c(viewA) + paddingTop;
            if (opVar.f == -1) {
                int i8 = opVar.b;
                i3 = i8 - ooVar.a;
                i = i8;
                i2 = iC2;
            } else {
                int i9 = opVar.b;
                i = ooVar.a + i9;
                i2 = iC2;
                i3 = i9;
            }
            i4 = paddingTop;
        }
        aR(viewA, i3, i4, i, i2);
        if (qeVar.c.s() || qeVar.c.v()) {
            ooVar.c = true;
        }
        ooVar.d = viewA.hasFocusable();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01aa  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(defpackage.ql r17, defpackage.qs r18) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.o(ql, qs):void");
    }

    @Override // defpackage.qd
    public void p(qs qsVar) {
        this.r = null;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.s.d();
    }

    public void s(boolean z) {
        U(null);
        if (this.o == z) {
            return;
        }
        this.o = z;
        be();
    }

    @Override // defpackage.qd
    public boolean u(int i, Bundle bundle) {
        int iMin;
        if (super.u(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.u;
                iMin = Math.min(i2, eG(recyclerView.e, recyclerView.N) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.u;
                iMin = Math.min(i3, eF(recyclerView2.e, recyclerView2.N) - 1);
            }
            if (iMin >= 0) {
                aa(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qd
    public boolean v() {
        return this.r == null && this.b == this.o;
    }

    public void w(qs qsVar, op opVar, oe oeVar) {
        int i = opVar.d;
        if (i < 0 || i >= qsVar.a()) {
            return;
        }
        oeVar.a(i, Math.max(0, opVar.g));
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.m = false;
        this.n = false;
        this.o = false;
        this.c = true;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.r = null;
        this.s = new on();
        this.d = new oo();
        this.e = 2;
        this.f = new int[2];
        qc qcVarAG = aG(context, attributeSet, i, i2);
        ab(qcVarAG.a);
        ac(qcVarAG.c);
        s(qcVarAG.d);
    }

    @Override // defpackage.qd
    public final void ao(RecyclerView recyclerView) {
    }

    public void l(ql qlVar, qs qsVar, on onVar, int i) {
    }
}
