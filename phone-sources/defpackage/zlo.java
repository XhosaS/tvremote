package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zlo extends zix implements zlp {
    private final zjb I;
    private zih J;
    private boolean K;

    public zlo(zjb zjbVar, zih zihVar) {
        this.K = true;
        this.I = zjbVar;
        this.J = zihVar;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(2);
        ziiVar.b(this.I);
        zih zihVar = this.J;
        if (zihVar != null) {
            ziiVar.b(new zkf(zihVar));
        }
        return this.K ? new zkc(ziiVar) : new zky(ziiVar);
    }

    public zlo(zjm zjmVar) {
        this.K = true;
        Enumeration enumerationF = zjmVar.f();
        this.I = (zjb) enumerationF.nextElement();
        if (enumerationF.hasMoreElements()) {
            this.J = ((zjr) enumerationF.nextElement()).f();
        }
        this.K = zjmVar instanceof zkc;
    }
}
