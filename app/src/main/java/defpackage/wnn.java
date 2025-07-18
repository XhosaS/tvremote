package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wnn extends wnx {
    private final int a;
    private final int b;

    public wnn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.wnx
    public final int a() {
        return this.a;
    }

    @Override // defpackage.wnx
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wnx) {
            wnx wnxVar = (wnx) obj;
            if (this.a == wnxVar.a() && this.b == wnxVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "PackageSyncKeyHash{packageNameHash=" + this.a + ", syncKeyNameHash=" + this.b + "}";
    }
}
