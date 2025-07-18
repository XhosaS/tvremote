package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agkq extends agjn {
    final ohd b;

    public agkq(agfr agfrVar, ohd ohdVar) {
        super(agfrVar);
        this.b = ohdVar;
    }

    @Override // defpackage.agfo
    public final void n(agfs agfsVar) {
        try {
            ohd ohdVar = this.b;
            ohc ohcVar = new ohc(ohdVar, agfsVar);
            ohdVar.toString();
            this.a.m(ohcVar);
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
}
