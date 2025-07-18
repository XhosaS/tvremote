package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypv extends yqt {
    public static final ypv a = new ypv();
    private static final long serialVersionUID = 0;

    private ypv() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.yqt
    public final yqt b(yqi yqiVar) {
        return a;
    }

    @Override // defpackage.yqt
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.yqt
    public final Object d(yrp yrpVar) {
        Object objEV = yrpVar.eV();
        objEV.getClass();
        return objEV;
    }

    @Override // defpackage.yqt
    public final Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.yqt
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.yqt
    public final Object f() {
        return null;
    }

    @Override // defpackage.yqt
    public final boolean g() {
        return false;
    }

    @Override // defpackage.yqt
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // defpackage.yqt
    public final yqt a(yqt yqtVar) {
        return yqtVar;
    }
}
