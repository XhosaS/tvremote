package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pgh extends pkq {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public pgh(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // defpackage.pkq
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.pkq
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.pkq
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pkq) {
            pkq pkqVar = (pkq) obj;
            if (this.a == pkqVar.c() && this.b == pkqVar.b() && this.c == pkqVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "ConstraintOverrides{requiresDeviceIdle=" + this.a + ", requiresCharging=" + this.b + ", requiresBatteryNotLow=" + this.c + "}";
    }
}
