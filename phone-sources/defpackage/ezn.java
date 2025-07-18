package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezn implements Comparable {
    public long a;
    public long b;
    public int c;

    public ezn(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.a, ((ezn) obj).a);
    }
}
