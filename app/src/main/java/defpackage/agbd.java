package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class agbd implements Runnable {
    final /* synthetic */ agbe b;

    public agbd(agbe agbeVar) {
        this.b = agbeVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            if (this.b.f == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            a();
        } catch (Exception e) {
            this.b.c.e(e);
        }
    }
}
