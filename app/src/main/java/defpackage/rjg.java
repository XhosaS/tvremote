package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rjg extends rjl {
    private volatile double a;

    public rjg(String str, rkq rkqVar) {
        super(str, "45687057", rkqVar);
    }

    @Override // defpackage.rhz
    protected final /* synthetic */ Object b(Object obj) {
        return (Double) obj;
    }

    @Override // defpackage.rhz
    protected final /* synthetic */ Object c(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // defpackage.riy
    public final /* synthetic */ Object e() {
        return Double.valueOf(this.a);
    }

    @Override // defpackage.riy
    public final /* synthetic */ void eS(Object obj) {
        this.a = ((Double) obj).doubleValue();
    }
}
