package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwb extends yiz implements yjz {
    Object a;
    Object b;
    int c;
    final /* synthetic */ gpm d;
    final /* synthetic */ guw e;
    final /* synthetic */ cb f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwb(gpm gpmVar, cb cbVar, guw guwVar, yih yihVar) {
        super(2, yihVar);
        this.d = gpmVar;
        this.f = cbVar;
        this.e = guwVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gwb) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        gwb gwbVar = new gwb(this.d, this.f, this.e, yihVar);
        gwbVar.g = obj;
        return gwbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [yqe] */
    /* JADX WARN: Type inference failed for: r1v5, types: [yqe] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        uhp uhpVar;
        ?? r3;
        yio yioVar = yio.a;
        ?? r1 = this.c;
        try {
            try {
                if (r1 != 0) {
                    Object obj2 = this.b;
                    r3 = this.a;
                    atomicInteger = (AtomicInteger) this.g;
                    try {
                        ybn.f(obj);
                        r1 = obj2;
                        r3 = r3;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        uhpVar = r3;
                        String str = gwf.a;
                        gpm gpmVar = this.d;
                        gpn.b();
                        Objects.toString(gpmVar.getClass());
                        int i = atomicInteger.get();
                        if (uhpVar.isCancelled() || i == -256) {
                            throw cancellationException;
                        }
                        throw new gvz(atomicInteger.get());
                    }
                } else {
                    ybn.f(obj);
                    yow yowVar = (yow) this.g;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    gpm gpmVar2 = this.d;
                    cb cbVar = this.f;
                    guw guwVar = this.e;
                    uhp uhpVarD = gpmVar2.d();
                    yqe yqeVarQ = ykr.q(yowVar, null, 0, new ajo(cbVar, guwVar, atomicInteger2, uhpVarD, (yih) null, 9), 3);
                    try {
                        this.g = atomicInteger2;
                        this.a = uhpVarD;
                        this.b = yqeVarQ;
                        this.c = 1;
                        obj = cme.s(uhpVarD, this);
                        if (obj == yioVar) {
                            return yioVar;
                        }
                        atomicInteger = atomicInteger2;
                        r3 = uhpVarD;
                        r1 = yqeVarQ;
                    } catch (CancellationException e2) {
                        cancellationException = e2;
                        atomicInteger = atomicInteger2;
                        uhpVar = uhpVarD;
                        String str2 = gwf.a;
                        gpm gpmVar3 = this.d;
                        gpn.b();
                        Objects.toString(gpmVar3.getClass());
                        int i2 = atomicInteger.get();
                        if (uhpVar.isCancelled()) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    }
                }
                gli gliVar = (gli) obj;
                r1.t(null);
                return gliVar;
            } catch (Throwable th) {
                String str3 = gwf.a;
                gpm gpmVar4 = this.d;
                gpn.b();
                Objects.toString(gpmVar4.getClass());
                throw th;
            }
        } catch (Throwable th2) {
            r1.t(null);
            throw th2;
        }
    }
}
