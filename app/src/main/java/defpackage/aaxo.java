package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxo implements rny {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final aaxn b;

    public aaxo(aaxn aaxnVar) {
        this.b = aaxnVar;
    }

    @Override // defpackage.rny
    public final void a() {
        if (Process.isIsolated() || a.getAndSet(true)) {
            return;
        }
        wvx wvxVarF = wzg.f("AndroidLoggerConfig", wwb.a, true);
        try {
            aaxn aaxnVar = this.b;
            zgy.c();
            zgy.b(aaxnVar);
            zhh.a.b.set(zhy.a);
            wvxVarF.close();
        } catch (Throwable th) {
            try {
                wvxVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
