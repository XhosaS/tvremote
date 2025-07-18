package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class efj extends drq {
    @Override // defpackage.drq
    protected final dxh ax(dru druVar, int i) {
        return new dxh(drh.b(druVar).a);
    }

    @Override // defpackage.drq
    public final String d() {
        return "EmptyComponent";
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this != drqVar) {
            return drqVar != null && getClass() == drqVar.getClass();
        }
        return true;
    }
}
