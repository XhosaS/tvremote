package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxw extends byg {
    public static final bxw a = new bxw();
    private static final long serialVersionUID = 0;

    private bxw() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.byg
    public final byg a(byb bybVar) {
        return a;
    }

    @Override // defpackage.byg
    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.byg
    public final Object c(byo byoVar) {
        return byoVar.aL();
    }

    @Override // defpackage.byg
    public final Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.byg
    public final Object e() {
        return null;
    }

    @Override // defpackage.byg
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.byg
    public final boolean f() {
        return false;
    }

    @Override // defpackage.byg
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
