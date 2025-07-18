package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import com.google.android.gms.cast.CastDevice;
import com.google.common.collect.Sets;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrg {
    public static nrg a;
    public final Map b;
    private final nmj d;
    private final nod e;
    private final nrd h;
    private final Map i;
    private final PowerManager j;
    private boolean l;
    private final obl m;
    private final Object k = new Object();
    public final Object c = new Object();
    private final Set g = Sets.newConcurrentHashSet();
    private final nrf f = new nrf(this);

    static {
        new nsf("RemoteConnectionManager");
    }

    public nrg(Context context, nmj nmjVar, nod nodVar, obl oblVar) {
        this.d = nmjVar;
        this.m = oblVar;
        nrd nrdVar = new nrd(this, 0);
        this.h = nrdVar;
        this.e = nodVar;
        nodVar.d(nrdVar);
        this.b = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.j = (PowerManager) context.getSystemService("power");
        new nre(this);
    }

    private final boolean f() {
        return this.e.e();
    }

    public final void a(Bundle bundle) {
        CastDevice castDeviceC;
        if (bundle == null || (castDeviceC = CastDevice.c(bundle)) == null) {
            return;
        }
        String string = bundle.getString("com.google.android.gms.cast.EXTRA_RUNNING_RECEIVER_APP_ID");
        Map map = this.b;
        if (map.containsKey(castDeviceC.e()) && ((nrb) map.get(castDeviceC.e())) != null) {
            throw null;
        }
        String str = this.d.d;
        if (string == null || str.isEmpty() || !string.equals(str)) {
            c(castDeviceC);
            return;
        }
        Set set = this.g;
        if (set.isEmpty()) {
            return;
        }
        synchronized (this.k) {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            Iterator it = this.b.values().iterator();
            if (it.hasNext()) {
                throw null;
            }
        }
    }

    public final void c(CastDevice castDevice) {
        if (((npj) this.i.remove(castDevice.e())) != null) {
            synchronized (this.k) {
                Iterator it = this.g.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
    }

    public final void d() {
        synchronized (this.c) {
            for (nrb nrbVar : this.b.values()) {
                f();
                PowerManager powerManager = this.j;
                if (powerManager != null) {
                    powerManager.isInteractive();
                }
                nrbVar.b();
            }
        }
    }

    public final void e() {
        fur furVarG;
        boolean zIsEmpty = this.g.isEmpty();
        if (f() || zIsEmpty) {
            if (this.l) {
                this.l = false;
                nsf.e();
                this.m.e(this.f);
                return;
            }
            return;
        }
        if (this.l) {
            return;
        }
        nsf.e();
        obl oblVar = this.m;
        nrf nrfVar = this.f;
        oblVar.e(nrfVar);
        String str = this.d.d;
        if (str.isEmpty()) {
            nsf.e();
            furVarG = null;
        } else {
            nxb nxbVar = new nxb();
            nxbVar.i(jys.C(str));
            furVarG = nxbVar.g();
        }
        if (furVarG == null) {
            nsf.e();
            return;
        }
        this.l = true;
        furVarG.b().toString();
        nsf.e();
        oblVar.f(furVarG, nrfVar);
    }
}
