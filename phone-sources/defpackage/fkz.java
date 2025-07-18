package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkz implements Comparable {
    public final int a;
    public final fkw b;

    public fkz(int i, fkw fkwVar) {
        this.a = i;
        this.b = fkwVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.a, ((fkz) obj).a);
    }
}
