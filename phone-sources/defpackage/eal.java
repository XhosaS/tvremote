package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eal {
    private final dzb a;

    public eal(dzb dzbVar) {
        this.a = dzbVar;
    }

    public final boolean a(int... iArr) {
        return this.a.d(iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eal) {
            return this.a.equals(((eal) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
