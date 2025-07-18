package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqk {
    private final ttl c;
    private volatile Process d;
    public volatile boolean b = false;
    public final tsl a = new pgc(this, 10);

    public rqk(tts ttsVar) {
        this.c = new ttl(ttsVar);
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
            ttl ttlVar = this.c;
            if (!ttlVar.a || ttlVar.a(TimeUnit.MILLISECONDS) >= 60000) {
                ttlVar.d();
                ttlVar.e();
                this.d = (Process) this.a.apply(str);
            }
        }
    }
}
