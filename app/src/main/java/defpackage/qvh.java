package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvh {
    private final yrn c;
    private volatile Process d;
    public volatile boolean b = false;
    public final yqi a = new yqi() { // from class: qvg
        @Override // defpackage.yqi
        public final Object apply(Object obj) {
            try {
                return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
            } catch (IOException unused) {
                this.a.b = true;
                return null;
            }
        }
    };

    public qvh(yrx yrxVar) {
        this.c = new yrn(yrxVar);
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
            yrn yrnVar = this.c;
            if (!yrnVar.a || yrnVar.a(TimeUnit.MILLISECONDS) >= 60000) {
                yrnVar.d();
                yrnVar.e();
                this.d = (Process) this.a.apply(str);
            }
        }
    }
}
