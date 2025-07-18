package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buv extends cxj implements Runnable, View.OnAttachStateChangeListener, cvq {
    private boolean a;
    private int d;
    private cyh e;
    private final ki f;
    private final bje g;
    private final bdn h;
    private final kc i;

    public buv() {
        super(1);
        ki kiVar = new ki(9);
        bup bupVar = buw.a;
        kiVar.j(buw.c, new bxc());
        kiVar.j(buw.a, new bxc());
        kiVar.j(buw.d, new bxc());
        kiVar.j(buw.e, new bxc());
        kiVar.j(buw.f, new bxc());
        kiVar.j(buw.g, new bxc());
        kiVar.j(buw.h, new bxc());
        kiVar.j(buw.i, new bxc());
        kiVar.j(buw.b, new bxc());
        this.f = kiVar;
        this.h = new bcf(0);
        this.i = new kc(4);
        this.g = new bje();
    }

    private final void e(cyh cyhVar) {
        long j;
        long j2;
        char c;
        char c2;
        char c3;
        char c4;
        long j3;
        char c5;
        long[] jArr;
        int[] iArr;
        int i;
        long[] jArr2;
        int i2;
        int i3;
        char c6;
        long j4;
        int[] iArr2;
        bdn bdnVar = this.h;
        bdnVar.h(bdnVar.e() + 1);
        jc jcVar = bux.b;
        int[] iArr3 = jcVar.b;
        Object[] objArr = jcVar.c;
        long[] jArr3 = jcVar.a;
        int length = jArr3.length - 2;
        long j5 = -9187201950435737472L;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            char c7 = 7;
            j2 = 255;
            c = 16;
            while (true) {
                long j6 = jArr3[i5];
                c2 = ' ';
                c3 = '0';
                if ((((~j6) << c7) & j6 & j5) != j5) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j6 & 255) < 128) {
                            int i8 = (i5 << 3) + i7;
                            c6 = c7;
                            int i9 = iArr3[i8];
                            j4 = j5;
                            bwl bwlVar = (bwl) objArr[i8];
                            i3 = i5;
                            long j7 = r9.b << 48;
                            i2 = i4;
                            long j8 = r9.c << 32;
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j9 = r9.d << 16;
                            int i10 = cyhVar.f(i9).e;
                            Object objA = this.f.a(bwlVar);
                            objA.getClass();
                            ((bxc) objA).c = j9 | j7 | j8 | i10;
                        } else {
                            jArr2 = jArr3;
                            i2 = i4;
                            i3 = i5;
                            c6 = c7;
                            j4 = j5;
                            iArr2 = iArr3;
                        }
                        j6 >>= i2;
                        i7++;
                        iArr3 = iArr2;
                        c7 = c6;
                        j5 = j4;
                        i5 = i3;
                        i4 = i2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    int i11 = i5;
                    c4 = c7;
                    j = j5;
                    iArr = iArr3;
                    if (i6 != i4) {
                        break;
                    } else {
                        i = i11;
                    }
                } else {
                    jArr = jArr3;
                    c4 = c7;
                    j = j5;
                    iArr = iArr3;
                    i = i5;
                }
                if (i == length) {
                    break;
                }
                i5 = i + 1;
                iArr3 = iArr;
                c7 = c4;
                j5 = j;
                jArr3 = jArr;
                i4 = 8;
            }
        } else {
            j = -9187201950435737472L;
            j2 = 255;
            c = 16;
            c2 = ' ';
            c3 = '0';
            c4 = 7;
        }
        jc jcVar2 = bux.c;
        int[] iArr4 = jcVar2.b;
        Object[] objArr2 = jcVar2.c;
        long[] jArr4 = jcVar2.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i12 = 0;
            while (true) {
                long j10 = jArr4[i12];
                if ((((~j10) << c4) & j10 & j) != j) {
                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j10 & j2) < 128) {
                            int i15 = (i12 << 3) + i14;
                            int i16 = iArr4[i15];
                            Object objA2 = this.f.a((buu) objArr2[i15]);
                            objA2.getClass();
                            bxc bxcVar = (bxc) objA2;
                            c5 = '\b';
                            if (i16 != 8) {
                                cyhVar.g(i16);
                            }
                            bxcVar.a.b(Boolean.valueOf(cyhVar.v(i16)));
                        } else {
                            c5 = '\b';
                        }
                        j10 >>= c5;
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length2) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        cvb cvbVarJ = cyhVar.j();
        if (cvbVarJ == null) {
            j3 = 0;
        } else {
            csr csrVarE = cvbVarJ.e();
            j3 = (csrVarE.b << c3) | (csrVarE.c << c2) | (csrVarE.d << c) | csrVarE.e;
        }
        ki kiVar = this.f;
        bup bupVar = buw.a;
        Object objA3 = kiVar.a(buw.b);
        objA3.getClass();
        ((bxc) objA3).c = j3;
        long jB = cvbVarJ != null ? (cvbVarJ.b() << c3) | (cvbVarJ.d() << c2) | (cvbVarJ.c() << c) | cvbVarJ.a() : 0L;
        Object objA4 = kiVar.a(buw.a);
        objA4.getClass();
        ((bxc) objA4).c = jB;
        if (cvbVarJ == null) {
            kc kcVar = this.i;
            if (kcVar.b > 0) {
                kcVar.k();
                this.g.clear();
            }
        } else {
            List boundingRects = Build.VERSION.SDK_INT >= 28 ? cvbVarJ.a.getBoundingRects() : Collections.EMPTY_LIST;
            kc kcVar2 = this.i;
            if (boundingRects.size() < kcVar2.b) {
                kcVar2.l(boundingRects.size(), kcVar2.b);
                bje bjeVar = this.g;
                bjeVar.e(boundingRects.size(), bjeVar.a());
            } else {
                int size = boundingRects.size() - kcVar2.b;
                for (int i17 = 0; i17 < size; i17++) {
                    kcVar2.p(new bci(boundingRects.get(kcVar2.b), bcz.c));
                    this.g.add(new bwm("display cutout rect " + kcVar2.b, 0));
                }
            }
            int size2 = boundingRects.size();
            for (int i18 = 0; i18 < size2; i18++) {
                ((bcb) kcVar2.c(i18)).b((Rect) boundingRects.get(i18));
            }
        }
        bcm.A();
    }

    private static final void f(bxc bxcVar, nxb nxbVar) {
        bxcVar.f(((cxq) nxbVar.a).m());
        bxcVar.d(((cxq) nxbVar.a).i());
        bxcVar.a(nxbVar.m());
        bxcVar.e(nxbVar.n());
        bxcVar.c(nxbVar.p());
    }

    @Override // defpackage.cxj
    public final cyh a(cyh cyhVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nxb nxbVar = (nxb) list.get(i);
            int iO = nxbVar.o();
            buu buuVar = (buu) bux.c.a(iO);
            if (buuVar != null) {
                Object objA = this.f.a(buuVar);
                objA.getClass();
                bxc bxcVar = (bxc) objA;
                if (((Boolean) bxcVar.b.a()).booleanValue()) {
                    f(bxcVar, nxbVar);
                    csr csrVarF = cyhVar.f(iO);
                    int i2 = csrVarF.b;
                    long j = csrVarF.c;
                    bxcVar.c = csrVarF.e | (csrVarF.d << 16) | (i2 << 48) | (j << 32);
                }
            }
        }
        e(cyhVar);
        return cyhVar;
    }

    @Override // defpackage.cxj
    public final cxi b(nxb nxbVar, cxi cxiVar) {
        cyh cyhVar = this.e;
        this.a = false;
        this.e = null;
        if (nxbVar.p() > 0 && cyhVar != null) {
            int iO = nxbVar.o();
            this.d |= iO;
            buu buuVar = (buu) bux.c.a(iO);
            if (buuVar != null) {
                Object objA = this.f.a(buuVar);
                objA.getClass();
                bxc bxcVar = (bxc) objA;
                csr csrVarF = cyhVar.f(iO);
                int i = csrVarF.b;
                int i2 = csrVarF.c;
                int i3 = csrVarF.d;
                long j = i2;
                if (!a.s(csrVarF.e | (i3 << 16) | (i << 48) | (j << 32), bxcVar.c)) {
                    bxcVar.b(true);
                    f(bxcVar, nxbVar);
                    bdn bdnVar = this.h;
                    bdnVar.h(bdnVar.e() + 1);
                    bcm.A();
                }
            }
        }
        return cxiVar;
    }

    @Override // defpackage.cxj
    public final void c(nxb nxbVar) {
        this.a = false;
        int iO = nxbVar.o();
        this.d = (~iO) & this.d;
        this.e = null;
        buu buuVar = (buu) bux.c.a(iO);
        if (buuVar != null) {
            Object objA = this.f.a(buuVar);
            objA.getClass();
            bxc bxcVar = (bxc) objA;
            bxcVar.f(null);
            bxcVar.d(0.0f);
            bxcVar.e(0.0f);
            bxcVar.a(1.0f);
            bxcVar.c(0L);
            bxcVar.d(0.0f);
            bxcVar.e(0.0f);
            bxcVar.f(null);
            bxcVar.b(false);
            bdn bdnVar = this.h;
            bdnVar.h(bdnVar.e() + 1);
            bcm.A();
        }
    }

    @Override // defpackage.cxj
    public final void d(nxb nxbVar) {
        this.a = true;
    }

    @Override // defpackage.cvq
    public final cyh onApplyWindowInsets(View view, cyh cyhVar) {
        if (this.a) {
            this.e = cyhVar;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return cyhVar;
            }
        } else if (this.d == 0) {
            e(cyhVar);
        }
        return cyhVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int[] iArr = cww.a;
        cwm.l(view, this);
        nxb.q(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int[] iArr = cww.a;
        cwm.l(view, null);
        nxb.q(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            this.d = 0;
            this.a = false;
            cyh cyhVar = this.e;
            if (cyhVar != null) {
                e(cyhVar);
                this.e = null;
            }
        }
    }
}
