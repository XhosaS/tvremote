package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obg implements Handler.Callback {
    public final obf a;
    public final Handler h;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g = false;
    public final Object i = new Object();

    public obg(Looper looper, obf obfVar) {
        this.a = obfVar;
        this.h = new ogh(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void b(nws nwsVar) {
        ocv.aF(nwsVar);
        synchronized (this.i) {
            ArrayList arrayList = this.b;
            if (arrayList.contains(nwsVar)) {
                Log.w("GmsClientEvents", a.cw(nwsVar, "registerConnectionCallbacks(): listener ", " is already registered"));
            } else {
                arrayList.add(nwsVar);
            }
        }
        if (this.a.D()) {
            Handler handler = this.h;
            handler.sendMessage(handler.obtainMessage(1, nwsVar));
        }
    }

    public final void c(nwt nwtVar) {
        ocv.aF(nwtVar);
        synchronized (this.i) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(nwtVar)) {
                Log.w("GmsClientEvents", a.cw(nwtVar, "registerConnectionFailedListener(): listener ", " is already registered"));
            } else {
                arrayList.add(nwtVar);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            Log.wtf("GmsClientEvents", "Don't know how to handle message: " + message.what, new Exception());
            return false;
        }
        nws nwsVar = (nws) message.obj;
        synchronized (this.i) {
            if (this.e && this.a.D() && this.b.contains(nwsVar)) {
                nwsVar.aD(null);
            }
        }
        return true;
    }
}
