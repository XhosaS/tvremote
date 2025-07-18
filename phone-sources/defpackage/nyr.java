package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v7.widget.ActivityChooserView;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyr implements nyx {
    public final nza a;
    public final Lock b;
    public final Context c;
    public final nvk d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final oav i;
    public onj j;
    public obm k;
    private nve l;
    private int m;
    private int o;
    private boolean r;
    private final Map s;
    private final ocv u;
    private int n = 0;
    private final Bundle p = new Bundle();
    private final Set q = new HashSet();
    private final ArrayList t = new ArrayList();

    public nyr(nza nzaVar, oav oavVar, Map map, nvk nvkVar, ocv ocvVar, Lock lock, Context context) {
        this.a = nzaVar;
        this.i = oavVar;
        this.s = map;
        this.d = nvkVar;
        this.u = ocvVar;
        this.b = lock;
        this.c = context;
    }

    private final void p() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
    }

    private final void q(boolean z) {
        onj onjVar = this.j;
        if (onjVar != null) {
            if (onjVar.D() && z) {
                try {
                    onh onhVar = (onh) onjVar.L();
                    Integer num = onjVar.a;
                    ocv.aF(num);
                    int iIntValue = num.intValue();
                    Parcel parcelK = onhVar.k();
                    parcelK.writeInt(iIntValue);
                    onhVar.m(7, parcelK);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            onjVar.n();
            ocv.aF(this.i);
            this.k = null;
        }
    }

    private final void r() {
        nza nzaVar = this.a;
        nzaVar.a.lock();
        try {
            nzaVar.l.q();
            nzaVar.j = new nyh(nzaVar);
            nzaVar.j.b();
            nzaVar.b.signalAll();
            nzaVar.a.unlock();
            nzb.a.execute(new nur(this, 5, null));
            onj onjVar = this.j;
            if (onjVar != null) {
                if (this.g) {
                    obm obmVar = this.k;
                    ocv.aF(obmVar);
                    boolean z = this.h;
                    try {
                        onh onhVar = (onh) onjVar.L();
                        Integer num = onjVar.a;
                        ocv.aF(num);
                        int iIntValue = num.intValue();
                        Parcel parcelK = onhVar.k();
                        ifl.e(parcelK, obmVar);
                        parcelK.writeInt(iIntValue);
                        parcelK.writeInt(z ? 1 : 0);
                        onhVar.m(9, parcelK);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                q(false);
            }
            nza nzaVar2 = this.a;
            Iterator it = nzaVar2.g.keySet().iterator();
            while (it.hasNext()) {
                nwj nwjVar = (nwj) nzaVar2.f.get((npj) it.next());
                ocv.aF(nwjVar);
                nwjVar.n();
            }
            Bundle bundle = this.p;
            nzaVar2.m.s(true != bundle.isEmpty() ? bundle : null);
        } catch (Throwable th) {
            nzaVar.a.unlock();
            throw th;
        }
    }

    private static final String s(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    @Override // defpackage.nyx
    public final nxr a(nxr nxrVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.nyx
    public final void b() {
        nza nzaVar = this.a;
        nzaVar.g.clear();
        this.e = false;
        this.l = null;
        this.n = 0;
        this.r = true;
        this.f = false;
        this.g = false;
        HashMap map = new HashMap();
        Map map2 = this.s;
        for (jzs jzsVar : map2.keySet()) {
            Map map3 = nzaVar.f;
            Object obj = jzsVar.b;
            nwj nwjVar = (nwj) map3.get(obj);
            ocv.aF(nwjVar);
            ((ocv) jzsVar.c).aO();
            boolean zBooleanValue = ((Boolean) map2.get(jzsVar)).booleanValue();
            if (nwjVar.i()) {
                this.e = true;
                if (zBooleanValue) {
                    this.q.add(obj);
                } else {
                    this.r = false;
                }
            }
            map.put(nwjVar, new nyi(this, jzsVar, zBooleanValue));
        }
        if (this.e) {
            oav oavVar = this.i;
            ocv.aF(oavVar);
            ocv ocvVar = this.u;
            ocv.aF(ocvVar);
            nyw nywVar = nzaVar.l;
            oavVar.h = Integer.valueOf(System.identityHashCode(nywVar));
            nyp nypVar = new nyp(this);
            this.j = (onj) ocvVar.b(this.c, nywVar.f, oavVar, oavVar.g, nypVar, nypVar);
        }
        this.o = ((ko) nzaVar.f).d;
        this.t.add(nzb.a.submit(new nyl(this, map)));
    }

    @Override // defpackage.nyx
    public final void d(Bundle bundle) {
        if (l(1)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (m()) {
                r();
            }
        }
    }

    @Override // defpackage.nyx
    public final void e(int i) {
        j(new nve(8, null));
    }

    @Override // defpackage.nyx
    public final void f(nxr nxrVar) {
        this.a.l.g.add(nxrVar);
    }

    @Override // defpackage.nyx
    public final void g() {
        p();
        q(true);
        this.a.i();
    }

    @Override // defpackage.nyx
    public final void h(nve nveVar, jzs jzsVar, boolean z) {
        if (l(1)) {
            o(nveVar, jzsVar, z);
            if (m()) {
                r();
            }
        }
    }

    public final void i() {
        this.e = false;
        nza nzaVar = this.a;
        nzaVar.l.j = Collections.EMPTY_SET;
        for (npj npjVar : this.q) {
            Map map = nzaVar.g;
            if (!map.containsKey(npjVar)) {
                map.put(npjVar, new nve(17, null));
            }
        }
    }

    public final void j(nve nveVar) {
        p();
        q(!nveVar.b());
        nza nzaVar = this.a;
        nzaVar.i();
        nzaVar.m.r(nveVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        if (this.o != 0) {
            return;
        }
        if (!this.e || this.f) {
            ArrayList arrayList = new ArrayList();
            this.n = 1;
            nza nzaVar = this.a;
            Map map = nzaVar.f;
            this.o = ((ko) map).d;
            for (npj npjVar : map.keySet()) {
                if (!nzaVar.g.containsKey(npjVar)) {
                    arrayList.add((nwj) map.get(npjVar));
                } else if (m()) {
                    r();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.t.add(nzb.a.submit(new nym(this, arrayList)));
        }
    }

    public final boolean l(int i) {
        if (this.n == i) {
            return true;
        }
        Log.w("GACConnecting", this.a.l.m());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.o);
        Log.e("GACConnecting", "GoogleApiClient connecting is in step " + s(this.n) + " but received callback for step " + s(i), new Exception());
        j(new nve(8, null));
        return false;
    }

    public final boolean m() {
        int i = this.o - 1;
        this.o = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.a.l.m());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            j(new nve(8, null));
            return false;
        }
        nve nveVar = this.l;
        if (nveVar == null) {
            return true;
        }
        this.a.k = this.m;
        j(nveVar);
        return false;
    }

    public final boolean n(nve nveVar) {
        return this.r && !nveVar.b();
    }

    public final void o(nve nveVar, jzs jzsVar, boolean z) {
        ((ocv) jzsVar.c).aO();
        if ((!z || nveVar.b() || this.d.i(null, nveVar.c, null) != null) && this.l == null) {
            this.l = nveVar;
            this.m = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        nza nzaVar = this.a;
        nzaVar.g.put(jzsVar.b, nveVar);
    }

    @Override // defpackage.nyx
    public final void c() {
    }
}
