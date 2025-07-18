package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agfo implements agfr {
    public static agfo e(agfq agfqVar) {
        agjv agjvVar = new agjv(agfqVar);
        aggz aggzVar = agoh.k;
        return agjvVar;
    }

    public static agfo f(Callable callable) {
        agjw agjwVar = new agjw(callable);
        aggz aggzVar = agoh.k;
        return agjwVar;
    }

    public static agfo i(long j, long j2, TimeUnit timeUnit, agfx agfxVar) {
        aghn.b(timeUnit, "unit is null");
        agkp agkpVar = new agkp(Math.max(0L, j), Math.max(0L, j2), timeUnit, agfxVar);
        aggz aggzVar = agoh.k;
        return agkpVar;
    }

    public final agfo g(aggw aggwVar) {
        agjy agjyVar = new agjy(this, aggwVar);
        aggz aggzVar = agoh.k;
        return agjyVar;
    }

    public final agfo h(aggy aggyVar, aggv aggvVar) {
        agkb agkbVar = new agkb(this, aggyVar, aggvVar);
        aggz aggzVar = agoh.k;
        return agkbVar;
    }

    public final agfo j(aggz aggzVar) {
        agks agksVar = new agks(this, aggzVar);
        aggz aggzVar2 = agoh.k;
        return agksVar;
    }

    public final agfo k(agfx agfxVar) {
        aghn.b(agfxVar, "scheduler is null");
        aglo agloVar = new aglo(this, agfxVar);
        aggz aggzVar = agoh.k;
        return agloVar;
    }

    public final aggi l(aggy aggyVar) {
        agia agiaVar = new agia(aggyVar, aghm.d);
        m(agiaVar);
        return agiaVar;
    }

    @Override // defpackage.agfr
    public final void m(agfs agfsVar) {
        aghn.b(agfsVar, "observer is null");
        try {
            mop mopVar = agoh.r;
            aghn.b(agfsVar, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            n(agfsVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            aggq.a(th);
            agoh.e(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void n(agfs agfsVar);

    public final agfo o(ohb ohbVar) {
        agkq agkqVar = new agkq(this, new ohd(ohbVar.a));
        aggz aggzVar = agoh.k;
        aggz aggzVar2 = agoh.k;
        return agkqVar;
    }

    public final agfy p(Object obj) {
        aghn.b(obj, "defaultItem is null");
        agkd agkdVar = new agkd(this, obj);
        aggz aggzVar = agoh.m;
        return agkdVar;
    }
}
