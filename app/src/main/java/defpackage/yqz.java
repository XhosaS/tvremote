package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqz extends yqt {
    private static final long serialVersionUID = 0;
    public final Object a;

    public yqz(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.yqt
    public final yqt b(yqi yqiVar) {
        Object objApply = yqiVar.apply(this.a);
        objApply.getClass();
        return new yqz(objApply);
    }

    @Override // defpackage.yqt
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.yqt
    public final Object d(yrp yrpVar) {
        yrpVar.getClass();
        return this.a;
    }

    @Override // defpackage.yqt
    public final Object e(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.yqt
    public final boolean equals(Object obj) {
        if (obj instanceof yqz) {
            return this.a.equals(((yqz) obj).a);
        }
        return false;
    }

    @Override // defpackage.yqt
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.yqt
    public final boolean g() {
        return true;
    }

    @Override // defpackage.yqt
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }

    @Override // defpackage.yqt
    public final yqt a(yqt yqtVar) {
        return this;
    }
}
