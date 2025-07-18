package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcv implements gcd {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/led/controller/LegacyLedController");
    private final Context c;
    private final Boolean d;
    private final fjt e;
    private final jcy f;
    private final Executor g;
    private final PackageManager h;
    private boolean j;
    private gcj k;
    gcx b = null;
    private ServiceConnection i = null;

    public gcv(Context context, Boolean bool, fjt fjtVar, jcy jcyVar, Executor executor, PackageManager packageManager) {
        this.c = context;
        this.d = bool;
        this.e = fjtVar;
        this.f = jcyVar;
        this.g = executor;
        this.h = packageManager;
    }

    private final Intent b(String str) {
        ServiceInfo serviceInfo;
        List<ResolveInfo> listQueryIntentServices = this.h.queryIntentServices(new Intent(str), 0);
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                ((zdv) ((zdv) a.b()).q("com/google/android/apps/tvsearch/led/controller/LegacyLedController", "getServiceWithAction", 283, "LegacyLedController.java")).x("Failed to find service with action=%s", str);
                serviceInfo = null;
                break;
            }
            ResolveInfo next = it.next();
            if (next.serviceInfo != null && gzt.a(next.serviceInfo.applicationInfo)) {
                ServiceInfo serviceInfo2 = listQueryIntentServices.get(0).serviceInfo;
                serviceInfo = next.serviceInfo;
                break;
            }
        }
        if (serviceInfo == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setAction(str);
        intent.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
        return intent;
    }

    private final void k(gcj gcjVar, gcu gcuVar) {
        ServiceConnection serviceConnection;
        ServiceConnection serviceConnection2;
        if (gce.a(this.d.booleanValue(), this.j, gcjVar)) {
            this.k = gcjVar;
            gcjVar.name();
            gcx gcxVar = this.b;
            if (gcxVar != null) {
                try {
                    if (gcxVar.a() - 1 != 0) {
                        gcuVar.a(gcxVar.b());
                        return;
                    } else {
                        gcxVar.c();
                        return;
                    }
                } catch (Exception e) {
                    ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/apps/tvsearch/led/controller/LegacyLedController", "withLedService", (char) 227, "LegacyLedController.java")).u("Exception when calling LedService");
                }
            }
            this.i = new gcs(this, gcuVar);
            Intent intentB = b("com.google.android.assistant.led.FixedStateLedService");
            if (intentB == null || (serviceConnection2 = this.i) == null || !this.c.bindService(intentB, serviceConnection2, 65)) {
                this.i = new gcr(this);
                Intent intentB2 = b("com.google.android.assistant.led.LedService");
                if (intentB2 == null || (serviceConnection = this.i) == null) {
                    return;
                }
                this.c.bindService(intentB2, serviceConnection, 65);
            }
        }
    }

    @Override // defpackage.gcd
    public final void a() {
        k(gcj.i, new gcu() { // from class: gcp
            @Override // defpackage.gcu
            public final void a(IInterface iInterface) {
                ert ertVar = (ert) iInterface;
                Parcel parcelB = ertVar.b(7, ertVar.a());
                int i = parcelB.readInt();
                parcelB.recycle();
                ((jrx) iInterface).e(i);
            }
        });
    }

    @Override // defpackage.gcd
    public final void c() {
        k(gcj.a, new gcu() { // from class: gcl
            @Override // defpackage.gcu
            public final void a(IInterface iInterface) {
                ert ertVar = (ert) iInterface;
                Parcel parcelB = ertVar.b(1, ertVar.a());
                int i = parcelB.readInt();
                parcelB.recycle();
                ((jrx) iInterface).e(i);
            }
        });
    }

    @Override // defpackage.gcd
    public final void d() {
        k(gcj.e, new gcu() { // from class: gcn
            @Override // defpackage.gcu
            public final void a(IInterface iInterface) {
                ert ertVar = (ert) iInterface;
                Parcel parcelB = ertVar.b(5, ertVar.a());
                int i = parcelB.readInt();
                parcelB.recycle();
                ((jrx) iInterface).e(i);
            }
        });
    }

    @Override // defpackage.gcd
    public final void e() {
        gcj gcjVar = this.k;
        gcj gcjVar2 = gcj.g;
        if (gcjVar == gcjVar2 || this.k == gcj.d) {
            return;
        }
        k(gcjVar2, new gcu() { // from class: gcm
            @Override // defpackage.gcu
            public final void a(IInterface iInterface) {
                ert ertVar = (ert) iInterface;
                Parcel parcelB = ertVar.b(6, ertVar.a());
                int i = parcelB.readInt();
                parcelB.recycle();
                ((jrx) iInterface).e(i);
            }
        });
    }

    @Override // defpackage.gcd
    public final void f() {
        e();
    }

    @Override // defpackage.gcd
    public final void g() {
        k(gcj.c, new gcu() { // from class: gck
            @Override // defpackage.gcu
            public final void a(IInterface iInterface) {
                ert ertVar = (ert) iInterface;
                Parcel parcelB = ertVar.b(3, ertVar.a());
                int i = parcelB.readInt();
                parcelB.recycle();
                ((jrx) iInterface).e(i);
            }
        });
    }

    @Override // defpackage.gcd
    public final void h(boolean z) {
        if (!z) {
            j();
        }
        this.j = z;
    }

    @Override // defpackage.gcd
    public final void i() {
        k(gcj.b, new gcu() { // from class: gco
            @Override // defpackage.gcu
            public final void a(IInterface iInterface) {
                ert ertVar = (ert) iInterface;
                Parcel parcelB = ertVar.b(2, ertVar.a());
                int i = parcelB.readInt();
                parcelB.recycle();
                ((jrx) iInterface).e(i);
            }
        });
    }

    @Override // defpackage.gcd
    public final void j() {
        jcy jcyVar = this.f;
        if (jcyVar.b()) {
            if (jcyVar.d()) {
                e();
                return;
            } else {
                d();
                return;
            }
        }
        zyd zydVarA = this.e.a();
        gcq gcqVar = new gcq(this);
        zxn.p(zydVarA, wyo.f(gcqVar), this.g);
    }
}
