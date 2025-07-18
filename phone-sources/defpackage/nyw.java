package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyw extends nwu implements nzm {
    public final Lock b;
    public final obg c;
    public final Context e;
    public final Looper f;
    nzj h;
    public final Map i;
    final oav k;
    final Map l;
    final oah m;
    final ocv n;
    private final int o;
    private volatile boolean p;
    private final nyu s;
    private final nvj t;
    private final ArrayList u;
    private final obf w;
    public nzn d = null;
    public final Queue g = new LinkedList();
    private long q = 120000;
    private long r = 5000;
    Set j = new HashSet();
    private final kwy x = new kwy((short[]) null);
    private Integer v = null;

    public nyw(Context context, Lock lock, Looper looper, oav oavVar, nvj nvjVar, ocv ocvVar, Map map, List list, List list2, Map map2, ArrayList arrayList) {
        nyt nytVar = new nyt(this);
        this.w = nytVar;
        this.e = context;
        this.b = lock;
        this.c = new obg(looper, nytVar);
        this.f = looper;
        this.s = new nyu(this, looper);
        this.t = nvjVar;
        this.o = -1;
        this.l = map;
        this.i = map2;
        this.u = arrayList;
        this.m = new oah();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.b((nws) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.c.c((nwt) it2.next());
        }
        this.k = oavVar;
        this.n = ocvVar;
    }

    public static int l(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        boolean zI = false;
        boolean zK = false;
        while (it.hasNext()) {
            nwj nwjVar = (nwj) it.next();
            zI |= nwjVar.i();
            zK |= nwjVar.k();
        }
        if (zI) {
            return (zK && z) ? 2 : 1;
        }
        return 3;
    }

    static String n(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    @Override // defpackage.nwu
    public final Looper a() {
        return this.f;
    }

    @Override // defpackage.nwu
    public final nxr b(nxr nxrVar) {
        boolean zContainsKey = this.i.containsKey(nxrVar.g);
        jzs jzsVar = nxrVar.h;
        ocv.au(zContainsKey, a.cg((String) (jzsVar != null ? jzsVar.a : "the API"), "GoogleApiClient is not configured to use ", " required for this call."));
        Lock lock = this.b;
        lock.lock();
        try {
            nzn nznVar = this.d;
            if (nznVar == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (!this.p) {
                return nznVar.b(nxrVar);
            }
            Queue queue = this.g;
            queue.add(nxrVar);
            while (!queue.isEmpty()) {
                nxr nxrVar2 = (nxr) queue.remove();
                this.m.a(nxrVar2);
                nxrVar2.m(Status.c);
            }
            lock.unlock();
            return nxrVar;
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.nzm
    public final void c(int i) {
        if (i == 1) {
            if (!this.p) {
                this.p = true;
                if (this.h == null) {
                    try {
                        this.h = this.t.a(this.e.getApplicationContext(), new nyv(this));
                    } catch (SecurityException unused) {
                    }
                }
                nyu nyuVar = this.s;
                nyuVar.sendMessageDelayed(nyuVar.obtainMessage(1), this.q);
                nyuVar.sendMessageDelayed(nyuVar.obtainMessage(2), this.r);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.m.b.toArray(new BasePendingResult[0])) {
            basePendingResult.n(oah.a);
        }
        obg obgVar = this.c;
        Handler handler = obgVar.h;
        ocv.aw(handler, "onUnintentionalDisconnection must only be called on the Handler thread");
        handler.removeMessages(1);
        synchronized (obgVar.i) {
            obgVar.g = true;
            ArrayList arrayList = obgVar.b;
            ArrayList arrayList2 = new ArrayList(arrayList);
            AtomicInteger atomicInteger = obgVar.f;
            int i2 = atomicInteger.get();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                nws nwsVar = (nws) it.next();
                if (!obgVar.e || atomicInteger.get() != i2) {
                    break;
                } else if (arrayList.contains(nwsVar)) {
                    nwsVar.aE(i);
                }
            }
            obgVar.c.clear();
            obgVar.g = false;
        }
        obgVar.a();
        if (i == 2) {
            o();
        }
    }

    @Override // defpackage.nwu
    public final void d() {
        boolean z;
        nyw nywVar = this;
        Lock lock = nywVar.b;
        lock.lock();
        try {
            if (nywVar.o >= 0) {
                ocv.aA(nywVar.v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = nywVar.v;
                if (num == null) {
                    nywVar.v = Integer.valueOf(l(nywVar.i.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = nywVar.v;
            ocv.aF(num2);
            int iIntValue = num2.intValue();
            lock.lock();
            if (iIntValue == 3 || iIntValue == 1) {
                z = true;
            } else if (iIntValue == 2) {
                iIntValue = 2;
                z = true;
            } else {
                z = false;
            }
            try {
                ocv.au(z, a.cf(iIntValue, "Illegal sign-in mode: "));
                Integer num3 = nywVar.v;
                if (num3 == null) {
                    nywVar.v = Integer.valueOf(iIntValue);
                } else if (num3.intValue() != iIntValue) {
                    throw new IllegalStateException("Cannot use sign-in mode: " + n(iIntValue) + ". Mode was already set to " + n(nywVar.v.intValue()));
                }
                if (nywVar.d == null) {
                    Map map = nywVar.i;
                    boolean zI = false;
                    boolean zK = false;
                    for (nwj nwjVar : map.values()) {
                        zI |= nwjVar.i();
                        zK |= nwjVar.k();
                    }
                    int iIntValue2 = nywVar.v.intValue();
                    if (iIntValue2 == 1) {
                        if (!zI) {
                            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                        }
                        if (zK) {
                            throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                        }
                    } else if (iIntValue2 == 2 && zI) {
                        Context context = nywVar.e;
                        Looper looper = nywVar.f;
                        nvj nvjVar = nywVar.t;
                        oav oavVar = nywVar.k;
                        Map map2 = nywVar.l;
                        ocv ocvVar = nywVar.n;
                        ArrayList arrayList = nywVar.u;
                        ir irVar = new ir();
                        ir irVar2 = new ir();
                        Iterator it = map.entrySet().iterator();
                        nwj nwjVar2 = null;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            nwj nwjVar3 = (nwj) entry.getValue();
                            Iterator it2 = it;
                            if (true == nwjVar3.k()) {
                                nwjVar2 = nwjVar3;
                            }
                            if (nwjVar3.i()) {
                                irVar.put((npj) entry.getKey(), nwjVar3);
                            } else {
                                irVar2.put((npj) entry.getKey(), nwjVar3);
                            }
                            it = it2;
                        }
                        ocv.aA(!irVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                        ir irVar3 = new ir();
                        ocv ocvVar2 = ocvVar;
                        nwj nwjVar4 = nwjVar2;
                        ir irVar4 = new ir();
                        for (jzs jzsVar : map2.keySet()) {
                            ocv ocvVar3 = ocvVar2;
                            Object obj = jzsVar.b;
                            if (irVar.containsKey(obj)) {
                                irVar3.put(jzsVar, (Boolean) map2.get(jzsVar));
                            } else {
                                if (!irVar2.containsKey(obj)) {
                                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                                }
                                irVar4.put(jzsVar, (Boolean) map2.get(jzsVar));
                            }
                            ocvVar2 = ocvVar3;
                        }
                        ocv ocvVar4 = ocvVar2;
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            try {
                                Context context2 = context;
                                nxy nxyVar = (nxy) arrayList.get(i);
                                jzs jzsVar2 = nxyVar.b;
                                if (irVar3.containsKey(jzsVar2)) {
                                    arrayList2.add(nxyVar);
                                } else {
                                    if (!irVar4.containsKey(jzsVar2)) {
                                        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                                    }
                                    arrayList3.add(nxyVar);
                                }
                                i++;
                                context = context2;
                            } catch (Throwable th) {
                                th = th;
                                nywVar = this;
                                throw th;
                            }
                        }
                        nywVar = this;
                        nywVar.d = new nyb(context, nywVar, lock, looper, nvjVar, irVar, irVar2, oavVar, ocvVar4, nwjVar4, arrayList2, arrayList3, irVar3, irVar4);
                    }
                    nywVar.d = new nza(nywVar.e, nywVar, lock, nywVar.f, nywVar.t, map, nywVar.k, nywVar.l, nywVar.n, nywVar.u, this);
                }
                nywVar.o();
                lock.unlock();
                lock.unlock();
            } catch (Throwable th2) {
                th = th2;
            }
        } finally {
            nywVar.b.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.nwu
    public final void e() {
        boolean zR;
        Lock lock = this.b;
        lock.lock();
        try {
            Set set = this.m.b;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
                basePendingResult.t(null);
                synchronized (basePendingResult.j) {
                    if (((nwu) basePendingResult.l.get()) == null || !basePendingResult.n) {
                        basePendingResult.h();
                    }
                    zR = basePendingResult.r();
                }
                if (zR) {
                    set.remove(basePendingResult);
                }
            }
            nzn nznVar = this.d;
            if (nznVar != null) {
                nznVar.d();
            }
            ?? r1 = this.x.a;
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                ((nzt) it.next()).a();
            }
            r1.clear();
            Queue<nxr> queue = this.g;
            for (nxr nxrVar : queue) {
                nxrVar.t(null);
                nxrVar.h();
            }
            queue.clear();
            if (this.d != null) {
                q();
                this.c.a();
            }
            lock.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    @Override // defpackage.nwu
    public final void f() {
        nzn nznVar = this.d;
        if (nznVar != null) {
            nznVar.e();
        }
    }

    @Override // defpackage.nwu
    public final boolean g() {
        nzn nznVar = this.d;
        return nznVar != null && nznVar.g();
    }

    @Override // defpackage.nwu
    public final boolean h() {
        nzn nznVar = this.d;
        return nznVar != null && nznVar.h();
    }

    @Override // defpackage.nwu
    public final boolean i(njg njgVar) {
        nzn nznVar = this.d;
        return nznVar != null && nznVar.j(njgVar);
    }

    @Override // defpackage.nwu
    public final nwj k(npj npjVar) {
        nwj nwjVar = (nwj) this.i.get(npjVar);
        ocv.aG(nwjVar, "Appropriate Api was not requested.");
        return nwjVar;
    }

    final String m() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(this.e);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(this.p);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(this.g.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(this.m.b.size());
        nzn nznVar = this.d;
        if (nznVar != null) {
            nznVar.l("", printWriter);
        }
        return stringWriter.toString();
    }

    public final void o() {
        this.c.e = true;
        nzn nznVar = this.d;
        ocv.aF(nznVar);
        nznVar.c();
    }

    public final void p() {
        this.b.lock();
        try {
            if (this.p) {
                o();
            }
        } finally {
            this.b.unlock();
        }
    }

    final boolean q() {
        if (!this.p) {
            return false;
        }
        this.p = false;
        nyu nyuVar = this.s;
        nyuVar.removeMessages(2);
        nyuVar.removeMessages(1);
        nzj nzjVar = this.h;
        if (nzjVar != null) {
            nzjVar.a();
            this.h = null;
        }
        return true;
    }

    @Override // defpackage.nzm
    public final void r(nve nveVar) {
        if (!nwb.e(this.e, nveVar.c)) {
            q();
        }
        if (this.p) {
            return;
        }
        obg obgVar = this.c;
        Handler handler = obgVar.h;
        ocv.aw(handler, "onConnectionFailure must only be called on the Handler thread");
        handler.removeMessages(1);
        synchronized (obgVar.i) {
            ArrayList arrayList = obgVar.d;
            ArrayList arrayList2 = new ArrayList(arrayList);
            AtomicInteger atomicInteger = obgVar.f;
            int i = atomicInteger.get();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                nwt nwtVar = (nwt) it.next();
                if (obgVar.e && atomicInteger.get() == i) {
                    if (arrayList.contains(nwtVar)) {
                        nwtVar.aC(nveVar);
                    }
                }
            }
        }
        this.c.a();
    }

    @Override // defpackage.nzm
    public final void s(Bundle bundle) {
        while (true) {
            Queue queue = this.g;
            if (queue.isEmpty()) {
                break;
            } else {
                b((nxr) queue.remove());
            }
        }
        obg obgVar = this.c;
        Handler handler = obgVar.h;
        ocv.aw(handler, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (obgVar.i) {
            a.ab(!obgVar.g);
            handler.removeMessages(1);
            obgVar.g = true;
            ArrayList arrayList = obgVar.c;
            a.ab(arrayList.isEmpty());
            ArrayList arrayList2 = new ArrayList(obgVar.b);
            AtomicInteger atomicInteger = obgVar.f;
            int i = atomicInteger.get();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                nws nwsVar = (nws) it.next();
                if (!obgVar.e || !obgVar.a.D() || atomicInteger.get() != i) {
                    break;
                } else if (!arrayList.contains(nwsVar)) {
                    nwsVar.aD(bundle);
                }
            }
            arrayList.clear();
            obgVar.g = false;
        }
    }
}
