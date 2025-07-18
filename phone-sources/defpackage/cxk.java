package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxk implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ cyh a;
    final /* synthetic */ cyh b;
    final /* synthetic */ int c;
    final /* synthetic */ View d;
    final /* synthetic */ nxb e;

    public cxk(nxb nxbVar, cyh cyhVar, cyh cyhVar2, int i, View view) {
        this.e = nxbVar;
        this.a = cyhVar;
        this.b = cyhVar2;
        this.c = i;
        this.d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        nxb nxbVar = this.e;
        nxbVar.r(valueAnimator.getAnimatedFraction());
        float fN = nxbVar.n();
        Interpolator interpolator = cxn.a;
        int i = Build.VERSION.SDK_INT;
        cyh cyhVar = this.a;
        cxw cxvVar = i >= 34 ? new cxv(cyhVar) : Build.VERSION.SDK_INT >= 31 ? new cxu(cyhVar) : Build.VERSION.SDK_INT >= 30 ? new cxt(cyhVar) : Build.VERSION.SDK_INT >= 29 ? new cxs(cyhVar) : new cxr(cyhVar);
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((this.c & i2) == 0) {
                cxvVar.g(i2, cyhVar.f(i2));
            } else {
                cyh cyhVar2 = this.b;
                csr csrVarF = cyhVar.f(i2);
                csr csrVarF2 = cyhVar2.f(i2);
                float f = 1.0f - fN;
                cxvVar.g(i2, cyh.i(csrVarF, (int) (((csrVarF.b - csrVarF2.b) * f) + 0.5d), (int) (((csrVarF.c - csrVarF2.c) * f) + 0.5d), (int) (((csrVarF.d - csrVarF2.d) * f) + 0.5d), (int) (((csrVarF.e - csrVarF2.e) * f) + 0.5d)));
            }
        }
        cxn.c(this.d, cxvVar.a(), Collections.singletonList(nxbVar));
    }
}
