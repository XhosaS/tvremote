package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes.dex */
public class avj implements Transition.TransitionListener {
    final /* synthetic */ avm a;

    public avj(avm avmVar) {
        this.a = avmVar;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        ((axy) this.a).b.g = null;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
