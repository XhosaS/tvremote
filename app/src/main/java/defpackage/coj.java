package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class coj extends agtu implements agvb {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cbv d;
    final /* synthetic */ cic e;
    final /* synthetic */ cld f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coj(cbv cbvVar, cic cicVar, cld cldVar, agsw agswVar) {
        super(2, agswVar);
        this.d = cbvVar;
        this.e = cicVar;
        this.f = cldVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ahdl] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ahdl] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.agto
    public final Object b(Object obj) {
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        zyd zydVar;
        ?? r5;
        agtg agtgVar = agtg.a;
        ?? r1 = this.c;
        try {
            try {
                if (r1 != 0) {
                    Object obj2 = this.b;
                    r5 = this.a;
                    atomicInteger = (AtomicInteger) this.g;
                    try {
                        agpl.b(obj);
                        r1 = obj2;
                        r5 = r5;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        zydVar = r5;
                        String str = cor.a;
                        cbv cbvVar = this.d;
                        cbx.c().b(str, "Delegated worker " + cbvVar.getClass() + " was cancelled", cancellationException);
                        int i = atomicInteger.get();
                        if (zydVar.isCancelled()) {
                            throw cancellationException;
                        }
                        throw cancellationException;
                    }
                } else {
                    agpl.b(obj);
                    ahbt ahbtVar = (ahbt) this.g;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    zyd zydVarB = this.d.b();
                    zydVarB.getClass();
                    ahdl ahdlVarE = ahal.e(ahbtVar, null, 0, new coi(this.e, this.f, atomicInteger2, zydVarB, null), 3);
                    try {
                        this.g = atomicInteger2;
                        this.a = zydVarB;
                        this.b = ahdlVarE;
                        this.c = 1;
                        obj = xw.a(zydVarB, this);
                        if (obj == agtgVar) {
                            return agtgVar;
                        }
                        atomicInteger = atomicInteger2;
                        r5 = zydVarB;
                        r1 = ahdlVarE;
                    } catch (CancellationException e2) {
                        cancellationException = e2;
                        atomicInteger = atomicInteger2;
                        zydVar = zydVarB;
                        String str2 = cor.a;
                        cbv cbvVar2 = this.d;
                        cbx.c().b(str2, "Delegated worker " + cbvVar2.getClass() + " was cancelled", cancellationException);
                        int i2 = atomicInteger.get();
                        if (zydVar.isCancelled() || i2 == -256) {
                            throw cancellationException;
                        }
                        throw new cof(atomicInteger.get());
                    }
                }
                cbu cbuVar = (cbu) obj;
                r1.s(null);
                return cbuVar;
            } catch (Throwable th) {
                String str3 = cor.a;
                cbv cbvVar3 = this.d;
                cbx.c().b(str3, "Delegated worker " + cbvVar3.getClass() + " threw exception in startWork.", th);
                throw th;
            }
        } catch (Throwable th2) {
            r1.s(null);
            throw th2;
        }
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        coj cojVar = new coj(this.d, this.e, this.f, agswVar);
        cojVar.g = obj;
        return cojVar;
    }
}
