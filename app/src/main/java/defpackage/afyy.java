package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afyy implements afzl {
    @Override // defpackage.afzz
    public final void d(afzy afzyVar) throws IOException {
        while (true) {
            InputStream inputStreamE = afzyVar.e();
            if (inputStreamE == null) {
                return;
            }
            try {
                inputStreamE.close();
            } catch (IOException e) {
                while (true) {
                    InputStream inputStreamE2 = afzyVar.e();
                    if (inputStreamE2 == null) {
                        throw new RuntimeException(e);
                    }
                    try {
                        inputStreamE2.close();
                    } catch (IOException e2) {
                        afzg.b.logp(Level.WARNING, "io.grpc.internal.ServerImpl$NoopListener", "messagesAvailable", "Exception closing stream", (Throwable) e2);
                    }
                }
            }
        }
    }

    @Override // defpackage.afzl
    public final void c() {
    }

    @Override // defpackage.afzz
    public final void e() {
    }

    @Override // defpackage.afzl
    public final void b(Status status) {
    }
}
