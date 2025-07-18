package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ryg extends ryl {
    private volatile double d;

    public ryg(String str, String str2, ryq ryqVar) {
        super(str, str2, ryqVar);
    }

    @Override // defpackage.rxu
    protected final /* synthetic */ Object a(Object obj) {
        return (Double) obj;
    }

    @Override // defpackage.rxu
    protected final /* bridge */ /* synthetic */ Object b(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // defpackage.rxy
    public final /* bridge */ /* synthetic */ Object f() {
        return Double.valueOf(this.d);
    }

    @Override // defpackage.rxy
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        this.d = ((Double) obj).doubleValue();
    }
}
