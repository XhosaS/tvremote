package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class bch extends bci {
    private volatile long d;

    public bch(String str, String str2, bco bcoVar) {
        super(str, str2, bcoVar);
    }

    @Override // defpackage.bbw
    protected final /* synthetic */ Object b(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.bbw
    protected final /* bridge */ /* synthetic */ Object c(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.bca
    public final /* bridge */ /* synthetic */ Object d() {
        return Long.valueOf(this.d);
    }

    @Override // defpackage.bca
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Long) obj).longValue();
    }
}
