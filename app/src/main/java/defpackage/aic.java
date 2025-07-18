package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
class aic implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aik a;
    final /* synthetic */ ajc b;
    final /* synthetic */ ajc c;
    final /* synthetic */ int d;
    final /* synthetic */ View e;

    public aic(aik aikVar, ajc ajcVar, ajc ajcVar2, int i, View view) {
        this.a = aikVar;
        this.b = ajcVar;
        this.c = ajcVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        aik aikVar = this.a;
        aikVar.a.k(valueAnimator.getAnimatedFraction());
        float fH = aikVar.a.h();
        Interpolator interpolator = aig.a;
        int i = Build.VERSION.SDK_INT;
        ajc ajcVar = this.b;
        aiq aipVar = i >= 34 ? new aip(ajcVar) : Build.VERSION.SDK_INT >= 31 ? new aio(ajcVar) : Build.VERSION.SDK_INT >= 30 ? new ain(ajcVar) : Build.VERSION.SDK_INT >= 29 ? new aim(ajcVar) : new ail(ajcVar);
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((this.d & i2) == 0) {
                aipVar.g(i2, ajcVar.b.a(i2));
            } else {
                ajc ajcVar2 = this.c;
                acs acsVarA = ajcVar.b.a(i2);
                acs acsVarA2 = ajcVar2.b.a(i2);
                float f = 1.0f - fH;
                aipVar.g(i2, ajc.f(acsVarA, (int) (((acsVarA.b - acsVarA2.b) * f) + 0.5d), (int) (((acsVarA.c - acsVarA2.c) * f) + 0.5d), (int) (((acsVarA.d - acsVarA2.d) * f) + 0.5d), (int) (((acsVarA.e - acsVarA2.e) * f) + 0.5d)));
            }
        }
        aig.e(this.e, aipVar.a(), Collections.singletonList(aikVar));
    }
}
