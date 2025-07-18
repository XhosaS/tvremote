package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
class eaw implements Choreographer.FrameCallback {
    final /* synthetic */ eay a;

    public eaw(eay eayVar) {
        this.a = eayVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d(j);
    }
}
