package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayj extends yiz implements yjz {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ bko c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayj(adp adpVar, int i, yih yihVar, int i2) {
        super(2, yihVar);
        this.d = i2;
        this.c = adpVar;
        this.b = i;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((ayj) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((ayj) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.d != 0) {
            return new ayj((adp) this.c, this.b, yihVar, 1);
        }
        return new ayj((ayk) this.c, this.b, yihVar, 0);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yjv] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        if (this.d != 0) {
            yio yioVar = yio.a;
            int i = this.a;
            ybn.f(obj);
            if (i == 0) {
                bko bkoVar = this.c;
                int i2 = this.b;
                ado adoVar = ((adp) bkoVar).b;
                this.a = 1;
                if (adoVar.f(i2, this) == yioVar) {
                    return yioVar;
                }
            }
            return ygi.a;
        }
        yio yioVar2 = yio.a;
        if (this.a != 0) {
            ybn.f(obj);
        } else {
            ybn.f(obj);
            bko bkoVar2 = this.c;
            float fE = ((ayk) bkoVar2).k.e();
            mr mrVarA = ms.a(fE);
            float f = 1.0f + fE;
            Float f2 = new Float(fE);
            Float f3 = new Float(f);
            ?? r6 = mrVarA.g.a;
            ne neVar = (ne) r6.a(f2);
            if (neVar == null) {
                neVar = mrVarA.c;
            }
            ne neVar2 = (ne) r6.a(f3);
            if (neVar2 == null) {
                neVar2 = mrVarA.d;
            }
            int iB = neVar.b();
            for (int i3 = 0; i3 < iB; i3++) {
                if (neVar.a(i3) > neVar2.a(i3)) {
                    og.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + neVar + " is greater than upper bound " + neVar2 + " on index " + i3);
                }
            }
            mrVarA.e = neVar;
            mrVarA.f = neVar2;
            if (!((Boolean) mrVarA.b.a()).booleanValue()) {
                Object objB = mrVarA.b(mrVarA.d());
                if (!yks.e(objB, mrVarA.d())) {
                    mrVarA.a.c(objB);
                }
            }
            Float f4 = new Float(f);
            nt ntVarH = fh.h(fh.i(this.b, no.c, 2), 1, 4);
            ars arsVar = new ars(bkoVar2, 19);
            this.a = 1;
            if (mr.j(mrVarA, f4, ntVarH, arsVar, this, 4) == yioVar2) {
                return yioVar2;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayj(ayk aykVar, int i, yih yihVar, int i2) {
        super(2, yihVar);
        this.d = i2;
        this.c = aykVar;
        this.b = i;
    }
}
