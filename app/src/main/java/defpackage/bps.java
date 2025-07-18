package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bps implements Comparable {
    public final int a;
    public final String b;
    public final String c;
    private final int d;

    public bps(int i, int i2, String str, String str2) {
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bps bpsVar = (bps) obj;
        bpsVar.getClass();
        int i = this.a - bpsVar.a;
        return i == 0 ? this.d - bpsVar.d : i;
    }
}
