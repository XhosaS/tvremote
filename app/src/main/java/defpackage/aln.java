package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
class aln implements Interpolator {
    final /* synthetic */ alp a;

    public aln(alp alpVar) {
        this.a = alpVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.e.getInterpolation(f);
    }
}
