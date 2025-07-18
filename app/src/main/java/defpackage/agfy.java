package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agfy implements agga {
    public static agfy b(Object obj) {
        aghn.b(obj, "item is null");
        agly aglyVar = new agly(obj);
        aggz aggzVar = agoh.m;
        return aglyVar;
    }

    public final agff a(aggz aggzVar) {
        aglx aglxVar = new aglx(this, aggzVar);
        aggz aggzVar2 = agoh.n;
        return aglxVar;
    }

    public final agfy c(aggz aggzVar) {
        agma agmaVar = new agma(this, aggzVar);
        aggz aggzVar2 = agoh.m;
        return agmaVar;
    }

    @Override // defpackage.agga
    public final void d(agfz agfzVar) {
        mop mopVar = agoh.s;
        try {
            e(agfzVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            aggq.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void e(agfz agfzVar);
}
