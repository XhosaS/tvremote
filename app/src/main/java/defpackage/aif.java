package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class aif implements View.OnApplyWindowInsetsListener {
    final aib a;
    private ajc b;

    public aif(View view, aib aibVar) {
        ajc ajcVarA;
        this.a = aibVar;
        int[] iArr = ahj.a;
        ajc ajcVarA2 = ahd.a(view);
        if (ajcVarA2 != null) {
            ajcVarA = (Build.VERSION.SDK_INT >= 34 ? new aip(ajcVarA2) : Build.VERSION.SDK_INT >= 31 ? new aio(ajcVarA2) : Build.VERSION.SDK_INT >= 30 ? new ain(ajcVarA2) : Build.VERSION.SDK_INT >= 29 ? new aim(ajcVarA2) : new ail(ajcVarA2)).a();
        } else {
            ajcVarA = null;
        }
        this.b = ajcVarA;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.b = ajc.g(windowInsets, view);
            return aig.a(view, windowInsets);
        }
        ajc ajcVarG = ajc.g(windowInsets, view);
        if (this.b == null) {
            int[] iArr = ahj.a;
            this.b = ahd.a(view);
        }
        if (this.b == null) {
            this.b = ajcVarG;
            return aig.a(view, windowInsets);
        }
        aib aibVarB = aig.b(view);
        if (aibVarB != null && Objects.equals(aibVarB.a, ajcVarG)) {
            return aig.a(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        ajc ajcVar = this.b;
        for (int i = 1; i <= 512; i += i) {
            aiy aiyVar = ajcVarG.b;
            aiy aiyVar2 = ajcVar.b;
            acs acsVarA = aiyVar.a(i);
            acs acsVarA2 = aiyVar2.a(i);
            int i2 = acsVarA.b;
            int i3 = acsVarA2.b;
            boolean z = i2 > i3 || acsVarA.c > acsVarA2.c || acsVarA.d > acsVarA2.d || acsVarA.e > acsVarA2.e;
            if (z != (i2 < i3 || acsVarA.c < acsVarA2.c || acsVarA.d < acsVarA2.d || acsVarA.e < acsVarA2.e)) {
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
            this.b = ajcVarG;
            return aig.a(view, windowInsets);
        }
        ajc ajcVar2 = this.b;
        aik aikVar = new aik(i6, (i4 & 8) != 0 ? aig.a : (i5 & 8) != 0 ? aig.b : (i4 & 519) != 0 ? aig.c : (i5 & 519) != 0 ? aig.d : null, (i6 & 8) != 0 ? 160L : 250L);
        aikVar.a.k(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(aikVar.a.j());
        acs acsVarA3 = ajcVarG.b.a(i6);
        acs acsVarA4 = ajcVar2.b.a(i6);
        int i7 = acsVarA3.b;
        int i8 = acsVarA4.b;
        int i9 = acsVarA3.c;
        int i10 = acsVarA4.c;
        int i11 = acsVarA3.d;
        int i12 = acsVarA4.d;
        int i13 = acsVarA3.e;
        int i14 = acsVarA4.e;
        aia aiaVar = new aia(acs.d(Math.min(i7, i8), Math.min(i9, i10), Math.min(i11, i12), Math.min(i13, i14)), acs.d(Math.max(i7, i8), Math.max(i9, i10), Math.max(i11, i12), Math.max(i13, i14)));
        aig.d(view, aikVar, ajcVarG, false);
        duration.addUpdateListener(new aic(aikVar, ajcVarG, ajcVar2, i6, view));
        duration.addListener(new aid(aikVar, view));
        agm.b(view, new aie(view, aikVar, aiaVar, duration));
        this.b = ajcVarG;
        return aig.a(view, windowInsets);
    }
}
