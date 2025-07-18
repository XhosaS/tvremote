package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yrh implements yij, yik {
    private final /* synthetic */ int c;
    public static final yrh b = new yrh(1);
    public static final yrh a = new yrh(0);

    private yrh(int i) {
        this.c = i;
    }

    @Override // defpackage.yil
    public final Object fold(Object obj, yjz yjzVar) {
        return this.c != 0 ? wcq.T(this, obj, yjzVar) : wcq.T(this, obj, yjzVar);
    }

    @Override // defpackage.yij, defpackage.yil
    public final yij get(yik yikVar) {
        return this.c != 0 ? wcq.U(this, yikVar) : wcq.U(this, yikVar);
    }

    @Override // defpackage.yij
    public final yik getKey() {
        return this.c != 0 ? b : this;
    }

    @Override // defpackage.yil
    public final yil minusKey(yik yikVar) {
        return this.c != 0 ? wcq.V(this, yikVar) : wcq.V(this, yikVar);
    }

    @Override // defpackage.yil
    public final yil plus(yil yilVar) {
        return this.c != 0 ? wcq.W(this, yilVar) : wcq.W(this, yilVar);
    }
}
