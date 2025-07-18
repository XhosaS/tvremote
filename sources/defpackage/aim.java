package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aim implements ServiceConnection {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final aik e;
    public ComponentName f;
    final /* synthetic */ ail g;

    public aim(ail ailVar, aik aikVar) {
        this.g = ailVar;
        this.e = aikVar;
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:35:0x00c1, B:43:0x00ed, B:44:0x00f3, B:46:0x00f7, B:47:0x010c, B:48:0x010f, B:49:0x0116, B:38:0x00cc, B:39:0x00d5, B:42:0x00e5), top: B:60:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:35:0x00c1, B:43:0x00ed, B:44:0x00f3, B:46:0x00f7, B:47:0x010c, B:48:0x010f, B:49:0x0116, B:38:0x00cc, B:39:0x00d5, B:42:0x00e5), top: B:60:0x00c1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aeq d() throws defpackage.aiz, android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aim.d():aeq");
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ail ailVar = this.g;
        synchronized (ailVar.c) {
            ailVar.e.removeMessages(1, this.e);
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
        ail ailVar = this.g;
        synchronized (ailVar.c) {
            ailVar.e.removeMessages(1, this.e);
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
