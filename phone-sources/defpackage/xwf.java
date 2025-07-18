package defpackage;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xwf implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public xwf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xzd] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xzd] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, xvv] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, xrd] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, xvv] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        long jNextLong;
        switch (this.b) {
            case 0:
                this.a.a(false);
                return;
            case 1:
                this.a.a(true);
                return;
            case 2:
                xyr xyrVar = ((xyf) this.a).a;
                sij.x(xyrVar.A.get(), "Channel must have been shut down");
                xyrVar.B = true;
                xyrVar.i(false);
                xyrVar.g();
                return;
            case 3:
                sij.x(((xyf) ((xwh) this.a).f).a.A.get(), "Channel must have been shut down");
                return;
            case 4:
                ((xwj) this.a).h.t();
                return;
            case 5:
                ((xwj) this.a).c();
                return;
            case 6:
                ((xwj) this.a).h.r();
                return;
            case 7:
                ((xwj) this.a).h.j();
                return;
            case 8:
                ((xwi) this.a).a.d();
                return;
            case 9:
                ((upo) ((zft) this.a).a).a.f(xtk.k.e("Keepalive failed. The connection is likely gone"));
                return;
            case 10:
                xxt xxtVar = (xxt) this.a;
                xxtVar.t = null;
                xxtVar.d.a(2, "CONNECTING after backoff");
                xxtVar.b(xqk.CONNECTING);
                xxtVar.h();
                return;
            case 11:
                xxt xxtVar2 = (xxt) this.a;
                if (xxtVar2.p.a == xqk.IDLE) {
                    xxtVar2.d.a(2, "CONNECTING as requested");
                    xxtVar2.b(xqk.CONNECTING);
                    xxtVar2.h();
                    return;
                }
                return;
            case 12:
                xxt xxtVar3 = (xxt) ((xxl) this.a).a;
                xze xzeVar = xxtVar3.k;
                xxtVar3.u = null;
                xxtVar3.k = null;
                xzeVar.e(xtk.k.e("InternalSubchannel closed transport due to address change"));
                return;
            case 13:
                ?? r0 = this.a;
                xxt xxtVar4 = (xxt) r0;
                xxtVar4.d.a(2, "Terminated");
                xyr xyrVar2 = xxtVar4.a.b.i;
                xyrVar2.v.remove(r0);
                xrb.b(xyrVar2.G.d, r0);
                xyrVar2.g();
                return;
            case 14:
                xxr xxrVar = (xxr) this.a;
                xxt xxtVar5 = xxrVar.c;
                xxtVar5.s = null;
                if (xxtVar5.q != null) {
                    sij.x(xxtVar5.o == null, "Unexpected non-null activeTransport");
                    xxrVar.a.e(xxtVar5.q);
                    return;
                }
                xvv xvvVar = xxtVar5.n;
                xvv xvvVar2 = xxrVar.a;
                if (xvvVar == xvvVar2) {
                    xxtVar5.o = xvvVar2;
                    xxtVar5.n = null;
                    xxtVar5.r = xxtVar5.h.a();
                    xxtVar5.b(xqk.READY);
                    return;
                }
                return;
            case 15:
                xxr xxrVar2 = (xxr) this.a;
                xvv xvvVar3 = xxrVar2.a;
                xxt xxtVar6 = xxrVar2.c;
                Collection collection = xxtVar6.l;
                collection.remove(xvvVar3);
                if (xxtVar6.p.a == xqk.SHUTDOWN && collection.isEmpty()) {
                    xxtVar6.e();
                    return;
                }
                return;
            case 16:
                Object obj = this.a;
                synchronized (obj) {
                    if (((xxw) obj).k != 6) {
                        ((xxw) obj).k = 6;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    ((xxw) this.a).l.a.f(xtk.k.e("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            case 17:
                Object obj2 = this.a;
                synchronized (obj2) {
                    ((xxw) obj2).f = null;
                    int i = ((xxw) obj2).k;
                    if (i == 2) {
                        ((xxw) obj2).k = 4;
                        ((xxw) obj2).e = ((xxw) obj2).c.schedule(((xxw) obj2).g, ((xxw) obj2).j, TimeUnit.NANOSECONDS);
                        z = true;
                    } else {
                        if (i == 3) {
                            ((xxw) obj2).f = ((xxw) obj2).c.schedule(((xxw) obj2).h, ((xxw) obj2).i - ((xxw) obj2).d.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                            ((xxw) obj2).k = 2;
                        }
                        z = false;
                    }
                }
                if (z) {
                    upo upoVar = ((xxw) this.a).l;
                    Object obj3 = upoVar.a;
                    zft zftVar = new zft(upoVar, null);
                    Object obj4 = ((ycz) obj3).m;
                    ugk ugkVar = ugk.a;
                    synchronized (obj4) {
                        a.ab(((ycz) obj3).k != null);
                        if (((ycz) obj3).u) {
                            ((ycz) obj3).g();
                            xxg.b(zftVar, ugkVar);
                            return;
                        }
                        xxg xxgVar = ((ycz) obj3).t;
                        if (xxgVar != null) {
                            jNextLong = 0;
                            z = false;
                        } else {
                            jNextLong = ((ycz) obj3).h.nextLong();
                            ttl ttlVar = new ttl();
                            ttlVar.e();
                            xxg xxgVar2 = new xxg(jNextLong, ttlVar);
                            ((ycz) obj3).t = xxgVar2;
                            ((ycz) obj3).I.e++;
                            xxgVar = xxgVar2;
                        }
                        if (z) {
                            ((ycz) obj3).k.d(false, (int) (jNextLong >>> 32), (int) jNextLong);
                        }
                        synchronized (xxgVar) {
                            if (xxgVar.d) {
                                xxg.a(ugkVar, xxgVar.e != null ? new xwf(zftVar, 9) : new ehq(20));
                                return;
                            } else {
                                xxgVar.c.put(zftVar, ugkVar);
                                return;
                            }
                        }
                    }
                }
                return;
            case 18:
                xyr xyrVar3 = (xyr) this.a;
                if (xyrVar3.t == null) {
                    return;
                }
                xyrVar3.i(true);
                xwh xwhVar = xyrVar3.y;
                xwhVar.d(null);
                xyrVar3.F.a(2, "Entering IDLE state");
                xyrVar3.o.a(xqk.IDLE);
                xxh xxhVar = xyrVar3.P;
                Object[] objArr = {xyrVar3.x, xwhVar};
                for (int i2 = 0; i2 < 2; i2++) {
                    if (xxhVar.a.contains(objArr[i2])) {
                        xyrVar3.f();
                        return;
                    }
                }
                return;
            case 19:
                xyr xyrVar4 = ((xyi) this.a).b;
                xyrVar4.m.c();
                if (xyrVar4.s) {
                    xyrVar4.r.b();
                    return;
                }
                return;
            default:
                ((xyn) this.a).c.f();
                return;
        }
    }
}
