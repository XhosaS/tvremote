package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rva extends rrx implements rqf {
    public final rqd a;
    public final uht b;
    public final xbw c;
    public final xbw d;
    public final rvl e;
    public final AtomicReference f;
    public final ulp g;

    public rva(yyh yyhVar, uht uhtVar, xbw xbwVar, xbw xbwVar2, yfo yfoVar, ulp ulpVar, shy shyVar) {
        super(null);
        AtomicReference atomicReference = new AtomicReference();
        this.f = atomicReference;
        this.b = uhtVar;
        this.c = xbwVar;
        this.d = xbwVar2;
        this.g = ulpVar;
        this.a = yyhVar.f(uhtVar, new xbw() { // from class: ruz
            @Override // defpackage.xbw
            public final Object b() {
                ruv ruvVarD = ruw.d();
                ruvVarD.b(true);
                return ruvVarD.a();
            }
        }, yfoVar);
        this.e = shyVar.a(new lii(xbwVar, 12));
        atomicReference.set(ulpVar.aG(1.0f));
    }

    @Override // defpackage.rqf
    public final void k() {
        this.b.execute(new rtr(this, 6));
    }
}
