package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yay implements xvm {
    final yaz a;
    public final /* synthetic */ ybb b;

    public yay(ybb ybbVar, yaz yazVar) {
        this.b = ybbVar;
        this.a = yazVar;
    }

    private static final Integer b(xsm xsmVar) {
        String str = (String) xsmVar.c(ybb.b);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // defpackage.xvm
    public final void a(xtk xtkVar, xvl xvlVar, xsm xsmVar) {
        int i;
        int i2;
        yau yauVar;
        ybb ybbVar = this.b;
        synchronized (ybbVar.m) {
            yax yaxVar = ybbVar.r;
            yaz yazVar = this.a;
            yazVar.b = true;
            Collection collection = yaxVar.c;
            if (collection.contains(yazVar)) {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.remove(yazVar);
                yaxVar = new yax(yaxVar.b, DesugarCollections.unmodifiableCollection(arrayList), yaxVar.d, yaxVar.f, yaxVar.g, yaxVar.a, yaxVar.h, yaxVar.e);
            }
            ybbVar.r = yaxVar;
            ybbVar.q.a(xtkVar.n);
        }
        ybb ybbVar2 = this.b;
        if (ybbVar2.u.decrementAndGet() == Integer.MIN_VALUE) {
            ybbVar2.h.execute(new xyp(this, 10));
            return;
        }
        yaz yazVar2 = this.a;
        if (yazVar2.c) {
            ybbVar2.d(yazVar2);
            if (ybbVar2.r.f == yazVar2) {
                ybbVar2.q(xtkVar, xvlVar, xsmVar);
                return;
            }
            return;
        }
        xvl xvlVar2 = xvl.MISCARRIED;
        if (xvlVar == xvlVar2 && ybbVar2.t.incrementAndGet() > 1000) {
            ybb ybbVar3 = this.b;
            yaz yazVar3 = this.a;
            ybbVar3.d(yazVar3);
            if (ybbVar3.r.f == yazVar3) {
                ybbVar3.q(xtk.j.e("Too many transparent retries. Might be a bug in gRPC").d(new xtn(xtkVar)), xvlVar, xsmVar);
                return;
            }
            return;
        }
        if (ybbVar2.r.f == null) {
            if (xvlVar == xvlVar2 || (xvlVar == xvl.REFUSED && ybbVar2.s.compareAndSet(false, true))) {
                ybb ybbVar4 = this.b;
                yaz yazVar4 = this.a;
                yaz yazVarB = ybbVar4.b(yazVar4.d, true);
                if (yazVarB != null) {
                    if (ybbVar4.l) {
                        synchronized (ybbVar4.m) {
                            yax yaxVar2 = ybbVar4.r;
                            ArrayList arrayList2 = new ArrayList(yaxVar2.d);
                            arrayList2.remove(yazVar4);
                            arrayList2.add(yazVarB);
                            ybbVar4.r = new yax(yaxVar2.b, yaxVar2.c, DesugarCollections.unmodifiableCollection(arrayList2), yaxVar2.f, yaxVar2.g, yaxVar2.a, yaxVar2.h, yaxVar2.e);
                        }
                    }
                    this.b.g.execute(new xxl((Object) this, (Object) yazVarB, 9, (byte[]) null));
                    return;
                }
                return;
            }
            if (xvlVar != xvl.DROPPED) {
                ybbVar2.s.set(true);
                if (ybbVar2.l) {
                    Integer numB = b(xsmVar);
                    ybb ybbVar5 = this.b;
                    boolean zContains = ybbVar5.k.c.contains(xtkVar.n);
                    boolean z = (ybbVar5.p == null || (!zContains && (numB == null || numB.intValue() >= 0))) ? false : !r9.b();
                    if (zContains && !z && !xtkVar.g() && numB != null && numB.intValue() > 0) {
                        numB = 0;
                    }
                    boolean z2 = zContains && !z;
                    if (z2 && numB != null) {
                        if (numB.intValue() < 0) {
                            ybbVar5.i();
                        } else {
                            Object obj = ybbVar5.m;
                            synchronized (obj) {
                                yau yauVar2 = ybbVar5.y;
                                if (yauVar2 != null) {
                                    Future futureA = yauVar2.a();
                                    yau yauVar3 = new yau(obj);
                                    ybbVar5.y = yauVar3;
                                    if (futureA != null) {
                                        futureA.cancel(false);
                                    }
                                    yauVar3.b(ybbVar5.i.schedule(new yav(ybbVar5, yauVar3, 0), numB.intValue(), TimeUnit.MILLISECONDS));
                                }
                            }
                        }
                    }
                    ybb ybbVar6 = this.b;
                    synchronized (ybbVar6.m) {
                        yax yaxVar3 = ybbVar6.r;
                        yaz yazVar5 = this.a;
                        ArrayList arrayList3 = new ArrayList(yaxVar3.d);
                        arrayList3.remove(yazVar5);
                        ybbVar6.r = new yax(yaxVar3.b, yaxVar3.c, DesugarCollections.unmodifiableCollection(arrayList3), yaxVar3.f, yaxVar3.g, yaxVar3.a, yaxVar3.h, yaxVar3.e);
                        if (z2 && (ybbVar6.s(ybbVar6.r) || !ybbVar6.r.d.isEmpty())) {
                            return;
                        }
                    }
                } else {
                    ybc ybcVar = ybbVar2.j;
                    long j = 0;
                    if (ybcVar == null) {
                        i2 = 0;
                        i = 1;
                    } else {
                        boolean zContains2 = ybcVar.f.contains(xtkVar.n);
                        Integer numB2 = b(xsmVar);
                        boolean z3 = (ybbVar2.p == null || (!zContains2 && (numB2 == null || numB2.intValue() >= 0))) ? false : !r13.b();
                        if (ybcVar.a <= yazVar2.d + 1 || z3) {
                            i = 1;
                            i2 = 0;
                        } else {
                            if (numB2 == null) {
                                if (zContains2) {
                                    long j2 = ybbVar2.z;
                                    double dNextDouble = ybb.e ? (ybb.d.nextDouble() * 0.8d) + 0.4d : ybb.d.nextDouble();
                                    i = 1;
                                    ybbVar2.z = Math.min((long) (ybbVar2.z * ybcVar.d), ybcVar.c);
                                    j = (long) (j2 * dNextDouble);
                                }
                                i = 1;
                                i2 = 0;
                            } else {
                                i = 1;
                                if (numB2.intValue() >= 0) {
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(numB2.intValue());
                                    ybbVar2.z = ybcVar.b;
                                    j = nanos;
                                }
                                i2 = 0;
                            }
                            i2 = i;
                        }
                    }
                    if (i2 != 0) {
                        yaz yazVarB2 = ybbVar2.b(yazVar2.d + i, false);
                        if (yazVarB2 != null) {
                            Object obj2 = ybbVar2.m;
                            synchronized (obj2) {
                                yauVar = new yau(obj2);
                                ybbVar2.x = yauVar;
                            }
                            yauVar.b(this.b.i.schedule(new rvp(this, yauVar, yazVarB2, 19), j, TimeUnit.NANOSECONDS));
                            return;
                        }
                        return;
                    }
                }
            } else if (ybbVar2.l) {
                ybbVar2.i();
            }
        }
        ybb ybbVar7 = this.b;
        yaz yazVar6 = this.a;
        ybbVar7.d(yazVar6);
        if (ybbVar7.r.f == yazVar6) {
            ybbVar7.q(xtkVar, xvlVar, xsmVar);
        }
    }

    @Override // defpackage.xvm
    public final void c(xsm xsmVar) {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        yaz yazVar = this.a;
        int i3 = yazVar.d;
        if (i3 > 0) {
            xsj xsjVar = ybb.a;
            xsmVar.f(xsjVar);
            xsmVar.h(xsjVar, String.valueOf(i3));
        }
        ybb ybbVar = this.b;
        ybbVar.d(yazVar);
        if (ybbVar.r.f == yazVar) {
            yba ybaVar = ybbVar.p;
            if (ybaVar != null) {
                do {
                    atomicInteger = ybaVar.d;
                    i = atomicInteger.get();
                    i2 = ybaVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(ybaVar.c + i, i2)));
            }
            ybbVar.h.execute(new xxl(this, xsmVar, 7));
        }
    }

    @Override // defpackage.ybu
    public final void d() {
        ybb ybbVar = this.b;
        if (ybbVar.p()) {
            ybbVar.h.execute(new xyp(this, 11));
        }
    }

    @Override // defpackage.ybu
    public final void e(xzg xzgVar) throws IOException {
        ybb ybbVar = this.b;
        yaz yazVar = ybbVar.r.f;
        sij.x(yazVar != null, "Headers should be received prior to messages.");
        if (yazVar != this.a) {
            xxc.j(xzgVar);
        } else {
            ybbVar.h.execute(new xxl(this, xzgVar, 10));
        }
    }
}
