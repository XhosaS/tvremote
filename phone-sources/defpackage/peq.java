package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class peq implements qdw {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ peq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.qdw
    public final Object a(qpv qpvVar) {
        String str;
        int i = this.b;
        if (i == 0) {
            return new peb(new pei((pea) this.a, "chime_versioned_identifiers", qpvVar, new pep(4)));
        }
        if (i == 1) {
            if (qpvVar instanceof qqn) {
                str = null;
            } else {
                if (!(qpvVar instanceof qpz)) {
                    throw new IllegalStateException("Only Zwieback and Gaia are supported by GrowthKit");
                }
                str = ((qpz) qpvVar).a;
            }
            return ((ntp) this.a).j("ANDROID_GROWTH", str);
        }
        if (i == 2) {
            return new peb(new pei((pea) this.a, "presented_promos", qpvVar, new pep(0)));
        }
        if (i != 3) {
            return new peb(new pei((pea) this.a, "promotions", qpvVar, new pep(3)));
        }
        return new peb(new pei((pea) this.a, "eval_results", qpvVar, new pep(5)));
    }
}
