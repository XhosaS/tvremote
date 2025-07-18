package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahkj implements agsw, agtr {
    private final agsw a;
    private final agte b;

    public ahkj(agsw agswVar, agte agteVar) {
        this.a = agswVar;
        this.b = agteVar;
    }

    @Override // defpackage.agsw
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override // defpackage.agsw
    public final agte fr() {
        return this.b;
    }

    @Override // defpackage.agtr
    public final agtr ft() {
        agsw agswVar = this.a;
        if (agswVar instanceof agtr) {
            return (agtr) agswVar;
        }
        return null;
    }

    @Override // defpackage.agtr
    public final void fu() {
    }
}
