package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.ahj;
import defpackage.ajq;
import defpackage.ajr;
import defpackage.ok;
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
import defpackage.ri;
import defpackage.rj;
import defpackage.rk;
import defpackage.rm;
import defpackage.rn;
import defpackage.ro;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends qd implements qq {
    private int[] K;
    ro[] a;
    public pg b;
    pg c;
    private int i;
    private int j;
    private int k;
    private final ok l;
    private BitSet m;
    private boolean o;
    private boolean p;
    private SavedState q;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = Integer.MIN_VALUE;
    rm h = new rm();
    private int n = 2;
    private final Rect r = new Rect();
    private final rj s = new rj(this);
    private boolean J = true;
    private final Runnable L = new ri(this);

    /* compiled from: PG */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new rn();
        int a;
        int b;
        int c;
        int[] d;
        int e;
        int[] f;
        List g;
        boolean h;
        boolean i;
        boolean j;

        public SavedState() {
        }

        final void a() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        final void b() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }

        public SavedState(SavedState savedState) {
            this.c = savedState.c;
            this.a = savedState.a;
            this.b = savedState.b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            int i = parcel.readInt();
            this.c = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.e = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.g = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        qc qcVarAG = aG(context, attributeSet, i, i2);
        int i3 = qcVarAG.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        U(null);
        if (i3 != this.j) {
            this.j = i3;
            pg pgVar = this.b;
            this.b = this.c;
            this.c = pgVar;
            be();
        }
        int i4 = qcVarAG.b;
        U(null);
        if (i4 != this.i) {
            this.h.a();
            be();
            this.i = i4;
            this.m = new BitSet(i4);
            this.a = new ro[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                this.a[i5] = new ro(this, i5);
            }
            be();
        }
        I(qcVarAG.c);
        this.l = new ok();
        this.b = pg.p(this, this.j);
        this.c = pg.p(this, 1 - this.j);
    }

    private final int M(int i) {
        if (at() == 0) {
            return this.e ? 1 : -1;
        }
        return (i < c()) != this.e ? -1 : 1;
    }

    private final int N(qs qsVar) {
        if (at() == 0) {
            return 0;
        }
        return rd.a(qsVar, this.b, r(!this.J), l(!this.J), this, this.J);
    }

    private final int O(qs qsVar) {
        if (at() == 0) {
            return 0;
        }
        return rd.b(qsVar, this.b, r(!this.J), l(!this.J), this, this.J, this.e);
    }

    private final int R(qs qsVar) {
        if (at() == 0) {
            return 0;
        }
        return rd.c(qsVar, this.b, r(!this.J), l(!this.J), this, this.J);
    }

    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    private final int S(ql qlVar, ok okVar, qs qsVar) {
        ro roVar;
        ?? r4;
        int iF;
        int iB;
        int iJ;
        int iB2;
        int i;
        int i2;
        int i3;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i4 = 0;
        int i5 = 1;
        staggeredGridLayoutManager.m.set(0, staggeredGridLayoutManager.i, true);
        ok okVar2 = staggeredGridLayoutManager.l;
        int i6 = okVar2.i ? okVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : okVar.e == 1 ? okVar.g + okVar.b : okVar.f - okVar.b;
        int i7 = okVar.e;
        for (int i8 = 0; i8 < staggeredGridLayoutManager.i; i8++) {
            if (!staggeredGridLayoutManager.a[i8].a.isEmpty()) {
                staggeredGridLayoutManager.bC(staggeredGridLayoutManager.a[i8], i7, i6);
            }
        }
        int iF2 = staggeredGridLayoutManager.e ? staggeredGridLayoutManager.b.f() : staggeredGridLayoutManager.b.j();
        boolean z = false;
        while (okVar.a(qsVar) && (okVar2.i || !staggeredGridLayoutManager.m.isEmpty())) {
            View viewP = qlVar.p(okVar.c);
            okVar.c += okVar.d;
            rk rkVar = (rk) viewP.getLayoutParams();
            int iC = rkVar.c.c();
            int[] iArr = staggeredGridLayoutManager.h.a;
            int i9 = (iArr == null || iC >= iArr.length) ? -1 : iArr[iC];
            int i10 = i9 == -1 ? i5 : i4;
            if (i10 != 0) {
                boolean z2 = rkVar.b;
                if (staggeredGridLayoutManager.bD(okVar.e)) {
                    i2 = staggeredGridLayoutManager.i - 1;
                    i = -1;
                    i3 = -1;
                } else {
                    i = staggeredGridLayoutManager.i;
                    i2 = i4;
                    i3 = i5;
                }
                ro roVar2 = null;
                if (okVar.e == i5) {
                    int iJ2 = staggeredGridLayoutManager.b.j();
                    int i11 = Integer.MAX_VALUE;
                    while (i2 != i) {
                        ro roVar3 = staggeredGridLayoutManager.a[i2];
                        int iD = roVar3.d(iJ2);
                        int i12 = iD < i11 ? iD : i11;
                        if (iD < i11) {
                            roVar2 = roVar3;
                        }
                        i2 += i3;
                        i11 = i12;
                    }
                } else {
                    int iF3 = staggeredGridLayoutManager.b.f();
                    int i13 = Integer.MIN_VALUE;
                    while (i2 != i) {
                        ro roVar4 = staggeredGridLayoutManager.a[i2];
                        int iF4 = roVar4.f(iF3);
                        int i14 = iF4 > i13 ? iF4 : i13;
                        if (iF4 > i13) {
                            roVar2 = roVar4;
                        }
                        i2 += i3;
                        i13 = i14;
                    }
                }
                roVar = roVar2;
                rm rmVar = staggeredGridLayoutManager.h;
                rmVar.b(iC);
                rmVar.a[iC] = roVar.e;
            } else {
                roVar = staggeredGridLayoutManager.a[i9];
            }
            ro roVar5 = roVar;
            rkVar.a = roVar5;
            if (okVar.e == 1) {
                r4 = 0;
                super.aL(viewP, -1, false);
            } else {
                r4 = 0;
                super.aL(viewP, 0, false);
            }
            boolean z3 = rkVar.b;
            if (staggeredGridLayoutManager.j == 1) {
                staggeredGridLayoutManager.bE(viewP, au(staggeredGridLayoutManager.k, staggeredGridLayoutManager.F, r4, rkVar.width, r4), au(staggeredGridLayoutManager.I, staggeredGridLayoutManager.G, staggeredGridLayoutManager.getPaddingTop() + staggeredGridLayoutManager.getPaddingBottom(), rkVar.height, true));
            } else {
                staggeredGridLayoutManager.bE(viewP, au(staggeredGridLayoutManager.H, staggeredGridLayoutManager.F, staggeredGridLayoutManager.getPaddingLeft() + staggeredGridLayoutManager.getPaddingRight(), rkVar.width, true), au(staggeredGridLayoutManager.k, staggeredGridLayoutManager.G, 0, rkVar.height, false));
            }
            if (okVar.e == 1) {
                boolean z4 = rkVar.b;
                iB = roVar5.d(iF2);
                iF = staggeredGridLayoutManager.b.b(viewP) + iB;
                if (i10 != 0) {
                    boolean z5 = rkVar.b;
                }
            } else {
                boolean z6 = rkVar.b;
                iF = roVar5.f(iF2);
                iB = iF - staggeredGridLayoutManager.b.b(viewP);
                if (i10 != 0) {
                    boolean z7 = rkVar.b;
                }
            }
            int i15 = iF;
            boolean z8 = rkVar.b;
            if (okVar.e == 1) {
                ro roVar6 = rkVar.a;
                rk rkVar2 = (rk) viewP.getLayoutParams();
                rkVar2.a = roVar6;
                ArrayList arrayList = roVar6.a;
                arrayList.add(viewP);
                roVar6.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    roVar6.b = Integer.MIN_VALUE;
                }
                if (rkVar2.c.s() || rkVar2.c.v()) {
                    roVar6.d += roVar6.f.b.b(viewP);
                }
            } else {
                ro roVar7 = rkVar.a;
                rk rkVar3 = (rk) viewP.getLayoutParams();
                rkVar3.a = roVar7;
                ArrayList arrayList2 = roVar7.a;
                arrayList2.add(0, viewP);
                roVar7.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    roVar7.c = Integer.MIN_VALUE;
                }
                if (rkVar3.c.s() || rkVar3.c.v()) {
                    roVar7.d += roVar7.f.b.b(viewP);
                }
            }
            if (staggeredGridLayoutManager.L() && staggeredGridLayoutManager.j == 1) {
                boolean z9 = rkVar.b;
                iB2 = staggeredGridLayoutManager.c.f() - (((staggeredGridLayoutManager.i - 1) - roVar5.e) * staggeredGridLayoutManager.k);
                iJ = iB2 - staggeredGridLayoutManager.c.b(viewP);
            } else {
                boolean z10 = rkVar.b;
                iJ = staggeredGridLayoutManager.c.j() + (roVar5.e * staggeredGridLayoutManager.k);
                iB2 = staggeredGridLayoutManager.c.b(viewP) + iJ;
            }
            int i16 = iJ;
            int i17 = iB2;
            if (staggeredGridLayoutManager.j == 1) {
                staggeredGridLayoutManager.aR(viewP, i16, iB, i17, i15);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.aR(viewP, iB, i16, i15, i17);
            }
            boolean z11 = rkVar.b;
            staggeredGridLayoutManager.bC(roVar5, okVar2.e, i6);
            staggeredGridLayoutManager.am(qlVar, okVar2);
            if (okVar2.h && viewP.hasFocusable()) {
                boolean z12 = rkVar.b;
                staggeredGridLayoutManager.m.set(roVar5.e, false);
                i4 = 0;
                z = true;
                i5 = 1;
            } else {
                z = true;
                i5 = 1;
                i4 = 0;
            }
        }
        if (!z) {
            staggeredGridLayoutManager.am(qlVar, okVar2);
        }
        int iJ3 = okVar2.e == -1 ? staggeredGridLayoutManager.b.j() - staggeredGridLayoutManager.W(staggeredGridLayoutManager.b.j()) : staggeredGridLayoutManager.V(staggeredGridLayoutManager.b.f()) - staggeredGridLayoutManager.b.f();
        if (iJ3 > 0) {
            return Math.min(okVar.b, iJ3);
        }
        return 0;
    }

    private final int V(int i) {
        int iD = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iD2 = this.a[i2].d(i);
            if (iD2 > iD) {
                iD = iD2;
            }
        }
        return iD;
    }

    private final int W(int i) {
        int iF = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iF2 = this.a[i2].f(i);
            if (iF2 < iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int aa(int r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L6
            if (r6 == 0) goto L14
            r5 = r0
        L6:
            int r1 = android.view.View.MeasureSpec.getMode(r4)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L15
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L14
            r1 = r2
            goto L15
        L14:
            return r4
        L15:
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r4 = r4 - r5
            int r4 = r4 - r6
            int r4 = java.lang.Math.max(r0, r4)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.aa(int, int, int):int");
    }

    private final void ab(ql qlVar, qs qsVar, boolean z) {
        int iF;
        int i;
        int iV = V(Integer.MIN_VALUE);
        if (iV != Integer.MIN_VALUE && (iF = this.b.f() - iV) > 0) {
            int i2 = -k(-iF, qlVar, qsVar);
            if (!z || (i = iF - i2) <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void ac(ql qlVar, qs qsVar, boolean z) {
        int iJ;
        int iW = W(Integer.MAX_VALUE);
        if (iW != Integer.MAX_VALUE && (iJ = iW - this.b.j()) > 0) {
            int iK = iJ - k(iJ, qlVar, qsVar);
            if (!z || iK <= 0) {
                return;
            }
            this.b.n(-iK);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ag(int r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.e
            if (r0 == 0) goto L9
            int r0 = r10.i()
            goto Ld
        L9:
            int r0 = r10.c()
        Ld:
            r1 = 8
            if (r13 != r1) goto L1a
            if (r11 >= r12) goto L16
            int r2 = r12 + 1
            goto L1c
        L16:
            int r2 = r11 + 1
            r3 = r12
            goto L1d
        L1a:
            int r2 = r11 + r12
        L1c:
            r3 = r11
        L1d:
            rm r4 = r10.h
            int[] r5 = r4.a
            r6 = 1
            if (r5 != 0) goto L26
            goto L93
        L26:
            int r5 = r5.length
            if (r3 >= r5) goto L93
            java.util.List r5 = r4.b
            r7 = -1
            if (r5 != 0) goto L30
        L2e:
            r5 = r7
            goto L7a
        L30:
            int r5 = r5.size()
            int r5 = r5 + r7
        L35:
            if (r5 < 0) goto L47
            java.util.List r8 = r4.b
            java.lang.Object r8 = r8.get(r5)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r8 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r8
            int r9 = r8.a
            if (r9 != r3) goto L44
            goto L48
        L44:
            int r5 = r5 + (-1)
            goto L35
        L47:
            r8 = 0
        L48:
            if (r8 == 0) goto L4f
            java.util.List r5 = r4.b
            r5.remove(r8)
        L4f:
            java.util.List r5 = r4.b
            int r5 = r5.size()
            r8 = 0
        L56:
            if (r8 >= r5) goto L68
            java.util.List r9 = r4.b
            java.lang.Object r9 = r9.get(r8)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r9 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r9
            int r9 = r9.a
            if (r9 < r3) goto L65
            goto L69
        L65:
            int r8 = r8 + 1
            goto L56
        L68:
            r8 = r7
        L69:
            if (r8 == r7) goto L2e
            java.util.List r5 = r4.b
            java.lang.Object r5 = r5.get(r8)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r5
            java.util.List r9 = r4.b
            r9.remove(r8)
            int r5 = r5.a
        L7a:
            if (r5 != r7) goto L86
            int[] r5 = r4.a
            int r8 = r5.length
            java.util.Arrays.fill(r5, r3, r8, r7)
            int[] r4 = r4.a
            int r4 = r4.length
            goto L93
        L86:
            int r5 = r5 + r6
            int[] r8 = r4.a
            int r8 = r8.length
            int r5 = java.lang.Math.min(r5, r8)
            int[] r4 = r4.a
            java.util.Arrays.fill(r4, r3, r5, r7)
        L93:
            if (r13 == r6) goto Lac
            r4 = 2
            if (r13 == r4) goto La6
            if (r13 == r1) goto L9b
            goto Lb1
        L9b:
            rm r13 = r10.h
            r13.d(r11, r6)
            rm r11 = r10.h
            r11.c(r12, r6)
            goto Lb1
        La6:
            rm r13 = r10.h
            r13.d(r11, r12)
            goto Lb1
        Lac:
            rm r13 = r10.h
            r13.c(r11, r12)
        Lb1:
            if (r2 > r0) goto Lb4
            goto Lc6
        Lb4:
            boolean r11 = r10.e
            if (r11 == 0) goto Lbd
            int r11 = r10.c()
            goto Lc1
        Lbd:
            int r11 = r10.i()
        Lc1:
            if (r3 > r11) goto Lc6
            r10.be()
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ag(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ai(defpackage.ql r12, defpackage.qs r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ai(ql, qs, boolean):void");
    }

    private final void am(ql qlVar, ok okVar) {
        if (!okVar.a || okVar.i) {
            return;
        }
        if (okVar.b == 0) {
            if (okVar.e == -1) {
                an(qlVar, okVar.g);
                return;
            } else {
                ap(qlVar, okVar.f);
                return;
            }
        }
        int i = 1;
        if (okVar.e == -1) {
            int i2 = okVar.f;
            int iF = this.a[0].f(i2);
            while (i < this.i) {
                int iF2 = this.a[i].f(i2);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i++;
            }
            int i3 = i2 - iF;
            an(qlVar, i3 < 0 ? okVar.g : okVar.g - Math.min(i3, okVar.b));
            return;
        }
        int i4 = okVar.g;
        int iD = this.a[0].d(i4);
        while (i < this.i) {
            int iD2 = this.a[i].d(i4);
            if (iD2 < iD) {
                iD = iD2;
            }
            i++;
        }
        int i5 = iD - okVar.g;
        ap(qlVar, i5 < 0 ? okVar.f : Math.min(i5, okVar.b) + okVar.f);
    }

    private final void an(ql qlVar, int i) {
        int iAt = at();
        while (true) {
            iAt--;
            if (iAt < 0) {
                return;
            }
            View viewAI = aI(iAt);
            if (this.b.d(viewAI) < i || this.b.m(viewAI) < i) {
                return;
            }
            rk rkVar = (rk) viewAI.getLayoutParams();
            boolean z = rkVar.b;
            if (rkVar.a.a.size() == 1) {
                return;
            }
            ro roVar = rkVar.a;
            ArrayList arrayList = roVar.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            rk rkVar2 = (rk) view.getLayoutParams();
            rkVar2.a = null;
            if (rkVar2.c.s() || rkVar2.c.v()) {
                roVar.d -= roVar.f.b.b(view);
            }
            if (size == 1) {
                roVar.b = Integer.MIN_VALUE;
            }
            roVar.c = Integer.MIN_VALUE;
            this.t.j(viewAI);
            qlVar.j(viewAI);
        }
    }

    private final void ap(ql qlVar, int i) {
        while (at() > 0) {
            View viewAI = aI(0);
            if (this.b.a(viewAI) > i || this.b.l(viewAI) > i) {
                return;
            }
            rk rkVar = (rk) viewAI.getLayoutParams();
            boolean z = rkVar.b;
            if (rkVar.a.a.size() == 1) {
                return;
            }
            ro roVar = rkVar.a;
            ArrayList arrayList = roVar.a;
            View view = (View) arrayList.remove(0);
            rk rkVar2 = (rk) view.getLayoutParams();
            rkVar2.a = null;
            if (arrayList.size() == 0) {
                roVar.c = Integer.MIN_VALUE;
            }
            if (rkVar2.c.s() || rkVar2.c.v()) {
                roVar.d -= roVar.f.b.b(view);
            }
            roVar.b = Integer.MIN_VALUE;
            this.t.j(viewAI);
            qlVar.j(viewAI);
        }
    }

    private final void bA(int i) {
        ok okVar = this.l;
        okVar.e = i;
        okVar.d = this.e != (i == -1) ? -1 : 1;
    }

    private final void bB(int i, qs qsVar) {
        int iK;
        int iK2;
        int i2;
        ok okVar = this.l;
        boolean z = false;
        okVar.b = 0;
        okVar.c = i;
        if (!bn() || (i2 = qsVar.a) == -1) {
            iK = 0;
            iK2 = 0;
        } else {
            if (this.e == (i2 < i)) {
                iK = this.b.k();
                iK2 = 0;
            } else {
                iK2 = this.b.k();
                iK = 0;
            }
        }
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || !recyclerView.j) {
            okVar.g = this.b.e() + iK;
            okVar.f = -iK2;
        } else {
            okVar.f = this.b.j() - iK2;
            okVar.g = this.b.f() + iK;
        }
        okVar.h = false;
        okVar.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        okVar.i = z;
    }

    private final void bC(ro roVar, int i, int i2) {
        int i3 = roVar.d;
        if (i == -1) {
            if (roVar.e() + i3 <= i2) {
                this.m.set(roVar.e, false);
            }
        } else if (roVar.c() - i3 >= i2) {
            this.m.set(roVar.e, false);
        }
    }

    private final boolean bD(int i) {
        int i2 = this.j;
        boolean z = i == -1;
        if (i2 == 0) {
            return z != this.e;
        }
        return (z == this.e) == L();
    }

    private final void bE(View view, int i, int i2) {
        Rect rect = this.r;
        aM(view, rect);
        rk rkVar = (rk) view.getLayoutParams();
        int iAa = aa(i, rkVar.leftMargin + rect.left, rkVar.rightMargin + rect.right);
        int iAa2 = aa(i2, rkVar.topMargin + rect.top, rkVar.bottomMargin + rect.bottom);
        if (bs(view, iAa, iAa2, rkVar)) {
            view.measure(iAa, iAa2);
        }
    }

    private final void bz() {
        this.e = (this.j == 1 || !L()) ? this.d : !this.d;
    }

    @Override // defpackage.qd
    public final void A(int i, int i2) {
        ag(i, i2, 2);
    }

    @Override // defpackage.qd
    public final void B(int i, int i2) {
        ag(i, i2, 4);
    }

    @Override // defpackage.qd
    public final int C(qs qsVar) {
        return N(qsVar);
    }

    @Override // defpackage.qd
    public final int D(qs qsVar) {
        return O(qsVar);
    }

    @Override // defpackage.qd
    public final int E(qs qsVar) {
        return R(qsVar);
    }

    @Override // defpackage.qd
    public final int F(qs qsVar) {
        return N(qsVar);
    }

    @Override // defpackage.qd
    public final int G(qs qsVar) {
        return O(qsVar);
    }

    @Override // defpackage.qd
    public final int H(qs qsVar) {
        return R(qsVar);
    }

    public final void I(boolean z) {
        U(null);
        SavedState savedState = this.q;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.d = z;
        be();
    }

    final void J(int i) {
        this.k = i / this.i;
        View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    public final boolean K() {
        int iC;
        if (at() == 0 || this.n == 0 || !this.z) {
            return false;
        }
        if (this.e) {
            iC = i();
            c();
        } else {
            iC = c();
            i();
        }
        if (iC != 0 || s() == null) {
            return false;
        }
        this.h.a();
        this.y = true;
        be();
        return true;
    }

    final boolean L() {
        return this.u.getLayoutDirection() == 1;
    }

    @Override // defpackage.qq
    public final PointF P(int i) {
        int iM = M(i);
        PointF pointF = new PointF();
        if (iM == 0) {
            return null;
        }
        float f = iM;
        if (this.j == 0) {
            pointF.x = f;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = f;
        return pointF;
    }

    @Override // defpackage.qd
    public final Parcelable Q() {
        int iF;
        int iJ;
        int[] iArr;
        SavedState savedState = this.q;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.h = this.d;
        savedState2.i = this.o;
        savedState2.j = this.p;
        rm rmVar = this.h;
        if (rmVar == null || (iArr = rmVar.a) == null) {
            savedState2.e = 0;
        } else {
            savedState2.f = iArr;
            savedState2.e = savedState2.f.length;
            savedState2.g = rmVar.b;
        }
        if (at() <= 0) {
            savedState2.a = -1;
            savedState2.b = -1;
            savedState2.c = 0;
            return savedState2;
        }
        savedState2.a = this.o ? i() : c();
        View viewL = this.e ? l(true) : r(true);
        savedState2.b = viewL != null ? aD(viewL) : -1;
        int i = this.i;
        savedState2.c = i;
        savedState2.d = new int[i];
        for (int i2 = 0; i2 < this.i; i2++) {
            if (this.o) {
                iF = this.a[i2].d(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.f();
                    iF -= iJ;
                }
            } else {
                iF = this.a[i2].f(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.j();
                    iF -= iJ;
                }
            }
            savedState2.d[i2] = iF;
        }
        return savedState2;
    }

    @Override // defpackage.qd
    public final void U(String str) {
        if (this.q == null) {
            super.U(str);
        }
    }

    @Override // defpackage.qd
    public final void X(AccessibilityEvent accessibilityEvent) {
        super.X(accessibilityEvent);
        if (at() > 0) {
            View viewR = r(false);
            View viewL = l(false);
            if (viewR == null || viewL == null) {
                return;
            }
            int iAD = aD(viewR);
            int iAD2 = aD(viewL);
            if (iAD < iAD2) {
                accessibilityEvent.setFromIndex(iAD);
                accessibilityEvent.setToIndex(iAD2);
            } else {
                accessibilityEvent.setFromIndex(iAD2);
                accessibilityEvent.setToIndex(iAD);
            }
        }
    }

    @Override // defpackage.qd
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.q = savedState;
            if (this.f != -1) {
                savedState.a();
                this.q.b();
            }
            be();
        }
    }

    @Override // defpackage.qd
    public final void Z(int i) {
        SavedState savedState = this.q;
        if (savedState != null && savedState.a != i) {
            savedState.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        be();
    }

    @Override // defpackage.qd
    public final void aS(int i) {
        super.aS(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.qd
    public final void aT(int i) {
        super.aT(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.qd
    public final void aU(pq pqVar, pq pqVar2) {
        this.h.a();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    @Override // defpackage.qd
    public final void aY(int i) {
        if (i == 0) {
            K();
        }
    }

    @Override // defpackage.qd
    public final boolean ad() {
        return this.j == 0;
    }

    @Override // defpackage.qd
    public final boolean ae() {
        return this.j == 1;
    }

    @Override // defpackage.qd
    public final boolean af() {
        return this.n != 0;
    }

    @Override // defpackage.qd
    public final boolean ah() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ak(int r5, int r6, defpackage.qs r7, defpackage.oe r8) {
        /*
            r4 = this;
            r0 = 1
            int r1 = r4.j
            if (r0 != r1) goto L6
            r5 = r6
        L6:
            int r6 = r4.at()
            if (r6 == 0) goto L76
            if (r5 != 0) goto Lf
            goto L76
        Lf:
            r4.w(r5, r7)
            int[] r5 = r4.K
            r6 = 0
            if (r5 == 0) goto L1c
            int r0 = r4.i
            int r5 = r5.length
            if (r5 >= r0) goto L22
        L1c:
            int r5 = r4.i
            int[] r5 = new int[r5]
            r4.K = r5
        L22:
            r5 = r6
            r0 = r5
        L24:
            int r1 = r4.i
            if (r5 >= r1) goto L54
            ok r1 = r4.l
            int r2 = r1.d
            r3 = -1
            if (r2 != r3) goto L3b
            int r1 = r1.f
            ro[] r2 = r4.a
            r2 = r2[r5]
            int r2 = r2.f(r1)
            int r1 = r1 - r2
            goto L49
        L3b:
            ro[] r2 = r4.a
            r2 = r2[r5]
            int r3 = r1.g
            int r2 = r2.d(r3)
            int r1 = r1.g
            int r1 = r2 - r1
        L49:
            if (r1 < 0) goto L51
            int[] r2 = r4.K
            r2[r0] = r1
            int r0 = r0 + 1
        L51:
            int r5 = r5 + 1
            goto L24
        L54:
            int[] r5 = r4.K
            java.util.Arrays.sort(r5, r6, r0)
        L59:
            if (r6 >= r0) goto L76
            ok r5 = r4.l
            boolean r1 = r5.a(r7)
            if (r1 == 0) goto L76
            int r1 = r5.c
            int[] r2 = r4.K
            r2 = r2[r6]
            r8.a(r1, r2)
            int r1 = r5.c
            int r2 = r5.d
            int r1 = r1 + r2
            r5.c = r1
            int r6 = r6 + 1
            goto L59
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ak(int, int, qs, oe):void");
    }

    @Override // defpackage.qd
    public final void ao(RecyclerView recyclerView) {
        bw(this.L);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.qd
    public final void aq(RecyclerView recyclerView, int i) {
        or orVar = new or(recyclerView.getContext());
        orVar.g = i;
        bk(orVar);
    }

    final int c() {
        if (at() == 0) {
            return 0;
        }
        return aD(aI(0));
    }

    @Override // defpackage.qd
    public final int d(int i, ql qlVar, qs qsVar) {
        return k(i, qlVar, qsVar);
    }

    @Override // defpackage.qd
    public final int e(int i, ql qlVar, qs qsVar) {
        return k(i, qlVar, qsVar);
    }

    @Override // defpackage.qd
    public final int eF(ql qlVar, qs qsVar) {
        if (this.j == 1) {
            return Math.min(this.i, qsVar.a());
        }
        return -1;
    }

    @Override // defpackage.qd
    public final int eG(ql qlVar, qs qsVar) {
        if (this.j == 0) {
            return Math.min(this.i, qsVar.a());
        }
        return -1;
    }

    @Override // defpackage.qd
    public final qe eH(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new rk((ViewGroup.MarginLayoutParams) layoutParams) : new rk(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View eI(android.view.View r9, int r10, defpackage.ql r11, defpackage.qs r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.eI(android.view.View, int, ql, qs):android.view.View");
    }

    @Override // defpackage.qd
    public final void eJ(ql qlVar, qs qsVar, ajr ajrVar) {
        super.eJ(qlVar, qsVar, ajrVar);
        ajrVar.a.setClassName("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.qd
    public final void eK(ql qlVar, qs qsVar, View view, ajr ajrVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof rk)) {
            super.aW(view, ajrVar);
            return;
        }
        rk rkVar = (rk) layoutParams;
        if (this.j == 0) {
            int iA = rkVar.a();
            boolean z = rkVar.b;
            ajrVar.e(ajq.b(iA, 1, -1, -1, false));
        } else {
            int iA2 = rkVar.a();
            boolean z2 = rkVar.b;
            ajrVar.e(ajq.b(-1, -1, iA2, 1, false));
        }
    }

    @Override // defpackage.qd
    public final void eL(Rect rect, int i, int i2) {
        int iAr;
        int iAr2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j == 1) {
            int iHeight = rect.height() + paddingTop;
            RecyclerView recyclerView = this.u;
            int[] iArr = ahj.a;
            iAr2 = ar(i2, iHeight, recyclerView.getMinimumHeight());
            iAr = ar(i, (this.k * this.i) + paddingLeft, this.u.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingLeft;
            RecyclerView recyclerView2 = this.u;
            int[] iArr2 = ahj.a;
            iAr = ar(i, iWidth, recyclerView2.getMinimumWidth());
            iAr2 = ar(i2, (this.k * this.i) + paddingTop, this.u.getMinimumHeight());
        }
        this.u.setMeasuredDimension(iAr, iAr2);
    }

    @Override // defpackage.qd
    public final qe f() {
        return this.j == 0 ? new rk(-2, -1) : new rk(-1, -2);
    }

    @Override // defpackage.qd
    public final qe h(Context context, AttributeSet attributeSet) {
        return new rk(context, attributeSet);
    }

    final int i() {
        int iAt = at();
        if (iAt == 0) {
            return 0;
        }
        return aD(aI(iAt - 1));
    }

    final int k(int i, ql qlVar, qs qsVar) {
        if (at() == 0 || i == 0) {
            return 0;
        }
        w(i, qsVar);
        ok okVar = this.l;
        int iS = S(qlVar, okVar, qsVar);
        if (okVar.b >= iS) {
            i = i < 0 ? -iS : iS;
        }
        this.b.n(-i);
        this.o = this.e;
        okVar.b = 0;
        am(qlVar, okVar);
        return i;
    }

    final View l(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        View view = null;
        for (int iAt = at() - 1; iAt >= 0; iAt--) {
            View viewAI = aI(iAt);
            int iD = this.b.d(viewAI);
            int iA = this.b.a(viewAI);
            if (iA > iJ && iD < iF) {
                if (iA <= iF || !z) {
                    return viewAI;
                }
                if (view == null) {
                    view = viewAI;
                }
            }
        }
        return view;
    }

    @Override // defpackage.qd
    public final void o(ql qlVar, qs qsVar) {
        ai(qlVar, qsVar, true);
    }

    @Override // defpackage.qd
    public final void p(qs qsVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.s.a();
    }

    final View r(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        int iAt = at();
        View view = null;
        for (int i = 0; i < iAt; i++) {
            View viewAI = aI(i);
            int iD = this.b.d(viewAI);
            if (this.b.a(viewAI) > iJ && iD < iF) {
                if (iD >= iJ || !z) {
                    return viewAI;
                }
                if (view == null) {
                    view = viewAI;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.view.View s() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.s():android.view.View");
    }

    @Override // defpackage.qd
    public final boolean t(qe qeVar) {
        return qeVar instanceof rk;
    }

    @Override // defpackage.qd
    public final boolean v() {
        return this.q == null;
    }

    final void w(int i, qs qsVar) {
        int iC;
        int i2;
        if (i > 0) {
            iC = i();
            i2 = 1;
        } else {
            iC = c();
            i2 = -1;
        }
        ok okVar = this.l;
        okVar.a = true;
        bB(iC, qsVar);
        bA(i2);
        okVar.c = iC + okVar.d;
        okVar.b = Math.abs(i);
    }

    @Override // defpackage.qd
    public final void x(int i, int i2) {
        ag(i, i2, 1);
    }

    @Override // defpackage.qd
    public final void y() {
        this.h.a();
        be();
    }

    @Override // defpackage.qd
    public final void z(int i, int i2) {
        ag(i, i2, 8);
    }
}
