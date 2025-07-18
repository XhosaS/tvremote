package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aed extends bko implements cef, byk {
    public final tf a;
    private boolean b;

    public aed(tf tfVar) {
        this.a = tfVar;
    }

    public static final bmy b(aed aedVar, bvc bvcVar, yjk yjkVar) {
        Object objA;
        if (aedVar.A && aedVar.b) {
            bvc bvcVarG = fh.G(aedVar);
            if (true != bvcVar.s()) {
                bvcVar = null;
            }
            if (bvcVar != null && (objA = yjkVar.a()) != null) {
                return ((bmy) objA).i(bvcVarG.p(bvcVar, false).f());
            }
        }
        return null;
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.byk
    public final void cj(bvc bvcVar) {
        this.b = true;
    }

    @Override // defpackage.cef
    public final Object e(bvc bvcVar, yjk yjkVar, yih yihVar) {
        Object objK = yoz.k(new aub(this, bvcVar, yjkVar, new bg(this, bvcVar, yjkVar, 4), (yih) null, 1), yihVar);
        return objK == yio.a ? objK : ygi.a;
    }

    @Override // defpackage.byk
    public final /* synthetic */ void bX(long j) {
    }
}
