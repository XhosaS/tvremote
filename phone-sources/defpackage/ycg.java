package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class ycg implements Runnable {
    final /* synthetic */ ych b;

    public ycg(ych ychVar) {
        this.b = ychVar;
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
            this.b.c.d(e);
        }
    }
}
