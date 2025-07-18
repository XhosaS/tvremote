package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfs {
    private static final Map o = new HashMap();
    public final Context a;
    public final String b;
    public boolean f;
    public final Intent g;
    public final tfp h;
    public ServiceConnection l;
    public IInterface m;
    public final ulp n;
    public final List c = new ArrayList();
    public final Set d = new HashSet();
    public final Object e = new Object();
    public final IBinder.DeathRecipient j = new IBinder.DeathRecipient() { // from class: tfk
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            tfs tfsVar = this.a;
            tfo tfoVar = (tfo) tfsVar.i.get();
            if (tfoVar != null) {
                tfoVar.a();
            } else {
                List list = tfsVar.c;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((tfj) it.next()).b(tfsVar.a());
                }
                list.clear();
            }
            synchronized (tfsVar.e) {
                tfsVar.b();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final WeakReference i = new WeakReference(null);

    public tfs(Context context, ulp ulpVar, String str, Intent intent, tfp tfpVar) {
        this.a = context;
        this.n = ulpVar;
        this.b = str;
        this.g = intent;
        this.h = tfpVar;
    }

    public final RemoteException a() {
        return new RemoteException(String.valueOf(this.b).concat(" : Binder has died."));
    }

    public final void b() {
        Set set = this.d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((kwy) it.next()).v(a());
        }
        set.clear();
    }

    public final void c(tfj tfjVar) {
        Handler handler;
        Map map = o;
        synchronized (map) {
            String str = this.b;
            if (!map.containsKey(str)) {
                HandlerThread handlerThread = new HandlerThread(str, 10);
                handlerThread.start();
                map.put(str, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(str);
        }
        handler.post(tfjVar);
    }

    public final void e(tfj tfjVar, kwy kwyVar) {
        c(new tfm(this, tfjVar.d, kwyVar, tfjVar));
    }

    public final void f(kwy kwyVar) {
        synchronized (this.e) {
            this.d.remove(kwyVar);
        }
        c(new tfn(this));
    }
}
