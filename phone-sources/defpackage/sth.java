package defpackage;

import android.animation.Animator;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sth extends ssv {
    final /* synthetic */ stk c;
    private boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sth(stk stkVar, xzg xzgVar) {
        super(stkVar, xzgVar);
        this.c = stkVar;
    }

    @Override // defpackage.ssv, defpackage.stt
    public final void e() {
        super.e();
        this.d = true;
    }

    @Override // defpackage.ssv, defpackage.stt
    public final void f() {
        super.f();
        stk stkVar = this.c;
        stkVar.z = 0;
        if (this.d) {
            return;
        }
        stkVar.setVisibility(8);
    }

    @Override // defpackage.ssv, defpackage.stt
    public final void g(Animator animator) {
        super.g(animator);
        this.d = false;
        stk stkVar = this.c;
        stkVar.setVisibility(0);
        stkVar.z = 1;
    }

    @Override // defpackage.stt
    public final int h() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // defpackage.stt
    public final void i() {
        this.c.setVisibility(8);
    }

    @Override // defpackage.stt
    public final boolean j() {
        stk stkVar = this.c;
        int visibility = stkVar.getVisibility();
        int i = stkVar.z;
        return visibility == 0 ? i == 1 : i != 2;
    }

    @Override // defpackage.stt
    public final void k() {
    }
}
