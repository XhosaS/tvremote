package com.google.android.libraries.flowlayoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.os.Trace;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.videos.R;
import defpackage.ctq;
import defpackage.cyu;
import defpackage.otd;
import defpackage.ote;
import defpackage.otf;
import defpackage.otg;
import defpackage.oth;
import defpackage.oti;
import defpackage.otj;
import defpackage.otk;
import defpackage.otm;
import defpackage.otn;
import defpackage.oto;
import defpackage.otp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlowLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int a = otd.a(0.5f);
    private static final Rect b = new Rect();
    private final int c;
    private final int d;
    private final List e;
    private boolean f;
    private otg g;
    private otn h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private otp o;

    public FlowLayoutManager() {
        int i = a;
        this.c = i;
        this.d = i;
        this.e = new ArrayList();
        this.j = -1;
        this.k = Integer.MIN_VALUE;
        this.o = null;
        setItemPrefetchEnabled(false);
    }

    private final int b(RecyclerView.Recycler recycler, oto otoVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        int i7;
        int i8;
        int i9;
        int iC = otoVar.c();
        if (iC < i) {
            if (t(recycler, iC, i3, null, i4, 0, i5, otoVar.f == iC, z, i6)) {
                otg otgVar = this.g;
                if (otgVar.f.o == 0) {
                    oti otiVarA = otgVar.a();
                    oth othVar = (oth) oth.a.a();
                    if (othVar == null) {
                        othVar = new oth();
                    }
                    othVar.f = iC;
                    othVar.e = i5;
                    othVar.b = i4;
                    othVar.d(otiVarA);
                    oth othVar2 = othVar;
                    int iE = e(recycler, othVar2, i, i3, z, i6);
                    otoVar.f(othVar2);
                    return iE;
                }
                oti otiVarA2 = otgVar.a();
                otj otjVar = this.g.f;
                otm otmVar = (otm) otm.a.a();
                if (otmVar == null) {
                    otmVar = new otm();
                }
                otmVar.f = iC;
                otmVar.e = i5;
                if (!otiVarA2.o) {
                    throw new IllegalArgumentException("creator not measured");
                }
                int i10 = otjVar.o;
                boolean z2 = (i10 & 4) != 0;
                boolean z3 = (i10 & 2) != 0;
                int i11 = i10 & 1;
                if (!z2 && !z3 && i11 == 0) {
                    throw new IllegalArgumentException("Unknown flow value: 0x".concat(String.valueOf(Integer.toHexString(i10))));
                }
                otmVar.b = otiVarA2;
                otmVar.c = otjVar.b == -4;
                if (z2) {
                    i7 = 0;
                } else {
                    oti otiVar = otmVar.b;
                    i7 = otiVar.g + otiVar.l + otiVar.h;
                }
                int i12 = otj.i("layout_flmFlowInsetStart", otjVar.q, otmVar.b.d, false);
                int i13 = otj.i("layout_flmFlowInsetEnd", otjVar.r, otmVar.b.d, false);
                if ((z3 || z2) && otd.c(otjVar.q) && (i8 = otmVar.b.b) != 0 && (i9 = otmVar.e) < i8) {
                    i12 += i8 - i9;
                }
                int i14 = otj.i("layout_flmFlowWidth", otjVar.t, otmVar.b.d, true);
                otmVar.d = i14;
                if (i14 < 0) {
                    i14 = Math.max(0, ((i4 - i7) - i12) - i13);
                    otmVar.d = i14;
                }
                if (z3) {
                    int i15 = i4 - i7;
                    oti otiVar2 = otmVar.b;
                    otiVar2.g = (i4 - otiVar2.h) - otiVar2.l;
                    otmVar.j = (i15 - i13) - i14;
                } else {
                    otmVar.j = i7 + i12;
                }
                otmVar.k = otjVar.e(otmVar.b.d);
                otmVar.l = otjVar.d(otmVar.b.d);
                int iC2 = otjVar.c(otmVar.b.d);
                otmVar.i = iC2;
                if (iC2 < 0) {
                    otmVar.i = Math.max(0, (otmVar.b.m - otmVar.k) - otmVar.l);
                }
                otm otmVar2 = otmVar;
                int iF = f(recycler, otmVar2, i, i2, i3);
                otoVar.f(otmVar2);
                return iF;
            }
        } else if (iC > i) {
            throw new IllegalArgumentException("¶@[" + otoVar.f + "," + iC + ") should not cover nextSectionStart@" + i);
        }
        return iC;
    }

    private final int c(RecyclerView.Recycler recycler, int i, int i2, int i3) throws Throwable {
        List list = this.e;
        oto otoVar = (oto) list.get(i);
        s();
        try {
            try {
                int i4 = ctq.a;
                Trace.beginSection("FLM: fillSection");
                int i5 = i2;
                oto otoVar2 = otoVar;
                while (i5 > 0) {
                    i++;
                    oto otoVar3 = i == list.size() ? null : (oto) list.get(i);
                    RecyclerView.Recycler recycler2 = recycler;
                    int i6 = i3;
                    try {
                        n(recycler2, otoVar2, -1, i5, otoVar3 == null ? i3 : otoVar3.f, i6);
                        otg otgVar = this.g;
                        i5 -= otgVar.a;
                        int i7 = otgVar.b;
                        if (i7 == -1) {
                            if (otoVar2.c() == i6) {
                                break;
                            }
                            otoVar2 = otoVar3;
                        } else {
                            oto otoVarE = oto.e(i7);
                            list.add(i, otoVarE);
                            otoVar2 = otoVarE;
                        }
                        recycler = recycler2;
                        i3 = i6;
                    } catch (RuntimeException e) {
                        e = e;
                        throw e;
                    }
                }
                Trace.endSection();
                return i5;
            } catch (RuntimeException e2) {
                e = e2;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                int i8 = ctq.a;
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            Throwable th22 = th;
            int i82 = ctq.a;
            Trace.endSection();
            throw th22;
        }
    }

    private final int d(RecyclerView.Recycler recycler, otk otkVar, int i, int i2, int i3, boolean z, int i4) {
        return otkVar instanceof oth ? e(recycler, (oth) otkVar, i, i3, z, i4) : f(recycler, (otm) otkVar, i, i2, i3);
    }

    private final int e(RecyclerView.Recycler recycler, oth othVar, int i, int i2, boolean z, int i3) {
        List list = othVar.d;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Line must not be empty");
        }
        int iC = othVar.c();
        while (iC < i) {
            int i4 = othVar.b;
            int i5 = othVar.c;
            if (i4 - i5 <= 1 || !t(recycler, iC, i2, list, i4, i5, othVar.e, false, z, i3)) {
                break;
            }
            othVar.d(this.g.a());
            iC++;
        }
        return iC;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0081 -> B:29:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int f(android.support.v7.widget.RecyclerView.Recycler r13, defpackage.otm r14, int r15, int r16, int r17) {
        /*
            r12 = this;
            oti r0 = r14.b
            if (r0 == 0) goto L8d
            int r10 = r14.c()
            oto r8 = r14.m
            if (r8 != 0) goto L3b
            int r0 = r14.d
            if (r0 == 0) goto L3a
            int r0 = r14.i
            if (r0 != 0) goto L15
            goto L3a
        L15:
            oto r2 = defpackage.oto.e(r10)
            int r6 = r14.d
            int r0 = r14.e
            int r1 = r14.j
            int r7 = r0 + r1
            r8 = 1
            int r9 = r14.i
            r0 = r12
            r1 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            int r6 = r0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r2.f
            if (r6 != r0) goto L37
            r2.n()
            return r6
        L37:
            r14.m = r2
            goto L83
        L3a:
            return r10
        L3b:
            r4 = r16
            int r0 = r8.i(r4)
            otk r2 = r8.d()
            if (r2 == 0) goto L85
            int r1 = r2.h
            int r0 = r0 - r1
            int r1 = r14.i
            int r7 = r1 - r0
            r6 = 1
            r0 = r12
            r1 = r13
            r3 = r15
            r5 = r17
            int r6 = r0.d(r1, r2, r3, r4, r5, r6, r7)
            if (r6 <= r10) goto L5d
            r8.k()
        L5d:
            r11 = r6
            r2 = r8
        L5f:
            int r0 = r14.i
            int r1 = r2.i(r4)
            int r9 = r0 - r1
            int r6 = r14.d
            int r0 = r14.e
            int r1 = r14.j
            int r7 = r0 + r1
            r8 = 1
            r0 = r12
            r1 = r13
            r3 = r15
            r5 = r17
            int r6 = r0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r6 > r11) goto L81
            if (r6 <= r10) goto L80
            r14.k()
        L80:
            return r6
        L81:
            r4 = r16
        L83:
            r11 = r6
            goto L5f
        L85:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Empty nested paragraph found!"
            r13.<init>(r14)
            throw r13
        L8d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Line must not be empty"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.flowlayoutmanager.FlowLayoutManager.f(android.support.v7.widget.RecyclerView$Recycler, otm, int, int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090 A[Catch: all -> 0x00a5, RuntimeException -> 0x00a8, TryCatch #0 {RuntimeException -> 0x00a8, blocks: (B:36:0x007a, B:40:0x0099, B:39:0x0090), top: B:52:0x007a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int g(android.support.v7.widget.RecyclerView.Recycler r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            r0 = -1
            if (r11 != r0) goto L5
            r1 = 0
            goto Ld
        L5:
            java.util.List r1 = r9.e
            java.lang.Object r1 = r1.get(r11)
            oto r1 = (defpackage.oto) r1
        Ld:
            java.lang.String r2 = " impossible to cover position "
            java.lang.String r3 = "Section at "
            if (r1 == 0) goto L22
            int r4 = r1.f
            if (r4 > r12) goto L18
            goto L22
        L18:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = defpackage.a.ce(r12, r11, r3, r2)
            r10.<init>(r11)
            throw r10
        L22:
            int r4 = r11 + 1
            java.util.List r5 = r9.e
            int r6 = r5.size()
            if (r4 >= r6) goto L41
            java.lang.Object r6 = r5.get(r4)
            oto r6 = (defpackage.oto) r6
            int r6 = r6.f
            if (r12 >= r6) goto L37
            goto L41
        L37:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = defpackage.a.ce(r12, r11, r3, r2)
            r10.<init>(r11)
            throw r10
        L41:
            if (r1 != 0) goto L45
            r2 = 0
            goto L49
        L45:
            int r2 = r1.c()
        L49:
            if (r2 > r12) goto Lb1
            r3 = r0
            r6 = r3
            r0 = r12
        L4e:
            if (r0 < r2) goto L79
            int r6 = r9.i(r10, r0, r3, r6)
            android.view.View r3 = r9.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            otj r3 = (defpackage.otj) r3
            boolean r3 = r3.h()
            if (r3 != 0) goto L6d
            if (r0 != 0) goto L67
            goto L6d
        L67:
            int r3 = r0 + (-1)
            r8 = r3
            r3 = r0
            r0 = r8
            goto L4e
        L6d:
            oto r1 = defpackage.oto.e(r0)
            r5.add(r4, r1)
            if (r0 != 0) goto L78
            r9.f = r3
        L78:
            r11 = r4
        L79:
            r3 = r1
            java.lang.String r0 = "FLM: fillSection"
            int r1 = defpackage.ctq.a     // Catch: java.lang.Throwable -> La5 java.lang.RuntimeException -> La8
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> La5 java.lang.RuntimeException -> La8
            r9.s()     // Catch: java.lang.Throwable -> La5 java.lang.RuntimeException -> La8
            int r0 = r11 + 1
            java.util.List r1 = r9.e     // Catch: java.lang.Throwable -> La5 java.lang.RuntimeException -> La8
            int r2 = r1.size()     // Catch: java.lang.Throwable -> La5 java.lang.RuntimeException -> La8
            if (r0 != r2) goto L90
            r6 = r13
            goto L99
        L90:
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> La5 java.lang.RuntimeException -> La8
            oto r0 = (defpackage.oto) r0     // Catch: java.lang.Throwable -> La5 java.lang.RuntimeException -> La8
            int r0 = r0.f     // Catch: java.lang.Throwable -> La5 java.lang.RuntimeException -> La8
            r6 = r0
        L99:
            r5 = 0
            r1 = r9
            r2 = r10
            r4 = r12
            r7 = r13
            r1.n(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La5 java.lang.RuntimeException -> La8
            android.os.Trace.endSection()
            return r11
        La5:
            r0 = move-exception
            r10 = r0
            goto Lab
        La8:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> La5
        Lab:
            int r11 = defpackage.ctq.a
            android.os.Trace.endSection()
            throw r10
        Lb1:
            r7 = r13
            r1.i(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.flowlayoutmanager.FlowLayoutManager.g(android.support.v7.widget.RecyclerView$Recycler, int, int, int):int");
    }

    private final int h(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return -1;
        }
        int i2 = 0;
        if (getPosition(getChildAt(0)) > i) {
            return -1;
        }
        if (getPosition(getChildAt(childCount - 1)) < i) {
            return ~childCount;
        }
        while (i2 < childCount) {
            int i3 = (i2 + childCount) / 2;
            int position = getPosition(getChildAt(i3));
            if (position == i) {
                return i3;
            }
            if (position < i) {
                i2 = i3 + 1;
            } else {
                childCount = i3;
            }
        }
        return ~i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int i(android.support.v7.widget.RecyclerView.Recycler r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            int r8 = r7 - r8
            r0 = 1
            r1 = -1
            if (r8 == r1) goto L11
            if (r8 == 0) goto Lf
            if (r8 == r0) goto Ld
            r8 = r1
            r9 = r8
            goto L16
        Ld:
            int r9 = r9 + 1
        Lf:
            r8 = r9
            goto L16
        L11:
            int r8 = r9 + (-1)
            r4 = r9
            r9 = r8
            r8 = r4
        L16:
            if (r9 < 0) goto L3c
            int r2 = r5.getChildCount()
            if (r9 >= r2) goto L3c
            android.view.View r2 = r5.getChildAt(r9)
            int r2 = r5.getPosition(r2)
            if (r2 != r7) goto L29
            return r9
        L29:
            r3 = 0
            if (r9 == r8) goto L2e
            r9 = r3
            goto L2f
        L2e:
            r9 = r0
        L2f:
            if (r2 > r7) goto L32
            r0 = r3
        L32:
            if (r9 == r0) goto L3c
            java.lang.String r8 = "FlowLayoutManager"
            java.lang.String r9 = "Wrong hint precondition, falling back to binary search"
            android.util.Log.e(r8, r9)
            goto L3d
        L3c:
            r1 = r8
        L3d:
            if (r1 >= 0) goto L47
            int r8 = r5.h(r7)
            if (r8 < 0) goto L46
            return r8
        L46:
            int r1 = ~r8
        L47:
            android.view.View r6 = r6.getViewForPosition(r7)
            r5.addView(r6, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.flowlayoutmanager.FlowLayoutManager.i(android.support.v7.widget.RecyclerView$Recycler, int, int, int):int");
    }

    private final int j(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        int i3;
        int iMax;
        int i4;
        int i5;
        int i6;
        List list;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i;
        int itemCount = state.getItemCount();
        if (itemCount == 0) {
            removeAndRecycleAllViews(recycler);
            q();
            return 0;
        }
        boolean z = i11 >= 0 && i11 < itemCount;
        int paddingTop = getPaddingTop();
        int iMax2 = Math.max(paddingTop, getHeight() - getPaddingBottom());
        int i12 = iMax2 - paddingTop;
        int iU = !z ? paddingTop : paddingTop - u(i12, this.c);
        int iU2 = u(i12, this.d) + iMax2;
        if (state.didStructureChange()) {
            detachAndScrapAttachedViews(recycler);
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((otj) childAt.getLayoutParams()).viewNeedsUpdate()) {
                detachAndScrapView(childAt, recycler);
            }
        }
        Integer numValueOf = Integer.valueOf(getWidth());
        Integer numValueOf2 = Integer.valueOf(getPaddingStart());
        Integer numValueOf3 = Integer.valueOf(getPaddingEnd());
        int i13 = -1;
        if (!numValueOf.equals(state.get(R.id.flm_width)) || !numValueOf2.equals(state.get(R.id.flm_paddingStart)) || !numValueOf3.equals(state.get(R.id.flm_paddingEnd))) {
            q();
            state.put(R.id.flm_width, numValueOf);
            state.put(R.id.flm_paddingStart, numValueOf2);
            state.put(R.id.flm_paddingEnd, numValueOf3);
        }
        List list2 = this.e;
        for (int size = list2.size() - 1; size >= 0; size--) {
            ((oto) list2.get(size)).m();
        }
        if (true != z) {
            i11 = 0;
        }
        int size2 = list2.size();
        if (size2 == 0 || ((oto) list2.get(0)).f > i11) {
            i3 = -1;
        } else if (((oto) list2.get(size2 - 1)).c() > i11) {
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    i3 = ~i14;
                    break;
                }
                int i15 = (i14 + size2) / 2;
                oto otoVar = (oto) list2.get(i15);
                if (i11 >= otoVar.f) {
                    if (i11 < otoVar.c()) {
                        i3 = i15;
                        break;
                    }
                    i14 = i15 + 1;
                } else {
                    size2 = i15;
                }
            }
        } else {
            i3 = ~size2;
        }
        if (i3 < 0) {
            i3 = (~i3) - 1;
        }
        int iG = g(recycler, i3, i11, itemCount);
        oto otoVar2 = (oto) list2.get(iG);
        int iA = z ? i2 - otoVar2.a(i11) : paddingTop;
        int iC = iU2 - c(recycler, iG, iU2 - iA, itemCount);
        if (z) {
            iMax = Math.max(0, iMax2 - iC);
            iA += iMax;
            iC += iMax;
        } else {
            iMax = 0;
        }
        int i16 = iA;
        oto otoVar3 = otoVar2;
        int i17 = iG;
        while (true) {
            i4 = iA;
            if (i16 <= iU || (i10 = otoVar3.f) <= 0) {
                break;
            }
            int iG2 = g(recycler, i17 - 1, i10 - 1, itemCount);
            if (iG2 == i17) {
                iG++;
            } else {
                i17 = iG2;
            }
            otoVar3 = (oto) list2.get(i17);
            i16 -= otoVar3.h;
            iA = i4;
        }
        if (z) {
            int iMax3 = Math.max(0, i16 - paddingTop);
            i16 -= iMax3;
            int i18 = i4 - iMax3;
            int iC2 = iC - iMax3;
            if (iMax3 <= 0 || iMax != 0) {
                i6 = iMax3;
                i5 = iC2;
            } else {
                if (iC2 < iU2) {
                    iC2 = iU2 - c(recycler, iG, iU2 - i18, itemCount);
                }
                int i19 = iC2;
                i6 = iMax3;
                i5 = i19;
                iMax = 0;
            }
        } else {
            i5 = iC;
            i6 = 0;
        }
        try {
            int i20 = ctq.a;
            Trace.beginSection("FLM: renderAndRecycleViews");
            int iMin = Math.min(i5, iU2);
            boolean z2 = getLayoutDirection() == 1;
            this.l = itemCount << 8;
            this.m = 0;
            this.n = 0;
            int i21 = i17;
            int i22 = -1;
            while (i16 < iMin && i21 < list2.size()) {
                List list3 = ((oto) list2.get(i21)).a;
                int i23 = i17;
                int size3 = list3.size();
                int i24 = i21;
                int i25 = i16;
                int i26 = 0;
                while (i25 < iMin && i26 < size3) {
                    List list4 = list3;
                    otk otkVar = (otk) list3.get(i26);
                    int i27 = i25;
                    int i28 = i27 + otkVar.h;
                    boolean z3 = z2;
                    int i29 = i13;
                    if (i22 == i29) {
                        if (i28 > iU) {
                            int iH = h(otkVar.f);
                            if (iH < 0) {
                                iH = ~iH;
                            }
                            for (int i30 = iH + i29; i30 >= 0; i30--) {
                                removeAndRecycleViewAt(i30, recycler);
                            }
                            i22 = 0;
                        } else {
                            i22 = -1;
                        }
                        i29 = -1;
                    }
                    if (i22 != i29) {
                        list = list4;
                        i7 = size3;
                        i8 = i24;
                        i9 = i28;
                        int iL = l(i27, otkVar, i22, recycler, z3);
                        int i31 = otkVar.h + i27;
                        if (i31 <= paddingTop || i27 >= iMax2) {
                            z3 = z3;
                        } else {
                            int iC3 = otkVar.c();
                            z3 = z3;
                            int i32 = otkVar.f;
                            int i33 = (iC3 - i32) << 8;
                            if (i27 <= paddingTop) {
                                this.m = (i32 << 8) + (((paddingTop - i27) * i33) / otkVar.h);
                            }
                            int iMin2 = Math.min(i31, iMax2) - Math.max(i27, paddingTop);
                            int i34 = otkVar.h;
                            if (i34 == 0) {
                                this.n += i33;
                            } else {
                                this.n += (i33 * iMin2) / i34;
                            }
                        }
                        i22 = iL;
                    } else {
                        list = list4;
                        i7 = size3;
                        i8 = i24;
                        i9 = i28;
                    }
                    i26++;
                    z2 = z3;
                    list3 = list;
                    i25 = i9;
                    i13 = -1;
                    i24 = i8;
                    size3 = i7;
                }
                int i35 = i25;
                i21 = i24 + 1;
                i17 = i23;
                z2 = z2;
                i16 = i35;
                i13 = -1;
            }
            int i36 = i17;
            int i37 = i21;
            for (int childCount2 = getChildCount() - 1; childCount2 >= 0 && childCount2 >= i22; childCount2--) {
                removeAndRecycleViewAt(childCount2, recycler);
            }
            if (i37 < list2.size()) {
                int i38 = ((oto) list2.get(i37)).f + 5;
                for (int size4 = list2.size() - 1; size4 >= i37 + 2 && ((oto) list2.get(size4)).f >= i38; size4--) {
                    r(size4);
                }
            }
            int i39 = otoVar3.f - 5;
            for (int i40 = i36 - 3; i40 >= 0; i40--) {
                if (((oto) list2.get(i40)).f < i39) {
                    r(i40);
                }
            }
            Trace.endSection();
            return iMax - i6;
        } catch (Throwable th) {
            int i41 = ctq.a;
            Trace.endSection();
            throw th;
        }
    }

    private final int k(int i, int i2, oti otiVar, int i3, int i4, RecyclerView.Recycler recycler, boolean z, otm otmVar) {
        int i5;
        int i6 = i(recycler, i3, i3, i4);
        View childAt = getChildAt(i6);
        int decoratedMeasuredHeight = otiVar.m;
        if (otmVar != null && otmVar.c && (i5 = otmVar.n) > 0) {
            p(childAt, otiVar.l, decoratedMeasuredHeight + i5);
            decoratedMeasuredHeight = getDecoratedMeasuredHeight(childAt);
        } else if (!otiVar.o) {
            p(childAt, otiVar.l, decoratedMeasuredHeight);
            otiVar.a(this, childAt, true);
            decoratedMeasuredHeight = otiVar.m;
        }
        int i7 = i + otiVar.p;
        int i8 = i2 + otiVar.g;
        int width = otiVar.l + i8;
        int width2 = z ? getWidth() - width : i8;
        if (z) {
            width = getWidth() - i8;
        }
        layoutDecorated(childAt, width2, i7, width, i7 + decoratedMeasuredHeight);
        if (this.h != null) {
            ((RecyclerView) childAt.getParent()).getChildViewHolder(childAt);
            this.h.a();
        }
        return i6;
    }

    private final int l(int i, otk otkVar, int i2, RecyclerView.Recycler recycler, boolean z) {
        int i3 = 0;
        if (otkVar instanceof oth) {
            oth othVar = (oth) otkVar;
            int paddingStart = getPaddingStart() + othVar.e;
            List list = othVar.d;
            int size = list.size();
            int iK = i2;
            int i4 = paddingStart;
            while (i3 < size) {
                oti otiVar = (oti) list.get(i3);
                iK = k(i, i4, otiVar, othVar.f + i3, iK, recycler, z, null) + 1;
                i4 += otiVar.g + otiVar.l + otiVar.h;
                i3++;
            }
            return iK;
        }
        otm otmVar = (otm) otkVar;
        int iK2 = k(i, getPaddingStart() + otmVar.e, otmVar.b, otmVar.f, i2, recycler, z, otmVar) + 1;
        oto otoVar = otmVar.m;
        int size2 = otoVar == null ? 0 : otoVar.a.size();
        int iL = iK2;
        int i5 = i + otmVar.b.p + otmVar.k;
        while (i3 < size2) {
            otk otkVar2 = (otk) otmVar.m.a.get(i3);
            iL = l(i5, otkVar2, iL, recycler, z);
            i5 += otkVar2.h;
            i3++;
        }
        return iL;
    }

    private final View m() {
        int height = getHeight();
        int childCount = getChildCount();
        int i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!((otj) childAt.getLayoutParams()).isItemRemoved()) {
                int decoratedTop = (getDecoratedTop(childAt) + getDecoratedBottom(childAt)) / 2;
                if (decoratedTop >= 0 && decoratedTop <= height) {
                    return childAt;
                }
                int i3 = decoratedTop < 0 ? -decoratedTop : decoratedTop - height;
                if (i3 < i) {
                    view = childAt;
                    i = i3;
                }
            }
        }
        return view;
    }

    private final void n(RecyclerView.Recycler recycler, oto otoVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3;
        if (i != -1) {
            i5 = i;
        } else {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Both criteria met before any processing");
            }
            i5 = -1;
        }
        if (otoVar.f >= i6) {
            throw new IllegalArgumentException("Section started after limit");
        }
        if (i5 >= i6 || i6 > i4) {
            throw new IllegalArgumentException("positionToCover < nextSectionStart <= totalItemCount does not hold");
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        otg otgVar = this.g;
        otgVar.b = -1;
        otgVar.a = otoVar.i(i4);
        int i7 = otoVar.f;
        otk otkVarD = otoVar.d();
        if (otkVarD != null) {
            otg otgVar2 = this.g;
            int i8 = otgVar2.a - otkVarD.h;
            otgVar2.a = i8;
            if (otkVarD.f > i5 && i8 >= i2) {
                return;
            }
            int iC = otkVarD.c();
            int iD = d(recycler, otkVarD, i6, i4, width, false, -1);
            if (iD != iC) {
                otoVar.k();
            }
            this.g.a = otoVar.i(i4);
            i7 = iD;
        }
        while (true) {
            if ((i7 > i5 && this.g.a >= i2) || this.g.b != -1 || i7 >= i6) {
                break;
            }
            int iB = b(recycler, otoVar, i6, i4, width, width, 0, false, -1);
            this.g.a = otoVar.i(i4);
            i6 = i3;
            i7 = iB;
        }
        otg otgVar3 = this.g;
        if (otgVar3.b == -1 || i7 <= i5 || otgVar3.a < i2) {
            return;
        }
        otgVar3.b = -1;
    }

    private final void o(int i, int i2, int i3) {
        int i4;
        List list = this.e;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i4 = 0;
                break;
            }
            oto otoVar = (oto) list.get(size);
            int i5 = otoVar.f;
            if (i5 < i2 || (i5 <= 0 && !this.f)) {
                break;
            } else {
                otoVar.l(i3);
            }
        }
        i4 = size + 1;
        while (true) {
            i4--;
            if (i4 < 0 || ((oto) list.get(i4)).j(i) != 2) {
                return;
            } else {
                r(i4);
            }
        }
    }

    private final void p(View view, int i, int i2) {
        Rect rect = b;
        calculateItemDecorationsForChild(view, rect);
        view.measure(View.MeasureSpec.makeMeasureSpec((i - rect.left) - rect.right, 1073741824), View.MeasureSpec.makeMeasureSpec((i2 - rect.top) - rect.bottom, 1073741824));
    }

    private final void q() {
        List list = this.e;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                list.clear();
                return;
            }
            ((oto) list.get(size)).n();
        }
    }

    private final void r(int i) {
        ((oto) this.e.remove(i)).n();
        if (i == 0) {
            this.f = true;
        }
    }

    private final void s() {
        if (this.g == null) {
            this.g = new otg();
        }
        otg otgVar = this.g;
        otgVar.a = 0;
        otgVar.b = -1;
        otgVar.d = -1;
        otgVar.e = -1;
        otgVar.f = null;
        oti otiVar = otgVar.c;
        if (otiVar != null) {
            otiVar.b();
            otgVar.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean t(android.support.v7.widget.RecyclerView.Recycler r18, int r19, int r20, java.util.List r21, int r22, int r23, int r24, boolean r25, boolean r26, int r27) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.flowlayoutmanager.FlowLayoutManager.t(android.support.v7.widget.RecyclerView$Recycler, int, int, java.util.List, int, int, int, boolean, boolean, int):boolean");
    }

    private static final int u(int i, int i2) {
        return otd.d(i2) ? i2 : (int) ((i * Float.intBitsToFloat(i2)) + 0.5f);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public otj generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new otj(context, attributeSet);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof otj;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (i2 == 0 || this.e.isEmpty()) {
            return;
        }
        if (i2 > 0) {
            View childAt = getChildAt(getChildCount() - 1);
            int position = getPosition(childAt) + 1;
            if (position < state.getItemCount()) {
                layoutPrefetchRegistry.addPosition(position, Math.max(0, getDecoratedBottom(childAt) - ((getHeight() - getPaddingBottom()) - getPaddingTop())));
                return;
            }
            return;
        }
        View childAt2 = getChildAt(0);
        int position2 = getPosition(childAt2) - 1;
        if (position2 >= 0) {
            layoutPrefetchRegistry.addPosition(position2, Math.max(0, -getDecoratedTop(childAt2)));
        }
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        return new PointF(0.0f, i < getPosition(childAt) ? -1 : 1);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return this.n;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.m;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return this.l;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final View findViewByPosition(int i) {
        int iH = h(i);
        if (iH < 0) {
            return null;
        }
        return getChildAt(iH);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final /* synthetic */ RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new otj();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void measureChild(View view, int i, int i2) {
        if (view.getLayoutParams() instanceof otj) {
            throw new UnsupportedOperationException("Views using FlowLayoutManager.LayoutParams should not be measured with measureChild()");
        }
        super.measureChild(view, i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View view, int i, int i2) {
        if (view.getLayoutParams() instanceof otj) {
            throw new UnsupportedOperationException("Views using FlowLayoutManager.LayoutParams should not be measured with measureChildWithMargins()");
        }
        super.measureChildWithMargins(view, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        if (this.i) {
            this.h = null;
            this.i = false;
        }
        if (adapter2 instanceof otf) {
            this.h = (otf) adapter2;
            this.i = true;
        }
        q();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        q();
        super.onDetachedFromWindow(recyclerView, recycler);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityEvent accessibilityEvent) {
        int viewAdapterPosition;
        int viewAdapterPosition2;
        super.onInitializeAccessibilityEvent(recycler, state, accessibilityEvent);
        cyu cyuVar = new cyu(accessibilityEvent);
        if (cyuVar.a() == 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= getChildCount()) {
                viewAdapterPosition = -1;
                break;
            }
            View childAt = getChildAt(i);
            if (childAt.getBottom() > 0) {
                viewAdapterPosition = ((otj) childAt.getLayoutParams()).getViewAdapterPosition();
                break;
            }
            i++;
        }
        int height = getHeight();
        int childCount = getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                viewAdapterPosition2 = -1;
                break;
            }
            View childAt2 = getChildAt(childCount);
            if (childAt2.getTop() < height) {
                viewAdapterPosition2 = ((otj) childAt2.getLayoutParams()).getViewAdapterPosition();
                break;
            }
            childCount--;
        }
        if (viewAdapterPosition == -1 || viewAdapterPosition2 == -1) {
            return;
        }
        cyuVar.b(viewAdapterPosition);
        cyuVar.c(viewAdapterPosition2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        o(i, i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        q();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        o(Math.min(i, i2), Math.max(i + i3, i2 + i3), 0);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        o(i, i + i2, -i2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int decoratedTop;
        otp otpVar = this.o;
        if (otpVar != null) {
            this.j = otpVar.a;
            this.k = (int) (getHeight() * this.o.b);
            this.o = null;
        }
        int i = this.j;
        int position = -1;
        if (i != -1) {
            if (i < 0 || i >= state.getItemCount()) {
                this.j = -1;
                this.k = Integer.MIN_VALUE;
            } else if (this.k == Integer.MIN_VALUE) {
                this.k = getPaddingTop();
            }
        }
        int i2 = this.j;
        if (i2 != -1) {
            decoratedTop = this.k;
            this.j = -1;
            this.k = Integer.MIN_VALUE;
            position = i2;
        } else {
            View viewM = m();
            if (viewM != null) {
                position = getPosition(viewM);
                decoratedTop = getDecoratedTop(viewM);
            } else {
                decoratedTop = 0;
            }
        }
        try {
            int i3 = ctq.a;
            Trace.beginSection("FLM: layoutViewport");
            j(recycler, state, position, decoratedTop);
            Trace.endSection();
        } catch (Throwable th) {
            int i4 = ctq.a;
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof otp) {
            this.o = (otp) parcelable;
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        otp otpVar = this.o;
        if (otpVar != null) {
            return new otp(otpVar);
        }
        otp otpVar2 = new otp();
        View viewM = m();
        if (viewM == null) {
            otpVar2.a = -1;
            otpVar2.b = 0.0f;
            return otpVar2;
        }
        otpVar2.a = getPosition(viewM);
        otpVar2.b = getDecoratedTop(viewM) / getHeight();
        return otpVar2;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.j = i;
        this.k = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        this.e.isEmpty();
        View viewM = m();
        if (viewM == null) {
            return 0;
        }
        return i - j(recycler, state, getPosition(viewM), getDecoratedTop(viewM) - i);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        ote oteVar = new ote(this, recyclerView.getContext());
        oteVar.setTargetPosition(i);
        startSmoothScroll(oteVar);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final /* bridge */ /* synthetic */ RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof otj ? new otj((otj) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new otj((ViewGroup.MarginLayoutParams) layoutParams) : new otj(layoutParams);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
    }
}
