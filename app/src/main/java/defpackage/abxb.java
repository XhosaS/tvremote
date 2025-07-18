package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxb implements Comparable {
    final abxg a;
    public final int b;
    final acap c;
    public final boolean d;
    final boolean e;

    public abxb(abxg abxgVar, int i, acap acapVar, boolean z, boolean z2) {
        this.a = abxgVar;
        this.b = i;
        this.c = acapVar;
        this.d = z;
        this.e = z2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.b - ((abxb) obj).b;
    }
}
