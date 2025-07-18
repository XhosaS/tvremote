package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byi extends byg {
    private static final long serialVersionUID = 0;
    public final Object a;

    public byi(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.byg
    public final byg a(byb bybVar) {
        Object objA = bybVar.a(this.a);
        objA.getClass();
        return new byi(objA);
    }

    @Override // defpackage.byg
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.byg
    public final Object c(byo byoVar) {
        return this.a;
    }

    @Override // defpackage.byg
    public final Object d(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.byg
    public final Object e() {
        return this.a;
    }

    @Override // defpackage.byg
    public final boolean equals(Object obj) {
        if (obj instanceof byi) {
            return this.a.equals(((byi) obj).a);
        }
        return false;
    }

    @Override // defpackage.byg
    public final boolean f() {
        return true;
    }

    @Override // defpackage.byg
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }
}
