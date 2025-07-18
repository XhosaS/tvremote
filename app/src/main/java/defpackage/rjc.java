package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rjc extends rjl {
    private volatile boolean a;

    public rjc(String str, String str2, rkq rkqVar) {
        super(str, str2, rkqVar);
    }

    @Override // defpackage.rhz
    protected final /* synthetic */ Object b(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.rhz
    protected final /* synthetic */ Object c(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.riy
    public final /* synthetic */ Object e() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.riy
    public final /* synthetic */ void eS(Object obj) {
        this.a = ((Boolean) obj).booleanValue();
    }
}
