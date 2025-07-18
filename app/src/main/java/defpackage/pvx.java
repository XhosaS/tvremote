package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvx {
    private final yrp a;

    public pvx(final phg phgVar) {
        this.a = yru.a(new yrp() { // from class: pvw
            @Override // defpackage.yrp
            public final Object eV() {
                phj phjVarY = phgVar.y();
                return phjVarY == phj.UNDEFINED ? phj.SHARED_PREFERENCES_ONLY : phjVarY;
            }
        });
    }

    public final phj a() {
        return (phj) this.a.eV();
    }
}
