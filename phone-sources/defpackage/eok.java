package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eok extends Handler {
    final /* synthetic */ eoo a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eok(eoo eooVar, Looper looper) {
        super(looper);
        this.a = eooVar;
    }

    final void a(int i, Object obj, boolean z) {
        obtainMessage(i, new eol(evq.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
    }

    public final synchronized void b() {
        removeCallbacksAndMessages(null);
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Exception excB;
        eol eolVar = (eol) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                eoo eooVar = this.a;
                excB = eooVar.d.b(eooVar.e, (epm) eolVar.d);
            } else {
                if (i != 2) {
                    throw new RuntimeException();
                }
                eoo eooVar2 = this.a;
                excB = eooVar2.d.a(eooVar2.e, (eph) eolVar.d);
            }
        } catch (epv e) {
            eol eolVar2 = (eol) message.obj;
            if (eolVar2.b) {
                int i2 = eolVar2.e + 1;
                eolVar2.e = i2;
                if (i2 <= this.a.k.h(3)) {
                    int i3 = evq.d;
                    long j = eolVar2.a;
                    SystemClock.elapsedRealtime();
                    SystemClock.elapsedRealtime();
                    long j2 = eolVar2.c;
                    long jI = sew.i(new zuw(e.getCause() instanceof IOException ? (IOException) e.getCause() : new eon(e.getCause()), eolVar2.e));
                    if (jI != -9223372036854775807L) {
                        synchronized (this) {
                            if (!this.b) {
                                sendMessageDelayed(Message.obtain(message), jI);
                                return;
                            }
                        }
                    }
                }
            }
            excB = e;
        } catch (Exception e2) {
            edb.f("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            excB = e2;
        }
        long j3 = eolVar.a;
        synchronized (this) {
            if (!this.b) {
                this.a.f.obtainMessage(message.what, Pair.create(eolVar.d, excB)).sendToTarget();
            }
        }
    }
}
