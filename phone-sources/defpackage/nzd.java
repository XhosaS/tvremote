package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzd implements nws, nwt, nxz {
    public final nwj b;
    public final nxn c;
    public final int f;
    public boolean g;
    public final /* synthetic */ nzg k;
    public final pkg l;
    private final oaa m;
    public final Queue a = new LinkedList();
    public final Set d = new HashSet();
    public final Map e = new HashMap();
    public final List h = new ArrayList();
    public nve i = null;
    public int j = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public nzd(nzg nzgVar, nwq nwqVar) {
        this.k = nzgVar;
        Looper looper = nzgVar.o.getLooper();
        oav oavVarA = nwqVar.p().a();
        Object obj = nwqVar.E.c;
        ocv.aF(obj);
        nwj nwjVarB = ((ocv) obj).b(nwqVar.w, looper, oavVarA, nwqVar.y, this, this);
        kwy kwyVar = nwqVar.F;
        if (kwyVar != null) {
            ((oat) nwjVarB).L = kwyVar;
        } else {
            String str = nwqVar.x;
            if (str != null) {
                ((oat) nwjVarB).D = str;
            }
        }
        this.b = nwjVarB;
        this.c = nwqVar.z;
        this.l = new pkg();
        this.f = nwqVar.B;
        if (nwjVarB.i()) {
            this.m = new oaa(nzgVar.g, nzgVar.o, nwqVar.p().a());
        } else {
            this.m = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final nvg p(nvg[] nvgVarArr) {
        if (nvgVarArr != null && nvgVarArr.length != 0) {
            nvg[] nvgVarArrG = this.b.G();
            if (nvgVarArrG == null) {
                nvgVarArrG = new nvg[0];
            }
            ir irVar = new ir(nvgVarArrG.length);
            for (nvg nvgVar : nvgVarArrG) {
                irVar.put(nvgVar.a, Long.valueOf(nvgVar.a()));
            }
            int length = nvgVarArr.length;
            for (int i = 0; i < length; i = 1) {
                nvg nvgVar2 = nvgVarArr[0];
                Long l = (Long) irVar.get(nvgVar2.a);
                if (l == null || l.longValue() < nvgVar2.a()) {
                    return nvgVar2;
                }
            }
        }
        return null;
    }

    private final Status q(nve nveVar) {
        return nzg.a(this.c, nveVar);
    }

    private final void r(nve nveVar) {
        Set set = this.d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((nxo) it.next()).a(this.c, nveVar, a.Q(nveVar, nve.a) ? this.b.y() : null);
        }
        set.clear();
    }

    private final void s(Status status, Exception exc, boolean z) {
        ocv.av(this.k.o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            nxm nxmVar = (nxm) it.next();
            if (!z || nxmVar.c == 2) {
                if (status != null) {
                    nxmVar.d(status);
                } else {
                    nxmVar.e(exc);
                }
                it.remove();
            }
        }
    }

    private final void t(nxm nxmVar) {
        nxmVar.g(this.l, o());
        try {
            nxmVar.f(this);
        } catch (DeadObjectException unused) {
            aE(1);
            this.b.C("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean u(nxm nxmVar) {
        if (!(nxmVar instanceof nxg)) {
            t(nxmVar);
            return true;
        }
        nxg nxgVar = (nxg) nxmVar;
        nvg nvgVarP = p(nxgVar.b(this));
        if (nvgVarP == null) {
            t(nxmVar);
            return true;
        }
        String name = this.b.getClass().getName();
        long jA = nvgVarP.a();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        String str = nvgVarP.a;
        sb.append(str);
        sb.append(", ");
        sb.append(jA);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        nzg nzgVar = this.k;
        if (!nzgVar.p || !nxgVar.a(this)) {
            nxgVar.e(new nxf(nvgVarP));
            return true;
        }
        nze nzeVar = new nze(this.c, nvgVarP);
        List list = this.h;
        int iIndexOf = list.indexOf(nzeVar);
        if (iIndexOf >= 0) {
            nze nzeVar2 = (nze) list.get(iIndexOf);
            Handler handler = nzgVar.o;
            handler.removeMessages(15, nzeVar2);
            handler.sendMessageDelayed(Message.obtain(handler, 15, nzeVar2), 5000L);
            return false;
        }
        list.add(nzeVar);
        Handler handler2 = nzgVar.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, nzeVar), 5000L);
        handler2.sendMessageDelayed(Message.obtain(handler2, 16, nzeVar), 120000L);
        nve nveVar = new nve(2, null);
        if (v(nveVar)) {
            Log.w("GoogleApiManager", "A dialog should be displayed for missing feature: " + str + ", version: " + nvgVarP.a());
            return false;
        }
        if (!nzgVar.h(nveVar, this.f)) {
            return false;
        }
        Log.w("GoogleApiManager", "Notification displayed for missing feature: " + str + ", version: " + nvgVarP.a());
        return false;
    }

    private final boolean v(nve nveVar) {
        synchronized (nzg.c) {
            nzg nzgVar = this.k;
            if (nzgVar.m == null || !nzgVar.n.contains(this.c)) {
                return false;
            }
            nye nyeVar = nzgVar.m;
            zuw zuwVar = new zuw(nveVar, this.f);
            if (a.v(nyeVar.b, zuwVar)) {
                nyeVar.c.post(new yav(nyeVar, zuwVar, 1));
            }
            return true;
        }
    }

    @Override // defpackage.nzw
    public final void aC(nve nveVar) {
        i(nveVar, null);
    }

    @Override // defpackage.nyc
    public final void aD(Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.k.o;
        if (looperMyLooper == handler.getLooper()) {
            h();
        } else {
            handler.post(new nur(this, 6, null));
        }
    }

    @Override // defpackage.nyc
    public final void aE(int i) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.k.o;
        if (looperMyLooper == handler.getLooper()) {
            j(i);
        } else {
            handler.post(new csl(this, i, 15, (char[]) null));
        }
    }

    public final void c() {
        ocv.av(this.k.o);
        this.i = null;
    }

    public final void d() {
        nzg nzgVar = this.k;
        ocv.av(nzgVar.o);
        nwj nwjVar = this.b;
        if (nwjVar.D() || nwjVar.E()) {
            return;
        }
        try {
            int iA = nzgVar.i.a(nzgVar.g, nwjVar);
            if (iA != 0) {
                nve nveVar = new nve(iA, null);
                Log.w("GoogleApiManager", "The service for " + nwjVar.getClass().getName() + " is not available: " + nveVar.toString());
                aC(nveVar);
                return;
            }
            nzg nzgVar2 = this.k;
            nwj nwjVar2 = this.b;
            nzf nzfVar = new nzf(nzgVar2, nwjVar2, this.c);
            if (nwjVar2.i()) {
                oaa oaaVar = this.m;
                ocv.aF(oaaVar);
                onj onjVar = oaaVar.e;
                if (onjVar != null) {
                    onjVar.n();
                }
                oav oavVar = oaaVar.d;
                oavVar.h = Integer.valueOf(System.identityHashCode(oaaVar));
                ocv ocvVar = oaaVar.g;
                Context context = oaaVar.a;
                Handler handler = oaaVar.b;
                oaaVar.e = (onj) ocvVar.b(context, handler.getLooper(), oavVar, oavVar.g, oaaVar, oaaVar);
                oaaVar.f = nzfVar;
                Set set = oaaVar.c;
                if (set == null || set.isEmpty()) {
                    handler.post(new nur(oaaVar, 8, null));
                } else {
                    oaaVar.e.m();
                }
            }
            try {
                nwjVar2.B(nzfVar);
            } catch (SecurityException e) {
                i(new nve(10), e);
            }
        } catch (IllegalStateException e2) {
            i(new nve(10), e2);
        }
    }

    public final void e(nxm nxmVar) {
        ocv.av(this.k.o);
        if (this.b.D()) {
            if (u(nxmVar)) {
                l();
                return;
            } else {
                this.a.add(nxmVar);
                return;
            }
        }
        this.a.add(nxmVar);
        nve nveVar = this.i;
        if (nveVar == null || !nveVar.b()) {
            d();
        } else {
            aC(nveVar);
        }
    }

    public final void f(Status status) {
        ocv.av(this.k.o);
        s(status, null, false);
    }

    public final void g() {
        Queue queue = this.a;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nxm nxmVar = (nxm) arrayList.get(i);
            if (!this.b.D()) {
                return;
            }
            if (u(nxmVar)) {
                queue.remove(nxmVar);
            }
        }
    }

    public final void h() {
        c();
        r(nve.a);
        n();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((jzs) it.next()).b;
            if (p((nvg[]) ((nzx) obj).d) != null) {
                it.remove();
            } else {
                try {
                    ((nzx) obj).c(this.b, new kwy((byte[]) null, (byte[]) null));
                } catch (DeadObjectException unused) {
                    aE(3);
                    this.b.C("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        l();
    }

    public final void i(nve nveVar, Exception exc) {
        onj onjVar;
        nzg nzgVar = this.k;
        Handler handler = nzgVar.o;
        ocv.av(handler);
        oaa oaaVar = this.m;
        if (oaaVar != null && (onjVar = oaaVar.e) != null) {
            onjVar.n();
        }
        c();
        nzgVar.i.b();
        r(nveVar);
        if ((this.b instanceof ocm) && nveVar.c != 24) {
            nzgVar.f = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = nveVar.c;
        if (i == 4) {
            f(nzg.b);
            return;
        }
        if (i == 25) {
            f(q(nveVar));
            return;
        }
        Queue queue = this.a;
        if (queue.isEmpty()) {
            this.i = nveVar;
            return;
        }
        if (exc != null) {
            ocv.av(handler);
            s(null, exc, false);
            return;
        }
        if (!nzgVar.p) {
            f(q(nveVar));
            return;
        }
        s(q(nveVar), null, true);
        if (queue.isEmpty() || v(nveVar) || nzgVar.h(nveVar, this.f)) {
            return;
        }
        if (i == 18) {
            this.g = true;
        }
        if (this.g) {
            handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        } else {
            f(q(nveVar));
        }
    }

    public final void j(int i) {
        c();
        this.g = true;
        String strZ = this.b.z();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strZ != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strZ);
        }
        this.l.k(true, new Status(20, sb.toString()));
        nzg nzgVar = this.k;
        nxn nxnVar = this.c;
        Handler handler = nzgVar.o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, nxnVar), 5000L);
        handler.sendMessageDelayed(Message.obtain(handler, 11, nxnVar), 120000L);
        nzgVar.i.b();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((jzs) it.next()).a;
        }
    }

    public final void k(nve nveVar) {
        ocv.av(this.k.o);
        nwj nwjVar = this.b;
        nwjVar.C("onSignInFailed for " + nwjVar.getClass().getName() + " with " + String.valueOf(nveVar));
        aC(nveVar);
    }

    public final void l() {
        nzg nzgVar = this.k;
        Handler handler = nzgVar.o;
        nxn nxnVar = this.c;
        handler.removeMessages(12, nxnVar);
        handler.sendMessageDelayed(handler.obtainMessage(12, nxnVar), nzgVar.e);
    }

    public final void m() {
        ocv.av(this.k.o);
        Status status = nzg.a;
        f(status);
        this.l.k(false, status);
        for (nzr nzrVar : (nzr[]) this.e.keySet().toArray(new nzr[0])) {
            e(new nxl(nzrVar, new kwy((byte[]) null, (byte[]) null)));
        }
        r(new nve(4));
        nwj nwjVar = this.b;
        if (nwjVar.D()) {
            nwjVar.J(new pku(this));
        }
    }

    public final void n() {
        if (this.g) {
            nzg nzgVar = this.k;
            nxn nxnVar = this.c;
            Handler handler = nzgVar.o;
            handler.removeMessages(11, nxnVar);
            handler.removeMessages(9, nxnVar);
            this.g = false;
        }
    }

    public final boolean o() {
        return this.b.i();
    }
}
