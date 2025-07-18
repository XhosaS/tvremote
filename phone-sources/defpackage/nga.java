package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nga implements Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        nga ngaVar = (nga) obj;
        int i = this.b;
        int i2 = ngaVar.b;
        return i != i2 ? i - i2 : this.a - ngaVar.a;
    }

    public final String toString() {
        return "Order{order=" + this.b + ", index=" + this.a + "}";
    }
}
