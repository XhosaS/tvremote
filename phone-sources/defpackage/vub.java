package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vub implements Comparable {
    public final int a;
    public final vwo b;

    public vub(int i, vwo vwoVar) {
        this.a = i;
        this.b = vwoVar;
    }

    public final vwp a() {
        return this.b.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((vub) obj).a;
    }
}
