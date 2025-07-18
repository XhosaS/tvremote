package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kjq implements ServiceConnection, kjt {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final kjo e;
    public ComponentName f;
    final /* synthetic */ kjs g;

    public kjq(kjs kjsVar, kjo kjoVar) {
        this.g = kjsVar;
        this.e = kjoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: kkl -> 0x0110, TryCatch #2 {kkl -> 0x0110, blocks: (B:3:0x0004, B:5:0x0012, B:6:0x001f, B:8:0x0023, B:9:0x002d, B:12:0x003f, B:31:0x007d, B:37:0x00ac, B:24:0x0065, B:27:0x0070, B:33:0x0088, B:34:0x00a8, B:16:0x0048, B:17:0x004f, B:14:0x0044, B:15:0x0047, B:21:0x0053), top: B:58:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.common.ConnectionResult a(java.lang.String r13, java.util.concurrent.Executor r14) throws android.os.RemoteException, defpackage.kkl {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjq.a(java.lang.String, java.util.concurrent.Executor):com.google.android.gms.common.ConnectionResult");
    }

    public final boolean b(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        kjs kjsVar = this.g;
        synchronized (kjsVar.c) {
            kjsVar.e.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        kjs kjsVar = this.g;
        synchronized (kjsVar.c) {
            kjsVar.e.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
