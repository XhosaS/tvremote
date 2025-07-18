package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rps {
    public final yzf a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final String f;
    public final yzi g;
    public final Integer h;
    public final int i;

    public rps(yzf yzfVar, Long l, Long l2, Long l3, Long l4, int i, String str, yzi yziVar, Integer num) {
        this.a = yzfVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.i = i;
        this.f = str;
        this.g = yziVar;
        this.h = num;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.f);
    }
}
