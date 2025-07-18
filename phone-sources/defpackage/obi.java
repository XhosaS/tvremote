package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obi {
    public static final Object a = new Object();
    public static HandlerThread b;
    private static obi j;
    public final HashMap c;
    public final Context d;
    public volatile Handler e;
    public final ocn f;
    public final long g;
    private final long h;
    private volatile Executor i;
    private final etv k;

    public obi() {
        throw null;
    }

    public static obi a(Context context) {
        synchronized (a) {
            if (j == null) {
                j = new obi(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return j;
    }

    public final void b(ComponentName componentName, ServiceConnection serviceConnection) {
        c(new obh(componentName), serviceConnection);
    }

    protected final void c(obh obhVar, ServiceConnection serviceConnection) {
        HashMap map = this.c;
        synchronized (map) {
            obj objVar = (obj) map.get(obhVar);
            if (objVar == null) {
                throw new IllegalStateException(hhh.c(obhVar, "Nonexistent connection status for service config: "));
            }
            if (!objVar.a(serviceConnection)) {
                throw new IllegalStateException(hhh.c(obhVar, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="));
            }
            objVar.a.remove(serviceConnection);
            if (objVar.b()) {
                this.e.sendMessageDelayed(this.e.obtainMessage(0, obhVar), this.h);
            }
        }
    }

    public final nve d(obh obhVar, ServiceConnection serviceConnection, String str) {
        nve nveVarD;
        HashMap map = this.c;
        synchronized (map) {
            obj objVar = (obj) map.get(obhVar);
            if (objVar == null) {
                objVar = new obj(this, obhVar);
                objVar.c(serviceConnection, serviceConnection);
                nveVarD = objVar.d(str);
                map.put(obhVar, objVar);
            } else {
                this.e.removeMessages(0, obhVar);
                if (objVar.a(serviceConnection)) {
                    throw new IllegalStateException(hhh.c(obhVar, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                }
                objVar.c(serviceConnection, serviceConnection);
                int i = objVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(objVar.f, objVar.d);
                } else if (i == 2) {
                    nveVarD = objVar.d(str);
                }
                nveVarD = null;
            }
            if (objVar.c) {
                return nve.a;
            }
            if (nveVarD == null) {
                nveVarD = new nve(-1);
            }
            return nveVarD;
        }
    }

    public final void e(String str, ServiceConnection serviceConnection, boolean z) {
        c(new obh(str, z), serviceConnection);
    }

    public obi(Context context, Looper looper) {
        this.c = new HashMap();
        etv etvVar = new etv(this, 6, null);
        this.k = etvVar;
        this.d = context.getApplicationContext();
        this.e = new ogh(looper, etvVar);
        this.f = ocn.a();
        this.h = 5000L;
        this.g = 300000L;
        this.i = null;
    }
}
