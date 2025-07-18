package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ymb implements Iterable, yli {
    public final int a;
    public final int b;
    public final int c;

    public ymb(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        this.a = i;
        this.b = wef.x(i, i2, i3);
        this.c = i3;
    }

    @Override // java.lang.Iterable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final yhf iterator() {
        return new ymc(this.a, this.b, this.c);
    }

    public boolean d() {
        return this.c > 0 ? this.a > this.b : this.a < this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ymb) {
            if (d() && ((ymb) obj).d()) {
                return true;
            }
            ymb ymbVar = (ymb) obj;
            return this.a == ymbVar.a && this.b == ymbVar.b && this.c == ymbVar.c;
        }
        return false;
    }

    public int hashCode() {
        if (d()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            str = "..";
        } else {
            i = -i;
            sb = new StringBuilder();
            sb.append(i2);
            str = " downTo ";
        }
        sb.append(str);
        sb.append(i3);
        sb.append(" step ");
        sb.append(i);
        return sb.toString();
    }
}
