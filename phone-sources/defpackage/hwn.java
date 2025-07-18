package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwn {
    private Class a;
    private Class b;
    private Class c;

    public hwn() {
    }

    public final void a(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hwn hwnVar = (hwn) obj;
        if (!this.a.equals(hwnVar.a) || !this.b.equals(hwnVar.b)) {
            return false;
        }
        Class cls = this.c;
        Class cls2 = hwnVar.c;
        char[] cArr = hwp.a;
        return a.au(cls, cls2);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Class cls = this.c;
        return (iHashCode * 31) + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + String.valueOf(this.a) + ", second=" + String.valueOf(this.b) + "}";
    }

    public hwn(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
