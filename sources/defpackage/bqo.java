package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqo {
    private static final cbt e = cbt.k("com/google/android/tv/remote/service/audio/device/ActiveAudioDeviceManager");
    public final List b = new ArrayList(2);
    public long c = Long.MAX_VALUE;
    public bqp d = null;
    public final Handler a = new bqn(this);

    static {
        TimeUnit.MILLISECONDS.convert(7L, TimeUnit.DAYS);
    }

    public final synchronized void a(bqp bqpVar) {
        bqpVar.getClass();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((bqh) it.next()).f();
        }
    }

    public final synchronized void b(bqp bqpVar) {
        bqpVar.getClass();
        if (this.d == bqpVar) {
            this.a.removeMessages(0);
            this.d = null;
            this.c = Long.MAX_VALUE;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((bqh) it.next()).c(bqpVar);
        }
    }

    public final synchronized void c(bqp bqpVar) {
        bqpVar.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis() + 15000;
        long j = this.c;
        if (jUptimeMillis < j) {
            if (j != Long.MAX_VALUE) {
                this.a.removeMessages(0);
            }
            Handler handler = this.a;
            handler.sendMessageAtTime(handler.obtainMessage(0, Long.valueOf(jUptimeMillis)), jUptimeMillis);
        }
        this.c = jUptimeMillis;
        bqp bqpVar2 = this.d;
        if (bqpVar2 != bqpVar) {
            if (bqpVar2 != null) {
                ((cbs) e.b().j("com/google/android/tv/remote/service/audio/device/ActiveAudioDeviceManager", "setActiveAudioDevice", 118, "ActiveAudioDeviceManager.java")).t("Changing focus to a new audio device: %s", bqpVar);
            }
            this.d = bqpVar;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((bqh) it.next()).b(bqpVar);
            }
        }
    }

    public final synchronized void d(bqp bqpVar) {
        bqpVar.getClass();
        if (this.d == bqpVar) {
            this.a.removeMessages(0);
            this.d = null;
            this.c = Long.MAX_VALUE;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((bqh) it.next()).e();
            }
        }
    }

    public final synchronized void e(bqh bqhVar) {
        this.b.add(bqhVar);
    }
}
