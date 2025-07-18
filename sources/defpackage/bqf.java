package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqf implements bqr {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ bqh c;

    public bqf(bqh bqhVar, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = bqhVar;
    }

    @Override // defpackage.bqr
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bqr
    public final void b(boolean z) {
        bqh bqhVar = this.c;
        synchronized (bqhVar) {
            int i = bqhVar.f;
            int i2 = this.b;
            if (i != i2) {
                ((cbs) ((cbs) bqh.a.g().g(btt.a)).j("com/google/android/tv/remote/service/audio/AudioBridgeX$1", "close", 365, "AudioBridgeX.java")).w("Closing an obsolete audio sink: %d/%d", i2, bqhVar.f);
            } else if (bqhVar.e == null) {
            } else {
                bqhVar.a(z);
            }
        }
    }

    @Override // defpackage.bqr
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bqr
    public final void d(dln dlnVar) {
        bqh bqhVar = this.c;
        synchronized (bqhVar) {
            if (bqhVar.f == this.b && !bqhVar.d.isEmpty()) {
                bqhVar.c.d.add(dlnVar);
            }
        }
    }
}
