package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afyc implements afog {
    final afyd a;
    final /* synthetic */ afyf b;

    public afyc(afyf afyfVar, afyd afydVar) {
        this.b = afyfVar;
        this.a = afydVar;
    }

    private final Integer b(afih afihVar) {
        String str = (String) afihVar.a(afyf.f);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // defpackage.afog
    public final void a(Status status, afof afofVar, afih afihVar) {
        boolean z;
        boolean z2;
        afxp afxpVar;
        afyf afyfVar = this.b;
        synchronized (afyfVar.q) {
            afxu afxuVar = afyfVar.w;
            afyd afydVar = this.a;
            afydVar.b = true;
            Collection collection = afxuVar.c;
            if (collection.contains(afydVar)) {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.remove(afydVar);
                afxuVar = new afxu(afxuVar.b, DesugarCollections.unmodifiableCollection(arrayList), afxuVar.d, afxuVar.f, afxuVar.g, afxuVar.a, afxuVar.h, afxuVar.e);
            }
            afyfVar.w = afxuVar;
            afyfVar.v.a(status.getCode());
        }
        afyf afyfVar2 = this.b;
        if (afyfVar2.z.decrementAndGet() == Integer.MIN_VALUE) {
            afkc afkcVar = (afkc) afyfVar2.l;
            afkcVar.c(new afxy(this));
            afkcVar.b();
            return;
        }
        afyd afydVar2 = this.a;
        if (afydVar2.c) {
            afyfVar2.o(afydVar2);
            if (afyfVar2.w.f == afydVar2) {
                afyfVar2.y(status, afofVar, afihVar);
                return;
            }
            return;
        }
        afof afofVar2 = afof.MISCARRIED;
        if (afofVar == afofVar2 && afyfVar2.y.incrementAndGet() > 1000) {
            afyf afyfVar3 = this.b;
            afyd afydVar3 = this.a;
            afyfVar3.o(afydVar3);
            if (afyfVar3.w.f == afydVar3) {
                afyfVar3.y(Status.k.withDescription("Too many transparent retries. Might be a bug in gRPC").c(new afjx(status, null)), afofVar, afihVar);
                return;
            }
            return;
        }
        if (afyfVar2.w.f == null) {
            if (afofVar == afofVar2 || (afofVar == afof.REFUSED && afyfVar2.x.compareAndSet(false, true))) {
                afyd afydVarK = afyfVar2.k(afydVar2.d, true);
                if (afydVarK != null) {
                    if (afyfVar2.p) {
                        synchronized (afyfVar2.q) {
                            afxu afxuVar2 = afyfVar2.w;
                            ArrayList arrayList2 = new ArrayList(afxuVar2.d);
                            arrayList2.remove(afydVar2);
                            arrayList2.add(afydVarK);
                            afyfVar2.w = new afxu(afxuVar2.b, afxuVar2.c, DesugarCollections.unmodifiableCollection(arrayList2), afxuVar2.f, afxuVar2.g, afxuVar2.a, afxuVar2.h, afxuVar2.e);
                        }
                    }
                    this.b.k.execute(new afxz(this, afydVarK));
                    return;
                }
                return;
            }
            if (afofVar == afof.DROPPED) {
                afyf afyfVar4 = this.b;
                if (afyfVar4.p) {
                    afyfVar4.x();
                }
            } else {
                afyf afyfVar5 = this.b;
                afyfVar5.x.set(true);
                if (afyfVar5.p) {
                    Integer numB = b(afihVar);
                    afyf afyfVar6 = this.b;
                    boolean zContains = afyfVar6.o.c.contains(status.getCode());
                    boolean z3 = (afyfVar6.u == null || (!zContains && (numB == null || numB.intValue() >= 0))) ? false : !r9.b();
                    if (zContains && !z3 && !status.e() && numB != null && numB.intValue() > 0) {
                        numB = 0;
                    }
                    boolean z4 = zContains && !z3;
                    if (z4 && numB != null) {
                        if (numB.intValue() < 0) {
                            afyfVar6.x();
                        } else {
                            Object obj = afyfVar6.q;
                            synchronized (obj) {
                                afxp afxpVar2 = afyfVar6.E;
                                if (afxpVar2 != null) {
                                    Future futureA = afxpVar2.a();
                                    afxp afxpVar3 = new afxp(obj);
                                    afyfVar6.E = afxpVar3;
                                    if (futureA != null) {
                                        futureA.cancel(false);
                                    }
                                    afxpVar3.b(afyfVar6.m.schedule(new afxr(afyfVar6, afxpVar3), numB.intValue(), TimeUnit.MILLISECONDS));
                                }
                            }
                        }
                    }
                    afyf afyfVar7 = this.b;
                    synchronized (afyfVar7.q) {
                        afxu afxuVar3 = afyfVar7.w;
                        afyd afydVar4 = this.a;
                        ArrayList arrayList3 = new ArrayList(afxuVar3.d);
                        arrayList3.remove(afydVar4);
                        afyfVar7.w = new afxu(afxuVar3.b, afxuVar3.c, DesugarCollections.unmodifiableCollection(arrayList3), afxuVar3.f, afxuVar3.g, afxuVar3.a, afxuVar3.h, afxuVar3.e);
                        if (z4 && (afyfVar7.z(afyfVar7.w) || !afyfVar7.w.d.isEmpty())) {
                            return;
                        }
                    }
                } else {
                    afyg afygVar = afyfVar5.n;
                    long j = 0;
                    if (afygVar == null) {
                        z = false;
                    } else {
                        boolean zContains2 = afygVar.f.contains(status.getCode());
                        Integer numB2 = b(afihVar);
                        boolean z5 = (afyfVar5.u == null || (!zContains2 && (numB2 == null || numB2.intValue() >= 0))) ? false : !r12.b();
                        if (afygVar.a <= this.a.d + 1 || z5) {
                            z = false;
                        } else {
                            if (numB2 == null) {
                                if (zContains2) {
                                    long j2 = afyfVar5.F;
                                    double dNextDouble = afyf.i ? (afyf.h.nextDouble() * 0.8d) + 0.4d : afyf.h.nextDouble();
                                    z2 = true;
                                    afyfVar5.F = Math.min((long) (afyfVar5.F * afygVar.d), afygVar.c);
                                    j = (long) (j2 * dNextDouble);
                                }
                                z = false;
                            } else {
                                z2 = true;
                                if (numB2.intValue() >= 0) {
                                    long nanos = TimeUnit.MILLISECONDS.toNanos(numB2.intValue());
                                    afyfVar5.F = afygVar.b;
                                    j = nanos;
                                }
                                z = false;
                            }
                            z = z2;
                        }
                    }
                    if (z) {
                        afyd afydVarK2 = afyfVar5.k(this.a.d + 1, false);
                        if (afydVarK2 != null) {
                            Object obj2 = afyfVar5.q;
                            synchronized (obj2) {
                                afxpVar = new afxp(obj2);
                                afyfVar5.D = afxpVar;
                            }
                            afxpVar.b(this.b.m.schedule(new afxx(this, afxpVar, afydVarK2), j, TimeUnit.NANOSECONDS));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        afyf afyfVar8 = this.b;
        afyd afydVar5 = this.a;
        afyfVar8.o(afydVar5);
        if (afyfVar8.w.f == afydVar5) {
            afyfVar8.y(status, afofVar, afihVar);
        }
    }

    @Override // defpackage.afog
    public final void c(afih afihVar) {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        afyd afydVar = this.a;
        int i3 = afydVar.d;
        if (i3 > 0) {
            afid afidVar = afyf.e;
            afihVar.c(afidVar);
            afihVar.e(afidVar, String.valueOf(i3));
        }
        afyf afyfVar = this.b;
        afyfVar.o(afydVar);
        if (afyfVar.w.f == afydVar) {
            afye afyeVar = afyfVar.u;
            if (afyeVar != null) {
                do {
                    atomicInteger = afyeVar.d;
                    i = atomicInteger.get();
                    i2 = afyeVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(afyeVar.c + i, i2)));
            }
            afkc afkcVar = (afkc) afyfVar.l;
            afkcVar.c(new afxv(this, afihVar));
            afkcVar.b();
        }
    }

    @Override // defpackage.afzz
    public final void d(afzy afzyVar) throws IOException {
        afyf afyfVar = this.b;
        afyd afydVar = afyfVar.w.f;
        yqw.M(afydVar != null, "Headers should be received prior to messages.");
        if (afydVar != this.a) {
            afrq.g(afzyVar);
            return;
        }
        afkc afkcVar = (afkc) afyfVar.l;
        afkcVar.c(new afya(this, afzyVar));
        afkcVar.b();
    }

    @Override // defpackage.afzz
    public final void e() {
        afyf afyfVar = this.b;
        if (afyfVar.i()) {
            afkc afkcVar = (afkc) afyfVar.l;
            afkcVar.c(new afyb(this));
            afkcVar.b();
        }
    }
}
