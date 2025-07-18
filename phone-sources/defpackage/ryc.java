package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ryc extends ryl {
    private volatile boolean d;

    public ryc(String str, String str2, ryq ryqVar) {
        super(str, str2, ryqVar);
    }

    @Override // defpackage.rxu
    protected final /* synthetic */ Object a(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.rxu
    protected final /* bridge */ /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.rxy
    public final /* bridge */ /* synthetic */ Object f() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.rxy
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        this.d = ((Boolean) obj).booleanValue();
    }
}
