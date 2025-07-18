package defpackage;

import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcv {
    public static final zcv a = new zcv(new upq((ThreadFactory) new zcq(String.valueOf(zcr.e).concat(" TaskRunner"), true)));
    public static final Logger b;
    public boolean c;
    public long d;
    public final upq h;
    private int i = WVMediaCrypto.TYPE;
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final Runnable g = new xyp(this, 16);

    static {
        Logger logger = Logger.getLogger(zcv.class.getName());
        logger.getClass();
        b = logger;
    }

    public zcv(upq upqVar) {
        this.h = upqVar;
    }

    public final zcu a() {
        int i;
        synchronized (this) {
            i = this.i;
            this.i = i + 1;
        }
        return new zcu(this, a.cf(i, "Q"));
    }

    public final void b(zcs zcsVar, long j) {
        byte[] bArr = zcr.a;
        zcu zcuVar = zcsVar.b;
        zcuVar.getClass();
        if (zcuVar.d != zcsVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = zcuVar.f;
        zcuVar.f = false;
        zcuVar.d = null;
        this.e.remove(zcuVar);
        if (j != -1 && !z && !zcuVar.c) {
            zcuVar.d(zcsVar, j, true);
        }
        if (zcuVar.e.isEmpty()) {
            return;
        }
        this.f.add(zcuVar);
    }

    public final void c(zcu zcuVar) {
        byte[] bArr = zcr.a;
        if (zcuVar.d == null) {
            if (zcuVar.e.isEmpty()) {
                this.f.remove(zcuVar);
            } else {
                List list = this.f;
                if (!list.contains(zcuVar)) {
                    list.add(zcuVar);
                }
            }
        }
        if (this.c) {
            notify();
        } else {
            this.h.s(this.g);
        }
    }
}
