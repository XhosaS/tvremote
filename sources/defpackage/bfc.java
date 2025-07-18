package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfc implements bem {
    public boolean a = false;

    static {
        new AtomicInteger();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [bfi, java.lang.Object] */
    @Override // defpackage.bem
    public final /* bridge */ /* synthetic */ Object a(cmt cmtVar) throws IOException {
        if (this.a) {
            if (cmtVar.b.isEmpty()) {
                return cmtVar.c.c((Uri) cmtVar.d);
            }
            throw new bew("Short circuit would skip transforms.");
        }
        bev bevVar = new bev(bfe.b(cmtVar), 0);
        try {
            Object obj = bevVar.a;
            if (!(obj instanceof bes)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileA = ((bes) obj).a();
            bevVar.close();
            return fileA;
        } catch (Throwable th) {
            try {
                bevVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
