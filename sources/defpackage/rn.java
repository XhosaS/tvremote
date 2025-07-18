package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rn extends ro {
    private final WindowInsetsAnimation a;

    public rn(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.ro
    public final float g() {
        return this.a.getAlpha();
    }

    @Override // defpackage.ro
    public final float h() {
        return this.a.getInterpolatedFraction();
    }

    @Override // defpackage.ro
    public final int i() {
        return this.a.getTypeMask();
    }

    @Override // defpackage.ro
    public final long j() {
        return this.a.getDurationMillis();
    }

    @Override // defpackage.ro
    public final void k(float f) {
        this.a.setFraction(f);
    }
}
