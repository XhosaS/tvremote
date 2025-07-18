package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jvh implements Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        jvh jvhVar = (jvh) obj;
        int i = this.b;
        int i2 = jvhVar.b;
        return i != i2 ? i - i2 : this.a - jvhVar.a;
    }

    public final String toString() {
        return "Order{order=" + this.b + ", index=" + this.a + "}";
    }
}
