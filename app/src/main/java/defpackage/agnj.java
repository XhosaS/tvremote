package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agnj implements Comparable {
    final Runnable a;
    final long b;
    final int c;
    volatile boolean d;

    public agnj(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        agnj agnjVar = (agnj) obj;
        long j = agnjVar.b;
        long j2 = this.b;
        int i = j2 < j ? -1 : j2 > j ? 1 : 0;
        if (i != 0) {
            return i;
        }
        int i2 = this.c;
        int i3 = agnjVar.c;
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }
}
