package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bcp<T> extends bbb<T> {
    public bcp(yjk yjkVar) {
        super(yjkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bbb
    public final bec b(bcq bcqVar, bec becVar) {
        bbm bbmVar = null;
        if (becVar instanceof bbm) {
            if (bcqVar.d) {
                bbmVar = (bbm) becVar;
                bbmVar.a.b(bcqVar.a());
            }
        } else if (becVar instanceof bea) {
            if ((bcqVar.b || bcqVar.e != null) && !bcqVar.d) {
                bea beaVar = (bea) becVar;
                if (yks.e(bcqVar.a(), beaVar.a)) {
                    bbmVar = beaVar;
                }
            }
        } else if (becVar instanceof bbf) {
            yjv yjvVar = ((bbf) becVar).a;
        }
        if (bbmVar != null) {
            return bbmVar;
        }
        if (!bcqVar.d) {
            return new bea(bcqVar.a());
        }
        Object obj = bcqVar.e;
        bds bdsVar = bcqVar.c;
        if (bdsVar == null) {
            bdsVar = bcz.c;
        }
        return new bbm(new bci(obj, bdsVar));
    }

    public abstract bcq c(Object obj);

    public final bcq d(Object obj) {
        bcq bcqVarC = c(obj);
        bcqVarC.f = false;
        return bcqVarC;
    }
}
