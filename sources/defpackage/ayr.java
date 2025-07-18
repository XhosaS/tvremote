package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayr extends awc implements auh {
    public final cov d;
    public final AtomicReference e;
    public final att f;
    private final cjd g;

    public ayr(auf aufVar, cjd cjdVar, cov covVar, crv crvVar, att attVar) {
        super(null);
        AtomicReference atomicReference = new AtomicReference();
        this.e = atomicReference;
        this.g = cjdVar;
        this.d = covVar;
        this.f = attVar;
        aufVar.a(cjdVar, new cov() { // from class: ayq
            @Override // defpackage.cov
            public final Object a() {
                ayo ayoVarD = ayp.d();
                ayoVarD.b(true);
                return ayoVarD.a();
            }
        }, crvVar);
        atomicReference.set(attVar.b(1.0f));
    }

    @Override // defpackage.auh
    public final void t() {
        this.g.execute(new ama(this, 8, null));
    }
}
