package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibn extends yiz implements yka {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ long c;
    final /* synthetic */ Object d;
    final /* synthetic */ kdj e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibn(yih yihVar, long j, kdj kdjVar, Object obj) {
        super(3, yihVar);
        this.c = j;
        this.e = kdjVar;
        this.d = obj;
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ibn ibnVar = new ibn((yih) obj3, this.c, this.e, this.d);
        ibnVar.f = (ysy) obj;
        ibnVar.b = obj2;
        return ibnVar.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, ysy] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        ysx isvVar;
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            ?? r11 = this.f;
            ibl iblVar = (ibl) this.b;
            boolean z = this.c < iblVar.c;
            Throwable th = (z && (iblVar instanceof ibk)) ? ((ibk) iblVar).b : null;
            if (iblVar instanceof ibk) {
                kdj kdjVar = this.e;
                Object obj2 = this.d;
                isvVar = new ipi(new ysq(new ibp(new ysq(new ajp((irc) kdjVar.c, obj2, (yih) null, 9)), null, z, th)), new ibm(obj2, (yih) null, 0), 14);
            } else {
                if (!(iblVar instanceof ibj)) {
                    throw new yfu();
                }
                isvVar = new isv(new iax[0], 5);
            }
            ipi ipiVar = new ipi((yjz) new daz(th, (yih) null, 9), isvVar, 13);
            this.a = 1;
            if (vyf.K(r11, ipiVar, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
