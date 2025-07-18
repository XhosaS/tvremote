package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jvi {
    public final jve a;
    public int[] b;
    public long[] c;
    private boolean[] d;
    private long[] e;

    public jvi(jve jveVar) {
        this.a = jveVar;
    }

    private final void A(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iG = (i - flexItem.g()) - flexItem.h();
        jve jveVar = this.a;
        int iMin = Math.min(Math.max(iG - jveVar.c(view), flexItem.m()), flexItem.k());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        C(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        jveVar.n(i2, view);
    }

    private final void B(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int i3 = (i - flexItem.i()) - flexItem.f();
        jve jveVar = this.a;
        int iMin = Math.min(Math.max(i3 - jveVar.c(view), flexItem.l()), flexItem.j());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        C(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        jveVar.n(i2, view);
    }

    private final void C(int i, int i2, int i3, View view) {
        long[] jArr = this.c;
        if (jArr != null) {
            jArr[i] = a(i2, i3);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = a(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private final boolean D(int i, int i2, jvf jvfVar) {
        return i == i2 + (-1) && jvfVar.h - jvfVar.i != 0;
    }

    private final int n(int i, FlexItem flexItem, int i2) {
        jve jveVar = this.a;
        int iA = jveVar.a(i, jveVar.getPaddingTop() + jveVar.getPaddingBottom() + flexItem.i() + flexItem.f() + i2, flexItem.e());
        int size = View.MeasureSpec.getSize(iA);
        return size > flexItem.j() ? View.MeasureSpec.makeMeasureSpec(flexItem.j(), View.MeasureSpec.getMode(iA)) : size < flexItem.l() ? View.MeasureSpec.makeMeasureSpec(flexItem.l(), View.MeasureSpec.getMode(iA)) : iA;
    }

    private final int o(int i, FlexItem flexItem, int i2) {
        jve jveVar = this.a;
        int iB = jveVar.b(i, jveVar.getPaddingLeft() + jveVar.getPaddingRight() + flexItem.g() + flexItem.h() + i2, flexItem.o());
        int size = View.MeasureSpec.getSize(iB);
        return size > flexItem.k() ? View.MeasureSpec.makeMeasureSpec(flexItem.k(), View.MeasureSpec.getMode(iB)) : size < flexItem.m() ? View.MeasureSpec.makeMeasureSpec(flexItem.m(), View.MeasureSpec.getMode(iB)) : iB;
    }

    private final int p(FlexItem flexItem, boolean z) {
        return z ? flexItem.f() : flexItem.h();
    }

    private final int q(FlexItem flexItem, boolean z) {
        return z ? flexItem.h() : flexItem.f();
    }

    private final int r(FlexItem flexItem, boolean z) {
        return z ? flexItem.i() : flexItem.g();
    }

    private final int s(FlexItem flexItem, boolean z) {
        return z ? flexItem.g() : flexItem.i();
    }

    private final int t(FlexItem flexItem, boolean z) {
        return z ? flexItem.e() : flexItem.o();
    }

    private final int u(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private final List v(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        jvf jvfVar = new jvf();
        jvfVar.g = (i - i2) / 2;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            if (i3 == 0) {
                arrayList.add(jvfVar);
                i3 = 0;
            }
            arrayList.add((jvf) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(jvfVar);
            }
            i3++;
        }
        return arrayList;
    }

    private final void w(List list, jvf jvfVar, int i, int i2) {
        jvfVar.m = i2;
        this.a.l(jvfVar);
        jvfVar.p = i;
        list.add(jvfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void x(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.m()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.m()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.k()
            if (r1 <= r3) goto L26
            int r1 = r0.k()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.l()
            if (r2 >= r5) goto L32
            int r2 = r0.l()
            goto L3e
        L32:
            int r5 = r0.j()
            if (r2 <= r5) goto L3d
            int r2 = r0.j()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.C(r8, r1, r0, r7)
            jve r0 = r6.a
            r0.n(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvi.x(android.view.View, int):void");
    }

    private final void y(int i, int i2, jvf jvfVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        int i6;
        float f2;
        int iMax;
        double d;
        boolean z2;
        boolean z3;
        int iJ;
        int i7;
        double d2;
        float f3 = jvfVar.j;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 < (i5 = jvfVar.e)) {
            return;
        }
        float f5 = (i3 - i5) / f3;
        jvfVar.e = i4 + jvfVar.f;
        int i8 = 0;
        if (!z) {
            jvfVar.g = Integer.MIN_VALUE;
        }
        boolean z4 = false;
        int i9 = 0;
        float f6 = 0.0f;
        while (i8 < jvfVar.h) {
            int i10 = jvfVar.o + i8;
            jve jveVar = this.a;
            View viewJ = jveVar.j(i10);
            if (viewJ == null || viewJ.getVisibility() == 8) {
                f = f4;
                i6 = i5;
                f2 = f5;
                z4 = z4;
            } else {
                FlexItem flexItem = (FlexItem) viewJ.getLayoutParams();
                int flexDirection = jveVar.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    f2 = f5;
                    boolean z5 = z4;
                    int measuredWidth = viewJ.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i10];
                    }
                    int measuredHeight = viewJ.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        long j = jArr2[i10];
                        i6 = i5;
                        measuredHeight = (int) (j >> 32);
                    } else {
                        i6 = i5;
                    }
                    if (!this.d[i10] && flexItem.b() > f) {
                        float fB = measuredWidth + (f2 * flexItem.b());
                        if (i8 == jvfVar.h - 1) {
                            fB += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fB);
                        if (iRound > flexItem.k()) {
                            iRound = flexItem.k();
                            this.d[i10] = true;
                            jvfVar.j -= flexItem.b();
                            z2 = true;
                        } else {
                            f6 += fB - iRound;
                            double d3 = f6;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d = d3 + 1.0d;
                                }
                                z2 = z5;
                            }
                            f6 = (float) d;
                            z2 = z5;
                        }
                        int iN = n(i2, flexItem, jvfVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewJ.measure(iMakeMeasureSpec, iN);
                        int measuredWidth2 = viewJ.getMeasuredWidth();
                        int measuredHeight2 = viewJ.getMeasuredHeight();
                        C(i10, iMakeMeasureSpec, iN, viewJ);
                        jveVar.n(i10, viewJ);
                        z5 = z2;
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, measuredHeight + flexItem.i() + flexItem.f() + jveVar.c(viewJ));
                    jvfVar.e += measuredWidth + flexItem.g() + flexItem.h();
                    iMax = iMax2;
                    z4 = z5;
                } else {
                    int measuredHeight3 = viewJ.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        long j2 = jArr3[i10];
                        f2 = f5;
                        z3 = z4;
                        measuredHeight3 = (int) (j2 >> 32);
                    } else {
                        f2 = f5;
                        z3 = z4;
                    }
                    int measuredWidth3 = viewJ.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i10];
                    }
                    if (!this.d[i10] && flexItem.b() > f) {
                        float fB2 = measuredHeight3 + (flexItem.b() * f2);
                        if (i8 == jvfVar.h - 1) {
                            fB2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fB2);
                        if (iRound2 > flexItem.j()) {
                            iJ = flexItem.j();
                            this.d[i10] = true;
                            jvfVar.j -= flexItem.b();
                            z3 = true;
                        } else {
                            f6 += fB2 - iRound2;
                            double d4 = f6;
                            if (d4 > 1.0d) {
                                i7 = iRound2 + 1;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                i7 = iRound2 - 1;
                                d2 = d4 + 1.0d;
                            } else {
                                iJ = iRound2;
                            }
                            iJ = i7;
                            f6 = (float) d2;
                        }
                        int iO = o(i, flexItem, jvfVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iJ, 1073741824);
                        viewJ.measure(iO, iMakeMeasureSpec2);
                        int measuredWidth4 = viewJ.getMeasuredWidth();
                        int measuredHeight4 = viewJ.getMeasuredHeight();
                        C(i10, iO, iMakeMeasureSpec2, viewJ);
                        jveVar.n(i10, viewJ);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    z4 = z3;
                    iMax = Math.max(i9, measuredWidth3 + flexItem.g() + flexItem.h() + jveVar.c(viewJ));
                    jvfVar.e += measuredHeight3 + flexItem.i() + flexItem.f();
                    i6 = i5;
                }
                jvfVar.g = Math.max(jvfVar.g, iMax);
                i9 = iMax;
            }
            i8++;
            f5 = f2;
            i5 = i6;
            f4 = f;
        }
        int i11 = i5;
        if (!z4 || i11 == jvfVar.e) {
            return;
        }
        y(i, i2, jvfVar, i3, i4, true);
    }

    private final void z(int i, int i2, jvf jvfVar, int i3, int i4, boolean z) {
        float f;
        int iMax;
        int i5 = jvfVar.e;
        float f2 = jvfVar.k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 > i5) {
            return;
        }
        float f4 = (i5 - i3) / f2;
        jvfVar.e = i4 + jvfVar.f;
        int i6 = 0;
        if (!z) {
            jvfVar.g = Integer.MIN_VALUE;
        }
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < jvfVar.h) {
            int i8 = jvfVar.o + i6;
            jve jveVar = this.a;
            View viewJ = jveVar.j(i8);
            if (viewJ == null || viewJ.getVisibility() == 8) {
                f = f3;
            } else {
                FlexItem flexItem = (FlexItem) viewJ.getLayoutParams();
                int flexDirection = jveVar.getFlexDirection();
                f = f3;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = viewJ.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewJ.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (!this.d[i8] && flexItem.c() > f) {
                        float fC = measuredWidth - (flexItem.c() * f4);
                        if (i6 == jvfVar.h - 1) {
                            fC += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fC);
                        if (iRound < flexItem.m()) {
                            iRound = flexItem.m();
                            this.d[i8] = true;
                            jvfVar.k -= flexItem.c();
                            z2 = true;
                        } else {
                            f5 += fC - iRound;
                            double d = f5;
                            if (d > 1.0d) {
                                iRound++;
                                f5 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f5 += 1.0f;
                            }
                        }
                        int iN = n(i2, flexItem, jvfVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewJ.measure(iMakeMeasureSpec, iN);
                        int measuredWidth2 = viewJ.getMeasuredWidth();
                        int measuredHeight2 = viewJ.getMeasuredHeight();
                        C(i8, iMakeMeasureSpec, iN, viewJ);
                        jveVar.n(i8, viewJ);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + flexItem.i() + flexItem.f() + jveVar.c(viewJ));
                    jvfVar.e += measuredWidth + flexItem.g() + flexItem.h();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewJ.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewJ.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (!this.d[i8] && flexItem.c() > f) {
                        float fC2 = measuredHeight3 - (flexItem.c() * f4);
                        if (i6 == jvfVar.h - 1) {
                            fC2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fC2);
                        if (iRound2 < flexItem.l()) {
                            iRound2 = flexItem.l();
                            this.d[i8] = true;
                            jvfVar.k -= flexItem.c();
                            z2 = true;
                        } else {
                            f5 += fC2 - iRound2;
                            double d2 = f5;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f5 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f5 += 1.0f;
                            }
                        }
                        int iO = o(i, flexItem, jvfVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewJ.measure(iO, iMakeMeasureSpec2);
                        measuredWidth3 = viewJ.getMeasuredWidth();
                        int measuredHeight4 = viewJ.getMeasuredHeight();
                        C(i8, iO, iMakeMeasureSpec2, viewJ);
                        jveVar.n(i8, viewJ);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + flexItem.g() + flexItem.h() + jveVar.c(viewJ));
                    jvfVar.e += measuredHeight3 + flexItem.i() + flexItem.f();
                }
                jvfVar.g = Math.max(jvfVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
        }
        if (!z2 || i5 == jvfVar.e) {
            return;
        }
        z(i, i2, jvfVar, i3, i4, true);
    }

    final long a(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    public final List b(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.a.i(i2).getLayoutParams();
            jvh jvhVar = new jvh();
            jvhVar.b = flexItem.n();
            jvhVar.a = i2;
            arrayList.add(jvhVar);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0372 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.jvg r31, int r32, int r33, int r34, int r35, int r36, java.util.List r37) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvi.c(jvg, int, int, int, int, int, java.util.List):void");
    }

    public final void d(List list, int i) {
        int i2 = this.b[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.b;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.c;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public final void e(int i, int i2, int i3) {
        int mode;
        int size;
        float f;
        int iRound;
        jve jveVar = this.a;
        int flexDirection = jveVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(a.b(flexDirection, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<jvf> flexLinesInternal = jveVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = jveVar.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((jvf) flexLinesInternal.get(0)).g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = jveVar.getAlignContent();
                if (alignContent == 1) {
                    jvf jvfVar = new jvf();
                    jvfVar.g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, jvfVar);
                    return;
                }
                if (alignContent == 2) {
                    jveVar.m(v(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                float f2 = -1.0f;
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    int size2 = flexLinesInternal.size() - 1;
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size3) {
                        arrayList.add((jvf) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            jvf jvfVar2 = new jvf();
                            f = f2;
                            float f4 = (size - sumOfCrossSize) / size2;
                            if (i4 == flexLinesInternal.size() - 2) {
                                int iRound2 = Math.round(f3 + f4);
                                jvfVar2.g = iRound2;
                                iRound = iRound2;
                                f3 = 0.0f;
                            } else {
                                iRound = Math.round(f4);
                                jvfVar2.g = iRound;
                            }
                            f3 += f4 - iRound;
                            if (f3 > 1.0f) {
                                jvfVar2.g = iRound + 1;
                                f3 += f;
                            } else if (f3 < f) {
                                jvfVar2.g = iRound - 1;
                                f3 += 1.0f;
                            }
                            arrayList.add(jvfVar2);
                        } else {
                            f = f2;
                        }
                        i4++;
                        f2 = f;
                    }
                    jveVar.m(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        jveVar.m(v(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size4 = flexLinesInternal.size();
                    int i5 = (size - sumOfCrossSize) / (size4 + size4);
                    ArrayList arrayList2 = new ArrayList();
                    jvf jvfVar3 = new jvf();
                    jvfVar3.g = i5;
                    for (jvf jvfVar4 : flexLinesInternal) {
                        arrayList2.add(jvfVar3);
                        arrayList2.add(jvfVar4);
                        arrayList2.add(jvfVar3);
                    }
                    jveVar.m(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f5 = 0.0f;
                    while (i4 < size6) {
                        jvf jvfVar5 = (jvf) flexLinesInternal.get(i4);
                        float f6 = jvfVar5.g + ((size - sumOfCrossSize) / size5);
                        if (i4 == flexLinesInternal.size() - 1) {
                            f6 += f5;
                            f5 = 0.0f;
                        }
                        int iRound3 = Math.round(f6);
                        f5 += f6 - iRound3;
                        if (f5 > 1.0f) {
                            iRound3++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound3--;
                            f5 += 1.0f;
                        }
                        jvfVar5.g = iRound3;
                        i4++;
                    }
                }
            }
        }
    }

    public final void f(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        int i5;
        jve jveVar = this.a;
        int flexItemCount = jveVar.getFlexItemCount();
        boolean[] zArr = this.d;
        if (zArr == null) {
            this.d = new boolean[Math.max(flexItemCount, 10)];
        } else {
            int length = zArr.length;
            if (length < flexItemCount) {
                this.d = new boolean[Math.max(length + length, flexItemCount)];
            } else {
                Arrays.fill(zArr, false);
            }
        }
        if (i3 >= jveVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = jveVar.getFlexDirection();
        int flexDirection2 = jveVar.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = jveVar.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = jveVar.getPaddingLeft();
            paddingRight = jveVar.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(a.b(flexDirection, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = jveVar.getLargestMainSize();
            }
            paddingLeft = jveVar.getPaddingTop();
            paddingRight = jveVar.getPaddingBottom();
        }
        int i6 = paddingLeft + paddingRight;
        int i7 = size;
        int[] iArr = this.b;
        int i8 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = jveVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            jvf jvfVar = (jvf) flexLinesInternal.get(i8);
            if (jvfVar.e < i7) {
                i4 = i;
                i5 = i2;
                y(i4, i5, jvfVar, i7, i6, false);
            } else {
                i4 = i;
                i5 = i2;
                z(i4, i5, jvfVar, i7, i6, false);
            }
            i8++;
            i = i4;
            i2 = i5;
        }
    }

    public final void g(int i) {
        int[] iArr = this.b;
        if (iArr == null) {
            this.b = new int[Math.max(i, 10)];
            return;
        }
        int length = iArr.length;
        if (length < i) {
            this.b = Arrays.copyOf(this.b, Math.max(length + length, i));
        }
    }

    public final void h(int i) {
        long[] jArr = this.c;
        if (jArr == null) {
            this.c = new long[Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        if (length < i) {
            this.c = Arrays.copyOf(this.c, Math.max(length + length, i));
        }
    }

    public final void i(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        if (length < i) {
            this.e = Arrays.copyOf(this.e, Math.max(length + length, i));
        }
    }

    public final void j(View view, jvf jvfVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        jve jveVar = this.a;
        int alignItems = jveVar.getAlignItems();
        if (flexItem.d() != -1) {
            alignItems = flexItem.d();
        }
        int i5 = jvfVar.g;
        if (alignItems == 0 || alignItems == 4) {
            if (jveVar.getFlexWrap() != 2) {
                view.layout(i, i2 + flexItem.i(), i3, i4 + flexItem.i());
                return;
            } else {
                view.layout(i, i2 - flexItem.f(), i3, i4 - flexItem.f());
                return;
            }
        }
        if (alignItems == 3) {
            if (jveVar.getFlexWrap() != 2) {
                int iMax = Math.max(jvfVar.l - view.getBaseline(), flexItem.i());
                view.layout(i, i2 + iMax, i3, i4 + iMax);
                return;
            } else {
                int iMax2 = Math.max((jvfVar.l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.f());
                view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                return;
            }
        }
        if (alignItems == 1) {
            if (jveVar.getFlexWrap() == 2) {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.i(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.i());
                return;
            } else {
                int i6 = i2 + i5;
                view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.f(), i3, i6 - flexItem.f());
                return;
            }
        }
        if (alignItems == 2) {
            int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.i()) - flexItem.f()) / 2;
            if (jveVar.getFlexWrap() != 2) {
                int i7 = i2 + measuredHeight;
                view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
            } else {
                int i8 = i2 - measuredHeight;
                view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
            }
        }
    }

    public final void k(View view, jvf jvfVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (flexItem.d() != -1) {
            alignItems = flexItem.d();
        }
        int i5 = jvfVar.g;
        if (alignItems == 0 || alignItems == 4 || alignItems == 3) {
            if (z) {
                view.layout(i - flexItem.h(), i2, i3 - flexItem.h(), i4);
                return;
            } else {
                view.layout(i + flexItem.g(), i2, i3 + flexItem.g(), i4);
                return;
            }
        }
        if (alignItems == 1) {
            if (z) {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.g(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.g(), i4);
                return;
            } else {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.h(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.h(), i4);
                return;
            }
        }
        if (alignItems == 2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int measuredWidth = (((i5 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
            if (z) {
                view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
            } else {
                view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
            }
        }
    }

    public final void l(int i) {
        View viewJ;
        jve jveVar = this.a;
        if (i >= jveVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = jveVar.getFlexDirection();
        if (jveVar.getAlignItems() != 4) {
            for (jvf jvfVar : jveVar.getFlexLinesInternal()) {
                for (Integer num : jvfVar.n) {
                    View viewJ2 = jveVar.j(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        B(viewJ2, jvfVar.g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(a.b(flexDirection, "Invalid flex direction: "));
                        }
                        A(viewJ2, jvfVar.g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.b;
        List flexLinesInternal = jveVar.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            jvf jvfVar2 = (jvf) flexLinesInternal.get(i2);
            int i3 = jvfVar2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = jvfVar2.o + i4;
                if (i4 < jveVar.getFlexItemCount() && (viewJ = jveVar.j(i5)) != null && viewJ.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewJ.getLayoutParams();
                    if (flexItem.d() == -1 || flexItem.d() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            B(viewJ, jvfVar2.g, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(a.b(flexDirection, "Invalid flex direction: "));
                            }
                            A(viewJ, jvfVar2.g, i5);
                        }
                    }
                }
            }
        }
    }

    public final int[] m(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jvh jvhVar = (jvh) it.next();
            int i3 = jvhVar.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, jvhVar.b);
            i2++;
        }
        return iArr;
    }
}
