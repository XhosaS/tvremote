package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rtr implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rtr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // java.lang.Runnable
    public final void run() {
        uhp uhpVarAI;
        long j;
        byte[] bArr = null;
        int i = 10;
        switch (this.b) {
            case 0:
                ((rtx) this.a).b(0);
                return;
            case 1:
                final rro rroVar = (rro) this.a;
                sfy.G(new ufv() { // from class: rrn
                    /* JADX WARN: Removed duplicated region for block: B:173:0x037f  */
                    /* JADX WARN: Removed duplicated region for block: B:175:0x038c  */
                    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, yfo] */
                    @Override // defpackage.ufv
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final defpackage.uhp a() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instructions count: 1444
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrn.a():uhp");
                    }
                }, rroVar.c);
                return;
            case 2:
                int i2 = rtu.b;
                sjl.c();
                rtx rtxVar = ((rtw) this.a).b;
                if (rtxVar.h != null) {
                    return;
                }
                rtxVar.h = rqj.a();
                return;
            case 3:
                int i3 = rtu.b;
                sjl.c();
                ?? r0 = this.a;
                rtw rtwVar = (rtw) r0;
                rtx rtxVar2 = rtwVar.b;
                if (rtxVar2.i != null) {
                    return;
                }
                rtxVar2.i = rqj.a();
                rtx.f("Primes-ttfdd-end-and-length-ms", rtxVar2.i.a);
                rtwVar.a.unregisterActivityLifecycleCallbacks(r0);
                return;
            case 4:
                sjl.c();
                rtx rtxVar3 = ((rtw) this.a).b;
                if (rtxVar3.k != null) {
                    return;
                }
                rtxVar3.k = rqj.a();
                return;
            case 5:
                sjl.c();
                rtx rtxVar4 = ((rtw) this.a).b;
                if (rtxVar4.j != null) {
                    return;
                }
                rtxVar4.j = rqj.a();
                return;
            case 6:
                Object obj = this.a;
                try {
                    AtomicReference atomicReference = ((rva) obj).f;
                    ulp ulpVar = ((rva) obj).g;
                    xbw xbwVar = ((rva) obj).d;
                    atomicReference.set(ulpVar.aG(((ruw) xbwVar.b()).b() ? ((ruw) xbwVar.b()).a : 0.0f));
                    return;
                } catch (Throwable unused) {
                    rva rvaVar = (rva) obj;
                    rvaVar.f.set(rvaVar.g.aG(0.0f));
                    return;
                }
            case 7:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 8:
                ((ryp) this.a).a();
                return;
            case 9:
                ryp rypVar = (ryp) this.a;
                if (rypVar.e) {
                    rwv rwvVar = rypVar.a;
                    if (osx.f(rwvVar.c)) {
                        ryp.h.h(rwvVar);
                        return;
                    }
                }
                rypVar.c();
                return;
            case 10:
                Object obj2 = this.a;
                ryp rypVar2 = (ryp) obj2;
                rwv rwvVar2 = rypVar2.a;
                uhp uhpVarB = ryy.b(rwvVar2).b(new nbb(rypVar2.b, i), rwvVar2.b());
                uhpVarB.c(new rmz(obj2, uhpVarB, 9), rwvVar2.b());
                return;
            case 11:
                uis uisVar = uis.FILE;
                rrx rrxVar = new rrx();
                ryz ryzVar = ((ryp) this.a).a.g;
                rza rzaVar = (rza) ryzVar.c.get();
                if (rzaVar == null) {
                    uhp uhpVar = uhl.a;
                    return;
                }
                int i4 = uisVar.h;
                a.H(true);
                int i5 = 1 << i4;
                if ((ryzVar.e & i5) == 0) {
                    CopyOnWriteArrayList copyOnWriteArrayList = ryzVar.f;
                    synchronized (copyOnWriteArrayList) {
                        int i6 = ryzVar.e;
                        if ((i6 & i5) == 0) {
                            copyOnWriteArrayList.add(rrxVar);
                            ryzVar.e = i5 | i6;
                        }
                    }
                }
                if (ryzVar.h == null) {
                    synchronized (ryzVar.g) {
                        if (ryzVar.h == null) {
                            Context context = ryzVar.a;
                            if (osx.f(context)) {
                                int i7 = 13;
                                ehq ehqVar = new ehq(i7);
                                ttm ttmVar = ryzVar.b;
                                uhpVarAI = ufn.j(osx.d(context, ehqVar, (Executor) ttmVar.get()), new pap(ryzVar, rzaVar, i7, bArr), (Executor) ttmVar.get());
                                ryzVar.h = uhpVarAI;
                            } else {
                                uhpVarAI = ((ulp) ryzVar.d.get()).aI(new tvv(ryzVar, rzaVar));
                                ryzVar.h = uhpVarAI;
                            }
                            uhpVarAI.c(new rtr(uhpVarAI, 15), (Executor) ryzVar.b.get());
                        }
                    }
                    return;
                }
                return;
            case 12:
                Object obj3 = this.a;
                Iterator it = ((unx) obj3).b.values().iterator();
                while (it.hasNext()) {
                    ryp[] rypVarArr = (ryp[]) ((AtomicReference) it.next()).get();
                    if (rypVarArr != null) {
                        for (ryp rypVar3 : rypVarArr) {
                            unx unxVar = ryp.h;
                            if (rypVar3.e) {
                                rypVar3.c();
                            }
                        }
                    }
                }
                synchronized (obj3) {
                    ((unx) obj3).a = null;
                }
                return;
            case 13:
                try {
                    sfy.J(this.a);
                    return;
                } catch (ExecutionException e) {
                    sjl.e(new rtr(e, 14));
                    return;
                }
            case 14:
                throw new RuntimeException(((ExecutionException) this.a).getCause());
            case 15:
                try {
                    sfy.J(this.a);
                    return;
                } catch (Exception e2) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e2);
                    return;
                }
            case 16:
                if (((Boolean) ((rza) this.a).c.get()).booleanValue()) {
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 17:
                try {
                    sfy.J(this.a);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 18:
                ArrayList arrayList = new ArrayList();
                Object obj4 = this.a;
                sby sbyVar = (sby) obj4;
                TreeMap treeMap = sbyVar.c;
                Set setKeySet = treeMap.keySet();
                setKeySet.getClass();
                for (Object obj5 : setKeySet) {
                    obj5.getClass();
                    Collection arrayList2 = (List) treeMap.get(Integer.valueOf(((Number) obj5).intValue()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList.addAll(arrayList2);
                }
                treeMap.clear();
                sbyVar.d(new qyw(arrayList, obj4, i));
                return;
            case 19:
                scq.a.removeCallbacks(this);
                Object obj6 = this.a;
                scq scqVar = (scq) obj6;
                if (scqVar.b.getLifecycle().a().a(dvd.b) && scqVar.d().w == obj6) {
                    synchronized (this) {
                        j = ((scq) obj6).e;
                        ((scq) obj6).e = 0L;
                    }
                    scq scqVar2 = (scq) this.a;
                    scf scfVarE = scqVar2.e();
                    sca scaVarD = scqVar2.d();
                    scaVarD.getClass();
                    scfVarE.h(scaVarD, j);
                    return;
                }
                return;
            default:
                Object obj7 = this.a;
                sgt.a.add(obj7);
                if (sgt.b != -1) {
                    ((sgs) obj7).b();
                    return;
                }
                return;
        }
    }

    public rtr(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
