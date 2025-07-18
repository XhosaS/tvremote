package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agsr implements agtd {
    private final agux a;
    private final agtd b;

    public agsr(agtd agtdVar, agux aguxVar) {
        this.a = aguxVar;
        this.b = agtdVar instanceof agsr ? ((agsr) agtdVar).b : agtdVar;
    }

    public final agtc a(agtc agtcVar) {
        return (agtc) this.a.a(agtcVar);
    }

    public final boolean b(agtd agtdVar) {
        agtdVar.getClass();
        return agtdVar == this || this.b == agtdVar;
    }
}
