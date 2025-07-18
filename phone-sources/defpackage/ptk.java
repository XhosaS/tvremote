package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptk implements pzr {
    private static final tvn a = tvn.n("GnpSdk");

    @Override // defpackage.pzr
    public final Object a(qen qenVar, vvj vvjVar, Throwable th, yih yihVar) {
        String strM;
        String str;
        tvk tvkVar = (tvk) a.l().i(th);
        if (qenVar == null || (str = qenVar.b) == null || (strM = qtl.M(str)) == null) {
            strM = "";
        }
        tvkVar.v("Failed to update preferences for account: %s.", strM);
        return ygi.a;
    }

    @Override // defpackage.pzr
    public final Object b(qen qenVar, vvj vvjVar, vvj vvjVar2, yih yihVar) {
        String strM;
        String str;
        tuv tuvVarL = a.l();
        if (qenVar == null || (str = qenVar.b) == null || (strM = qtl.M(str)) == null) {
            strM = "";
        }
        tuvVarL.v("Successfully updated preferences for account: %s.", strM);
        return ygi.a;
    }
}
