package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class daq implements Interpolator {
    final /* synthetic */ das a;

    public daq(das dasVar) {
        this.a = dasVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.a.e.getInterpolation(f);
    }
}
