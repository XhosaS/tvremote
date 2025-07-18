package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zls extends zix implements zlp {
    public zjo I;
    public zjo J;
    private ziu K;
    private zjo L;
    private zlo M;
    private zjo N;

    public zls(ziu ziuVar, zjo zjoVar, zlo zloVar, zjo zjoVar2, zjo zjoVar3) {
        this.K = ziuVar;
        this.L = zjoVar;
        this.M = zloVar;
        this.I = zjoVar2;
        this.J = null;
        this.N = zjoVar3;
    }

    public static zls a(Object obj) {
        if (obj != null) {
            return new zls(zjm.j(obj));
        }
        return null;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(6);
        ziiVar.b(this.K);
        ziiVar.b(this.L);
        ziiVar.b(this.M);
        zjo zjoVar = this.I;
        if (zjoVar != null) {
            ziiVar.b(new zks(false, 0, zjoVar));
        }
        zjo zjoVar2 = this.J;
        if (zjoVar2 != null) {
            ziiVar.b(new zks(false, 1, zjoVar2));
        }
        ziiVar.b(this.N);
        return new zkc(ziiVar);
    }

    public zls(zjm zjmVar) {
        Enumeration enumerationF = zjmVar.f();
        this.K = (ziu) enumerationF.nextElement();
        this.L = (zjo) enumerationF.nextElement();
        Object objNextElement = enumerationF.nextElement();
        this.M = objNextElement instanceof zlo ? (zlo) objNextElement : objNextElement != null ? new zlo(zjm.j(objNextElement)) : null;
        while (enumerationF.hasMoreElements()) {
            zjh zjhVar = (zjh) enumerationF.nextElement();
            if (zjhVar instanceof zjr) {
                zjr zjrVar = (zjr) zjhVar;
                int i = zjrVar.c;
                if (i == 0) {
                    this.I = zjo.h(zjrVar);
                } else {
                    if (i != 1) {
                        throw new IllegalArgumentException(a.cf(i, "unknown tag value "));
                    }
                    this.J = zjo.h(zjrVar);
                }
            } else {
                this.N = (zjo) zjhVar;
            }
        }
    }
}
