package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aun {
    private final byn c;
    private volatile Process d;
    public volatile boolean b = false;
    public final byb a = new adz(this, 3);

    public aun(byu byuVar) {
        this.c = new byn(byuVar);
    }

    public final void a(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (this.d != null) {
            try {
                if (this.d.exitValue() != 0) {
                    this.b = true;
                    this.d = null;
                }
            } catch (IllegalThreadStateException unused) {
                return;
            }
        }
        if (this.b) {
            return;
        }
        synchronized (this) {
            byn bynVar = this.c;
            if (!bynVar.a || TimeUnit.MILLISECONDS.convert(bynVar.a(), TimeUnit.NANOSECONDS) >= 60000) {
                bynVar.a = false;
                bynVar.b();
                this.d = (Process) this.a.a(str);
            }
        }
    }
}
