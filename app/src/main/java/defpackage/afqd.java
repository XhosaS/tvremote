package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afqd implements Runnable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ afqm b;

    public afqd(afqm afqmVar, InputStream inputStream) {
        this.a = inputStream;
        this.b = afqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.h(this.a);
    }
}
