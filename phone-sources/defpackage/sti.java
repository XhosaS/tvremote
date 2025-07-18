package defpackage;

import android.animation.Animator;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sti extends ssv {
    final /* synthetic */ stk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sti(stk stkVar, xzg xzgVar) {
        super(stkVar, xzgVar);
        this.c = stkVar;
    }

    @Override // defpackage.ssv, defpackage.stt
    public final void f() {
        super.f();
        this.c.z = 0;
    }

    @Override // defpackage.ssv, defpackage.stt
    public final void g(Animator animator) {
        super.g(animator);
        stk stkVar = this.c;
        stkVar.setVisibility(0);
        stkVar.z = 2;
    }

    @Override // defpackage.stt
    public final int h() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.stt
    public final void i() {
        stk stkVar = this.c;
        stkVar.setVisibility(0);
        stkVar.setAlpha(1.0f);
        stkVar.setScaleY(1.0f);
        stkVar.setScaleX(1.0f);
    }

    @Override // defpackage.stt
    public final boolean j() {
        return this.c.A();
    }

    @Override // defpackage.stt
    public final void k() {
    }
}
