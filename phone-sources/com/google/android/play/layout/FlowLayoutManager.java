package com.google.android.play.layout;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.cyu;
import defpackage.tgc;
import defpackage.tgd;
import defpackage.tge;
import defpackage.tgf;
import defpackage.tgg;
import defpackage.tgh;
import defpackage.tgi;
import defpackage.tgk;
import defpackage.tgl;
import defpackage.tgm;
import defpackage.tgn;
import defpackage.thl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlowLayoutManager extends RecyclerView.LayoutManager {
    public static final int a;
    private static final Rect b;
    private final int c;
    private final int d;
    private final List e;
    private boolean f;
    private tge g;
    private tgl h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private tgn o;

    static {
        int i = thl.a;
        int iFloatToIntBits = Float.floatToIntBits(0.5f);
        if (!thl.b(iFloatToIntBits)) {
            throw new IllegalArgumentException("Float length 0.5 out of range or NaN");
        }
        a = iFloatToIntBits;
        b = new Rect();
    }

    public FlowLayoutManager() {
        int i = a;
        this.c = i;
        this.d = i;
        this.e = new ArrayList();
        this.j = -1;
        this.k = Integer.MIN_VALUE;
        this.o = null;
    }

    private final int a(RecyclerView.Recycler recycler, tgm tgmVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        int i7;
        int i8;
        int i9;
        int iC = tgmVar.c();
        if (iC < i) {
            if (s(recycler, iC, i3, null, i4, 0, i5, tgmVar.f == iC, z, i6)) {
                tge tgeVar = this.g;
                if (tgeVar.f.p == 0) {
                    tgg tggVarA = tgeVar.a();
                    tgf tgfVar = (tgf) tgf.a.a();
                    if (tgfVar == null) {
                        tgfVar = new tgf();
                    }
                    tgfVar.f = iC;
                    tgfVar.e = i5;
                    tgfVar.b = i4;
                    tgfVar.d(tggVarA);
                    tgf tgfVar2 = tgfVar;
                    int iD = d(recycler, tgfVar2, i, i3, z, i6);
                    tgmVar.f(tgfVar2);
                    return iD;
                }
                tgg tggVarA2 = tgeVar.a();
                tgh tghVar = this.g.f;
                tgk tgkVar = (tgk) tgk.a.a();
                if (tgkVar == null) {
                    tgkVar = new tgk();
                }
                tgkVar.f = iC;
                tgkVar.e = i5;
                if (!tggVarA2.o) {
                    throw new IllegalArgumentException("creator not measured");
                }
                int i10 = tghVar.p;
                boolean z2 = (i10 & 4) != 0;
                boolean z3 = (i10 & 2) != 0;
                int i11 = i10 & 1;
                if (!z2 && !z3 && i11 == 0) {
                    throw new IllegalArgumentException("Unknown flow value: 0x".concat(String.valueOf(Integer.toHexString(i10))));
                }
                tgkVar.b = tggVarA2;
                tgkVar.c = tghVar.c == -4;
                if (z2) {
                    i7 = 0;
                } else {
                    tgg tggVar = tgkVar.b;
                    i7 = tggVar.g + tggVar.l + tggVar.h;
                }
                int iJ = tgh.j("layout_flmFlowInsetStart", tghVar.r, tgkVar.b.d, false);
                int iJ2 = tgh.j("layout_flmFlowInsetEnd", tghVar.s, tgkVar.b.d, false);
                if ((z3 || z2) && thl.b(tghVar.r) && (i8 = tgkVar.b.b) != 0 && (i9 = tgkVar.e) < i8) {
                    iJ += i8 - i9;
                }
                int iJ3 = tgh.j("layout_flmFlowWidth", tghVar.u, tgkVar.b.d, true);
                tgkVar.d = iJ3;
                if (iJ3 < 0) {
                    iJ3 = Math.max(0, ((i4 - i7) - iJ) - iJ2);
                    tgkVar.d = iJ3;
                }
                if (z3) {
                    int i12 = i4 - i7;
                    tgg tggVar2 = tgkVar.b;
                    tggVar2.g = (i4 - tggVar2.h) - tggVar2.l;
                    tgkVar.j = (i12 - iJ2) - iJ3;
                } else {
                    tgkVar.j = i7 + iJ;
                }
                tgkVar.k = tghVar.e(tgkVar.b.d);
                tgkVar.l = tghVar.d(tgkVar.b.d);
                int iC2 = tghVar.c(tgkVar.b.d);
                tgkVar.i = iC2;
                if (iC2 < 0) {
                    tgkVar.i = Math.max(0, (tgkVar.b.m - tgkVar.k) - tgkVar.l);
                }
                tgk tgkVar2 = tgkVar;
                int iE = e(recycler, tgkVar2, i, i2, i3);
                tgmVar.f(tgkVar2);
                return iE;
            }
        } else if (iC > i) {
            throw new IllegalArgumentException("p@[" + tgmVar.f + "," + iC + ") should not cover nextSectionStart@" + i);
        }
        return iC;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int b(android.support.v7.widget.RecyclerView.Recycler r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            java.util.List r0 = r11.e
            java.lang.Object r1 = r0.get(r13)
            tgm r1 = (defpackage.tgm) r1
            r11.r()
            r6 = r14
            r4 = r1
            r1 = r13
        Le:
            if (r6 <= 0) goto L9e
            int r9 = r1 + 1
            int r2 = r0.size()     // Catch: java.lang.RuntimeException -> L55
            if (r9 != r2) goto L1b
            r2 = 0
        L19:
            r10 = r2
            goto L22
        L1b:
            java.lang.Object r2 = r0.get(r9)     // Catch: java.lang.RuntimeException -> L55
            tgm r2 = (defpackage.tgm) r2     // Catch: java.lang.RuntimeException -> L55
            goto L19
        L22:
            if (r10 != 0) goto L26
            r7 = r15
            goto L29
        L26:
            int r2 = r10.f     // Catch: java.lang.RuntimeException -> L55
            r7 = r2
        L29:
            r5 = -1
            r2 = r11
            r3 = r12
            r8 = r15
            r2.m(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L52
            tge r12 = r2.g     // Catch: java.lang.RuntimeException -> L52
            int r15 = r12.a     // Catch: java.lang.RuntimeException -> L52
            int r6 = r6 - r15
            int r12 = r12.b     // Catch: java.lang.RuntimeException -> L52
            r15 = -1
            if (r12 == r15) goto L46
            tgm r4 = defpackage.tgm.e(r12)     // Catch: java.lang.RuntimeException -> L52
            r0.add(r9, r4)     // Catch: java.lang.RuntimeException -> L42
            goto L4d
        L42:
            r0 = move-exception
            r12 = r0
            r1 = r9
            goto L59
        L46:
            int r12 = r4.c()     // Catch: java.lang.RuntimeException -> L52
            if (r12 == r8) goto L51
            r4 = r10
        L4d:
            r12 = r3
            r15 = r8
            r1 = r9
            goto Le
        L51:
            return r6
        L52:
            r0 = move-exception
        L53:
            r12 = r0
            goto L59
        L55:
            r0 = move-exception
            r2 = r11
            r8 = r15
            goto L53
        L59:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "fillDownForHeight() states at exception:\n\t startSectionIndex="
            r15.<init>(r0)
            r15.append(r13)
            java.lang.String r13 = "\n\t height="
            r15.append(r13)
            r15.append(r14)
            java.lang.String r13 = "\n\t totalItemCount="
            r15.append(r13)
            r15.append(r8)
            java.lang.String r13 = "\n\t remainingHeight="
            r15.append(r13)
            r15.append(r6)
            java.lang.String r13 = "\n\t lastSectionIndex="
            r15.append(r13)
            r15.append(r1)
            java.lang.String r13 = "\n\t lastSection="
            r15.append(r13)
            if (r4 != 0) goto L90
            java.lang.String r13 = "null"
            r15.append(r13)
            goto L93
        L90:
            r4.n(r15)
        L93:
            java.lang.String r13 = "\n\t mFillState="
            r15.append(r13)
            tge r13 = r2.g
            r15.append(r13)
            throw r12
        L9e:
            r2 = r11
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.layout.FlowLayoutManager.b(android.support.v7.widget.RecyclerView$Recycler, int, int, int):int");
    }

    private final int c(RecyclerView.Recycler recycler, tgi tgiVar, int i, int i2, int i3, boolean z, int i4) {
        return tgiVar instanceof tgf ? d(recycler, (tgf) tgiVar, i, i3, z, i4) : e(recycler, (tgk) tgiVar, i, i2, i3);
    }

    private final int d(RecyclerView.Recycler recycler, tgf tgfVar, int i, int i2, boolean z, int i3) {
        List list = tgfVar.d;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Line must not be empty");
        }
        int iC = tgfVar.c();
        while (iC < i) {
            int i4 = tgfVar.b;
            int i5 = tgfVar.c;
            if (i4 - i5 <= 1 || !s(recycler, iC, i2, list, i4, i5, tgfVar.e, false, z, i3)) {
                break;
            }
            tgfVar.d(this.g.a());
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
    private final int e(android.support.v7.widget.RecyclerView.Recycler r13, defpackage.tgk r14, int r15, int r16, int r17) {
        /*
            r12 = this;
            tgg r0 = r14.b
            if (r0 == 0) goto L8d
            int r10 = r14.c()
            tgm r8 = r14.m
            if (r8 != 0) goto L3b
            int r0 = r14.d
            if (r0 == 0) goto L3a
            int r0 = r14.i
            if (r0 != 0) goto L15
            goto L3a
        L15:
            tgm r2 = defpackage.tgm.e(r10)
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
            int r6 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r2.f
            if (r6 != r0) goto L37
            r2.o()
            return r6
        L37:
            r14.m = r2
            goto L83
        L3a:
            return r10
        L3b:
            r4 = r16
            int r0 = r8.j(r4)
            tgi r2 = r8.d()
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
            int r6 = r0.c(r1, r2, r3, r4, r5, r6, r7)
            if (r6 <= r10) goto L5d
            r8.l()
        L5d:
            r11 = r6
            r2 = r8
        L5f:
            int r0 = r14.i
            int r1 = r2.j(r4)
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
            int r6 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r6 > r11) goto L81
            if (r6 <= r10) goto L80
            r14.l()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.layout.FlowLayoutManager.e(android.support.v7.widget.RecyclerView$Recycler, tgk, int, int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[Catch: RuntimeException -> 0x009f, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x009f, blocks: (B:36:0x007a, B:39:0x0089), top: B:53:0x007a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int f(android.support.v7.widget.RecyclerView.Recycler r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            r0 = -1
            if (r11 != r0) goto L5
            r1 = 0
            goto Ld
        L5:
            java.util.List r1 = r9.e
            java.lang.Object r1 = r1.get(r11)
            tgm r1 = (defpackage.tgm) r1
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
            tgm r6 = (defpackage.tgm) r6
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
            if (r2 > r12) goto La8
            r3 = r0
            r6 = r3
            r0 = r12
        L4e:
            if (r0 < r2) goto L79
            int r6 = r9.h(r10, r0, r3, r6)
            android.view.View r3 = r9.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            tgh r3 = (defpackage.tgh) r3
            boolean r3 = r3.i()
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
            tgm r1 = defpackage.tgm.e(r0)
            r5.add(r4, r1)
            if (r0 != 0) goto L78
            r9.f = r3
        L78:
            r11 = r4
        L79:
            r3 = r1
            r9.r()     // Catch: java.lang.RuntimeException -> L9f
            int r0 = r11 + 1
            java.util.List r1 = r9.e     // Catch: java.lang.RuntimeException -> L9f
            int r2 = r1.size()     // Catch: java.lang.RuntimeException -> L9f
            if (r0 != r2) goto L89
            r6 = r13
            goto L92
        L89:
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.RuntimeException -> L9f
            tgm r0 = (defpackage.tgm) r0     // Catch: java.lang.RuntimeException -> L9f
            int r0 = r0.f     // Catch: java.lang.RuntimeException -> L9f
            r6 = r0
        L92:
            r5 = 0
            r1 = r9
            r2 = r10
            r4 = r12
            r7 = r13
            r1.m(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L9c
            r10 = r1
            return r11
        L9c:
            r0 = move-exception
            r10 = r1
            goto La1
        L9f:
            r0 = move-exception
            r10 = r9
        La1:
            r11 = r0
            tge r12 = r10.g
            java.lang.String.valueOf(r12)
            throw r11
        La8:
            r10 = r9
            r7 = r13
            r1.j(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.layout.FlowLayoutManager.f(android.support.v7.widget.RecyclerView$Recycler, int, int, int):int");
    }

    private final int g(int i) {
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

    private final int h(RecyclerView.Recycler recycler, int i, int i2, int i3) {
        int iG;
        int i4;
        boolean z;
        int i5 = i - i2;
        if (i5 != -1) {
            iG = i5 != 0 ? i5 != 1 ? -1 : i3 + 1 : i3;
            i4 = iG;
        } else {
            iG = i3 - 1;
            i4 = i3;
        }
        if (iG >= 0 && iG < getChildCount()) {
            int position = getPosition(getChildAt(iG));
            if (position == i) {
                return iG;
            }
            if ((iG == i4) != (position > i)) {
                throw new IllegalArgumentException("Wrong hint precondition.\n\t position=" + i + "\n\t positionHint=" + i2 + "\n\t indexHint=" + i3 + "\n\t potentialIndex=" + iG + "\n\t insertIndex=" + i4 + "\n\t realChildPosition(potentialIndex)=" + position);
            }
        }
        if (i4 < 0) {
            iG = g(i);
            if (iG >= 0) {
                return iG;
            }
            i4 = ~iG;
            z = true;
        } else {
            z = false;
        }
        View viewForPosition = recycler.getViewForPosition(i);
        try {
            int position2 = getPosition(viewForPosition);
            if (position2 != i) {
                throw new IllegalStateException(a.ce(position2, i, "Recycler.getViewForPosition(", ") returned a view @"));
            }
            addView(viewForPosition, i4);
            int iMax = Math.max(0, i4 - 1);
            View childAt = getChildAt(iMax);
            int position3 = getPosition(childAt);
            String strH = ((tgh) childAt.getLayoutParams()).h();
            int i6 = iMax + 1;
            int iMin = Math.min(i4 + 1, getChildCount() - 1);
            while (i6 <= iMin) {
                View childAt2 = getChildAt(i6);
                int i7 = iMin;
                int position4 = getPosition(childAt2);
                String strH2 = ((tgh) childAt2.getLayoutParams()).h();
                if (position4 <= position3) {
                    StringBuilder sb = new StringBuilder("Index/position monotonicity broken!\n\t position=");
                    sb.append(i);
                    sb.append("\n\t positionHint=");
                    sb.append(i2);
                    sb.append("\n\t indexHint=");
                    sb.append(i3);
                    sb.append("\n\t potentialIndex=");
                    sb.append(iG);
                    sb.append("\n\t insertIndex=");
                    sb.append(i4);
                    sb.append("\n\t usedBinarySearch=");
                    sb.append(z);
                    sb.append("\n\t p(childAt(");
                    sb.append(i6 - 1);
                    sb.append("))=");
                    sb.append(position3);
                    sb.append("\n\t   viewHolderDump=");
                    sb.append(strH);
                    sb.append("\n\t p(childAt(");
                    sb.append(i6);
                    sb.append("))=");
                    sb.append(position4);
                    sb.append("\n\t   viewHolderDump=");
                    sb.append(strH2);
                    throw new IllegalStateException(sb.toString());
                }
                i6++;
                position3 = position4;
                strH = strH2;
                iMin = i7;
            }
            return i4;
        } catch (RuntimeException e) {
            tgh tghVar = (tgh) viewForPosition.getLayoutParams();
            if (tghVar != null) {
                tghVar.h();
            }
            throw e;
        }
    }

    private final int i(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        FlowLayoutManager flowLayoutManager;
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        RecyclerView.Recycler recycler2;
        int i14;
        FlowLayoutManager flowLayoutManager2 = this;
        RecyclerView.Recycler recycler3 = recycler;
        int i15 = i;
        try {
            int itemCount = state.getItemCount();
            if (itemCount == 0) {
                removeAndRecycleAllViews(recycler);
                flowLayoutManager2.p();
                return 0;
            }
            boolean z2 = i15 >= 0 && i15 < itemCount;
            int paddingTop = flowLayoutManager2.getPaddingTop();
            int iMax2 = Math.max(paddingTop, flowLayoutManager2.getHeight() - flowLayoutManager2.getPaddingBottom());
            if (z2) {
                int iIntBitsToFloat = flowLayoutManager2.c;
                if (!thl.c(iIntBitsToFloat)) {
                    iIntBitsToFloat = (int) (((iMax2 - paddingTop) * Float.intBitsToFloat(iIntBitsToFloat)) + 0.5f);
                }
                i4 = paddingTop - iIntBitsToFloat;
            } else {
                i4 = paddingTop;
            }
            int i16 = flowLayoutManager2.d;
            int iIntBitsToFloat2 = thl.c(i16) ? i16 + iMax2 : iMax2 + ((int) (((iMax2 - paddingTop) * Float.intBitsToFloat(i16)) + 0.5f));
            if (state.didStructureChange()) {
                detachAndScrapAttachedViews(recycler);
            }
            for (int childCount = flowLayoutManager2.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = flowLayoutManager2.getChildAt(childCount);
                if (((tgh) childAt.getLayoutParams()).viewNeedsUpdate()) {
                    flowLayoutManager2.detachAndScrapView(childAt, recycler3);
                }
            }
            Integer numValueOf = Integer.valueOf(flowLayoutManager2.getWidth());
            Integer numValueOf2 = Integer.valueOf(flowLayoutManager2.getPaddingStart());
            Integer numValueOf3 = Integer.valueOf(flowLayoutManager2.getPaddingEnd());
            int i17 = -1;
            if (!numValueOf.equals(state.get(R.id.flm_width)) || !numValueOf2.equals(state.get(R.id.flm_paddingStart)) || !numValueOf3.equals(state.get(R.id.flm_paddingEnd))) {
                flowLayoutManager2.p();
                state.put(R.id.flm_width, numValueOf);
                state.put(R.id.flm_paddingStart, numValueOf2);
                state.put(R.id.flm_paddingEnd, numValueOf3);
            }
            List list = flowLayoutManager2.e;
            for (int size = list.size() - 1; size >= 0; size--) {
                ((tgm) list.get(size)).i();
            }
            if (true != z2) {
                i15 = 0;
            }
            int size2 = list.size();
            if (size2 == 0 || ((tgm) list.get(0)).f > i15) {
                i5 = -1;
            } else if (((tgm) list.get(size2 - 1)).c() > i15) {
                int i18 = 0;
                while (true) {
                    if (i18 >= size2) {
                        i5 = ~i18;
                        break;
                    }
                    int i19 = (i18 + size2) / 2;
                    tgm tgmVar = (tgm) list.get(i19);
                    if (i15 >= tgmVar.f) {
                        if (i15 < tgmVar.c()) {
                            i5 = i19;
                            break;
                        }
                        i18 = i19 + 1;
                    } else {
                        size2 = i19;
                    }
                }
            } else {
                i5 = ~size2;
            }
            if (i5 < 0) {
                i5 = (~i5) - 1;
            }
            int iF = flowLayoutManager2.f(recycler3, i5, i15, itemCount);
            tgm tgmVar2 = (tgm) list.get(iF);
            int iA = z2 ? i2 - tgmVar2.a(i15) : paddingTop;
            int iB = iIntBitsToFloat2 - flowLayoutManager2.b(recycler3, iF, iIntBitsToFloat2 - iA, itemCount);
            if (z2) {
                iMax = Math.max(0, iMax2 - iB);
                iA += iMax;
                iB += iMax;
            } else {
                iMax = 0;
            }
            int i20 = iA;
            tgm tgmVar3 = tgmVar2;
            int i21 = iF;
            while (true) {
                if (iA <= i4) {
                    i6 = iA;
                    break;
                }
                i6 = iA;
                int i22 = tgmVar3.f;
                if (i22 <= 0) {
                    break;
                }
                int iF2 = flowLayoutManager2.f(recycler3, i21 - 1, i22 - 1, itemCount);
                if (iF2 == i21) {
                    iF++;
                } else {
                    i21 = iF2;
                }
                tgmVar3 = (tgm) list.get(i21);
                iA = i6 - tgmVar3.h;
            }
            if (z2) {
                int iMax3 = Math.max(0, i6 - paddingTop);
                int i23 = i6 - iMax3;
                int i24 = i20 - iMax3;
                iB -= iMax3;
                if (iMax3 <= 0 || iMax != 0) {
                    i8 = iMax;
                    i9 = iMax3;
                    i7 = i23;
                } else {
                    if (iB < iIntBitsToFloat2) {
                        iB = iIntBitsToFloat2 - flowLayoutManager2.b(recycler3, iF, iIntBitsToFloat2 - i24, itemCount);
                    }
                    i9 = iMax3;
                    i7 = i23;
                    i8 = 0;
                }
            } else {
                i7 = i6;
                i8 = iMax;
                i9 = 0;
            }
            int iMin = Math.min(iB, iIntBitsToFloat2);
            boolean z3 = flowLayoutManager2.getLayoutDirection() == 1;
            flowLayoutManager2.l = itemCount << 8;
            flowLayoutManager2.m = 0;
            flowLayoutManager2.n = 0;
            int i25 = i21;
            int i26 = -1;
            while (i7 < iMin && i25 < list.size()) {
                List list2 = ((tgm) list.get(i25)).a;
                int i27 = i7;
                int size3 = list2.size();
                int i28 = i26;
                int i29 = i27;
                int i30 = i25;
                int i31 = i28;
                int i32 = 0;
                while (i29 < iMin && i32 < size3) {
                    int i33 = size3;
                    tgi tgiVar = (tgi) list2.get(i32);
                    int i34 = i29;
                    int i35 = i34 + tgiVar.h;
                    List list3 = list2;
                    int i36 = i17;
                    if (i31 != i36) {
                        i10 = i31;
                        i11 = i36;
                    } else if (i35 > i4) {
                        int iG = flowLayoutManager2.g(tgiVar.f);
                        if (iG < 0) {
                            iG = ~iG;
                        }
                        for (int i37 = iG + i36; i37 >= 0; i37--) {
                            flowLayoutManager2.removeAndRecycleViewAt(i37, recycler3);
                        }
                        i11 = -1;
                        i10 = 0;
                    } else {
                        i11 = -1;
                        i10 = -1;
                    }
                    if (i10 != i11) {
                        i13 = i35;
                        i12 = i30;
                        int iK = flowLayoutManager2.k(i34, tgiVar, i10, recycler3, z3);
                        z = z3;
                        recycler2 = recycler3;
                        flowLayoutManager = flowLayoutManager2;
                        try {
                            int i38 = tgiVar.h + i34;
                            if (i38 <= paddingTop || i34 >= iMax2) {
                                i14 = iK;
                            } else {
                                int iC = tgiVar.c();
                                i14 = iK;
                                int i39 = tgiVar.f;
                                int i40 = (iC - i39) << 8;
                                if (i34 <= paddingTop) {
                                    flowLayoutManager.m = (i39 << 8) + (((paddingTop - i34) * i40) / tgiVar.h);
                                }
                                int iMin2 = Math.min(i38, iMax2) - Math.max(i34, paddingTop);
                                int i41 = tgiVar.h;
                                if (i41 == 0) {
                                    flowLayoutManager.n += i40;
                                } else {
                                    flowLayoutManager.n += (i40 * iMin2) / i41;
                                }
                            }
                            i31 = i14;
                        } catch (RuntimeException e) {
                            e = e;
                            state.getItemCount();
                            state.didStructureChange();
                            List list4 = flowLayoutManager.e;
                            int size4 = list4.size();
                            if (size4 > 0) {
                                StringBuilder sb = new StringBuilder();
                                tgm tgmVar4 = (tgm) list4.get(0);
                                sb.append("  $0@");
                                sb.append(tgmVar4.f);
                                if (tgmVar4.f == 0) {
                                    i3 = 1;
                                    sb.append(true != flowLayoutManager.f ? "(fake)" : "(real)");
                                } else {
                                    i3 = 1;
                                }
                                sb.append(':');
                                tgmVar4.n(sb);
                                while (i3 < size4) {
                                    sb.setLength(0);
                                    tgm tgmVar5 = (tgm) list4.get(i3);
                                    sb.append("  $");
                                    sb.append(i3);
                                    sb.append('@');
                                    sb.append(tgmVar5.f);
                                    sb.append(':');
                                    tgmVar5.n(sb);
                                    i3++;
                                }
                            }
                            int childCount2 = flowLayoutManager.getChildCount();
                            if (childCount2 > 0) {
                                RecyclerView recyclerView = (RecyclerView) flowLayoutManager.getChildAt(0).getParent();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i42 = 0; i42 < childCount2; i42++) {
                                    sb2.append("  #");
                                    sb2.append(i42);
                                    sb2.append('@');
                                    View childAt2 = flowLayoutManager.getChildAt(i42);
                                    sb2.append(flowLayoutManager.getPosition(childAt2));
                                    sb2.append(',');
                                    sb2.append(recyclerView.getChildViewHolder(childAt2));
                                    sb2.setLength(0);
                                }
                            }
                            throw e;
                        }
                    } else {
                        i12 = i30;
                        i13 = i35;
                        z = z3;
                        recycler2 = recycler3;
                        flowLayoutManager = flowLayoutManager2;
                        i31 = i10;
                    }
                    i32++;
                    i30 = i12;
                    flowLayoutManager2 = flowLayoutManager;
                    recycler3 = recycler2;
                    i29 = i13;
                    list2 = list3;
                    z3 = z;
                    i17 = -1;
                    size3 = i33;
                }
                boolean z4 = z3;
                RecyclerView.Recycler recycler4 = recycler3;
                FlowLayoutManager flowLayoutManager3 = flowLayoutManager2;
                int i43 = i29;
                i26 = i31;
                i17 = -1;
                i25 = i30 + 1;
                i7 = i43;
                flowLayoutManager2 = flowLayoutManager3;
                recycler3 = recycler4;
                z3 = z4;
            }
            int i44 = i25;
            RecyclerView.Recycler recycler5 = recycler3;
            flowLayoutManager = flowLayoutManager2;
            for (int childCount3 = flowLayoutManager.getChildCount() - 1; childCount3 >= 0 && childCount3 >= i26; childCount3--) {
                flowLayoutManager.removeAndRecycleViewAt(childCount3, recycler5);
            }
            if (i44 < list.size()) {
                int i45 = ((tgm) list.get(i44)).f + 5;
                for (int size5 = list.size() - 1; size5 >= i44 + 2 && ((tgm) list.get(size5)).f >= i45; size5--) {
                    flowLayoutManager.q(size5);
                }
            }
            int i46 = tgmVar3.f - 5;
            for (int i47 = i21 - 3; i47 >= 0; i47--) {
                if (((tgm) list.get(i47)).f < i46) {
                    flowLayoutManager.q(i47);
                }
            }
            return i8 - i9;
        } catch (RuntimeException e2) {
            e = e2;
            flowLayoutManager = flowLayoutManager2;
        }
    }

    private final int j(int i, int i2, tgg tggVar, int i3, int i4, RecyclerView.Recycler recycler, boolean z, tgk tgkVar) {
        int i5;
        int iH = h(recycler, i3, i3, i4);
        View childAt = getChildAt(iH);
        int decoratedMeasuredHeight = tggVar.m;
        if (tgkVar != null && tgkVar.c && (i5 = tgkVar.n) > 0) {
            o(childAt, tggVar.l, decoratedMeasuredHeight + i5);
            decoratedMeasuredHeight = getDecoratedMeasuredHeight(childAt);
        } else if (!tggVar.o) {
            o(childAt, tggVar.l, decoratedMeasuredHeight);
            tggVar.a(this, childAt, true);
            decoratedMeasuredHeight = tggVar.m;
        }
        int i6 = i + tggVar.p;
        int i7 = i2 + tggVar.g;
        int width = tggVar.l + i7;
        int width2 = z ? getWidth() - width : i7;
        if (z) {
            width = getWidth() - i7;
        }
        layoutDecorated(childAt, width2, i6, width, i6 + decoratedMeasuredHeight);
        if (this.h != null) {
            ((RecyclerView) childAt.getParent()).getChildViewHolder(childAt);
            this.h.a();
        }
        return iH;
    }

    private final int k(int i, tgi tgiVar, int i2, RecyclerView.Recycler recycler, boolean z) {
        int i3 = 0;
        if (tgiVar instanceof tgf) {
            tgf tgfVar = (tgf) tgiVar;
            int paddingStart = getPaddingStart() + tgfVar.e;
            List list = tgfVar.d;
            int size = list.size();
            int iJ = i2;
            int i4 = paddingStart;
            while (i3 < size) {
                tgg tggVar = (tgg) list.get(i3);
                iJ = j(i, i4, tggVar, tgfVar.f + i3, iJ, recycler, z, null) + 1;
                i4 += tggVar.g + tggVar.l + tggVar.h;
                i3++;
            }
            return iJ;
        }
        tgk tgkVar = (tgk) tgiVar;
        int iJ2 = j(i, getPaddingStart() + tgkVar.e, tgkVar.b, tgkVar.f, i2, recycler, z, tgkVar) + 1;
        tgm tgmVar = tgkVar.m;
        int size2 = tgmVar == null ? 0 : tgmVar.a.size();
        int iK = iJ2;
        int i5 = i + tgkVar.b.p + tgkVar.k;
        while (i3 < size2) {
            tgi tgiVar2 = (tgi) tgkVar.m.a.get(i3);
            iK = k(i5, tgiVar2, iK, recycler, z);
            i5 += tgiVar2.h;
            i3++;
        }
        return iK;
    }

    private final View l() {
        int height = getHeight();
        int childCount = getChildCount();
        int i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (!((tgh) childAt.getLayoutParams()).isItemRemoved()) {
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

    private final void m(RecyclerView.Recycler recycler, tgm tgmVar, int i, int i2, int i3, int i4) {
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
        if (tgmVar.f >= i6) {
            throw new IllegalArgumentException("Section started after limit");
        }
        if (i5 >= i6 || i6 > i4) {
            throw new IllegalArgumentException("positionToCover < nextSectionStart <= totalItemCount does not hold");
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        tge tgeVar = this.g;
        tgeVar.b = -1;
        tgeVar.a = tgmVar.j(i4);
        int i7 = tgmVar.f;
        tgi tgiVarD = tgmVar.d();
        if (tgiVarD != null) {
            tge tgeVar2 = this.g;
            int i8 = tgeVar2.a - tgiVarD.h;
            tgeVar2.a = i8;
            if (tgiVarD.f > i5 && i8 >= i2) {
                return;
            }
            int iC = tgiVarD.c();
            int iC2 = c(recycler, tgiVarD, i6, i4, width, false, -1);
            if (iC2 != iC) {
                tgmVar.l();
            }
            this.g.a = tgmVar.j(i4);
            i7 = iC2;
        }
        while (true) {
            if ((i7 > i5 && this.g.a >= i2) || this.g.b != -1 || i7 >= i6) {
                break;
            }
            int iA = a(recycler, tgmVar, i6, i4, width, width, 0, false, -1);
            this.g.a = tgmVar.j(i4);
            i6 = i3;
            i7 = iA;
        }
        tge tgeVar3 = this.g;
        if (tgeVar3.b == -1 || i7 <= i5 || tgeVar3.a < i2) {
            return;
        }
        tgeVar3.b = -1;
    }

    private final void n(int i, int i2, int i3) {
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
            tgm tgmVar = (tgm) list.get(size);
            int i5 = tgmVar.f;
            if (i5 < i2 || (i5 <= 0 && !this.f)) {
                break;
            } else {
                tgmVar.m(i3);
            }
        }
        i4 = size + 1;
        while (true) {
            i4--;
            if (i4 < 0 || ((tgm) list.get(i4)).k(i) != 2) {
                return;
            } else {
                q(i4);
            }
        }
    }

    private final void o(View view, int i, int i2) {
        Rect rect = b;
        calculateItemDecorationsForChild(view, rect);
        view.measure(View.MeasureSpec.makeMeasureSpec((i - rect.left) - rect.right, 1073741824), View.MeasureSpec.makeMeasureSpec((i2 - rect.top) - rect.bottom, 1073741824));
    }

    private final void p() {
        List list = this.e;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                list.clear();
                return;
            }
            ((tgm) list.get(size)).o();
        }
    }

    private final void q(int i) {
        ((tgm) this.e.remove(i)).o();
        if (i == 0) {
            this.f = true;
        }
    }

    private final void r() {
        if (this.g == null) {
            this.g = new tge();
        }
        tge tgeVar = this.g;
        tgeVar.a = 0;
        tgeVar.b = -1;
        tgeVar.d = -1;
        tgeVar.e = -1;
        tgeVar.f = null;
        tgg tggVar = tgeVar.c;
        if (tggVar != null) {
            tggVar.b();
            tgeVar.c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean s(android.support.v7.widget.RecyclerView.Recycler r18, int r19, int r20, java.util.List r21, int r22, int r23, int r24, boolean r25, boolean r26, int r27) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.layout.FlowLayoutManager.s(android.support.v7.widget.RecyclerView$Recycler, int, int, java.util.List, int, int, int, boolean, boolean, int):boolean");
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof tgh;
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
        int iG = g(i);
        if (iG < 0) {
            return null;
        }
        return getChildAt(iG);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final /* synthetic */ RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new tgh();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final /* synthetic */ RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new tgh(context, attributeSet);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void measureChild(View view, int i, int i2) {
        if (view.getLayoutParams() instanceof tgh) {
            throw new UnsupportedOperationException("Views using FlowLayoutManager.LayoutParams should not be measured with measureChild()");
        }
        super.measureChild(view, i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View view, int i, int i2) {
        if (view.getLayoutParams() instanceof tgh) {
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
        if (adapter2 instanceof tgd) {
            this.h = (tgd) adapter2;
            this.i = true;
        }
        p();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        p();
        super.onDetachedFromWindow(recyclerView, recycler);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityEvent accessibilityEvent) {
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
                viewAdapterPosition = ((tgh) childAt.getLayoutParams()).getViewAdapterPosition();
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
                viewAdapterPosition2 = ((tgh) childAt2.getLayoutParams()).getViewAdapterPosition();
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
        n(i, i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        p();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        n(Math.min(i, i2), Math.max(i + i3, i2 + i3), 0);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        n(i, i + i2, -i2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int decoratedTop;
        tgn tgnVar = this.o;
        if (tgnVar != null) {
            this.j = tgnVar.a;
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
            View viewL = l();
            if (viewL != null) {
                position = getPosition(viewL);
                decoratedTop = getDecoratedTop(viewL);
            } else {
                decoratedTop = 0;
            }
        }
        i(recycler, state, position, decoratedTop);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof tgn) {
            this.o = (tgn) parcelable;
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        tgn tgnVar = this.o;
        if (tgnVar != null) {
            return new tgn(tgnVar);
        }
        tgn tgnVar2 = new tgn();
        View viewL = l();
        if (viewL == null) {
            tgnVar2.a = -1;
            tgnVar2.b = 0.0f;
            return tgnVar2;
        }
        tgnVar2.a = getPosition(viewL);
        tgnVar2.b = getDecoratedTop(viewL) / getHeight();
        return tgnVar2;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.j = i;
        this.k = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View viewL = l();
        if (viewL == null) {
            return 0;
        }
        return i - i(recycler, state, getPosition(viewL), getDecoratedTop(viewL) - i);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        tgc tgcVar = new tgc(this, recyclerView.getContext());
        tgcVar.setTargetPosition(i);
        startSmoothScroll(tgcVar);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final /* bridge */ /* synthetic */ RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof tgh ? new tgh((tgh) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new tgh((ViewGroup.MarginLayoutParams) layoutParams) : new tgh(layoutParams);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
    }
}
