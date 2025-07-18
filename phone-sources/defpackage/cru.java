package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cru implements Handler.Callback, ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    public cru(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper(), this);
    }

    private final void a(crt crtVar) {
        if (crtVar.b) {
            this.b.unbindService(this);
            crtVar.b = false;
        }
        crtVar.e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(defpackage.crt r11) {
        /*
            r10 = this;
            java.util.ArrayDeque r0 = r11.c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La
            goto Lab
        La:
            boolean r1 = r11.b
            java.lang.String r2 = "NotifManCompat"
            r3 = 0
            if (r1 == 0) goto L12
            goto L45
        L12:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r4 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r1.<init>(r4)
            android.content.ComponentName r4 = r11.a
            android.content.Intent r1 = r1.setComponent(r4)
            android.content.Context r5 = r10.b
            r6 = 33
            boolean r1 = r5.bindService(r1, r10, r6)
            r11.b = r1
            if (r1 == 0) goto L2e
            r11.d = r3
            goto L41
        L2e:
            java.util.Objects.toString(r4)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "Unable to bind to listener "
            java.lang.String r1 = r4.concat(r1)
            android.util.Log.w(r2, r1)
            r5.unbindService(r10)
        L41:
            boolean r1 = r11.b
            if (r1 == 0) goto Lac
        L45:
            di r1 = r11.e
            if (r1 == 0) goto Lac
        L49:
            java.lang.Object r1 = r0.peek()
            crs r1 = (defpackage.crs) r1
            if (r1 != 0) goto L52
            goto La0
        L52:
            di r4 = r11.e     // Catch: android.os.RemoteException -> L8d android.os.DeadObjectException -> La0
            android.app.Notification r5 = r1.d     // Catch: android.os.RemoteException -> L8d android.os.DeadObjectException -> La0
            java.lang.String r6 = r1.c     // Catch: android.os.RemoteException -> L8d android.os.DeadObjectException -> La0
            int r7 = r1.b     // Catch: android.os.RemoteException -> L8d android.os.DeadObjectException -> La0
            java.lang.String r1 = r1.a     // Catch: android.os.RemoteException -> L8d android.os.DeadObjectException -> La0
            java.lang.String r8 = "android.support.v4.app.INotificationSideChannel"
            android.os.Parcel r9 = android.os.Parcel.obtain()     // Catch: android.os.RemoteException -> L8d android.os.DeadObjectException -> La0
            r9.writeInterfaceToken(r8)     // Catch: java.lang.Throwable -> L88
            r9.writeString(r1)     // Catch: java.lang.Throwable -> L88
            r9.writeInt(r7)     // Catch: java.lang.Throwable -> L88
            r9.writeString(r6)     // Catch: java.lang.Throwable -> L88
            r1 = 1
            if (r5 == 0) goto L78
            r9.writeInt(r1)     // Catch: java.lang.Throwable -> L88
            r5.writeToParcel(r9, r3)     // Catch: java.lang.Throwable -> L88
            goto L7b
        L78:
            r9.writeInt(r3)     // Catch: java.lang.Throwable -> L88
        L7b:
            android.os.IBinder r4 = r4.a     // Catch: java.lang.Throwable -> L88
            r5 = 0
            r4.transact(r1, r9, r5, r1)     // Catch: java.lang.Throwable -> L88
            r9.recycle()     // Catch: android.os.RemoteException -> L8d android.os.DeadObjectException -> La0
            r0.remove()     // Catch: android.os.RemoteException -> L8d android.os.DeadObjectException -> La0
            goto L49
        L88:
            r0 = move-exception
            r9.recycle()     // Catch: android.os.RemoteException -> L8d android.os.DeadObjectException -> La0
            throw r0     // Catch: android.os.RemoteException -> L8d android.os.DeadObjectException -> La0
        L8d:
            r0 = move-exception
            android.content.ComponentName r1 = r11.a
            java.util.Objects.toString(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "RemoteException communicating with "
            java.lang.String r1 = r3.concat(r1)
            android.util.Log.w(r2, r1, r0)
        La0:
            java.util.ArrayDeque r0 = r11.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lab
            r10.c(r11)
        Lab:
            return
        Lac:
            r10.c(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cru.b(crt):void");
    }

    private final void c(crt crtVar) {
        ComponentName componentName = crtVar.a;
        Handler handler = this.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = crtVar.d + 1;
        crtVar.d = i;
        if (i <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r3) * 1000);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = crtVar.c;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(crtVar.d);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [android.os.IBinder, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Set set;
        di diVar;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    crt crtVar = (crt) this.d.get((ComponentName) message.obj);
                    if (crtVar != null) {
                        a(crtVar);
                    }
                    return true;
                }
                if (i != 3) {
                    return false;
                }
                crt crtVar2 = (crt) this.d.get((ComponentName) message.obj);
                if (crtVar2 != null) {
                    b(crtVar2);
                }
                return true;
            }
            dhk dhkVar = (dhk) message.obj;
            Object obj = dhkVar.a;
            ?? r10 = dhkVar.b;
            crt crtVar3 = (crt) this.d.get(obj);
            if (crtVar3 != null) {
                if (r10 == 0) {
                    diVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = r10.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    diVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof di)) ? new di(r10) : (di) iInterfaceQueryLocalInterface;
                }
                crtVar3.e = diVar;
                crtVar3.d = 0;
                b(crtVar3);
            }
            return true;
        }
        crs crsVar = (crs) message.obj;
        Context context = this.b;
        Object obj2 = crv.a;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (crv.a) {
            if (string != null) {
                if (!string.equals(crv.b)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    crv.c = hashSet;
                    crv.b = string;
                }
                set = crv.c;
            } else {
                set = crv.c;
            }
        }
        if (!set.equals(this.e)) {
            this.e = set;
            List<ResolveInfo> listQueryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet2 = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (set.contains(resolveInfo.serviceInfo.packageName)) {
                    ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", a.cj(componentName, "Permission present on component ", ", not adding listener record."));
                    } else {
                        hashSet2.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet2) {
                Map map = this.d;
                if (!map.containsKey(componentName2)) {
                    map.put(componentName2, new crt(componentName2));
                }
            }
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet2.contains(entry.getKey())) {
                    a((crt) entry.getValue());
                    it.remove();
                }
            }
        }
        for (crt crtVar4 : this.d.values()) {
            crtVar4.c.add(crsVar);
            b(crtVar4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.obtainMessage(1, new dhk(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
