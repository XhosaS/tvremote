package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class saz implements sbh {
    private final /* synthetic */ int a;

    @Override // defpackage.sbh
    public final Object a(sbi sbiVar) {
        int i = this.a;
        if (i == 0) {
            saf safVar = new saf();
            safVar.b = sbiVar;
            return safVar;
        }
        if (i == 1) {
            sah sahVar = new sah(1);
            sahVar.b = sbiVar;
            return sahVar;
        }
        if (i == 2) {
            return sac.a(sbiVar);
        }
        if (i == 3) {
            sal salVar = new sal();
            salVar.b = sbiVar;
            return salVar;
        }
        if (i != 4) {
            return sah.d(sbiVar);
        }
        sah sahVar2 = new sah(0);
        sahVar2.b = sbiVar;
        return sahVar2;
    }
}
