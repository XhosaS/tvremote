package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccc implements cds {
    private final ViewConfiguration a;

    public ccc(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.cds
    public final float a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }

    @Override // defpackage.cds
    public final float b() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // defpackage.cds
    public final float c() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.cds
    public final float d() {
        return this.a.getScaledMinimumFlingVelocity();
    }

    @Override // defpackage.cds
    public final float e() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.cds
    public final long f() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.cds
    public final long g() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.cds
    public final /* synthetic */ long h() {
        return a.j(48.0f, 48.0f);
    }
}
