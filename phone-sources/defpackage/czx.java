package defpackage;

import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czx implements cva {
    final /* synthetic */ NestedScrollView a;

    public czx(NestedScrollView nestedScrollView) {
        this.a = nestedScrollView;
    }

    @Override // defpackage.cva
    public final float getScaledScrollFactor() {
        return -this.a.a();
    }

    @Override // defpackage.cva
    public final boolean startDifferentialMotionFling(float f) {
        if (f == 0.0f) {
            return false;
        }
        stopDifferentialMotionFling();
        this.a.e((int) f);
        return true;
    }

    @Override // defpackage.cva
    public final void stopDifferentialMotionFling() {
        this.a.a.abortAnimation();
    }
}
