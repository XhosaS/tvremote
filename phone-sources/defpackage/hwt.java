package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwt implements cuj {
    private final hws a;
    private final hwv b;
    private final cuj c;

    public hwt(cuj cujVar, hws hwsVar, hwv hwvVar) {
        this.c = cujVar;
        this.a = hwsVar;
        this.b = hwvVar;
    }

    @Override // defpackage.cuj
    public final Object a() {
        Object objA = this.c.a();
        if (objA == null) {
            objA = this.a.a();
        }
        if (objA instanceof hwu) {
            ((hwu) objA).f().a = false;
        }
        return objA;
    }

    @Override // defpackage.cuj
    public final boolean b(Object obj) {
        if (obj instanceof hwu) {
            ((hwu) obj).f().a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
