package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
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
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kgq implements ket, keu {
    public final keg b;
    public final kfq c;
    public final kgg d;
    public final int g;
    public boolean h;
    public final /* synthetic */ kgu l;
    private final khy m;
    public final Queue a = new LinkedList();
    public final Set e = new HashSet();
    public final Map f = new HashMap();
    public final List i = new ArrayList();
    public ConnectionResult j = null;
    public int k = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public kgq(kgu kguVar, kes kesVar) {
        this.l = kguVar;
        keg kegVarA = kesVar.e.a.a(kesVar.b, kguVar.o.getLooper(), kesVar.f().a(), kesVar.f, this, this);
        kly klyVar = kesVar.d;
        if (klyVar != null) {
            ((kiz) kegVarA).n = klyVar;
        } else {
            String str = kesVar.c;
            if (str != null) {
                ((kiz) kegVarA).m = str;
            }
        }
        this.b = kegVarA;
        this.c = kesVar.g;
        this.d = new kgg();
        this.g = kesVar.i;
        if (kegVarA.o()) {
            this.m = new khy(kguVar.g, kguVar.o, kesVar.f().a(), khy.a);
        } else {
            this.m = null;
        }
    }

    private final Feature q(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] featureArrP = this.b.p();
            if (featureArrP == null) {
                featureArrP = new Feature[0];
            }
            we weVar = new we(featureArrP.length);
            for (Feature feature : featureArrP) {
                weVar.put(feature.a, Long.valueOf(feature.a()));
            }
            int length = featureArr.length;
            for (int i = 0; i < length; i = 1) {
                Feature feature2 = featureArr[0];
                Long l = (Long) weVar.get(feature2.a);
                if (l == null || l.longValue() < feature2.a()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    private final void r(ConnectionResult connectionResult) {
        Set set = this.e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((kfr) it.next()).a(this.c, connectionResult, kki.a(connectionResult, ConnectionResult.a) ? this.b.h() : null);
        }
        set.clear();
    }

    private final void s(Status status, Exception exc, boolean z) {
        kkk.d(this.l.o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            kfo kfoVar = (kfo) it.next();
            if (!z || kfoVar.c == 2) {
                if (status != null) {
                    kfoVar.d(status);
                } else {
                    kfoVar.e(exc);
                }
                it.remove();
            }
        }
    }

    private final void t(kfo kfoVar) {
        kfoVar.g(this.d, p());
        try {
            kfoVar.f(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.b.l("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean u(kfo kfoVar) {
        if (!(kfoVar instanceof kfi)) {
            t(kfoVar);
            return true;
        }
        kfi kfiVar = (kfi) kfoVar;
        Feature featureQ = q(kfiVar.b(this));
        if (featureQ == null) {
            t(kfoVar);
            return true;
        }
        String name = this.b.getClass().getName();
        long jA = featureQ.a();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        String str = featureQ.a;
        sb.append(str);
        sb.append(", ");
        sb.append(jA);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        kgu kguVar = this.l;
        if (!kguVar.p || !kfiVar.a(this)) {
            kfiVar.e(new kfh(featureQ));
            return true;
        }
        kgr kgrVar = new kgr(this.c, featureQ);
        List list = this.i;
        int iIndexOf = list.indexOf(kgrVar);
        if (iIndexOf >= 0) {
            kgr kgrVar2 = (kgr) list.get(iIndexOf);
            Handler handler = kguVar.o;
            handler.removeMessages(15, kgrVar2);
            handler.sendMessageDelayed(Message.obtain(handler, 15, kgrVar2), 5000L);
            return false;
        }
        list.add(kgrVar);
        Handler handler2 = kguVar.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, kgrVar), 5000L);
        handler2.sendMessageDelayed(Message.obtain(handler2, 16, kgrVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null);
        if (v(connectionResult)) {
            Log.w("GoogleApiManager", "A dialog should be displayed for missing feature: " + str + ", version: " + featureQ.a());
            return false;
        }
        if (!kguVar.i(connectionResult, this.g)) {
            return false;
        }
        Log.w("GoogleApiManager", "Notification displayed for missing feature: " + str + ", version: " + featureQ.a());
        return false;
    }

    private final boolean v(ConnectionResult connectionResult) {
        synchronized (kgu.c) {
            kgu kguVar = this.l;
            if (kguVar.m == null || !kguVar.n.contains(this.c)) {
                return false;
            }
            kgh kghVar = kguVar.m;
            kfw kfwVar = new kfw(connectionResult, this.g);
            AtomicReference atomicReference = kghVar.b;
            while (true) {
                if (atomicReference.compareAndSet(null, kfwVar)) {
                    kghVar.c.post(new kfy(kghVar, kfwVar));
                    break;
                }
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return true;
        }
    }

    @Override // defpackage.kgd
    public final void a(int i) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.l.o;
        if (looperMyLooper == handler.getLooper()) {
            k(i);
        } else {
            handler.post(new kgn(this, i));
        }
    }

    @Override // defpackage.kgd
    public final void b() {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.l.o;
        if (looperMyLooper == handler.getLooper()) {
            h();
        } else {
            handler.post(new kgm(this));
        }
    }

    public final void c() {
        kkk.d(this.l.o);
        this.j = null;
    }

    public final void d() {
        int iG;
        kgu kguVar = this.l;
        kkk.d(kguVar.o);
        keg kegVar = this.b;
        if (kegVar.m() || kegVar.n()) {
            return;
        }
        try {
            kjv kjvVar = kguVar.i;
            Context context = kguVar.g;
            kkk.k(context);
            kkk.k(kegVar);
            kegVar.r();
            int iA = kegVar.a();
            int iB = kjvVar.b(iA);
            if (iB == -1) {
                SparseIntArray sparseIntArray = kjvVar.a;
                synchronized (sparseIntArray) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= sparseIntArray.size()) {
                            i = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i2);
                        if (iKeyAt > iA && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    iG = i == -1 ? kjvVar.b.g(context, iA) : i;
                    sparseIntArray.put(iA, iG);
                }
                iB = iG;
            }
            if (iB != 0) {
                ConnectionResult connectionResult = new ConnectionResult(1, iB, null, null);
                Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + connectionResult.toString());
                j(connectionResult, null);
                return;
            }
            kgu kguVar2 = this.l;
            keg kegVar2 = this.b;
            kgt kgtVar = new kgt(kguVar2, kegVar2, this.c);
            if (kegVar2.o()) {
                khy khyVar = this.m;
                kkk.k(khyVar);
                ltx ltxVar = khyVar.h;
                if (ltxVar != null) {
                    ltxVar.z();
                }
                kjd kjdVar = khyVar.f;
                kjdVar.g = Integer.valueOf(System.identityHashCode(khyVar));
                kdy kdyVar = khyVar.d;
                Context context2 = khyVar.b;
                Handler handler = khyVar.c;
                ltq ltqVar = kjdVar.f;
                khyVar.h = ((lto) kdyVar).c(context2, handler.getLooper(), kjdVar, khyVar, khyVar);
                khyVar.g = kgtVar;
                Set set = khyVar.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new khw(khyVar));
                } else {
                    ltx ltxVar2 = khyVar.h;
                    ltxVar2.k(new kiw(ltxVar2));
                }
            }
            try {
                kegVar2.k(kgtVar);
            } catch (SecurityException e) {
                j(new ConnectionResult(1, 10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            j(new ConnectionResult(1, 10, null, null), e2);
        }
    }

    public final void e(kfo kfoVar) {
        kkk.d(this.l.o);
        if (this.b.m()) {
            if (u(kfoVar)) {
                m();
                return;
            } else {
                this.a.add(kfoVar);
                return;
            }
        }
        this.a.add(kfoVar);
        ConnectionResult connectionResult = this.j;
        if (connectionResult == null || !connectionResult.b()) {
            d();
        } else {
            j(connectionResult, null);
        }
    }

    public final void f(Status status) {
        kkk.d(this.l.o);
        s(status, null, false);
    }

    public final void g() {
        Queue queue = this.a;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kfo kfoVar = (kfo) arrayList.get(i);
            if (!this.b.m()) {
                return;
            }
            if (u(kfoVar)) {
                queue.remove(kfoVar);
            }
        }
    }

    public final void h() {
        c();
        r(ConnectionResult.a);
        o();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            kho khoVar = ((khp) it.next()).a;
            if (q(khoVar.b) != null) {
                it.remove();
            } else {
                try {
                    khoVar.a(this.b, new lvj());
                } catch (DeadObjectException unused) {
                    a(3);
                    this.b.l("DeadObjectException thrown while calling register listener method.");
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
        m();
    }

    @Override // defpackage.khm
    public final void i(ConnectionResult connectionResult) {
        j(connectionResult, null);
    }

    public final void j(ConnectionResult connectionResult, Exception exc) {
        ltx ltxVar;
        kgu kguVar = this.l;
        Handler handler = kguVar.o;
        kkk.d(handler);
        khy khyVar = this.m;
        if (khyVar != null && (ltxVar = khyVar.h) != null) {
            ltxVar.z();
        }
        c();
        kguVar.i.a();
        r(connectionResult);
        if ((this.b instanceof klc) && connectionResult.c != 24) {
            kguVar.f = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = connectionResult.c;
        if (i == 4) {
            f(kgu.b);
            return;
        }
        if (i == 25) {
            f(kgu.a(this.c, connectionResult));
            return;
        }
        Queue queue = this.a;
        if (queue.isEmpty()) {
            this.j = connectionResult;
            return;
        }
        if (exc != null) {
            kkk.d(handler);
            s(null, exc, false);
            return;
        }
        if (!kguVar.p) {
            f(kgu.a(this.c, connectionResult));
            return;
        }
        kfq kfqVar = this.c;
        s(kgu.a(kfqVar, connectionResult), null, true);
        if (queue.isEmpty() || v(connectionResult) || kguVar.i(connectionResult, this.g)) {
            return;
        }
        if (i == 18) {
            this.h = true;
        }
        if (this.h) {
            handler.sendMessageDelayed(Message.obtain(handler, 9, kfqVar), 5000L);
        } else {
            f(kgu.a(kfqVar, connectionResult));
        }
    }

    public final void k(int i) {
        c();
        this.h = true;
        String strI = this.b.i();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strI != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strI);
        }
        this.d.a(true, new Status(20, sb.toString(), null, null));
        kgu kguVar = this.l;
        kfq kfqVar = this.c;
        Handler handler = kguVar.o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, kfqVar), 5000L);
        handler.sendMessageDelayed(Message.obtain(handler, 11, kfqVar), 120000L);
        kguVar.i.a();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            Runnable runnable = ((khp) it.next()).c;
        }
    }

    public final void l(ConnectionResult connectionResult) {
        kkk.d(this.l.o);
        keg kegVar = this.b;
        kegVar.l("onSignInFailed for " + kegVar.getClass().getName() + " with " + String.valueOf(connectionResult));
        j(connectionResult, null);
    }

    public final void m() {
        kgu kguVar = this.l;
        Handler handler = kguVar.o;
        kfq kfqVar = this.c;
        handler.removeMessages(12, kfqVar);
        handler.sendMessageDelayed(handler.obtainMessage(12, kfqVar), kguVar.e);
    }

    public final void n() {
        kkk.d(this.l.o);
        Status status = kgu.a;
        f(status);
        this.d.a(false, status);
        for (khg khgVar : (khg[]) this.f.keySet().toArray(new khg[0])) {
            e(new kfn(khgVar, new lvj()));
        }
        r(new ConnectionResult(1, 4, null, null));
        keg kegVar = this.b;
        if (kegVar.m()) {
            kegVar.q(new kgp(this));
        }
    }

    public final void o() {
        if (this.h) {
            kgu kguVar = this.l;
            kfq kfqVar = this.c;
            Handler handler = kguVar.o;
            handler.removeMessages(11, kfqVar);
            handler.removeMessages(9, kfqVar);
            this.h = false;
        }
    }

    public final boolean p() {
        return this.b.o();
    }
}
