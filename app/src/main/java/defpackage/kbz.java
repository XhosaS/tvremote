package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
class kbz implements ServiceConnection {
    kca c;
    final /* synthetic */ kcf f;
    int a = 0;
    final Messenger b = new Messenger(new kos(Looper.getMainLooper(), new Handler.Callback() { // from class: kby
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", a.b(i, "Received response to request: "));
            }
            kbz kbzVar = this.a;
            synchronized (kbzVar) {
                SparseArray sparseArray = kbzVar.e;
                kcc kccVar = (kcc) sparseArray.get(i);
                if (kccVar == null) {
                    Log.w("MessengerIpcClient", a.b(i, "Received response for unknown request: "));
                    return true;
                }
                sparseArray.remove(i);
                kbzVar.d();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    kccVar.c(new kcd("Not supported by GmsCore", null));
                    return true;
                }
                kccVar.a(data);
                return true;
            }
        }
    }));
    final Queue d = new ArrayDeque();
    final SparseArray e = new SparseArray();

    public kbz(kcf kcfVar) {
        this.f = kcfVar;
    }

    final void a() {
        this.f.b.execute(new Runnable() { // from class: kbu
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                while (true) {
                    final kbz kbzVar = this.a;
                    synchronized (kbzVar) {
                        if (kbzVar.a != 2) {
                            return;
                        }
                        Queue queue = kbzVar.d;
                        if (queue.isEmpty()) {
                            kbzVar.d();
                            return;
                        }
                        final kcc kccVar = (kcc) queue.poll();
                        SparseArray sparseArray = kbzVar.e;
                        int i = kccVar.a;
                        sparseArray.put(i, kccVar);
                        kbzVar.f.b.schedule(new Runnable() { // from class: kbw
                            @Override // java.lang.Runnable
                            public final void run() {
                                kbzVar.c(kccVar.a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(String.valueOf(kccVar))));
                        }
                        kcf kcfVar = kbzVar.f;
                        Messenger messenger = kbzVar.b;
                        int i2 = kccVar.c;
                        Message messageObtain = Message.obtain();
                        messageObtain.what = i2;
                        messageObtain.arg1 = i;
                        messageObtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kccVar.b());
                        bundle.putString("pkg", kcfVar.a.getPackageName());
                        bundle.putBundle("data", kccVar.d);
                        messageObtain.setData(bundle);
                        try {
                            kca kcaVar = kbzVar.c;
                            Messenger messenger2 = kcaVar.a;
                            if (messenger2 != null) {
                                messenger2.send(messageObtain);
                            } else {
                                CloudMessagingMessengerCompat cloudMessagingMessengerCompat = kcaVar.b;
                                if (cloudMessagingMessengerCompat == null) {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                                cloudMessagingMessengerCompat.a.send(messageObtain);
                            }
                        } catch (RemoteException e) {
                            kbzVar.g(e.getMessage());
                        }
                    }
                }
            }
        });
    }

    final synchronized void b() {
        if (this.a == 1) {
            g("Timed out while binding");
        }
    }

    final synchronized void c(int i) {
        SparseArray sparseArray = this.e;
        kcc kccVar = (kcc) sparseArray.get(i);
        if (kccVar != null) {
            Log.w("MessengerIpcClient", a.b(i, "Timing out request: "));
            sparseArray.remove(i);
            kccVar.c(new kcd("Timed out waiting for response", null));
            d();
        }
    }

    final synchronized void d() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            kle.a().b(this.f.a, this);
        }
    }

    final synchronized boolean e(kcc kccVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(kccVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(kccVar);
            a();
            return true;
        }
        this.d.add(kccVar);
        kkk.f(this.a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            kle kleVarA = kle.a();
            kcf kcfVar = this.f;
            if (kleVarA.c(kcfVar.a, intent, this, 1)) {
                kcfVar.b.schedule(new Runnable() { // from class: kbv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                g("Unable to bind to service");
            }
        } catch (SecurityException e) {
            f("Unable to bind to service", e);
        }
        return true;
    }

    final synchronized void f(String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
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
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.a = 4;
        kle.a().b(this.f.a, this);
        kcd kcdVar = new kcd(str, th);
        Queue queue = this.d;
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            ((kcc) it.next()).c(kcdVar);
        }
        queue.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.e;
            if (i2 >= sparseArray.size()) {
                sparseArray.clear();
                return;
            } else {
                ((kcc) sparseArray.valueAt(i2)).c(kcdVar);
                i2++;
            }
        }
    }

    final synchronized void g(String str) {
        f(str, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        kcf kcfVar = this.f;
        kcfVar.b.execute(new Runnable() { // from class: kbt
            @Override // java.lang.Runnable
            public final void run() {
                kbz kbzVar = this.a;
                IBinder iBinder2 = iBinder;
                synchronized (kbzVar) {
                    try {
                        if (iBinder2 == null) {
                            kbzVar.g("Null service connection");
                            return;
                        }
                        try {
                            kbzVar.c = new kca(iBinder2);
                            kbzVar.a = 2;
                            kbzVar.a();
                        } catch (RemoteException e) {
                            kbzVar.g(e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        kcf kcfVar = this.f;
        kcfVar.b.execute(new Runnable() { // from class: kbx
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g("Service disconnected");
            }
        });
    }
}
