package defpackage;

import android.os.Trace;
import android.util.Log;
import java.net.SocketAddress;
import java.util.LinkedHashSet;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xxl implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public xxl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v114, types: [aaat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v116, types: [aaat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v118, types: [aaat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, yoe] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, TimeoutException, BrokenBarrierException {
        xze xzeVar;
        yba ybaVar;
        int i = 0;
        char[] cArr = null;
        yau yauVar = 0;
        switch (this.c) {
            case 0:
                xxt xxtVar = (xxt) this.b;
                xqk xqkVar = xxtVar.p.a;
                xqk xqkVar2 = xqk.SHUTDOWN;
                if (xqkVar == xqkVar2) {
                    return;
                }
                xtk xtkVar = (xtk) this.a;
                xxtVar.q = xtkVar;
                xze xzeVar2 = xxtVar.o;
                xvv xvvVar = xxtVar.n;
                xxtVar.o = null;
                xxtVar.n = null;
                xxtVar.b(xqkVar2);
                xxtVar.h.c();
                if (xxtVar.l.isEmpty()) {
                    xxtVar.e();
                }
                xxtVar.g.c();
                ulo uloVar = xxtVar.t;
                if (uloVar != null) {
                    uloVar.r();
                    xxtVar.t = null;
                    xxtVar.s = null;
                }
                ulo uloVar2 = xxtVar.u;
                if (uloVar2 != null) {
                    uloVar2.r();
                    xxtVar.k.e(xtkVar);
                    xxtVar.u = null;
                    xxtVar.k = null;
                }
                if (xzeVar2 != null) {
                    xzeVar2.e(xtkVar);
                }
                if (xvvVar != null) {
                    xvvVar.e(xtkVar);
                    return;
                }
                return;
            case 1:
                ?? r0 = this.b;
                xxt xxtVar2 = (xxt) this.a;
                xxq xxqVar = xxtVar2.h;
                SocketAddress socketAddressB = xxqVar.b();
                xxqVar.c = r0;
                xxqVar.c();
                xxtVar2.i = r0;
                xqk xqkVar3 = xxtVar2.p.a;
                xqk xqkVar4 = xqk.READY;
                if (xqkVar3 == xqkVar4 || xxtVar2.p.a == xqk.CONNECTING) {
                    while (true) {
                        if (i < xxqVar.c.size()) {
                            int iIndexOf = ((xqt) xxqVar.c.get(i)).b.indexOf(socketAddressB);
                            if (iIndexOf == -1) {
                                i++;
                            } else {
                                xxqVar.a = i;
                                xxqVar.b = iIndexOf;
                            }
                        } else if (xxtVar2.p.a == xqkVar4) {
                            xzeVar = xxtVar2.o;
                            xxtVar2.o = null;
                            xxqVar.c();
                            xxtVar2.b(xqk.IDLE);
                        } else {
                            xxtVar2.n.e(xtk.k.e("InternalSubchannel closed pending transport due to address change"));
                            xxtVar2.n = null;
                            xxqVar.c();
                            xxtVar2.h();
                        }
                    }
                    xzeVar = null;
                } else {
                    xzeVar = null;
                }
                if (xzeVar != null) {
                    if (xxtVar2.u != null) {
                        xxtVar2.k.e(xtk.k.e("InternalSubchannel closed transport early due to address change"));
                        xxtVar2.u.r();
                        xxtVar2.u = null;
                    }
                    xxtVar2.k = xzeVar;
                    xxtVar2.u = xxtVar2.g.d(new xwf(this, 12), 5L, TimeUnit.SECONDS, xxtVar2.b);
                    return;
                }
                return;
            case 2:
                xxr xxrVar = (xxr) this.b;
                xxt xxtVar3 = xxrVar.c;
                if (xxtVar3.p.a == xqk.SHUTDOWN) {
                    return;
                }
                xze xzeVar3 = xxtVar3.o;
                xvv xvvVar2 = xxrVar.a;
                if (xzeVar3 == xvvVar2) {
                    xxtVar3.o = null;
                    xxtVar3.h.c();
                    xxtVar3.b(xqk.IDLE);
                    return;
                }
                if (xxtVar3.n == xvvVar2) {
                    sij.z(xxtVar3.p.a == xqk.CONNECTING, "Expected state is CONNECTING, actual state is %s", xxtVar3.p.a);
                    xxq xxqVar2 = xxtVar3.h;
                    xqt xqtVar = (xqt) xxqVar2.c.get(xxqVar2.a);
                    int i2 = xxqVar2.b + 1;
                    xxqVar2.b = i2;
                    if (i2 >= xqtVar.b.size()) {
                        xxqVar2.a++;
                        xxqVar2.b = 0;
                    }
                    if (xxqVar2.a < xxqVar2.c.size()) {
                        xxtVar3.h();
                        return;
                    }
                    xxtVar3.n = null;
                    xxqVar2.c();
                    Object obj = this.a;
                    xtq xtqVar = xxtVar3.g;
                    xtqVar.c();
                    xtk xtkVar2 = (xtk) obj;
                    sij.o(!xtkVar2.g(), "The error status must not be OK");
                    xxtVar3.d(new xql(xqk.TRANSIENT_FAILURE, xtkVar2));
                    if (xxtVar3.e) {
                        return;
                    }
                    if (xxtVar3.s == null) {
                        xxtVar3.s = new xwq();
                    }
                    long jA = xxtVar3.s.a() - xxtVar3.j.a(TimeUnit.NANOSECONDS);
                    xxtVar3.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", xxt.k(xtkVar2), Long.valueOf(jA));
                    sij.x(xxtVar3.t == null, "previous reconnectTask is not done");
                    xxtVar3.t = xtqVar.d(new xwf(xxtVar3, 10), jA, TimeUnit.NANOSECONDS, xxtVar3.b);
                    return;
                }
                return;
            case 3:
                ((xyj) this.b).d((xtk) this.a);
                return;
            case 4:
                xyn xynVar = (xyn) this.b;
                if (xynVar.a.get() != xyr.e) {
                    ((xym) this.a).j();
                    return;
                }
                xyr xyrVar = xynVar.c;
                if (xyrVar.w == null) {
                    xyrVar.w = new LinkedHashSet();
                    xyrVar.P.c(xyrVar.x, true);
                }
                xyrVar.w.add(this.a);
                return;
            case 5:
                this.b.run();
                Object obj2 = this.a;
                ((xym) obj2).f.c.m.execute(new xyp(obj2, 1));
                return;
            case 6:
                Object obj3 = this.a;
                Object obj4 = ((yav) obj3).b;
                Object obj5 = ((ybb) obj4).m;
                synchronized (obj5) {
                    if (!((yau) ((yav) obj3).a).b) {
                        ((ybb) obj4).r = ((ybb) obj4).r.a((yaz) this.b);
                        if (((ybb) obj4).s(((ybb) obj4).r) && ((ybaVar = ((ybb) obj4).p) == null || ybaVar.a())) {
                            yau yauVar2 = new yau(obj5);
                            ((ybb) obj4).y = yauVar2;
                            cArr = yauVar2;
                        } else {
                            ((ybb) obj4).r = ((ybb) obj4).r.b();
                            ((ybb) obj4).y = null;
                        }
                        z = false;
                        yauVar = cArr;
                    }
                }
                if (z) {
                    yaz yazVar = (yaz) this.b;
                    yazVar.a.o(new yay((ybb) ((yav) this.a).b, yazVar));
                    yazVar.a.h(xtk.c.e("Unneeded hedging"));
                    return;
                } else {
                    if (yauVar != 0) {
                        Object obj6 = ((yav) this.a).b;
                        yav yavVar = new yav(obj6, yauVar, 0);
                        ybb ybbVar = (ybb) obj6;
                        yauVar.b(ybbVar.i.schedule(yavVar, ybbVar.k.b, TimeUnit.NANOSECONDS));
                    }
                    ((ybb) ((yav) this.a).b).f((yaz) this.b);
                    return;
                }
            case 7:
                ((yay) this.b).b.w.c((xsm) this.a);
                return;
            case 8:
                ((yay) ((rvp) this.a).b).b.f((yaz) this.b);
                return;
            case 9:
                ((yay) this.a).b.f((yaz) this.b);
                return;
            case 10:
                ((yay) this.b).b.w.e((xzg) this.a);
                return;
            case 11:
                try {
                    ((CyclicBarrier) this.b).await(1000L, TimeUnit.MILLISECONDS);
                    ((CountDownLatch) this.a).await();
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                } catch (BrokenBarrierException | TimeoutException unused2) {
                    return;
                }
            case 12:
                this.a.d((yot) this.b, ygi.a);
                return;
            case 13:
                int i3 = zyz.b;
                try {
                    ((aabc) this.b).onRequestFinished((RequestFinishedInfo) this.a);
                    return;
                } catch (Exception e) {
                    Log.e("HttpEngineWrapper", "Exception thrown from observation task", e);
                    return;
                }
            case 14:
                new zyg("JavaUploadDataSinkBase#executeOnExecutor " + ((String) this.b) + " running callback", 0);
                try {
                    this.a.run();
                    Trace.endSection();
                    return;
                } finally {
                }
            case 15:
                aaas aaasVar = (aaas) this.b;
                String str = aaasVar.p;
                aaaq aaaqVar = aaasVar.b;
                aaaqVar.a(new aaap(aaaqVar, (UrlResponseInfo) this.a, str, i), "onRedirectReceived");
                return;
            case 16:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th) {
                    ((aaas) this.a).b(new zzr("System error", th));
                    return;
                }
            case 17:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th2) {
                    ((aaas) this.a).c(th2);
                    return;
                }
            case 18:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th3) {
                    Object obj7 = this.a;
                    aaal aaalVar = new aaal(obj7, 0);
                    aaas aaasVar2 = (aaas) obj7;
                    aaasVar2.d(aaalVar, "enterUserErrorState");
                    aaasVar2.b(new zzn("Exception received from UrlRequest.Callback", th3));
                    return;
                }
            case 19:
                String str2 = aaas.a;
                new zyg("Cronet JavaUrlRequest#executeOnExecutor " + ((String) this.b) + " running callback", 0);
                try {
                    this.a.run();
                    Trace.endSection();
                    return;
                } finally {
                }
            default:
                Object obj8 = this.b;
                Object obj9 = this.a;
                ((aaas) obj9).d(new xxl(obj9, obj8, 16, cArr), "read");
                return;
        }
    }

    public xxl(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ xxl(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ xxl(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public xxl(CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch, int i) {
        this.c = i;
        this.b = cyclicBarrier;
        this.a = countDownLatch;
    }
}
