package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhz {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public rhz(View.OnClickListener onClickListener) {
        this.b = trk.a;
        this.a = onClickListener;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, nfw] */
    private final void A(View view, int i, int i2) {
        nfx nfxVar = (nfx) view.getLayoutParams();
        int i3 = (i - nfxVar.i()) - nfxVar.f();
        ?? r1 = this.a;
        int iMin = Math.min(Math.max(i3 - r1.e(view), nfxVar.l()), nfxVar.j());
        Object obj = this.c;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(obj != null ? (int) ((long[]) obj)[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        B(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        r1.s(i2, view);
    }

    private final void B(int i, int i2, int i3, View view) {
        Object obj = this.e;
        if (obj != null) {
            ((long[]) obj)[i] = p(i2, i3);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            ((long[]) obj2)[i] = p(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private static final List C(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        nfy nfyVar = new nfy();
        nfyVar.g = (i - i2) / 2;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            if (i3 == 0) {
                arrayList.add(nfyVar);
                i3 = 0;
            }
            arrayList.add((nfy) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(nfyVar);
            }
            i3++;
        }
        return arrayList;
    }

    private static final int D(nfx nfxVar, boolean z) {
        return z ? nfxVar.f() : nfxVar.h();
    }

    private static final int E(nfx nfxVar, boolean z) {
        return z ? nfxVar.h() : nfxVar.f();
    }

    private static final int F(nfx nfxVar, boolean z) {
        return z ? nfxVar.i() : nfxVar.g();
    }

    private static final int G(nfx nfxVar, boolean z) {
        return z ? nfxVar.g() : nfxVar.i();
    }

    private static final int H(nfx nfxVar, boolean z) {
        return z ? nfxVar.e() : nfxVar.o();
    }

    private static final int I(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private static final boolean J(int i, int i2, nfy nfyVar) {
        return i == i2 + (-1) && nfyVar.a() != 0;
    }

    static final long p(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    public static final int q(long j) {
        return (int) (j >> 32);
    }

    public static final int[] r(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            nga ngaVar = (nga) it.next();
            int i3 = ngaVar.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, ngaVar.b);
            i2++;
        }
        return iArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nfw] */
    private final int t(int i, nfx nfxVar, int i2) {
        ?? r0 = this.a;
        int iC = r0.c(i, r0.getPaddingTop() + r0.getPaddingBottom() + nfxVar.i() + nfxVar.f() + i2, nfxVar.e());
        int size = View.MeasureSpec.getSize(iC);
        return size > nfxVar.j() ? View.MeasureSpec.makeMeasureSpec(nfxVar.j(), View.MeasureSpec.getMode(iC)) : size < nfxVar.l() ? View.MeasureSpec.makeMeasureSpec(nfxVar.l(), View.MeasureSpec.getMode(iC)) : iC;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nfw] */
    private final int u(int i, nfx nfxVar, int i2) {
        ?? r0 = this.a;
        int iD = r0.d(i, r0.getPaddingLeft() + r0.getPaddingRight() + nfxVar.g() + nfxVar.h() + i2, nfxVar.o());
        int size = View.MeasureSpec.getSize(iD);
        return size > nfxVar.k() ? View.MeasureSpec.makeMeasureSpec(nfxVar.k(), View.MeasureSpec.getMode(iD)) : size < nfxVar.m() ? View.MeasureSpec.makeMeasureSpec(nfxVar.m(), View.MeasureSpec.getMode(iD)) : iD;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, nfw] */
    private final void v(List list, nfy nfyVar, int i, int i2) {
        nfyVar.m = i2;
        this.a.q(nfyVar);
        nfyVar.p = i;
        list.add(nfyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nfw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            nfx r0 = (defpackage.nfx) r0
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
            r6.B(r8, r1, r0, r7)
            java.lang.Object r0 = r6.a
            r0.s(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhz.w(android.view.View, int):void");
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, nfw] */
    private final void x(int i, int i2, nfy nfyVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        float f2;
        int iMax;
        double d;
        boolean z2;
        double d2;
        float f3 = nfyVar.j;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 < (i5 = nfyVar.e)) {
            return;
        }
        float f5 = (i3 - i5) / f3;
        nfyVar.e = i4 + nfyVar.f;
        int i6 = 0;
        if (!z) {
            nfyVar.g = Integer.MIN_VALUE;
        }
        boolean z3 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < nfyVar.h) {
            int i8 = nfyVar.o + i6;
            ?? r11 = this.a;
            View viewN = r11.n(i8);
            if (viewN == null || viewN.getVisibility() == 8) {
                f = f4;
                f2 = f5;
                z3 = z3;
            } else {
                nfx nfxVar = (nfx) viewN.getLayoutParams();
                int iG = r11.g();
                f = f4;
                if (iG == 0 || iG == 1) {
                    f2 = f5;
                    boolean z4 = z3;
                    int measuredWidth = viewN.getMeasuredWidth();
                    Object obj = this.c;
                    if (obj != null) {
                        measuredWidth = (int) ((long[]) obj)[i8];
                    }
                    int measuredHeight = viewN.getMeasuredHeight();
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        measuredHeight = q(((long[]) obj2)[i8]);
                    }
                    if (((boolean[]) this.d)[i8] || nfxVar.b() <= f) {
                        z3 = z4;
                    } else {
                        float fB = measuredWidth + (nfxVar.b() * f2);
                        if (i6 == nfyVar.h - 1) {
                            fB += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fB);
                        if (iRound > nfxVar.k()) {
                            iRound = nfxVar.k();
                            ((boolean[]) this.d)[i8] = true;
                            nfyVar.j -= nfxVar.b();
                            z3 = true;
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
                                z3 = z4;
                            }
                            f6 = (float) d;
                            z3 = z4;
                        }
                        int iT = t(i2, nfxVar, nfyVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewN.measure(iMakeMeasureSpec, iT);
                        int measuredWidth2 = viewN.getMeasuredWidth();
                        int measuredHeight2 = viewN.getMeasuredHeight();
                        B(i8, iMakeMeasureSpec, iT, viewN);
                        r11.s(i8, viewN);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + nfxVar.i() + nfxVar.f() + r11.e(viewN));
                    nfyVar.e += measuredWidth + nfxVar.g() + nfxVar.h();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewN.getMeasuredHeight();
                    Object obj3 = this.c;
                    if (obj3 != null) {
                        measuredHeight3 = q(((long[]) obj3)[i8]);
                    }
                    int measuredWidth3 = viewN.getMeasuredWidth();
                    Object obj4 = this.c;
                    if (obj4 != null) {
                        f2 = f5;
                        z2 = z3;
                        measuredWidth3 = (int) ((long[]) obj4)[i8];
                    } else {
                        f2 = f5;
                        z2 = z3;
                    }
                    if (((boolean[]) this.d)[i8] || nfxVar.b() <= f) {
                        z3 = z2;
                    } else {
                        float fB2 = measuredHeight3 + (nfxVar.b() * f2);
                        if (i6 == nfyVar.h - 1) {
                            fB2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fB2);
                        if (iRound2 > nfxVar.j()) {
                            iRound2 = nfxVar.j();
                            ((boolean[]) this.d)[i8] = true;
                            nfyVar.j -= nfxVar.b();
                            z3 = true;
                        } else {
                            f6 += fB2 - iRound2;
                            double d4 = f6;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                }
                                z3 = z2;
                            }
                            f6 = (float) d2;
                            z3 = z2;
                        }
                        int iU = u(i, nfxVar, nfyVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewN.measure(iU, iMakeMeasureSpec2);
                        int measuredWidth4 = viewN.getMeasuredWidth();
                        int measuredHeight4 = viewN.getMeasuredHeight();
                        B(i8, iU, iMakeMeasureSpec2, viewN);
                        r11.s(i8, viewN);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + nfxVar.g() + nfxVar.h() + r11.e(viewN));
                    nfyVar.e += measuredHeight3 + nfxVar.i() + nfxVar.f();
                }
                nfyVar.g = Math.max(nfyVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f;
            f5 = f2;
        }
        if (!z3 || i5 == nfyVar.e) {
            return;
        }
        x(i, i2, nfyVar, i3, i4, true);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, nfw] */
    private final void y(int i, int i2, nfy nfyVar, int i3, int i4, boolean z) {
        float f;
        int iMax;
        int i5 = nfyVar.e;
        float f2 = nfyVar.k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 > i5) {
            return;
        }
        float f4 = (i5 - i3) / f2;
        nfyVar.e = i4 + nfyVar.f;
        int i6 = 0;
        if (!z) {
            nfyVar.g = Integer.MIN_VALUE;
        }
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < nfyVar.h) {
            int i8 = nfyVar.o + i6;
            ?? r11 = this.a;
            View viewN = r11.n(i8);
            if (viewN == null || viewN.getVisibility() == 8) {
                f = f3;
            } else {
                nfx nfxVar = (nfx) viewN.getLayoutParams();
                int iG = r11.g();
                f = f3;
                if (iG == 0 || iG == 1) {
                    int measuredWidth = viewN.getMeasuredWidth();
                    Object obj = this.c;
                    if (obj != null) {
                        measuredWidth = (int) ((long[]) obj)[i8];
                    }
                    int measuredHeight = viewN.getMeasuredHeight();
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        measuredHeight = q(((long[]) obj2)[i8]);
                    }
                    if (!((boolean[]) this.d)[i8] && nfxVar.c() > f) {
                        float fC = measuredWidth - (nfxVar.c() * f4);
                        if (i6 == nfyVar.h - 1) {
                            fC += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fC);
                        if (iRound < nfxVar.m()) {
                            iRound = nfxVar.m();
                            ((boolean[]) this.d)[i8] = true;
                            nfyVar.k -= nfxVar.c();
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
                        int iT = t(i2, nfxVar, nfyVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewN.measure(iMakeMeasureSpec, iT);
                        int measuredWidth2 = viewN.getMeasuredWidth();
                        int measuredHeight2 = viewN.getMeasuredHeight();
                        B(i8, iMakeMeasureSpec, iT, viewN);
                        r11.s(i8, viewN);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, measuredHeight + nfxVar.i() + nfxVar.f() + r11.e(viewN));
                    nfyVar.e += measuredWidth + nfxVar.g() + nfxVar.h();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewN.getMeasuredHeight();
                    Object obj3 = this.c;
                    if (obj3 != null) {
                        measuredHeight3 = q(((long[]) obj3)[i8]);
                    }
                    int measuredWidth3 = viewN.getMeasuredWidth();
                    Object obj4 = this.c;
                    if (obj4 != null) {
                        measuredWidth3 = (int) ((long[]) obj4)[i8];
                    }
                    if (!((boolean[]) this.d)[i8] && nfxVar.c() > f) {
                        float fC2 = measuredHeight3 - (nfxVar.c() * f4);
                        if (i6 == nfyVar.h - 1) {
                            fC2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fC2);
                        if (iRound2 < nfxVar.l()) {
                            iRound2 = nfxVar.l();
                            ((boolean[]) this.d)[i8] = true;
                            nfyVar.k -= nfxVar.c();
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
                        int iU = u(i, nfxVar, nfyVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewN.measure(iU, iMakeMeasureSpec2);
                        measuredWidth3 = viewN.getMeasuredWidth();
                        int measuredHeight4 = viewN.getMeasuredHeight();
                        B(i8, iU, iMakeMeasureSpec2, viewN);
                        r11.s(i8, viewN);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, measuredWidth3 + nfxVar.g() + nfxVar.h() + r11.e(viewN));
                    nfyVar.e += measuredHeight3 + nfxVar.i() + nfxVar.f();
                }
                nfyVar.g = Math.max(nfyVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
        }
        if (!z2 || i5 == nfyVar.e) {
            return;
        }
        y(i, i2, nfyVar, i3, i4, true);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, nfw] */
    private final void z(View view, int i, int i2) {
        nfx nfxVar = (nfx) view.getLayoutParams();
        int iG = (i - nfxVar.g()) - nfxVar.h();
        ?? r1 = this.a;
        int iMin = Math.min(Math.max(iG - r1.e(view), nfxVar.m()), nfxVar.k());
        Object obj = this.c;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(obj != null ? q(((long[]) obj)[i2]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        B(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        r1.s(i2, view);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, nfw] */
    public final List a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            nfx nfxVar = (nfx) this.a.m(i2).getLayoutParams();
            nga ngaVar = new nga();
            ngaVar.b = nfxVar.n();
            ngaVar.a = i2;
            arrayList.add(ngaVar);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0373 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, nfw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.nfz r31, int r32, int r33, int r34, int r35, int r36, java.util.List r37) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhz.b(nfz, int, int, int, int, int, java.util.List):void");
    }

    public final void c(nfz nfzVar, int i, int i2, int i3, int i4, List list) {
        b(nfzVar, i, i2, i3, i4, -1, list);
    }

    public final void d(nfz nfzVar, int i, int i2, int i3, int i4, List list) {
        b(nfzVar, i2, i, i3, i4, -1, list);
    }

    public final void e(List list, int i) {
        int i2 = ((int[]) this.b)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.b;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.e;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nfw] */
    public final void f(int i, int i2, int i3) {
        int mode;
        int size;
        float f;
        int iRound;
        ?? r1 = this.a;
        int iG = r1.g();
        if (iG == 0 || iG == 1) {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        } else {
            if (iG != 2 && iG != 3) {
                throw new IllegalArgumentException(a.cf(iG, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<nfy> listO = r1.o();
        if (mode == 1073741824) {
            int iL = r1.l() + i3;
            int i4 = 0;
            if (listO.size() == 1) {
                ((nfy) listO.get(0)).g = size - i3;
                return;
            }
            if (listO.size() >= 2) {
                int iA = r1.a();
                if (iA == 1) {
                    nfy nfyVar = new nfy();
                    nfyVar.g = size - iL;
                    listO.add(0, nfyVar);
                    return;
                }
                if (iA == 2) {
                    r1.r(C(listO, size, iL));
                    return;
                }
                float f2 = -1.0f;
                if (iA == 3) {
                    if (iL >= size) {
                        return;
                    }
                    int size2 = listO.size() - 1;
                    ArrayList arrayList = new ArrayList();
                    int size3 = listO.size();
                    float f3 = 0.0f;
                    while (i4 < size3) {
                        arrayList.add((nfy) listO.get(i4));
                        if (i4 != listO.size() - 1) {
                            nfy nfyVar2 = new nfy();
                            f = f2;
                            float f4 = (size - iL) / size2;
                            if (i4 == listO.size() - 2) {
                                int iRound2 = Math.round(f3 + f4);
                                nfyVar2.g = iRound2;
                                iRound = iRound2;
                                f3 = 0.0f;
                            } else {
                                iRound = Math.round(f4);
                                nfyVar2.g = iRound;
                            }
                            f3 += f4 - iRound;
                            if (f3 > 1.0f) {
                                nfyVar2.g = iRound + 1;
                                f3 += f;
                            } else if (f3 < f) {
                                nfyVar2.g = iRound - 1;
                                f3 += 1.0f;
                            }
                            arrayList.add(nfyVar2);
                        } else {
                            f = f2;
                        }
                        i4++;
                        f2 = f;
                    }
                    r1.r(arrayList);
                    return;
                }
                if (iA == 4) {
                    if (iL >= size) {
                        r1.r(C(listO, size, iL));
                        return;
                    }
                    int size4 = listO.size();
                    int i5 = (size - iL) / (size4 + size4);
                    ArrayList arrayList2 = new ArrayList();
                    nfy nfyVar3 = new nfy();
                    nfyVar3.g = i5;
                    for (nfy nfyVar4 : listO) {
                        arrayList2.add(nfyVar3);
                        arrayList2.add(nfyVar4);
                        arrayList2.add(nfyVar3);
                    }
                    r1.r(arrayList2);
                    return;
                }
                if (iA == 5 && iL < size) {
                    float size5 = listO.size();
                    int size6 = listO.size();
                    float f5 = 0.0f;
                    while (i4 < size6) {
                        nfy nfyVar5 = (nfy) listO.get(i4);
                        float f6 = nfyVar5.g + ((size - iL) / size5);
                        if (i4 == listO.size() - 1) {
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
                        nfyVar5.g = iRound3;
                        i4++;
                    }
                }
            }
        }
    }

    public final void g(int i, int i2) {
        h(i, i2, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nfw] */
    public final void h(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        int i5;
        ?? r0 = this.a;
        int iH = r0.h();
        Object obj = this.d;
        if (obj == null) {
            this.d = new boolean[Math.max(iH, 10)];
        } else {
            boolean[] zArr = (boolean[]) obj;
            int length = zArr.length;
            if (length < iH) {
                this.d = new boolean[Math.max(length + length, iH)];
            } else {
                Arrays.fill(zArr, false);
            }
        }
        if (i3 >= r0.h()) {
            return;
        }
        int iG = r0.g();
        int iG2 = r0.g();
        if (iG2 == 0 || iG2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int iJ = r0.j();
            if (mode != 1073741824) {
                size = Math.min(iJ, size);
            }
            paddingLeft = r0.getPaddingLeft();
            paddingRight = r0.getPaddingRight();
        } else {
            if (iG2 != 2 && iG2 != 3) {
                throw new IllegalArgumentException(a.cf(iG, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = r0.j();
            }
            paddingLeft = r0.getPaddingTop();
            paddingRight = r0.getPaddingBottom();
        }
        int i6 = paddingLeft + paddingRight;
        int i7 = size;
        Object obj2 = this.b;
        int i8 = obj2 != null ? ((int[]) obj2)[i3] : 0;
        List listO = r0.o();
        int size2 = listO.size();
        while (i8 < size2) {
            nfy nfyVar = (nfy) listO.get(i8);
            if (nfyVar.e < i7) {
                i4 = i;
                i5 = i2;
                x(i4, i5, nfyVar, i7, i6, false);
            } else {
                i4 = i;
                i5 = i2;
                y(i4, i5, nfyVar, i7, i6, false);
            }
            i8++;
            i = i4;
            i2 = i5;
        }
    }

    public final void i(int i) {
        Object obj = this.b;
        if (obj == null) {
            this.b = new int[Math.max(i, 10)];
            return;
        }
        int length = ((int[]) obj).length;
        if (length < i) {
            this.b = Arrays.copyOf((int[]) this.b, Math.max(length + length, i));
        }
    }

    public final void j(int i) {
        Object obj = this.e;
        if (obj == null) {
            this.e = new long[Math.max(i, 10)];
            return;
        }
        int length = ((long[]) obj).length;
        if (length < i) {
            this.e = Arrays.copyOf((long[]) this.e, Math.max(length + length, i));
        }
    }

    public final void k(int i) {
        Object obj = this.c;
        if (obj == null) {
            this.c = new long[Math.max(i, 10)];
            return;
        }
        int length = ((long[]) obj).length;
        if (length < i) {
            this.c = Arrays.copyOf((long[]) this.c, Math.max(length + length, i));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nfw] */
    public final void l(View view, nfy nfyVar, int i, int i2, int i3, int i4) {
        nfx nfxVar = (nfx) view.getLayoutParams();
        ?? r1 = this.a;
        int iB = r1.b();
        if (nfxVar.d() != -1) {
            iB = nfxVar.d();
        }
        int i5 = nfyVar.g;
        if (iB == 0 || iB == 4) {
            if (r1.i() != 2) {
                view.layout(i, i2 + nfxVar.i(), i3, i4 + nfxVar.i());
                return;
            } else {
                view.layout(i, i2 - nfxVar.f(), i3, i4 - nfxVar.f());
                return;
            }
        }
        if (iB == 3) {
            if (r1.i() != 2) {
                int iMax = Math.max(nfyVar.l - view.getBaseline(), nfxVar.i());
                view.layout(i, i2 + iMax, i3, i4 + iMax);
                return;
            } else {
                int iMax2 = Math.max((nfyVar.l - view.getMeasuredHeight()) + view.getBaseline(), nfxVar.f());
                view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                return;
            }
        }
        if (iB == 1) {
            if (r1.i() == 2) {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + nfxVar.i(), i3, (i4 - i5) + view.getMeasuredHeight() + nfxVar.i());
                return;
            } else {
                int i6 = i2 + i5;
                view.layout(i, (i6 - view.getMeasuredHeight()) - nfxVar.f(), i3, i6 - nfxVar.f());
                return;
            }
        }
        if (iB == 2) {
            int measuredHeight = (((i5 - view.getMeasuredHeight()) + nfxVar.i()) - nfxVar.f()) / 2;
            if (r1.i() != 2) {
                int i7 = i2 + measuredHeight;
                view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
            } else {
                int i8 = i2 - measuredHeight;
                view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, nfw] */
    public final void m(View view, nfy nfyVar, boolean z, int i, int i2, int i3, int i4) {
        nfx nfxVar = (nfx) view.getLayoutParams();
        int iB = this.a.b();
        if (nfxVar.d() != -1) {
            iB = nfxVar.d();
        }
        int i5 = nfyVar.g;
        if (iB == 0 || iB == 4 || iB == 3) {
            if (z) {
                view.layout(i - nfxVar.h(), i2, i3 - nfxVar.h(), i4);
                return;
            } else {
                view.layout(i + nfxVar.g(), i2, i3 + nfxVar.g(), i4);
                return;
            }
        }
        if (iB == 1) {
            if (z) {
                view.layout((i - i5) + view.getMeasuredWidth() + nfxVar.g(), i2, (i3 - i5) + view.getMeasuredWidth() + nfxVar.g(), i4);
                return;
            } else {
                view.layout(((i + i5) - view.getMeasuredWidth()) - nfxVar.h(), i2, ((i3 + i5) - view.getMeasuredWidth()) - nfxVar.h(), i4);
                return;
            }
        }
        if (iB == 2) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int measuredWidth = (((i5 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
            if (z) {
                view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
            } else {
                view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
            }
        }
    }

    public final void n() {
        o(0);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, nfw] */
    public final void o(int i) {
        View viewN;
        ?? r2 = this.a;
        if (i >= r2.h()) {
            return;
        }
        int iG = r2.g();
        if (r2.b() != 4) {
            for (nfy nfyVar : r2.o()) {
                for (Integer num : nfyVar.n) {
                    View viewN2 = r2.n(num.intValue());
                    if (iG == 0 || iG == 1) {
                        A(viewN2, nfyVar.g, num.intValue());
                    } else {
                        if (iG != 2 && iG != 3) {
                            throw new IllegalArgumentException(a.cf(iG, "Invalid flex direction: "));
                        }
                        z(viewN2, nfyVar.g, num.intValue());
                    }
                }
            }
            return;
        }
        Object obj = this.b;
        List listO = r2.o();
        int size = listO.size();
        for (int i2 = obj != null ? ((int[]) obj)[i] : 0; i2 < size; i2++) {
            nfy nfyVar2 = (nfy) listO.get(i2);
            int i3 = nfyVar2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = nfyVar2.o + i4;
                if (i4 < r2.h() && (viewN = r2.n(i5)) != null && viewN.getVisibility() != 8) {
                    nfx nfxVar = (nfx) viewN.getLayoutParams();
                    if (nfxVar.d() == -1 || nfxVar.d() == 4) {
                        if (iG == 0 || iG == 1) {
                            A(viewN, nfyVar2.g, i5);
                        } else {
                            if (iG != 2 && iG != 3) {
                                throw new IllegalArgumentException(a.cf(iG, "Invalid flex direction: "));
                            }
                            z(viewN, nfyVar2.g, i5);
                        }
                    }
                }
            }
        }
    }

    public final void s(aafi aafiVar, int i) {
        this.c = new csl(aafiVar, i, 16);
    }

    public rhz(nfw nfwVar) {
        this.a = nfwVar;
    }
}
