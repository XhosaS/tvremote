package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes.dex */
class btj extends Animation {
    final /* synthetic */ btl a;

    public btj(btl btlVar) {
        this.a = btlVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.a.b(f);
    }
}
