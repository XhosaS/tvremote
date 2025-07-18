package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sko implements sjp {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    public final void b() {
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, skt] */
    @Override // defpackage.sjp
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final File a(unc uncVar) throws IOException {
        if (this.a) {
            if (uncVar.f.isEmpty()) {
                return uncVar.a.b((Uri) uncVar.c);
            }
            throw new ske("Short circuit would skip transforms.");
        }
        skc skcVar = new skc(skn.b(uncVar));
        try {
            Closeable closeable = skcVar.a;
            if (!(closeable instanceof sjw)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileC = ((sjw) closeable).c();
            skcVar.close();
            return fileC;
        } catch (Throwable th) {
            try {
                skcVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
