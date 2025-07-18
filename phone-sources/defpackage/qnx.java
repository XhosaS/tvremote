package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qnx implements qnr {
    public static final tvn a = tvn.n("GnpSdk");
    public final qnt b;
    public final yil c;

    public qnx(qnt qntVar, yil yilVar) {
        this.b = qntVar;
        this.c = yilVar;
    }

    @Override // defpackage.qnr
    public final qen a(qpv qpvVar) throws qek {
        qen qenVar;
        try {
            qenVar = (qen) gez.j(((qnw) this.b).a, true, false, new aps(osk.ag(qpvVar), ((qpz) qpvVar).a, 10));
        } catch (Exception e) {
            ((tvk) ((tvk) a.g()).i(e)).r();
            qenVar = null;
        }
        if (qenVar != null) {
            return qenVar;
        }
        throw new qek("Account representation not found in GnpAccountStorage");
    }

    @Override // defpackage.qnr
    public final Object b(qpv qpvVar, yih yihVar) {
        return ykr.l(this.c, new ajp(this, qpvVar, (yih) null, 11, (byte[]) null), yihVar);
    }

    @Override // defpackage.qnr
    public final Object c(yih yihVar) {
        return ykr.l(this.c, new kim(this, (yih) null, 2), yihVar);
    }

    @Override // defpackage.qnr
    public final Object d(List list, yih yihVar) {
        return ykr.l(this.c, new uc(this, list, (yih) null, 18), yihVar);
    }

    @Override // defpackage.qnr
    public final Object e(List list, yih yihVar) {
        return ykr.l(this.c, new uc(this, list, (yih) null, 19, (byte[]) null), yihVar);
    }
}
