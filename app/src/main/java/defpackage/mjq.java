package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes.dex */
class mjq extends AnimatorListenerAdapter {
    final /* synthetic */ nzx a;
    final /* synthetic */ mjr b;

    public mjq(mjr mjrVar, nzx nzxVar) {
        this.a = nzxVar;
        this.b = mjrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        mjr mjrVar = this.b;
        oaa oaaVar = (oaa) mjrVar.b.a();
        CommandOuterClass$Command defaultInstance = mjrVar.a.h;
        if (defaultInstance == null) {
            defaultInstance = CommandOuterClass$Command.getDefaultInstance();
        }
        oaaVar.a(defaultInstance, this.a).k();
    }
}
