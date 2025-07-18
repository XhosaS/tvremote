package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class trk extends tst {
    public static final trk a = new trk();
    private static final long serialVersionUID = 0;

    private trk() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.tst
    public final tst b(tsl tslVar) {
        return a;
    }

    @Override // defpackage.tst
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.tst
    public final Object d(ttm ttmVar) {
        Object obj = ttmVar.get();
        obj.getClass();
        return obj;
    }

    @Override // defpackage.tst
    public final Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.tst
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.tst
    public final Object f() {
        return null;
    }

    @Override // defpackage.tst
    public final boolean g() {
        return false;
    }

    @Override // defpackage.tst
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // defpackage.tst
    public final tst a(tst tstVar) {
        return tstVar;
    }
}
