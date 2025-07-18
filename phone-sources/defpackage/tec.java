package defpackage;

import android.content.Context;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tec implements Interpolator {
    final /* synthetic */ Context a;
    private final Interpolator b;

    public tec(Context context) {
        this.a = context;
        this.b = ted.a(context);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.b.getInterpolation(1.0f - f);
    }
}
