package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fho implements fhi {
    private final amb a;

    public fho(amb ambVar) {
        this.a = ambVar;
    }

    @Override // defpackage.fhi
    public final Object a(agsw agswVar) {
        return ahii.a(((ano) this.a).c, agswVar);
    }

    @Override // defpackage.fhi
    public final Object b(agux aguxVar, agsw agswVar) {
        Object objA = this.a.a(new fhn(aguxVar), agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }
}
