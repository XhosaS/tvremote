package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ats {
    public final cwt a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final cwj f;
    public final String g;
    public final cww h;
    public final Integer i;

    public ats(cwt cwtVar, Long l, Long l2, Long l3, Long l4, cwj cwjVar, String str, cww cwwVar, Integer num) {
        this.a = cwtVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = cwjVar;
        this.g = str;
        this.h = cwwVar;
        this.i = num;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
