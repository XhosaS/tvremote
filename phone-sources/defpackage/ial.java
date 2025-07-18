package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ial {
    public static final iai a;
    private static final long b;
    private static final long c;

    static {
        long j = ynm.a;
        long jO = ylh.o(24, yno.f);
        b = jO;
        c = 100L;
        long j2 = iai.a;
        long j3 = iai.a;
        if (!a.s(j3, j3)) {
            throw new IllegalStateException("Cannot set expireAfterWrite with expireAfterAccess already set");
        }
        a = new iai(jO, j3, 100L);
    }
}
