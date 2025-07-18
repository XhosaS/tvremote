package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class bcd extends bci {
    private volatile boolean d;

    public bcd(String str, String str2, bco bcoVar) {
        super(str, str2, bcoVar);
    }

    @Override // defpackage.bbw
    protected final /* synthetic */ Object b(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.bbw
    protected final /* bridge */ /* synthetic */ Object c(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.bca
    public final /* bridge */ /* synthetic */ Object d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.bca
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Boolean) obj).booleanValue();
    }
}
