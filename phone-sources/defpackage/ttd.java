package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttd extends tst {
    private static final long serialVersionUID = 0;
    public final Object a;

    public ttd(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.tst
    public final tst b(tsl tslVar) {
        Object objApply = tslVar.apply(this.a);
        objApply.getClass();
        return new ttd(objApply);
    }

    @Override // defpackage.tst
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.tst
    public final Object d(ttm ttmVar) {
        return this.a;
    }

    @Override // defpackage.tst
    public final Object e(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.tst
    public final boolean equals(Object obj) {
        if (obj instanceof ttd) {
            return this.a.equals(((ttd) obj).a);
        }
        return false;
    }

    @Override // defpackage.tst
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.tst
    public final boolean g() {
        return true;
    }

    @Override // defpackage.tst
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }

    @Override // defpackage.tst
    public final tst a(tst tstVar) {
        return this;
    }
}
