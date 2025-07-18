package defpackage;

import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class akz implements afx {
    final /* synthetic */ NestedScrollView a;

    public akz(NestedScrollView nestedScrollView) {
        this.a = nestedScrollView;
    }

    @Override // defpackage.afx
    public final float a() {
        return -this.a.cF();
    }

    @Override // defpackage.afx
    public final void b() {
        this.a.a.abortAnimation();
    }

    @Override // defpackage.afx
    public final boolean c(float f) {
        if (f == 0.0f) {
            return false;
        }
        b();
        this.a.j((int) f);
        return true;
    }
}
