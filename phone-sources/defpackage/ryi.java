package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ryi extends ryl {
    private volatile long d;

    public ryi(String str, String str2, ryq ryqVar) {
        super(str, str2, ryqVar);
    }

    @Override // defpackage.rxu
    protected final /* synthetic */ Object a(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.rxu
    protected final /* bridge */ /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.rxy
    public final /* bridge */ /* synthetic */ Object f() {
        return Long.valueOf(this.d);
    }

    @Override // defpackage.rxy
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        this.d = ((Long) obj).longValue();
    }
}
