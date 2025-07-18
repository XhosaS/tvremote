package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iws extends agtu implements agvb {
    int a;
    final /* synthetic */ iwt b;
    final /* synthetic */ abnb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iws(iwt iwtVar, abnb abnbVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iwtVar;
        this.c = abnbVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((iws) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        iwt iwtVar;
        iyd iydVar;
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            iwt iwtVar2 = this.b;
            abnb abnbVar = this.c;
            this.a = 1;
            obj = iwtVar2.u.a(abnbVar, this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        if (((Boolean) obj).booleanValue() && (iydVar = (iwtVar = this.b).k) != null) {
            int iOrdinal = this.c.ordinal();
            if (iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7) {
                xds xdsVar = iwtVar.n;
                if (xdsVar != null) {
                    iwtVar.e.d(xdsVar, iydVar);
                }
            } else if (iOrdinal == 11) {
                euk eukVar = iwtVar.t;
                String str = iwtVar.b.a;
                if (str.length() == 0) {
                    str = null;
                }
                far farVarA = eukVar.a(str);
                ffm ffmVar = iwtVar.q;
                if (ffmVar != null) {
                    ffmVar.p(farVarA);
                }
                iwtVar.e.d(farVarA.a(), iydVar);
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new iws(this.b, this.c, agswVar);
    }
}
