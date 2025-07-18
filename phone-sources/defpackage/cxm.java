package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxm implements View.OnApplyWindowInsetsListener {
    final cxj a;
    private cyh b;

    public cxm(View view, cxj cxjVar) {
        cyh cyhVarA;
        this.a = cxjVar;
        int[] iArr = cww.a;
        cyh cyhVarA2 = cwn.a(view);
        if (cyhVarA2 != null) {
            cyhVarA = (Build.VERSION.SDK_INT >= 34 ? new cxv(cyhVarA2) : Build.VERSION.SDK_INT >= 31 ? new cxu(cyhVarA2) : Build.VERSION.SDK_INT >= 30 ? new cxt(cyhVarA2) : Build.VERSION.SDK_INT >= 29 ? new cxs(cyhVarA2) : new cxr(cyhVarA2)).a();
        } else {
            cyhVarA = null;
        }
        this.b = cyhVarA;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.b = cyh.p(windowInsets, view);
            return cxn.a(view, windowInsets);
        }
        cyh cyhVarP = cyh.p(windowInsets, view);
        if (this.b == null) {
            int[] iArr = cww.a;
            this.b = cwn.a(view);
        }
        if (this.b == null) {
            this.b = cyhVarP;
            return cxn.a(view, windowInsets);
        }
        cxj cxjVarB = cxn.b(view);
        if (cxjVarB != null && Objects.equals(cxjVarB.b, cyhVarP)) {
            return cxn.a(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        cyh cyhVar = this.b;
        for (int i = 1; i <= 512; i += i) {
            csr csrVarF = cyhVarP.f(i);
            csr csrVarF2 = cyhVar.f(i);
            int i2 = csrVarF.b;
            int i3 = csrVarF2.b;
            boolean z = i2 > i3 || csrVarF.c > csrVarF2.c || csrVarF.d > csrVarF2.d || csrVarF.e > csrVarF2.e;
            if (z != (i2 < i3 || csrVarF.c < csrVarF2.c || csrVarF.d < csrVarF2.d || csrVarF.e < csrVarF2.e)) {
                if (z) {
                    iArr2[0] = iArr2[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
        }
        int i4 = iArr2[0];
        int i5 = iArr3[0];
        int i6 = i4 | i5;
        if (i6 == 0) {
            this.b = cyhVarP;
            return cxn.a(view, windowInsets);
        }
        cyh cyhVar2 = this.b;
        nxb nxbVar = new nxb(i6, (i4 & 8) != 0 ? cxn.a : (i5 & 8) != 0 ? cxn.b : (i4 & 519) != 0 ? cxn.c : (i5 & 519) != 0 ? cxn.d : null, (i6 & 8) != 0 ? 160L : 250L);
        nxbVar.r(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(nxbVar.p());
        csr csrVarF3 = cyhVarP.f(i6);
        csr csrVarF4 = cyhVar2.f(i6);
        int i7 = csrVarF3.b;
        int i8 = csrVarF4.b;
        int i9 = csrVarF3.c;
        int i10 = csrVarF4.c;
        int i11 = csrVarF3.d;
        int i12 = csrVarF4.d;
        int i13 = csrVarF3.e;
        int i14 = csrVarF4.e;
        cxi cxiVar = new cxi(csr.e(Math.min(i7, i8), Math.min(i9, i10), Math.min(i11, i12), Math.min(i13, i14)), csr.e(Math.max(i7, i8), Math.max(i9, i10), Math.max(i11, i12), Math.max(i13, i14)));
        cxn.e(view, nxbVar, cyhVarP, false);
        duration.addUpdateListener(new cxk(nxbVar, cyhVarP, cyhVar2, i6, view));
        duration.addListener(new cxl(nxbVar, view));
        cvs.b(view, new ejr(view, nxbVar, cxiVar, duration, 1));
        this.b = cyhVarP;
        return cxn.a(view, windowInsets);
    }
}
