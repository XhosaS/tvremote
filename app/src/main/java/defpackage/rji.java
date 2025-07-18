package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rji extends rjl {
    private volatile long a;

    public rji(String str, String str2, rkq rkqVar) {
        super(str, str2, rkqVar);
    }

    @Override // defpackage.rhz
    protected final /* synthetic */ Object b(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.rhz
    protected final /* synthetic */ Object c(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.riy
    public final /* synthetic */ Object e() {
        return Long.valueOf(this.a);
    }

    @Override // defpackage.riy
    public final /* synthetic */ void eS(Object obj) {
        this.a = ((Long) obj).longValue();
    }
}
