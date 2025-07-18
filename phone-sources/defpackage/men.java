package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class men extends icu implements iej {
    private final mem g;
    private boolean h;

    public men(mem memVar) {
        this.g = memVar;
    }

    @Override // defpackage.iej
    public final void dM() {
        mem memVar = this.g;
        boolean z = this.h;
        boolean zD = memVar.d();
        this.h = zD;
        if (!zD || z) {
            return;
        }
        eb();
    }

    @Override // defpackage.icu
    protected final void ec() {
        mem memVar = this.g;
        memVar.ea(this);
        boolean zD = memVar.d();
        this.h = zD;
        if (zD) {
            eb();
        }
    }

    @Override // defpackage.icu
    protected final void ed() {
        this.g.ee(this);
    }
}
