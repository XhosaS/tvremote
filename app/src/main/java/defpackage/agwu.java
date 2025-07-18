package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agwu {
    public static final agwt a = new agwt();
    public static final agwu b;

    static {
        Integer num = agub.a;
        b = (num == null || num.intValue() >= 34) ? new agwv() : new agwr();
    }

    public long a() {
        throw null;
    }

    public int c() {
        throw null;
    }

    public long d() {
        return fk();
    }

    public long fk() {
        long jA;
        long j;
        do {
            jA = a() >>> 1;
            j = jA % Long.MAX_VALUE;
        } while ((jA - j) + 9223372036854775806L < 0);
        return j;
    }
}
