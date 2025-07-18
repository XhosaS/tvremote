package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
class aii extends aij {
    private final WindowInsetsAnimation a;

    public aii(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.aij
    public final float g() {
        return this.a.getAlpha();
    }

    @Override // defpackage.aij
    public final float h() {
        return this.a.getInterpolatedFraction();
    }

    @Override // defpackage.aij
    public final int i() {
        return this.a.getTypeMask();
    }

    @Override // defpackage.aij
    public final long j() {
        return this.a.getDurationMillis();
    }

    @Override // defpackage.aij
    public final void k(float f) {
        this.a.setFraction(f);
    }
}
