package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhg implements uef {
    public boolean a = false;

    static {
        new AtomicInteger();
    }

    @Override // defpackage.uef
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final File a(uee ueeVar) throws IOException {
        if (this.a) {
            if (ueeVar.b()) {
                throw new ufx("Short circuit would skip transforms.");
            }
            return ueeVar.b.c(ueeVar.f);
        }
        ufv ufvVar = new ufv(new uhi().a(ueeVar));
        try {
            Closeable closeable = ufvVar.a;
            if (!(closeable instanceof uff)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileC = ((uff) closeable).c();
            ufvVar.close();
            return fileC;
        } catch (Throwable th) {
            try {
                ufvVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
