package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcu implements yij {
    private final dcu a;
    private final dbz b;

    public dcu(dcu dcuVar, dbz dbzVar) {
        this.a = dcuVar;
        this.b = dbzVar;
    }

    public final void a(dbd dbdVar) {
        if (this.b == dbdVar) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        dcu dcuVar = this.a;
        if (dcuVar != null) {
            dcuVar.a(dbdVar);
        }
    }

    @Override // defpackage.yil
    public final <R> R fold(R r, yjz<? super R, ? super yij, ? extends R> yjzVar) {
        return (R) wcq.T(this, r, yjzVar);
    }

    @Override // defpackage.yij, defpackage.yil
    public final <E extends yij> E get(yik<E> yikVar) {
        return (E) wcq.U(this, yikVar);
    }

    @Override // defpackage.yij
    public final yik<?> getKey() {
        return bbx.d;
    }

    @Override // defpackage.yil
    public final yil minusKey(yik<?> yikVar) {
        return wcq.V(this, yikVar);
    }

    @Override // defpackage.yil
    public final yil plus(yil yilVar) {
        return wcq.W(this, yilVar);
    }
}
