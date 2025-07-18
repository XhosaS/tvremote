package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tt implements Interpolator {
    final /* synthetic */ tv a;

    public tt(tv tvVar) {
        this.a = tvVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.e.getInterpolation(f);
    }
}
