package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idu extends icu implements iej {
    public final ids[] g;

    public idu(int i, ids... idsVarArr) {
        super(i);
        this.g = idsVarArr;
    }

    @Override // defpackage.iej
    public final void dM() {
        eb();
    }

    @Override // defpackage.icu
    protected final void ec() {
        for (ids idsVar : this.g) {
            idsVar.ea(this);
        }
    }

    @Override // defpackage.icu
    protected final void ed() {
        for (ids idsVar : this.g) {
            idsVar.ee(this);
        }
    }
}
