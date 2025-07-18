package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wzi implements ServiceConnection {
    final /* synthetic */ wzk a;

    public wzi(wzk wzkVar) {
        this.a = wzkVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        wxc wxcVar;
        wzk wzkVar = this.a;
        synchronized (wzkVar.c) {
            wxcVar = wzkVar.e;
        }
        wxcVar.getClass();
        wxcVar.b("onBindingDied:".concat(String.valueOf(componentName.flattenToShortString())), "com/google/apps/tiktok/tracing/TracingServiceConnection$1", "onBindingDied", 85).close();
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        wwq wwqVar;
        wxc wxcVar;
        wzk wzkVar = this.a;
        synchronized (wzkVar.c) {
            wzj wzjVar = wzkVar.d;
            wwqVar = null;
            if (wzjVar != null) {
                wwq wwqVar2 = wzjVar.a;
                wzjVar.a = null;
                uea.a().removeCallbacks(wzjVar);
                wzkVar.d = null;
                wwqVar = wwqVar2;
            }
            wxcVar = wzkVar.e;
        }
        if (wwqVar != null) {
            wwq wwqVarG = wum.g(wum.c(), wwqVar);
            try {
                this.a.a();
                return;
            } finally {
                wum.g(wum.c(), wwqVarG);
            }
        }
        wvl wvlVarB = wxcVar.b("onServiceConnected:".concat(String.valueOf(componentName.flattenToShortString())), "com/google/apps/tiktok/tracing/TracingServiceConnection$1", "onNullBinding", 113);
        try {
            this.a.a();
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        wwq wwqVar;
        wxc wxcVar;
        wzk wzkVar = this.a;
        synchronized (wzkVar.c) {
            wzj wzjVar = wzkVar.d;
            wwqVar = null;
            if (wzjVar != null) {
                wwq wwqVar2 = wzjVar.a;
                wzjVar.a = null;
                uea.a().removeCallbacks(wzjVar);
                wzkVar.d = null;
                wwqVar = wwqVar2;
            }
            wxcVar = wzkVar.e;
        }
        if (wwqVar != null) {
            wwq wwqVarG = wum.g(wum.c(), wwqVar);
            try {
                this.a.b(iBinder);
                return;
            } finally {
                wum.g(wum.c(), wwqVarG);
            }
        }
        wvl wvlVarB = wxcVar.b("onServiceConnected:".concat(String.valueOf(componentName.flattenToShortString())), "com/google/apps/tiktok/tracing/TracingServiceConnection$1", "onServiceConnected", 56);
        try {
            this.a.b(iBinder);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        wxc wxcVar;
        wzk wzkVar = this.a;
        synchronized (wzkVar.c) {
            wxcVar = wzkVar.e;
        }
        wxcVar.getClass();
        wvl wvlVarB = wxcVar.b("onServiceDisconnected:".concat(String.valueOf(componentName.flattenToShortString())), "com/google/apps/tiktok/tracing/TracingServiceConnection$1", "onServiceDisconnected", 71);
        try {
            this.a.c();
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
