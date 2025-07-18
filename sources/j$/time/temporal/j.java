package j$.time.temporal;

import j$.time.C0003b;

/* loaded from: classes2.dex */
public enum j implements p {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient t b;
    public final transient long c;

    static {
        b bVar = b.NANOS;
    }

    j(String str, long j) {
        this.a = str;
        this.b = t.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.p
    public final boolean i(m mVar) {
        return mVar.e(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.p
    public final t j(m mVar) {
        if (mVar.e(a.EPOCH_DAY)) {
            return this.b;
        }
        throw new C0003b("Unsupported field: ".concat(String.valueOf(this)));
    }

    @Override // j$.time.temporal.p
    public final t k() {
        return this.b;
    }

    @Override // j$.time.temporal.p
    public final long l(m mVar) {
        return mVar.x(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.p
    public final l o(l lVar, long j) {
        if (this.b.e(j)) {
            return lVar.c(j$.nio.file.attribute.a.G(j, this.c), a.EPOCH_DAY);
        }
        throw new C0003b("Invalid value: " + this.a + " " + j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
