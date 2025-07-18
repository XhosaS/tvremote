package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class sq extends sw {
    final /* synthetic */ int a;
    final /* synthetic */ qv b;
    final /* synthetic */ sz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(sz szVar, qv qvVar, int i, float f, float f2, float f3, float f4, int i2, qv qvVar2) {
        super(qvVar, i, f, f2, f3, f4);
        this.c = szVar;
        this.a = i2;
        this.b = qvVar2;
    }

    @Override // defpackage.sw, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        if (this.a <= 0) {
            sz szVar = this.c;
            szVar.l.c(this.b);
        } else {
            sz szVar2 = this.c;
            szVar2.a.add(this.b.a);
            this.k = true;
            szVar2.p.post(new sr(szVar2, this));
        }
        sz szVar3 = this.c;
        qv qvVar = this.b;
        View view = szVar3.s;
        View view2 = qvVar.a;
        if (view == view2) {
            szVar3.l(view2);
        }
    }
}
