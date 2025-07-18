package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes.dex */
class btg extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ btl c;

    public btg(btl btlVar, int i, int i2) {
        this.c = btlVar;
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.b;
        this.c.i.setAlpha((int) (this.a + ((i - r0) * f)));
    }
}
