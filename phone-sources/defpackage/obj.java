package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obj implements ServiceConnection {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final obh e;
    public ComponentName f;
    public final /* synthetic */ obi g;

    public obj(obi obiVar, obh obhVar) {
        this.g = obiVar;
        this.e = obhVar;
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

    public final nve d(String str) throws Throwable {
        obx obxVar;
        Intent component;
        Bundle bundleCall;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        obi obiVar;
        ocn ocnVar;
        Context context;
        obh obhVar;
        nve nveVar;
        try {
            Context context2 = this.g.d;
            obh obhVar2 = this.e;
            Uri uri = occ.a;
            String str2 = obhVar2.a;
            try {
                if (str2 == null) {
                    component = new Intent().setComponent(obhVar2.c);
                } else {
                    Intent intent = null;
                    if (obhVar2.e) {
                        Bundle bundle = new Bundle();
                        bundle.putString("serviceActionBundleKey", str2);
                        try {
                            contentProviderClientAcquireUnstableContentProviderClient = context2.getContentResolver().acquireUnstableContentProviderClient(occ.a);
                        } catch (RemoteException | IllegalArgumentException e) {
                            Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                            bundleCall = null;
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new RemoteException("Failed to acquire ContentProviderClient");
                        }
                        try {
                            bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            if (bundleCall != null) {
                                Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                                if (intent2 != null) {
                                    intent = intent2;
                                } else {
                                    PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                                    if (pendingIntent != null) {
                                        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action " + str2 + " but has possible resolution");
                                        throw new obx(new nve(25, pendingIntent));
                                    }
                                }
                            }
                            if (intent == null) {
                                Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str2));
                            }
                        } catch (Throwable th) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            throw th;
                        }
                    }
                    component = intent;
                    if (component == null) {
                        component = new Intent(str2).setPackage(obhVar2.b);
                    }
                }
                Intent intent3 = component;
                this.b = 3;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                if (Build.VERSION.SDK_INT >= 31) {
                    StrictMode.setVmPolicy(ocv.d(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
                }
                try {
                    obiVar = this.g;
                    ocnVar = obiVar.f;
                    context = obiVar.d;
                    obhVar = this.e;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    boolean zD = ocnVar.d(context, str, intent3, this, 4225);
                    this.c = zD;
                    if (zD) {
                        obiVar.e.sendMessageDelayed(obiVar.e.obtainMessage(1, obhVar), obiVar.g);
                        nveVar = nve.a;
                    } else {
                        this.b = 2;
                        try {
                            ocnVar.b(context, this);
                        } catch (IllegalArgumentException unused) {
                        }
                        nveVar = new nve(16);
                    }
                    StrictMode.setVmPolicy(vmPolicy);
                    return nveVar;
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th4;
                }
            } catch (obx e2) {
                obxVar = e2;
                return obxVar.a;
            }
        } catch (obx e3) {
            obxVar = e3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        obi obiVar = this.g;
        synchronized (obiVar.c) {
            obiVar.e.removeMessages(1, this.e);
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
        obi obiVar = this.g;
        synchronized (obiVar.c) {
            obiVar.e.removeMessages(1, this.e);
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
