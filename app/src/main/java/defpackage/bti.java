package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes.dex */
class bti extends Animation {
    final /* synthetic */ btl a;

    public bti(btl btlVar) {
        this.a = btlVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        btl btlVar = this.a;
        boolean z = btlVar.k;
        int iAbs = btlVar.g - Math.abs(btlVar.f);
        btlVar.k((btlVar.e + ((int) ((iAbs - r1) * f))) - btlVar.d.getTop());
        btlVar.i.c(1.0f - f);
    }
}
