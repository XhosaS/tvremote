package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agff implements agfi {
    public static agff c(agfh agfhVar) {
        agii agiiVar = new agii(agfhVar);
        aggz aggzVar = agoh.n;
        return agiiVar;
    }

    public static agff f(Throwable th) {
        agik agikVar = new agik(th);
        aggz aggzVar = agoh.n;
        return agikVar;
    }

    public static agff g(aggv aggvVar) {
        agil agilVar = new agil(aggvVar);
        aggz aggzVar = agoh.n;
        return agilVar;
    }

    public static agff h(Runnable runnable) {
        agim agimVar = new agim(runnable);
        aggz aggzVar = agoh.n;
        return agimVar;
    }

    @Override // defpackage.agfi
    public final void a(agfg agfgVar) {
        aghn.b(agfgVar, "observer is null");
        try {
            mop mopVar = agoh.t;
            aghn.b(agfgVar, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            l(agfgVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            aggq.a(th);
            agoh.e(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final agff b(agfj agfjVar) {
        agfi agfiVarB = agfjVar.b(this);
        if (agfiVarB instanceof agff) {
            agff agffVar = (agff) agfiVarB;
            aggz aggzVar = agoh.n;
            return agffVar;
        }
        agip agipVar = new agip(agfiVarB);
        aggz aggzVar2 = agoh.n;
        return agipVar;
    }

    public final agff d(aggy aggyVar) {
        return m(aghm.c, aggyVar, aghm.b);
    }

    public final agff e(aggy aggyVar) {
        return m(aggyVar, aghm.c, aghm.b);
    }

    public final agff i(agfx agfxVar) {
        aghn.b(agfxVar, "scheduler is null");
        agiu agiuVar = new agiu(this, agfxVar);
        aggz aggzVar = agoh.n;
        return agiuVar;
    }

    public final agff j(agfx agfxVar) {
        aghn.b(agfxVar, "scheduler is null");
        agja agjaVar = new agja(this, agfxVar);
        aggz aggzVar = agoh.n;
        return agjaVar;
    }

    public final aggi k() {
        aghz aghzVar = new aghz();
        a(aghzVar);
        return aghzVar;
    }

    protected abstract void l(agfg agfgVar);

    public final agff m(aggy aggyVar, aggy aggyVar2, aggv aggvVar) {
        agiy agiyVar = new agiy(this, aggyVar, aggyVar2, aggvVar);
        aggz aggzVar = agoh.n;
        return agiyVar;
    }
}
