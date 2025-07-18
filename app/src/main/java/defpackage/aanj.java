package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aanj implements aann {
    private final aano a;
    private final lvj b;

    public aanj(aano aanoVar, lvj lvjVar) {
        this.a = aanoVar;
        this.b = lvjVar;
    }

    @Override // defpackage.aann
    public final boolean a(Exception exc) {
        this.b.a.q(exc);
        return true;
    }

    @Override // defpackage.aann
    public final boolean b(aanv aanvVar) {
        if (!aanvVar.l() || this.a.b(aanvVar)) {
            return false;
        }
        lvj lvjVar = this.b;
        aanr aanrVar = (aanr) aanvVar;
        String str = aanrVar.b;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        lvjVar.a.p(new aamz(str, aanrVar.d, aanrVar.e));
        return true;
    }
}
