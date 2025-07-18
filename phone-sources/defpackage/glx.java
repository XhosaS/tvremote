package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glx extends a {
    final /* synthetic */ bv a;
    final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glx(bv bvVar, FrameLayout frameLayout) {
        super(null);
        this.a = bvVar;
        this.b = frameLayout;
    }

    @Override // defpackage.a
    public final void bC(cr crVar, bv bvVar, View view) {
        if (bvVar == this.a) {
            crVar.ap(this);
            gmd.g(view, this.b);
        }
    }
}
