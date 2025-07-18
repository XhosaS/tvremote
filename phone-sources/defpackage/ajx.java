package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajx implements bdy, bjk {
    public final bcb a = new bci(null, ajw.a);
    public final bcb b = new bci(null, aju.a);
    private ajt c = new ajt();
    private cxe d;

    public final ajw b() {
        return (ajw) this.a.a();
    }

    @Override // defpackage.bjk
    public final bjm c() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cgz e(defpackage.ajw r39, defpackage.aju r40) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajx.e(ajw, aju):cgz");
    }

    @Override // defpackage.bdy
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final cgz a() {
        aju ajuVar;
        ajw ajwVarB = b();
        if (ajwVarB == null || (ajuVar = (aju) this.b.a()) == null) {
            return null;
        }
        return e(ajwVarB, ajuVar);
    }

    @Override // defpackage.bjk
    public final void g(bjm bjmVar) {
        bjmVar.getClass();
        this.c = (ajt) bjmVar;
    }

    @Override // defpackage.bjk
    public final bjm d(bjm bjmVar, bjm bjmVar2, bjm bjmVar3) {
        return bjmVar3;
    }
}
