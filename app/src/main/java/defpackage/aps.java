package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aps implements agtc {
    private final aps a;
    private final ano b;

    public aps(aps apsVar, ano anoVar) {
        this.a = apsVar;
        this.b = anoVar;
    }

    public final void a(amb ambVar) {
        if (this.b == ambVar) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        aps apsVar = this.a;
        if (apsVar != null) {
            apsVar.a(ambVar);
        }
    }

    @Override // defpackage.agte
    public final Object fold(Object obj, agvb agvbVar) {
        return agtb.a(this, obj, agvbVar);
    }

    @Override // defpackage.agtc, defpackage.agte
    public final agtc get(agtd agtdVar) {
        return agtb.b(this, agtdVar);
    }

    @Override // defpackage.agtc
    public final agtd getKey() {
        return apr.a;
    }

    @Override // defpackage.agte
    public final agte minusKey(agtd agtdVar) {
        return agtb.c(this, agtdVar);
    }

    @Override // defpackage.agte
    public final agte plus(agte agteVar) {
        agteVar.getClass();
        return agta.a(this, agteVar);
    }
}
