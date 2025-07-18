package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ama implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ama(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [amc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v77, types: [byo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v2, types: [cjd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [crv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [crv, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        cja cjaVarF;
        int i = 4;
        int i2 = 3;
        byte[] bArr = null;
        int i3 = 1;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                synchronized (((amb) obj).a) {
                    ((amb) obj).b.b();
                }
                return;
            case 1:
                ((ahp) this.a).f.b(new aeq(4));
                return;
            case 2:
                try {
                    Thread.sleep(Math.max(0L, 600000L));
                } catch (InterruptedException e) {
                    Log.e("AppDoctorRestartUtil", "Interrupted. Killing processes now.", e);
                    Thread.currentThread().interrupt();
                }
                aog.a((Context) this.a);
                aog.b();
                return;
            case 3:
                bfv bfvVar = (bfv) ((bfv) this.a).c;
                ((are) bfvVar.d).a(new arn(bfvVar));
                return;
            case 4:
                asz aszVar = (asz) this.a;
                aqe aqeVar = aszVar.h;
                aqeVar.getClass();
                if (aszVar.b == 0) {
                    aszVar.c = true;
                    Iterator it = aszVar.g.iterator();
                    while (it.hasNext()) {
                        ((ask) it.next()).k(aqeVar);
                    }
                }
                aszVar.h.getClass();
                aszVar.a();
                return;
            case 5:
                ((aup) this.a).a();
                return;
            case 6:
                avu avuVar = (avu) this.a;
                if (((Boolean) avuVar.h.a()).booleanValue()) {
                    are areVar = avuVar.j;
                    Iterator it2 = areVar.b.iterator();
                    while (it2.hasNext()) {
                        chk.i(((arj) it2.next()).a(), new avs(areVar, i3), areVar.a);
                    }
                }
                bfv bfvVar2 = avuVar.k;
                if (((Boolean) bfvVar2.d.a()).booleanValue()) {
                    bfvVar2.e.scheduleWithFixedDelay(new ama(bfvVar2, i2, bArr), Math.round(((Long) bfvVar2.a.a()).longValue() + (((Random) bfvVar2.f).nextDouble() * ((Long) r7.a()).longValue())), ((Long) bfvVar2.b.a()).longValue(), TimeUnit.MILLISECONDS);
                    return;
                }
                return;
            case 7:
                final avu avuVar2 = (avu) this.a;
                qm.O(new chs() { // from class: avt
                    /* JADX WARN: Removed duplicated region for block: B:186:0x03c9  */
                    /* JADX WARN: Removed duplicated region for block: B:188:0x03d3  */
                    /* JADX WARN: Type inference failed for: r6v10, types: [crv, java.lang.Object] */
                    @Override // defpackage.chs
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final defpackage.cja a() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instructions count: 1506
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.avt.a():cja");
                    }
                }, avuVar2.c);
                return;
            case 8:
                Object obj2 = this.a;
                try {
                    AtomicReference atomicReference = ((ayr) obj2).e;
                    att attVar = ((ayr) obj2).f;
                    cov covVar = ((ayr) obj2).d;
                    atomicReference.set(attVar.b(((ayp) covVar.a()).b() ? ((ayp) covVar.a()).a : 0.0f));
                    return;
                } catch (Throwable unused) {
                    ayr ayrVar = (ayr) obj2;
                    ayrVar.e.set(ayrVar.f.b(0.0f));
                    return;
                }
            case 9:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 10:
                ((bcn) this.a).a();
                return;
            case 11:
                bcn bcnVar = (bcn) this.a;
                if (bcnVar.e) {
                    bav bavVar = bcnVar.a;
                    if (apr.f(bavVar.d)) {
                        bcn.h.c(bavVar);
                        return;
                    }
                }
                bcnVar.c();
                return;
            case 12:
                Object obj3 = this.a;
                bcn bcnVar2 = (bcn) obj3;
                bav bavVar2 = bcnVar2.a;
                cja cjaVarB = bcw.b(bavVar2).b(new bab(bcnVar2.b, i2), bavVar2.b());
                cjaVarB.m(new ame(obj3, cjaVarB, 9), bavVar2.b());
                return;
            case 13:
                cjv cjvVar = cjv.FILE;
                tj tjVar = new tj();
                bcy bcyVar = ((bcn) this.a).a.h;
                bda bdaVar = (bda) bcyVar.c.aL();
                if (bdaVar == null) {
                    cja cjaVar = ciw.a;
                    return;
                }
                int i4 = cjvVar.h;
                bdq.e(true);
                int i5 = 1 << i4;
                if ((bcyVar.e & i5) == 0) {
                    CopyOnWriteArrayList copyOnWriteArrayList = bcyVar.f;
                    synchronized (copyOnWriteArrayList) {
                        int i6 = bcyVar.e;
                        if ((i6 & i5) == 0) {
                            copyOnWriteArrayList.add(tjVar);
                            bcyVar.e = i5 | i6;
                        }
                    }
                }
                if (bcyVar.h == null) {
                    synchronized (bcyVar.g) {
                        if (bcyVar.h == null) {
                            Context context = bcyVar.a;
                            if (apr.f(context)) {
                                om omVar = new om(5);
                                byo byoVar = bcyVar.b;
                                cjaVarF = chk.i(apr.d(context, omVar, (Executor) byoVar.aL()), new awf(bcyVar, bdaVar, i), (Executor) byoVar.aL());
                                bcyVar.h = cjaVarF;
                            } else {
                                cjaVarF = ((asv) bcyVar.d.aL()).f(new bcx(bcyVar, bdaVar));
                                bcyVar.h = cjaVarF;
                            }
                            cjaVarF.m(new ama(cjaVarF, 17, bArr), (Executor) bcyVar.b.aL());
                        }
                    }
                    return;
                }
                return;
            case 14:
                Object obj4 = this.a;
                Iterator it3 = ((cih) obj4).a.values().iterator();
                while (it3.hasNext()) {
                    bcn[] bcnVarArr = (bcn[]) ((AtomicReference) it3.next()).get();
                    if (bcnVarArr != null) {
                        for (bcn bcnVar3 : bcnVarArr) {
                            cih cihVar = bcn.h;
                            if (bcnVar3.e) {
                                bcnVar3.c();
                            }
                        }
                    }
                }
                synchronized (obj4) {
                    ((cih) obj4).b = null;
                }
                return;
            case 15:
                try {
                    qm.P(this.a);
                    return;
                } catch (ExecutionException e2) {
                    bej.b(new ama(e2, 16, bArr));
                    return;
                }
            case 16:
                throw new RuntimeException(((ExecutionException) this.a).getCause());
            case 17:
                try {
                    qm.P(this.a);
                    return;
                } catch (Exception e3) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e3);
                    return;
                }
            case 18:
                if (((Boolean) ((bda) this.a).c.aL()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 19:
                try {
                    qm.P(this.a);
                    return;
                } catch (Exception e4) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e4);
                        return;
                    }
                    return;
                }
            default:
                ((bgt) this.a).d();
                return;
        }
    }

    public /* synthetic */ ama(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
