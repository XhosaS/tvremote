package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbh extends bjl implements bdy {
    public final yjk a;
    public final bds b;
    public bbg c = new bbg(bjb.b().v());

    public bbh(yjk yjkVar, bds bdsVar) {
        this.a = yjkVar;
        this.b = bdsVar;
    }

    @Override // defpackage.bdy
    public final Object a() {
        yjv yjvVarI = bjb.b().i();
        if (yjvVarI != null) {
            yjvVarI.a(this);
        }
        bit bitVarB = bjb.b();
        return b((bbg) bjb.f(this.c, bitVarB), bitVarB, true, this.a).e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bbg b(defpackage.bbg r21, defpackage.bit r22, boolean r23, defpackage.yjk r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbh.b(bbg, bit, boolean, yjk):bbg");
    }

    @Override // defpackage.bjk
    public final bjm c() {
        return this.c;
    }

    public final bbg e() {
        bit bitVarB = bjb.b();
        return b((bbg) bjb.f(this.c, bitVarB), bitVarB, false, this.a);
    }

    @Override // defpackage.bjk
    public final void g(bjm bjmVar) {
        bjmVar.getClass();
        this.c = (bbg) bjmVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        bbg bbgVar = (bbg) bjb.e(this.c);
        sb.append(bbgVar.e(bjb.b()) ? String.valueOf(bbgVar.e) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
