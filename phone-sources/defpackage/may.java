package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class may {
    public final idy a = new lnt(this, 7);
    public final mfm b;
    private final idy c;
    private int d;
    private boolean e;
    private int f;
    private Throwable g;

    public may(idy idyVar, mfm mfmVar) {
        this.b = mfmVar;
        this.c = idyVar;
    }

    public final synchronized void a() {
        a.ah(!this.e, "decrement called after sync process was completed");
        a.ah(this.d > 0, "decrement called when no task was pending");
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.e = true;
            if (mfm.b(this.b)) {
                this.c.c(ieg.b(new CancellationException()));
                return;
            }
            Throwable mbgVar = this.g;
            if (mbgVar == null) {
                this.c.c(kvk.b);
                return;
            }
            if (this.f >= 2) {
                mbgVar = new mbg(mbgVar);
            }
            this.c.c(ieg.b(mbgVar));
        }
    }

    public final synchronized void b() {
        a.ah(!this.e, "increment called after sync process was completed");
        this.d++;
    }

    public final synchronized void c(Throwable th) {
        boolean z = true;
        a.ah(!this.e, "onError called after sync process was completed");
        if (this.d <= 0) {
            z = false;
        }
        a.ah(z, "onError called when no task was pending");
        th.getClass();
        if (!(th instanceof IOException) || (th instanceof vuq)) {
            krd.d("Error level 3", th);
        }
        if (this.f < 3) {
            this.f = 3;
            this.g = th;
        }
    }
}
