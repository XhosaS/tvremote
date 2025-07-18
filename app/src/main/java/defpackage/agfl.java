package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agfl implements aidd {
    public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static agfl a(Iterable iterable) {
        aghn.b(iterable, "source is null");
        agjj agjjVar = new agjj(iterable);
        aggz aggzVar = agoh.j;
        return agjjVar;
    }

    public final agfl b(aggz aggzVar) {
        agjm agjmVar = new agjm(this, aggzVar);
        aggz aggzVar2 = agoh.j;
        return agjmVar;
    }

    public final void c(agfm agfmVar) {
        try {
            mop mopVar = agoh.q;
            e(agfmVar);
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

    @Override // defpackage.aidd
    public final void d(aide aideVar) {
        if (aideVar instanceof agfm) {
            c((agfm) aideVar);
        } else {
            c(new agnp(aideVar));
        }
    }

    protected abstract void e(aide aideVar);
}
