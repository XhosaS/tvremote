package defpackage;

import android.animation.TimeInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebm extends ebr {
    private final TimeInterpolator e;

    public ebm(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
    }

    @Override // defpackage.ebr
    protected final float a(long j) {
        return this.e.getInterpolation(f("default_input").c);
    }
}
