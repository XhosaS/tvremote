package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rh implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ sf a;
    final /* synthetic */ sf b;
    final /* synthetic */ int c;
    final /* synthetic */ View d;
    final /* synthetic */ apl e;

    public rh(apl aplVar, sf sfVar, sf sfVar2, int i, View view) {
        this.e = aplVar;
        this.a = sfVar;
        this.b = sfVar2;
        this.c = i;
        this.d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        apl aplVar = this.e;
        aplVar.h(valueAnimator.getAnimatedFraction());
        float fE = aplVar.e();
        Interpolator interpolator = rl.a;
        int i = Build.VERSION.SDK_INT;
        sf sfVar = this.a;
        ru rtVar = i >= 34 ? new rt(sfVar) : Build.VERSION.SDK_INT >= 31 ? new rs(sfVar) : Build.VERSION.SDK_INT >= 30 ? new rr(sfVar) : Build.VERSION.SDK_INT >= 29 ? new rq(sfVar) : new rp(sfVar);
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((this.c & i2) == 0) {
                rtVar.g(i2, sfVar.f(i2));
            } else {
                sf sfVar2 = this.b;
                nt ntVarF = sfVar.f(i2);
                nt ntVarF2 = sfVar2.f(i2);
                float f = 1.0f - fE;
                rtVar.g(i2, sf.i(ntVarF, (int) (((ntVarF.b - ntVarF2.b) * f) + 0.5d), (int) (((ntVarF.c - ntVarF2.c) * f) + 0.5d), (int) (((ntVarF.d - ntVarF2.d) * f) + 0.5d), (int) (((ntVarF.e - ntVarF2.e) * f) + 0.5d)));
            }
        }
        rl.c(this.d, rtVar.a(), Collections.singletonList(aplVar));
    }
}
