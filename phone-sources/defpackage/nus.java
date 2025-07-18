package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nus implements ServiceConnection {
    public int a = 0;
    final Messenger b = new Messenger(new ogh(Looper.getMainLooper(), new etv(this, 5)));
    final Queue c = new ArrayDeque();
    public final SparseArray d = new SparseArray();
    final /* synthetic */ nux e;
    public pkg f;

    public nus(nux nuxVar) {
        this.e = nuxVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final void a() {
        this.e.b.execute(new nur(this, 1));
    }

    final synchronized void b() {
        if (this.a == 1) {
            g("Timed out while binding");
        }
    }

    public final synchronized void c(int i) {
        SparseArray sparseArray = this.d;
        nuu nuuVar = (nuu) sparseArray.get(i);
        if (nuuVar != null) {
            Log.w("MessengerIpcClient", a.cf(i, "Timing out request: "));
            sparseArray.remove(i);
            nuuVar.c(new nuv("Timed out waiting for response"));
            d();
        }
    }

    public final synchronized void d() {
        if (this.a == 2 && this.c.isEmpty() && this.d.size() == 0) {
            this.a = 3;
            ocn.a().b((Context) this.e.a, this);
        }
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    final synchronized boolean e(nuu nuuVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.c.add(nuuVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.c.add(nuuVar);
            a();
            return true;
        }
        this.c.add(nuuVar);
        a.ab(this.a == 0);
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            ocn ocnVarA = ocn.a();
            nux nuxVar = this.e;
            if (ocnVarA.c((Context) nuxVar.a, intent, this, 1)) {
                nuxVar.b.schedule(new nur(this, 0), 30L, TimeUnit.SECONDS);
            } else {
                g("Unable to bind to service");
            }
        } catch (SecurityException e) {
            f("Unable to bind to service", e);
        }
        return true;
    }

    final synchronized void f(String str, Throwable th) {
        int i = this.a;
        if (i == 0) {
            throw new IllegalStateException();
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            this.a = 4;
            return;
        }
        this.a = 4;
        ocn.a().b((Context) this.e.a, this);
        nuv nuvVar = new nuv(str, th);
        Queue queue = this.c;
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            ((nuu) it.next()).c(nuvVar);
        }
        queue.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i2 >= sparseArray.size()) {
                sparseArray.clear();
                return;
            } else {
                ((nuu) sparseArray.valueAt(i2)).c(nuvVar);
                i2++;
            }
        }
    }

    public final synchronized void g(String str) {
        f(str, null);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.e.b.execute(new non(this, iBinder, 5));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.e.b.execute(new nur(this, 2));
    }
}
