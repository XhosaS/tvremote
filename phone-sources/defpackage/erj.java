package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class erj implements Comparable {
    public final String c;
    public final eri d;
    public final long e;
    public final int f;
    public final long g;
    public final dza h;
    public final String i;
    public final String j;
    public final long k;
    public final long l;
    public final boolean m;

    public erj(String str, eri eriVar, long j, int i, long j2, dza dzaVar, String str2, String str3, long j3, long j4, boolean z) {
        this.c = str;
        this.d = eriVar;
        this.e = j;
        this.f = i;
        this.g = j2;
        this.h = dzaVar;
        this.i = str2;
        this.j = str3;
        this.k = j3;
        this.l = j4;
        this.m = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        long j = this.g;
        if (j > jLongValue) {
            return 1;
        }
        return j >= l.longValue() ? 0 : -1;
    }
}
