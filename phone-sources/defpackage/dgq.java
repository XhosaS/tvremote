package defpackage;

import android.animation.Animator;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dgq implements Choreographer.FrameCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dgq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.b;
        if (i == 0) {
            this.a.run();
            return;
        }
        if (i == 1) {
            this.a.run();
            return;
        }
        pny pnyVar = ((poa) this.a).b;
        pnyVar.c++;
        Animator animator = pnyVar.a;
        if (pnyVar.a(animator) || animator.isStarted()) {
            return;
        }
        if (pnyVar.b != -1 && pnyVar.c >= 0) {
            return;
        }
        animator.start();
    }
}
