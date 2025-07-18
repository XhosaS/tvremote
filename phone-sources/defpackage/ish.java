package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ish extends icu implements iej {
    final /* synthetic */ isi g;
    private Object h;
    private final yjv i;

    public ish(isi isiVar, Object obj, yjv yjvVar) {
        this.g = isiVar;
        this.h = obj;
        this.i = yjvVar;
    }

    @Override // defpackage.iej
    public final synchronized void dM() {
        Object objA = this.i.a(this.g.i);
        if (yks.e(this.h, objA)) {
            return;
        }
        this.h = objA;
        eb();
    }

    @Override // defpackage.icu
    protected final void ec() {
        this.g.j.ea(this);
    }

    @Override // defpackage.icu
    protected final void ed() {
        this.g.j.ee(this);
    }
}
