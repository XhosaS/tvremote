package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rk implements View.OnApplyWindowInsetsListener {
    final rg a;
    private sf b;

    public rk(View view, rg rgVar) {
        sf sfVarA;
        this.a = rgVar;
        int[] iArr = qv.a;
        sf sfVarA2 = qn.a(view);
        if (sfVarA2 != null) {
            sfVarA = (Build.VERSION.SDK_INT >= 34 ? new rt(sfVarA2) : Build.VERSION.SDK_INT >= 31 ? new rs(sfVarA2) : Build.VERSION.SDK_INT >= 30 ? new rr(sfVarA2) : Build.VERSION.SDK_INT >= 29 ? new rq(sfVarA2) : new rp(sfVarA2)).a();
        } else {
            sfVarA = null;
        }
        this.b = sfVarA;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.b = sf.o(windowInsets, view);
            return rl.a(view, windowInsets);
        }
        sf sfVarO = sf.o(windowInsets, view);
        if (this.b == null) {
            int[] iArr = qv.a;
            this.b = qn.a(view);
        }
        if (this.b == null) {
            this.b = sfVarO;
            return rl.a(view, windowInsets);
        }
        rg rgVarB = rl.b(view);
        if (rgVarB != null && Objects.equals(rgVarB.a, sfVarO)) {
            return rl.a(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        sf sfVar = this.b;
        for (int i = 1; i <= 512; i += i) {
            nt ntVarF = sfVarO.f(i);
            nt ntVarF2 = sfVar.f(i);
            int i2 = ntVarF.b;
            int i3 = ntVarF2.b;
            boolean z = i2 > i3 || ntVarF.c > ntVarF2.c || ntVarF.d > ntVarF2.d || ntVarF.e > ntVarF2.e;
            if (z != (i2 < i3 || ntVarF.c < ntVarF2.c || ntVarF.d < ntVarF2.d || ntVarF.e < ntVarF2.e)) {
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
            this.b = sfVarO;
            return rl.a(view, windowInsets);
        }
        sf sfVar2 = this.b;
        apl aplVar = new apl(i6, (i4 & 8) != 0 ? rl.a : (i5 & 8) != 0 ? rl.b : (i4 & 519) != 0 ? rl.c : (i5 & 519) != 0 ? rl.d : null, (i6 & 8) != 0 ? 160L : 250L);
        aplVar.h(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(((ro) aplVar.a).j());
        nt ntVarF3 = sfVarO.f(i6);
        nt ntVarF4 = sfVar2.f(i6);
        int i7 = ntVarF3.b;
        int i8 = ntVarF4.b;
        int i9 = ntVarF3.c;
        int i10 = ntVarF4.c;
        int i11 = ntVarF3.d;
        int i12 = ntVarF4.d;
        int i13 = ntVarF3.e;
        int i14 = ntVarF4.e;
        rf rfVar = new rf(nt.d(Math.min(i7, i8), Math.min(i9, i10), Math.min(i11, i12), Math.min(i13, i14)), nt.d(Math.max(i7, i8), Math.max(i9, i10), Math.max(i11, i12), Math.max(i13, i14)));
        rl.e(view, aplVar, sfVarO, false);
        duration.addUpdateListener(new rh(aplVar, sfVarO, sfVar2, i6, view));
        duration.addListener(new ri(aplVar, view));
        px.b(view, new rj(view, aplVar, rfVar, duration, 0));
        this.b = sfVarO;
        return rl.a(view, windowInsets);
    }
}
