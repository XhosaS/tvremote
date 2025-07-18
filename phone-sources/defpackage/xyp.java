package defpackage;

import android.os.Process;
import android.support.v7.widget.ActivityChooserView;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xyp implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public xyp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v122, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IOException, IllegalArgumentException {
        zcs zcsVar;
        long jNanoTime;
        boolean z;
        int i = 0;
        zcs zcsVar2 = null;
        switch (this.b) {
            case 0:
                ((xun) this.a).f.g(xyr.c);
                return;
            case 1:
                Object obj = this.a;
                xyr xyrVar = ((xym) obj).f.c;
                Collection collection = xyrVar.w;
                if (collection != null) {
                    collection.remove(obj);
                    if (xyrVar.w.isEmpty()) {
                        xyrVar.P.c(xyrVar.x, false);
                        xyrVar.w = null;
                        if (xyrVar.A.get()) {
                            xyq xyqVar = xyrVar.z;
                            xtk xtkVar = xyr.b;
                            synchronized (xyqVar.a) {
                                if (xyqVar.c != null) {
                                    return;
                                }
                                xyqVar.c = xtkVar;
                                boolean zIsEmpty = xyqVar.b.isEmpty();
                                if (zIsEmpty) {
                                    xyqVar.d.y.e(xtkVar);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Object obj2 = this.a;
                xzw xzwVar = (xzw) obj2;
                xzwVar.q = null;
                xzwVar.i.c();
                ((xrx) obj2).c();
                return;
            case 3:
                Object obj3 = this.a;
                xzw xzwVar2 = (xzw) obj3;
                xzwVar2.p = null;
                if (xzwVar2.i.e()) {
                    ((xrx) obj3).c();
                    return;
                }
                return;
            case 4:
                ((xrx) this.a).c();
                return;
            case 5:
                ((yaa) this.a).a.a();
                return;
            case 6:
                Object obj4 = this.a;
                yal yalVar = (yal) obj4;
                if (!yalVar.e) {
                    yalVar.f = null;
                    return;
                }
                long jA = yalVar.d - yalVar.a();
                if (jA > 0) {
                    yalVar.f = yalVar.a.schedule(new xyp(obj4, 7), jA, TimeUnit.NANOSECONDS);
                    return;
                }
                yalVar.e = false;
                yalVar.f = null;
                yalVar.c.run();
                return;
            case 7:
                Object obj5 = this.a;
                ((yal) obj5).b.execute(new xyp(obj5, 6));
                return;
            case 8:
                ybb ybbVar = (ybb) ((rip) this.a).c;
                ybbVar.A = true;
                xvm xvmVar = ybbVar.w;
                aafi aafiVar = ybbVar.F;
                xvmVar.a((xtk) aafiVar.a, (xvl) aafiVar.b, (xsm) aafiVar.c);
                return;
            case 9:
                ybb ybbVar2 = (ybb) this.a;
                if (ybbVar2.A) {
                    return;
                }
                ybbVar2.w.d();
                return;
            case 10:
                ybb ybbVar3 = ((yay) this.a).b;
                ybbVar3.A = true;
                xvm xvmVar2 = ybbVar3.w;
                aafi aafiVar2 = ybbVar3.F;
                xvmVar2.a((xtk) aafiVar2.a, (xvl) aafiVar2.b, (xsm) aafiVar2.c);
                return;
            case 11:
                ybb ybbVar4 = ((yay) this.a).b;
                if (ybbVar4.A) {
                    return;
                }
                ybbVar4.w.d();
                return;
            case 12:
                ((xsx) this.a).b();
                return;
            case 13:
                try {
                    Object obj6 = this.a;
                    zhm zhmVar = ((ych) obj6).f;
                    if (zhmVar != null) {
                        zgk zgkVar = ((ych) obj6).b;
                        long j = zgkVar.b;
                        if (j > 0) {
                            zhmVar.eW(zgkVar, j);
                        }
                    }
                } catch (IOException e) {
                    ((ych) this.a).c.d(e);
                }
                try {
                    zhm zhmVar2 = ((ych) this.a).f;
                    if (zhmVar2 != null) {
                        zhmVar2.close();
                    }
                } catch (IOException e2) {
                    ((ych) this.a).c.d(e2);
                }
                try {
                    Socket socket = ((ych) this.a).g;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    ((ych) this.a).c.d(e3);
                    return;
                }
            case 14:
                xup xupVar = (xup) this.a;
                xuq xuqVar = xupVar.b;
                AtomicLong atomicLong = xuqVar.c;
                long j2 = xupVar.a;
                long jMax = Math.max(j2 + j2, j2);
                if (atomicLong.compareAndSet(j2, jMax)) {
                    xuq.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{xuqVar.b, Long.valueOf(jMax)});
                    return;
                }
                return;
            case 15:
                Object obj7 = this.a;
                ycz yczVar = (ycz) obj7;
                yczVar.o.execute(yczVar.q);
                synchronized (yczVar.m) {
                    ((ycz) obj7).z = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    ((ycz) obj7).q();
                }
                return;
            case 16:
                break;
            case 17:
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(0);
                this.a.run();
                return;
            case 18:
                ((aaai) this.a).g++;
                return;
            case 19:
                aaas aaasVar = (aaas) this.a;
                aaai aaaiVar = aaasVar.y;
                if (aaaiVar != null) {
                    try {
                        aaaiVar.e();
                    } catch (IOException e4) {
                        Log.e(aaas.a, "Exception when closing OutputChannel", e4);
                    }
                }
                HttpURLConnection httpURLConnection = aaasVar.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    aaasVar.q = null;
                    return;
                }
                return;
            default:
                aaas aaasVar2 = (aaas) this.a;
                aaasVar2.f.add(aaasVar2.m);
                aaasVar2.h();
                return;
        }
        while (true) {
            Object obj8 = this.a;
            synchronized (obj8) {
                byte[] bArr = zcr.a;
                while (true) {
                    List list = ((zcv) obj8).f;
                    if (list.isEmpty()) {
                        zcsVar = zcsVar2;
                    } else {
                        long jNanoTime2 = System.nanoTime();
                        Iterator it = list.iterator();
                        long jMin = Long.MAX_VALUE;
                        zcsVar = zcsVar2;
                        while (true) {
                            if (it.hasNext()) {
                                zcs zcsVar3 = (zcs) ((zcu) it.next()).e.get(i);
                                long jMax2 = Math.max(0L, zcsVar3.c - jNanoTime2);
                                if (jMax2 > 0) {
                                    jMin = Math.min(jMax2, jMin);
                                } else if (zcsVar != null) {
                                    z = true;
                                } else {
                                    zcsVar = zcsVar3;
                                }
                                i = 0;
                            } else {
                                z = false;
                            }
                        }
                        if (zcsVar != null) {
                            zcsVar.c = -1L;
                            zcu zcuVar = zcsVar.b;
                            zcuVar.getClass();
                            zcuVar.e.remove(zcsVar);
                            List list2 = ((zcv) obj8).f;
                            list2.remove(zcuVar);
                            zcuVar.d = zcsVar;
                            ((zcv) obj8).e.add(zcuVar);
                            if (z || (!((zcv) obj8).c && !list2.isEmpty())) {
                                ((zcv) obj8).h.s(((zcv) obj8).g);
                            }
                        } else if (((zcv) obj8).c) {
                            if (jMin < ((zcv) obj8).d - jNanoTime2) {
                                obj8.notify();
                            }
                            zcsVar = null;
                        } else {
                            ((zcv) obj8).c = true;
                            ((zcv) obj8).d = jNanoTime2 + jMin;
                            try {
                                try {
                                    long j3 = jMin / 1000000;
                                    if (j3 > 0 || jMin > 0) {
                                        Long.signum(j3);
                                        obj8.wait(j3, (int) (jMin - (1000000 * j3)));
                                    }
                                    ((zcv) obj8).c = false;
                                } catch (InterruptedException unused) {
                                    List list3 = ((zcv) obj8).e;
                                    int size = list3.size();
                                    while (true) {
                                        size--;
                                        if (size >= 0) {
                                            ((zcu) list3.get(size)).c();
                                        } else {
                                            List list4 = ((zcv) obj8).f;
                                            int size2 = list4.size();
                                            while (true) {
                                                size2--;
                                                if (size2 >= 0) {
                                                    zcu zcuVar2 = (zcu) list4.get(size2);
                                                    zcuVar2.c();
                                                    if (zcuVar2.e.isEmpty()) {
                                                        list4.remove(size2);
                                                    }
                                                } else {
                                                    ((zcv) obj8).c = false;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = 0;
                                zcsVar2 = null;
                            } catch (Throwable th) {
                                ((zcv) obj8).c = false;
                                throw th;
                            }
                        }
                    }
                }
            }
            if (zcsVar == null) {
                return;
            }
            zcu zcuVar3 = zcsVar.b;
            zcuVar3.getClass();
            Object obj9 = this.a;
            boolean zIsLoggable = zcv.b.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                wbb.I(zcsVar, zcuVar3, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                threadCurrentThread.setName(zcsVar.a);
                try {
                    long jA2 = zcsVar.a();
                    synchronized (obj9) {
                        ((zcv) obj9).b(zcsVar, jA2);
                    }
                    threadCurrentThread.setName(name);
                    if (zIsLoggable) {
                        wbb.I(zcsVar, zcuVar3, "finished run in ".concat(wbb.H(System.nanoTime() - jNanoTime)));
                    }
                    i = 0;
                    zcsVar2 = null;
                } catch (Throwable th2) {
                    synchronized (obj9) {
                        ((zcv) obj9).b(zcsVar, -1L);
                        threadCurrentThread.setName(name);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    ((zcv) obj9).h.s(this);
                    throw th3;
                } catch (Throwable th4) {
                    if (zIsLoggable) {
                        wbb.I(zcsVar, zcuVar3, "failed a run in ".concat(wbb.H(System.nanoTime() - jNanoTime)));
                    }
                    throw th4;
                }
            }
        }
    }

    public /* synthetic */ xyp(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
