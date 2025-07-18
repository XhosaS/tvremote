package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cls implements Comparable {
    public final int a;
    public final cog b;

    public cls(int i, cog cogVar) {
        this.a = i;
        this.b = cogVar;
    }

    public final coh a() {
        return this.b.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((cls) obj).a;
    }
}
