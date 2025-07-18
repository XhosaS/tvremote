package defpackage;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxp extends cxq {
    private final WindowInsetsAnimation a;

    public cxp(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.cxq
    public final void g(float f) {
        this.a.setFraction(f);
    }

    @Override // defpackage.cxq
    public final float h() {
        return this.a.getAlpha();
    }

    @Override // defpackage.cxq
    public final float i() {
        return this.a.getFraction();
    }

    @Override // defpackage.cxq
    public final float j() {
        return this.a.getInterpolatedFraction();
    }

    @Override // defpackage.cxq
    public final int k() {
        return this.a.getTypeMask();
    }

    @Override // defpackage.cxq
    public final long l() {
        return this.a.getDurationMillis();
    }

    @Override // defpackage.cxq
    public final Interpolator m() {
        return this.a.getInterpolator();
    }
}
