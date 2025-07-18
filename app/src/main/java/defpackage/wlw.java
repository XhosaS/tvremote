package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlw extends wlz {
    public String a;
    public Integer b;
    private aasp c;

    @Override // defpackage.wlz
    public final wma a() {
        aasp aaspVar = this.c;
        if (aaspVar != null) {
            return new wlx(this.a, this.b, aaspVar);
        }
        throw new IllegalStateException("Missing required properties: rpcServiceConfig");
    }

    @Override // defpackage.wlz
    public final void b(aasp aaspVar) {
        if (aaspVar == null) {
            throw new NullPointerException("Null rpcServiceConfig");
        }
        this.c = aaspVar;
    }
}
