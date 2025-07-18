package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gua implements gsx, gqg {
    public static final String a = gpn.a("SystemFgDispatcher");
    public static final /* synthetic */ int k = 0;
    public final grs b;
    public final Object c = new Object();
    gun d;
    final Map e;
    public final Map f;
    public final Map g;
    public gtz h;
    public final isy i;
    public final cb j;
    private final Context l;

    public gua(Context context) {
        this.l = context;
        grs grsVarH = grs.h(context);
        this.b = grsVarH;
        this.i = grsVarH.k;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.j = new cb(grsVarH.i);
        grsVarH.e.c(this);
    }

    @Override // defpackage.gqg
    public final void a(gun gunVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            yqe yqeVar = ((guw) this.f.remove(gunVar)) != null ? (yqe) this.g.remove(gunVar) : null;
            if (yqeVar != null) {
                yqeVar.t(null);
            }
        }
        Map map = this.e;
        gpd gpdVar = (gpd) map.remove(gunVar);
        if (gunVar.equals(this.d)) {
            if (map.size() > 0) {
                Iterator it = map.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (gun) entry.getKey();
                if (this.h != null) {
                    gpd gpdVar2 = (gpd) entry.getValue();
                    gtz gtzVar = this.h;
                    int i = gpdVar2.a;
                    gtzVar.c(i, gpdVar2.b, gpdVar2.c);
                    this.h.a(i);
                }
            } else {
                this.d = null;
            }
        }
        gtz gtzVar2 = this.h;
        if (gpdVar == null || gtzVar2 == null) {
            return;
        }
        gpn.b();
        int i2 = gpdVar.a;
        Objects.toString(gunVar);
        int i3 = gpdVar.b;
        gtzVar2.a(i2);
    }

    public final void b(Intent intent) {
        if (this.h == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        gun gunVar = new gun(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        gpn.b();
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        gpd gpdVar = new gpd(intExtra, notification, intExtra2);
        Map map = this.e;
        map.put(gunVar, gpdVar);
        gpd gpdVar2 = (gpd) map.get(this.d);
        if (gpdVar2 == null) {
            this.d = gunVar;
        } else {
            this.h.b(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((gpd) ((Map.Entry) it.next()).getValue()).b;
                }
                gpdVar = new gpd(gpdVar2.a, gpdVar2.c, i);
            } else {
                gpdVar = gpdVar2;
            }
        }
        this.h.c(gpdVar.a, gpdVar.b, gpdVar.c);
    }

    public final void c() {
        this.h = null;
        synchronized (this.c) {
            Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                ((yqe) it.next()).t(null);
            }
        }
        this.b.e.d(this);
    }

    public final void d(int i) {
        gpn.b();
        for (Map.Entry entry : this.e.entrySet()) {
            if (((gpd) entry.getValue()).b == i) {
                this.b.k((gun) entry.getKey(), -128);
            }
        }
        gtz gtzVar = this.h;
        if (gtzVar != null) {
            gtzVar.d();
        }
    }

    @Override // defpackage.gsx
    public final void e(guw guwVar, fki fkiVar) {
        if (fkiVar instanceof gst) {
            gpn.b();
            this.b.k(fki.aM(guwVar), ((gst) fkiVar).a);
        }
    }
}
