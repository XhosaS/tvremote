package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgf extends pko {
    private final long a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;

    public pgf(long j, int i, boolean z, boolean z2, boolean z3) {
        this.a = j;
        this.e = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // defpackage.pko
    public final long a() {
        return this.a;
    }

    @Override // defpackage.pko
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.pko
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.pko
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.pko
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pko) {
            pko pkoVar = (pko) obj;
            if (this.a == pkoVar.a() && this.e == pkoVar.e() && this.b == pkoVar.b() && this.c == pkoVar.c() && this.d == pkoVar.d()) {
                pkoVar.f();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.d ? 1237 : 1231;
        int i2 = true != this.c ? 1237 : 1231;
        int i3 = true == this.b ? 1231 : 1237;
        long j = this.a;
        return ((i ^ ((((i3 ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.e) * 1000003)) * 1000003) ^ i2) * 1000003)) * 1000003) ^ 2;
    }

    public final String toString() {
        return "TaskInfo{periodHours=" + this.a + ", networkState=" + pkr.a(this.e) + ", requiresBatteryNotLow=" + this.b + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", taskScheduler=TASK_SCHEDULER_WORK_MANAGER}";
    }

    @Override // defpackage.pko
    public final void f() {
    }
}
