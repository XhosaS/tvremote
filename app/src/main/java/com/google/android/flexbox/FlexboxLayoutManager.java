package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import defpackage.jve;
import defpackage.jvf;
import defpackage.jvg;
import defpackage.jvi;
import defpackage.jvk;
import defpackage.jvl;
import defpackage.jvm;
import defpackage.jvn;
import defpackage.or;
import defpackage.pe;
import defpackage.pf;
import defpackage.pg;
import defpackage.pq;
import defpackage.qc;
import defpackage.qd;
import defpackage.qe;
import defpackage.ql;
import defpackage.qq;
import defpackage.qs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FlexboxLayoutManager extends qd implements jve, qq {
    private static final Rect h = new Rect();
    private final Context L;
    private View M;
    public int a;
    public int b;
    public boolean c;
    public pg f;
    public pg g;
    private int i;
    private boolean k;
    private ql l;
    private qs m;
    private jvm n;
    private SavedState p;
    private final int j = -1;
    public List d = new ArrayList();
    public final jvi e = new jvi(this);
    private final jvk o = new jvk(this);
    private int q = -1;
    private int r = Integer.MIN_VALUE;
    private int s = Integer.MIN_VALUE;
    private int J = Integer.MIN_VALUE;
    private final SparseArray K = new SparseArray();
    private int N = -1;
    private final jvg O = new jvg();

    /* compiled from: PG */
    public class LayoutParams extends qe implements FlexItem {
        public static final Parcelable.Creator CREATOR = new jvl();
        private float a;
        private float b;
        private int g;
        private float h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;

        public LayoutParams() {
            super(-2, -2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float a() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float b() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float c() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int d() {
            return this.g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int e() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return this.bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int g() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j() {
            return this.l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k() {
            return this.k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int l() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int m() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void p(int i) {
            this.j = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void q(int i) {
            this.i = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean r() {
            return this.m;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeInt(this.g);
            parcel.writeFloat(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            this.g = parcel.readInt();
            this.h = parcel.readFloat();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    /* compiled from: PG */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new jvn();
        public int a;
        public int b;

        public SavedState() {
        }

        public final boolean a(int i) {
            int i2 = this.a;
            return i2 >= 0 && i2 < i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "SavedState{mAnchorPosition=" + this.a + ", mAnchorOffset=" + this.b + "}";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        qc qcVarAG = aG(context, attributeSet, i, i2);
        int i3 = qcVarAG.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (qcVarAG.c) {
                    s(3);
                } else {
                    s(2);
                }
            }
        } else if (qcVarAG.c) {
            s(1);
        } else {
            s(0);
        }
        if (this.b != 1) {
            aZ();
            ab();
            this.b = 1;
            this.f = null;
            this.g = null;
            be();
        }
        if (this.i != 4) {
            aZ();
            ab();
            this.i = 4;
            be();
        }
        this.L = context;
    }

    private final int I(qs qsVar) {
        if (at() == 0) {
            return 0;
        }
        int iA = qsVar.a();
        View viewR = R(iA);
        View viewV = V(iA);
        if (qsVar.a() == 0 || viewR == null || viewV == null) {
            return 0;
        }
        int iAD = aD(viewR);
        int iAD2 = aD(viewV);
        int iA2 = this.f.a(viewV) - this.f.d(viewR);
        jvi jviVar = this.e;
        int iAbs = Math.abs(iA2);
        int i = jviVar.b[iAD];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((r3[iAD2] - i) + 1))) + (this.f.j() - this.f.d(viewR)));
    }

    private final int J(qs qsVar) {
        if (at() != 0) {
            int iA = qsVar.a();
            View viewR = R(iA);
            View viewV = V(iA);
            if (qsVar.a() != 0 && viewR != null && viewV != null) {
                View viewBD = bD(0, at());
                int iAD = viewBD == null ? -1 : aD(viewBD);
                return (int) ((Math.abs(this.f.a(viewV) - this.f.d(viewR)) / ((r() - iAD) + 1)) * qsVar.a());
            }
        }
        return 0;
    }

    private final int K(ql qlVar, qs qsVar, jvm jvmVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        int i8 = jvmVar.f;
        if (i8 != Integer.MIN_VALUE) {
            int i9 = jvmVar.a;
            if (i9 < 0) {
                jvmVar.f = i8 + i9;
            }
            ai(qlVar, jvmVar);
        }
        int i10 = jvmVar.a;
        boolean zQ = q();
        int i11 = i10;
        int i12 = 0;
        while (true) {
            if (i11 <= 0 && !this.n.b) {
                break;
            }
            List list = this.d;
            int i13 = jvmVar.d;
            if (i13 < 0 || i13 >= qsVar.a() || (i = jvmVar.c) < 0 || i >= list.size()) {
                break;
            }
            jvf jvfVar = (jvf) this.d.get(jvmVar.c);
            jvmVar.d = jvfVar.o;
            int i14 = 1;
            if (q()) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i15 = this.H;
                int i16 = jvmVar.e;
                if (jvmVar.i == -1) {
                    i16 -= jvfVar.g;
                }
                int i17 = jvmVar.d;
                int i18 = i15 - paddingRight;
                float f2 = this.o.d;
                float fMax = Math.max(0.0f, 0.0f);
                int i19 = jvfVar.h;
                float measuredWidth = i18 - f2;
                float measuredWidth2 = paddingLeft - f2;
                int i20 = i17;
                int i21 = 0;
                while (i20 < i17 + i19) {
                    View viewI = i(i20);
                    int i22 = i10;
                    if (jvmVar.i == i14) {
                        aM(viewI, h);
                        super.aL(viewI, -1, false);
                    } else {
                        aM(viewI, h);
                        int i23 = i21;
                        super.aL(viewI, i23, false);
                        i21 = i23 + 1;
                    }
                    int i24 = i19;
                    jvi jviVar = this.e;
                    int i25 = i16;
                    long j = jviVar.c[i20];
                    int i26 = (int) j;
                    boolean z2 = zQ;
                    int i27 = (int) (j >> 32);
                    if (bC(viewI, i26, i27, (LayoutParams) viewI.getLayoutParams())) {
                        viewI.measure(i26, i27);
                    }
                    float fAC = measuredWidth2 + r5.leftMargin + aC(viewI);
                    float fAE = measuredWidth - (r5.rightMargin + aE(viewI));
                    int iAF = i25 + aF(viewI);
                    if (this.c) {
                        int iRound = Math.round(fAE) - viewI.getMeasuredWidth();
                        int iRound2 = Math.round(fAE);
                        int measuredHeight = iAF + viewI.getMeasuredHeight();
                        i7 = i20;
                        f = fAE;
                        jviVar.j(viewI, jvfVar, iRound, iAF, iRound2, measuredHeight);
                    } else {
                        i7 = i20;
                        f = fAE;
                        jviVar.j(viewI, jvfVar, Math.round(fAC), iAF, Math.round(fAC) + viewI.getMeasuredWidth(), iAF + viewI.getMeasuredHeight());
                    }
                    measuredWidth2 = fAC + viewI.getMeasuredWidth() + r5.rightMargin + aE(viewI) + fMax;
                    measuredWidth = f - (((viewI.getMeasuredWidth() + r5.leftMargin) + aC(viewI)) + fMax);
                    i20 = i7 + 1;
                    i10 = i22;
                    i16 = i25;
                    i19 = i24;
                    zQ = z2;
                    i14 = 1;
                }
                i2 = i10;
                z = zQ;
                jvmVar.c += this.n.i;
                i4 = jvfVar.g;
            } else {
                i2 = i10;
                z = zQ;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i28 = this.I;
                int i29 = jvmVar.e;
                if (jvmVar.i == -1) {
                    int i30 = jvfVar.g;
                    i3 = i29 + i30;
                    i29 -= i30;
                } else {
                    i3 = i29;
                }
                int i31 = jvmVar.d;
                int i32 = i28 - paddingBottom;
                float f3 = this.o.d;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i33 = jvfVar.h;
                float measuredHeight2 = i32 - f3;
                float measuredHeight3 = paddingTop - f3;
                int i34 = i31;
                int i35 = 0;
                while (i34 < i31 + i33) {
                    int i36 = i31;
                    View viewI2 = i(i34);
                    int i37 = i33;
                    jvi jviVar2 = this.e;
                    float f4 = measuredHeight3;
                    int i38 = i34;
                    long j2 = jviVar2.c[i38];
                    int i39 = (int) j2;
                    float f5 = measuredHeight2;
                    int i40 = (int) (j2 >> 32);
                    if (bC(viewI2, i39, i40, (LayoutParams) viewI2.getLayoutParams())) {
                        viewI2.measure(i39, i40);
                    }
                    float fAF = f4 + r6.topMargin + aF(viewI2);
                    float fAs = f5 - (r6.rightMargin + as(viewI2));
                    if (jvmVar.i == 1) {
                        aM(viewI2, h);
                        super.aL(viewI2, -1, false);
                    } else {
                        aM(viewI2, h);
                        super.aL(viewI2, i35, false);
                        i35++;
                    }
                    int i41 = i35;
                    int iAC = aC(viewI2) + i29;
                    int iAE = i3 - aE(viewI2);
                    if (!this.c) {
                        i5 = i36;
                        i6 = i37;
                        if (this.k) {
                            jviVar2.k(viewI2, jvfVar, false, iAC, Math.round(fAs) - viewI2.getMeasuredHeight(), iAC + viewI2.getMeasuredWidth(), Math.round(fAs));
                        } else {
                            jviVar2.k(viewI2, jvfVar, false, iAC, Math.round(fAF), iAC + viewI2.getMeasuredWidth(), Math.round(fAF) + viewI2.getMeasuredHeight());
                        }
                    } else if (this.k) {
                        int measuredWidth3 = iAE - viewI2.getMeasuredWidth();
                        int iRound3 = Math.round(fAs) - viewI2.getMeasuredHeight();
                        int iRound4 = Math.round(fAs);
                        i6 = i37;
                        i5 = i36;
                        jviVar2.k(viewI2, jvfVar, true, measuredWidth3, iRound3, iAE, iRound4);
                    } else {
                        i5 = i36;
                        i6 = i37;
                        jviVar2.k(viewI2, jvfVar, true, iAE - viewI2.getMeasuredWidth(), Math.round(fAF), iAE, Math.round(fAF) + viewI2.getMeasuredHeight());
                    }
                    measuredHeight3 = fAF + viewI2.getMeasuredHeight() + r6.topMargin + as(viewI2) + fMax2;
                    measuredHeight2 = fAs - (((viewI2.getMeasuredHeight() + r6.bottomMargin) + aF(viewI2)) + fMax2);
                    i31 = i5;
                    i35 = i41;
                    i34 = i38 + 1;
                    i33 = i6;
                }
                jvmVar.c += this.n.i;
                i4 = jvfVar.g;
            }
            i12 += i4;
            if (z || !this.c) {
                jvmVar.e += jvfVar.g * jvmVar.i;
            } else {
                jvmVar.e -= jvfVar.g * jvmVar.i;
            }
            i11 -= jvfVar.g;
            i10 = i2;
            zQ = z;
        }
        int i42 = i10;
        int i43 = jvmVar.a - i12;
        jvmVar.a = i43;
        int i44 = jvmVar.f;
        if (i44 != Integer.MIN_VALUE) {
            int i45 = i44 + i12;
            jvmVar.f = i45;
            if (i43 < 0) {
                jvmVar.f = i45 + i43;
            }
            ai(qlVar, jvmVar);
        }
        return i42 - jvmVar.a;
    }

    private final int L(int i, ql qlVar, qs qsVar, boolean z) {
        int iN;
        int iF;
        if (q() || !this.c) {
            int iF2 = this.f.f() - i;
            if (iF2 <= 0) {
                return 0;
            }
            iN = -N(-iF2, qlVar, qsVar);
        } else {
            int iJ = i - this.f.j();
            if (iJ <= 0) {
                return 0;
            }
            iN = N(iJ, qlVar, qsVar);
        }
        int i2 = i + iN;
        if (!z || (iF = this.f.f() - i2) <= 0) {
            return iN;
        }
        this.f.n(iF);
        return iF + iN;
    }

    private final int M(int i, ql qlVar, qs qsVar, boolean z) {
        int iN;
        int iJ;
        if (q() || !this.c) {
            int iJ2 = i - this.f.j();
            if (iJ2 <= 0) {
                return 0;
            }
            iN = -N(iJ2, qlVar, qsVar);
        } else {
            int iF = this.f.f() - i;
            if (iF <= 0) {
                return 0;
            }
            iN = N(-iF, qlVar, qsVar);
        }
        int i2 = i + iN;
        if (!z || (iJ = i2 - this.f.j()) <= 0) {
            return iN;
        }
        this.f.n(-iJ);
        return iN - iJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int N(int r20, defpackage.ql r21, defpackage.qs r22) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.N(int, ql, qs):int");
    }

    private final int O(int i) {
        if (at() == 0 || i == 0) {
            return 0;
        }
        ag();
        boolean zQ = q();
        int width = zQ ? this.M.getWidth() : this.M.getHeight();
        int i2 = zQ ? this.H : this.I;
        if (this.u.getLayoutDirection() == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + this.o.d) - width, iAbs);
            }
            int i3 = this.o.d;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - this.o.d) - width, i);
            }
            int i4 = this.o.d;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    private final View R(int i) {
        View viewAa = aa(0, at(), i);
        if (viewAa == null) {
            return null;
        }
        int i2 = this.e.b[aD(viewAa)];
        if (i2 != -1) {
            return S(viewAa, (jvf) this.d.get(i2));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.View S(android.view.View r6, defpackage.jvf r7) {
        /*
            r5 = this;
            boolean r0 = r5.q()
            int r7 = r7.h
            r1 = 1
        L7:
            if (r1 >= r7) goto L3e
            android.view.View r2 = r5.aI(r1)
            if (r2 == 0) goto L3b
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L3b
            boolean r3 = r5.c
            if (r3 == 0) goto L2c
            if (r0 != 0) goto L2c
            pg r3 = r5.f
            int r3 = r3.a(r6)
            pg r4 = r5.f
            int r4 = r4.a(r2)
            if (r3 >= r4) goto L3b
            goto L3a
        L2c:
            pg r3 = r5.f
            int r3 = r3.d(r6)
            pg r4 = r5.f
            int r4 = r4.d(r2)
            if (r3 <= r4) goto L3b
        L3a:
            r6 = r2
        L3b:
            int r1 = r1 + 1
            goto L7
        L3e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.S(android.view.View, jvf):android.view.View");
    }

    private final View V(int i) {
        View viewAa = aa(at() - 1, -1, i);
        if (viewAa == null) {
            return null;
        }
        return W(viewAa, (jvf) this.d.get(this.e.b[aD(viewAa)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.View W(android.view.View r6, defpackage.jvf r7) {
        /*
            r5 = this;
            boolean r0 = r5.q()
            int r1 = r5.at()
            int r1 = r1 + (-2)
            int r2 = r5.at()
            int r7 = r7.h
            int r2 = r2 - r7
        L11:
            int r7 = r2 + (-1)
            if (r1 <= r7) goto L4a
            android.view.View r7 = r5.aI(r1)
            if (r7 == 0) goto L47
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 == r4) goto L47
            boolean r3 = r5.c
            if (r3 == 0) goto L38
            if (r0 != 0) goto L38
            pg r3 = r5.f
            int r3 = r3.d(r6)
            pg r4 = r5.f
            int r4 = r4.d(r7)
            if (r3 <= r4) goto L47
            goto L46
        L38:
            pg r3 = r5.f
            int r3 = r3.a(r6)
            pg r4 = r5.f
            int r4 = r4.a(r7)
            if (r3 >= r4) goto L47
        L46:
            r6 = r7
        L47:
            int r1 = r1 + (-1)
            goto L11
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.W(android.view.View, jvf):android.view.View");
    }

    private final View aa(int i, int i2, int i3) {
        int iAD;
        ag();
        ac();
        int iJ = this.f.j();
        int iF = this.f.f();
        View view = null;
        int i4 = i;
        View view2 = null;
        while (i4 != i2) {
            View viewAI = aI(i4);
            if (viewAI != null && (iAD = aD(viewAI)) >= 0 && iAD < i3) {
                if (((qe) viewAI.getLayoutParams()).c.s()) {
                    if (view2 == null) {
                        view2 = viewAI;
                    }
                } else {
                    if (this.f.d(viewAI) >= iJ && this.f.a(viewAI) <= iF) {
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

    private final void ab() {
        this.d.clear();
        jvk jvkVar = this.o;
        jvkVar.b();
        jvkVar.d = 0;
    }

    private final void ac() {
        if (this.n == null) {
            this.n = new jvm();
        }
    }

    private final void ag() {
        if (this.f != null) {
            return;
        }
        if (q()) {
            if (this.b == 0) {
                this.f = new pe(this);
                this.g = new pf(this);
                return;
            } else {
                this.f = new pf(this);
                this.g = new pe(this);
                return;
            }
        }
        if (this.b == 0) {
            this.f = new pf(this);
            this.g = new pe(this);
        } else {
            this.f = new pe(this);
            this.g = new pf(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ai(defpackage.ql r12, defpackage.jvm r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.ai(ql, jvm):void");
    }

    private final void am(ql qlVar, int i, int i2) {
        while (i2 >= i) {
            bc(i2, qlVar);
            i2--;
        }
    }

    private final void an() {
        int i = q() ? this.G : this.F;
        jvm jvmVar = this.n;
        boolean z = true;
        if (i != 0 && i != Integer.MIN_VALUE) {
            z = false;
        }
        jvmVar.b = z;
    }

    private final void ap(int i) {
        if (i >= r()) {
            return;
        }
        int iAt = at();
        jvi jviVar = this.e;
        jviVar.h(iAt);
        jviVar.i(iAt);
        jviVar.g(iAt);
        if (i < jviVar.b.length) {
            this.N = i;
            View viewAI = aI(0);
            if (viewAI != null) {
                this.q = aD(viewAI);
                if (q() || !this.c) {
                    this.r = this.f.d(viewAI) - this.f.j();
                } else {
                    this.r = this.f.a(viewAI) + this.f.g();
                }
            }
        }
    }

    private final void bA(jvk jvkVar, boolean z, boolean z2) {
        if (z2) {
            an();
        } else {
            this.n.b = false;
        }
        if (q() || !this.c) {
            this.n.a = jvkVar.c - this.f.j();
        } else {
            this.n.a = (this.M.getWidth() - jvkVar.c) - this.f.j();
        }
        jvm jvmVar = this.n;
        jvmVar.d = jvkVar.a;
        jvmVar.h = 1;
        jvmVar.i = -1;
        jvmVar.e = jvkVar.c;
        jvmVar.f = Integer.MIN_VALUE;
        jvmVar.c = jvkVar.b;
        if (!z || jvkVar.b <= 0) {
            return;
        }
        int size = this.d.size();
        int i = jvkVar.b;
        if (size > i) {
            jvf jvfVar = (jvf) this.d.get(i);
            r4.c--;
            this.n.d -= jvfVar.h;
        }
    }

    private static boolean bB(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private final boolean bC(View view, int i, int i2, qe qeVar) {
        return (!view.isLayoutRequested() && this.B && bB(view.getWidth(), i, qeVar.width) && bB(view.getHeight(), i2, qeVar.height)) ? false : true;
    }

    private final View bD(int i, int i2) {
        int i3 = i;
        while (i3 != i2) {
            View viewAI = aI(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.H - getPaddingRight();
            int paddingBottom = this.I - getPaddingBottom();
            int iAw = aw(viewAI) - ((qe) viewAI.getLayoutParams()).leftMargin;
            int iAA = aA(viewAI) - ((qe) viewAI.getLayoutParams()).topMargin;
            int iAz = az(viewAI) + ((qe) viewAI.getLayoutParams()).rightMargin;
            int iAv = av(viewAI) + ((qe) viewAI.getLayoutParams()).bottomMargin;
            int i4 = 1;
            boolean z = iAw >= paddingRight || iAz >= paddingLeft;
            boolean z2 = iAA >= paddingBottom || iAv >= paddingTop;
            if (z && z2) {
                return viewAI;
            }
            if (i2 <= i) {
                i4 = -1;
            }
            i3 += i4;
        }
        return null;
    }

    private final void bz(jvk jvkVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            an();
        } else {
            this.n.b = false;
        }
        if (q() || !this.c) {
            this.n.a = this.f.f() - jvkVar.c;
        } else {
            this.n.a = jvkVar.c - getPaddingRight();
        }
        jvm jvmVar = this.n;
        jvmVar.d = jvkVar.a;
        jvmVar.h = 1;
        jvmVar.i = 1;
        jvmVar.e = jvkVar.c;
        jvmVar.f = Integer.MIN_VALUE;
        jvmVar.c = jvkVar.b;
        if (!z || this.d.size() <= 1 || (i = jvkVar.b) < 0 || i >= this.d.size() - 1) {
            return;
        }
        jvf jvfVar = (jvf) this.d.get(jvkVar.b);
        jvm jvmVar2 = this.n;
        jvmVar2.c++;
        jvmVar2.d += jvfVar.h;
    }

    private final int w(qs qsVar) {
        if (at() == 0) {
            return 0;
        }
        int iA = qsVar.a();
        ag();
        View viewR = R(iA);
        View viewV = V(iA);
        if (qsVar.a() == 0 || viewR == null || viewV == null) {
            return 0;
        }
        return Math.min(this.f.k(), this.f.a(viewV) - this.f.d(viewR));
    }

    @Override // defpackage.qd
    public final void A(int i, int i2) {
        ap(i);
    }

    @Override // defpackage.qd
    public final void B(int i, int i2) {
        bu(i, i2);
        ap(i);
    }

    @Override // defpackage.qd
    public final int C(qs qsVar) {
        return w(qsVar);
    }

    @Override // defpackage.qd
    public final int D(qs qsVar) {
        return I(qsVar);
    }

    @Override // defpackage.qd
    public final int E(qs qsVar) {
        return J(qsVar);
    }

    @Override // defpackage.qd
    public final int F(qs qsVar) {
        return w(qsVar);
    }

    @Override // defpackage.qd
    public final int G(qs qsVar) {
        return I(qsVar);
    }

    @Override // defpackage.qd
    public final int H(qs qsVar) {
        return J(qsVar);
    }

    @Override // defpackage.qq
    public final PointF P(int i) {
        View viewAI;
        if (at() == 0 || (viewAI = aI(0)) == null) {
            return null;
        }
        float f = i < aD(viewAI) ? -1 : 1;
        return q() ? new PointF(0.0f, f) : new PointF(f, 0.0f);
    }

    @Override // defpackage.qd
    public final Parcelable Q() {
        SavedState savedState = this.p;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (at() <= 0) {
            savedState2.a = -1;
            return savedState2;
        }
        View viewAI = aI(0);
        savedState2.a = aD(viewAI);
        savedState2.b = this.f.d(viewAI) - this.f.j();
        return savedState2;
    }

    @Override // defpackage.qd
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.p = (SavedState) parcelable;
            be();
        }
    }

    @Override // defpackage.qd
    public final void Z(int i) {
        this.q = i;
        this.r = Integer.MIN_VALUE;
        SavedState savedState = this.p;
        if (savedState != null) {
            savedState.a = -1;
        }
        be();
    }

    @Override // defpackage.jve
    public final int a(int i, int i2, int i3) {
        return au(this.I, this.G, i2, i3, ae());
    }

    @Override // defpackage.qd
    public final void aU(pq pqVar, pq pqVar2) {
        aZ();
    }

    @Override // defpackage.qd
    public final void aV(RecyclerView recyclerView) {
        this.M = (View) recyclerView.getParent();
    }

    @Override // defpackage.qd
    public final boolean ad() {
        if (this.b == 0) {
            return q();
        }
        if (!q()) {
            return true;
        }
        int i = this.H;
        View view = this.M;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // defpackage.qd
    public final boolean ae() {
        if (this.b == 0) {
            return !q();
        }
        if (!q()) {
            int i = this.I;
            View view = this.M;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.qd
    public final boolean af() {
        return true;
    }

    @Override // defpackage.qd
    public final void aq(RecyclerView recyclerView, int i) {
        or orVar = new or(recyclerView.getContext());
        orVar.g = i;
        bk(orVar);
    }

    @Override // defpackage.jve
    public final int b(int i, int i2, int i3) {
        return au(this.H, this.F, i2, i3, ad());
    }

    @Override // defpackage.qd
    public final void bu(int i, int i2) {
        ap(i);
    }

    @Override // defpackage.jve
    public final int c(View view) {
        int iAC;
        int iAE;
        if (q()) {
            iAC = aF(view);
            iAE = as(view);
        } else {
            iAC = aC(view);
            iAE = aE(view);
        }
        return iAC + iAE;
    }

    @Override // defpackage.qd
    public final int d(int i, ql qlVar, qs qsVar) {
        if (!q() || this.b == 0) {
            int iN = N(i, qlVar, qsVar);
            this.K.clear();
            return iN;
        }
        int iO = O(i);
        this.o.d += iO;
        this.g.n(-iO);
        return iO;
    }

    @Override // defpackage.qd
    public final int e(int i, ql qlVar, qs qsVar) {
        if (q() || (this.b == 0 && !q())) {
            int iN = N(i, qlVar, qsVar);
            this.K.clear();
            return iN;
        }
        int iO = O(i);
        this.o.d += iO;
        this.g.n(-iO);
        return iO;
    }

    @Override // defpackage.qd
    public final qe f() {
        return new LayoutParams();
    }

    @Override // defpackage.jve
    public final int g(View view, int i, int i2) {
        int iAF;
        int iAs;
        if (q()) {
            iAF = aC(view);
            iAs = aE(view);
        } else {
            iAF = aF(view);
            iAs = as(view);
        }
        return iAF + iAs;
    }

    @Override // defpackage.jve
    public final int getAlignContent() {
        return 5;
    }

    @Override // defpackage.jve
    public final int getAlignItems() {
        return this.i;
    }

    @Override // defpackage.jve
    public final int getFlexDirection() {
        return this.a;
    }

    @Override // defpackage.jve
    public final int getFlexItemCount() {
        return this.m.a();
    }

    @Override // defpackage.jve
    public final List getFlexLinesInternal() {
        return this.d;
    }

    @Override // defpackage.jve
    public final int getFlexWrap() {
        return this.b;
    }

    @Override // defpackage.jve
    public final int getLargestMainSize() {
        if (this.d.size() == 0) {
            return 0;
        }
        int size = this.d.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((jvf) this.d.get(i)).e);
        }
        return iMax;
    }

    @Override // defpackage.jve
    public final int getMaxLine() {
        return this.j;
    }

    @Override // defpackage.jve
    public final int getSumOfCrossSize() {
        int size = this.d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((jvf) this.d.get(i2)).g;
        }
        return i;
    }

    @Override // defpackage.qd
    public final qe h(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // defpackage.jve
    public final View i(int i) {
        View view = (View) this.K.get(i);
        return view != null ? view : this.l.p(i);
    }

    @Override // defpackage.jve
    public final View j(int i) {
        return i(i);
    }

    @Override // defpackage.jve
    public final void k(View view, int i, int i2, jvf jvfVar) {
        aM(view, h);
        if (q()) {
            int iAC = aC(view) + aE(view);
            jvfVar.e += iAC;
            jvfVar.f += iAC;
        } else {
            int iAF = aF(view) + as(view);
            jvfVar.e += iAF;
            jvfVar.f += iAF;
        }
    }

    @Override // defpackage.jve
    public final void m(List list) {
        this.d = list;
    }

    @Override // defpackage.jve
    public final void n(int i, View view) {
        this.K.put(i, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.ql r18, defpackage.qs r19) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.o(ql, qs):void");
    }

    @Override // defpackage.qd
    public final void p(qs qsVar) {
        this.p = null;
        this.q = -1;
        this.r = Integer.MIN_VALUE;
        this.N = -1;
        this.o.b();
        this.K.clear();
    }

    @Override // defpackage.jve
    public final boolean q() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public final int r() {
        View viewBD = bD(at() - 1, -1);
        if (viewBD == null) {
            return -1;
        }
        return aD(viewBD);
    }

    public final void s(int i) {
        if (this.a != i) {
            aZ();
            this.a = i;
            this.f = null;
            this.g = null;
            ab();
            be();
        }
    }

    @Override // defpackage.qd
    public final boolean t(qe qeVar) {
        return qeVar instanceof LayoutParams;
    }

    @Override // defpackage.qd
    public final void x(int i, int i2) {
        ap(i);
    }

    @Override // defpackage.qd
    public final void z(int i, int i2) {
        ap(Math.min(i, i2));
    }

    @Override // defpackage.qd
    public final void ao(RecyclerView recyclerView) {
    }

    @Override // defpackage.jve
    public final void l(jvf jvfVar) {
    }
}
