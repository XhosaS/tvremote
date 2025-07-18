package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggq implements Comparable {
    public final int a;
    public final String b;
    public final String c;
    private final int d;

    public ggq(int i, int i2, String str, String str2) {
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ggq ggqVar = (ggq) obj;
        ggqVar.getClass();
        int i = this.a - ggqVar.a;
        return i == 0 ? this.d - ggqVar.d : i;
    }
}
