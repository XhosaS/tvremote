package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cca implements Choreographer.FrameCallback {
    final /* synthetic */ yoe a;
    final /* synthetic */ yjv b;

    public cca(yoe yoeVar, yjv yjvVar) {
        this.a = yoeVar;
        this.b = yjvVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objE;
        try {
            objE = this.b.a(Long.valueOf(j));
        } catch (Throwable th) {
            objE = ybn.e(th);
        }
        this.a.resumeWith(objE);
    }
}
