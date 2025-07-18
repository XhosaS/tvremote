package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agww implements Iterable {
    public final int a;
    public final int b;
    public final int c = 1;

    public agww(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final agrh iterator() {
        return new agwx(this.a, this.b);
    }

    public boolean b() {
        return this.a > this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof agww) {
            if (b() && ((agww) obj).b()) {
                return true;
            }
            agww agwwVar = (agww) obj;
            if (this.a != agwwVar.a || this.b != agwwVar.b) {
                return false;
            }
            int i = agwwVar.c;
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
