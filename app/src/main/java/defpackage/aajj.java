package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajj {
    private final Class a;
    private final Class b;

    public aajj(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aajj aajjVar = (aajj) obj;
        if (this.b.equals(aajjVar.b)) {
            return this.a.equals(aajjVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        Class cls = this.a;
        if (cls == aaji.class) {
            return this.b.getName();
        }
        Class cls2 = this.b;
        return "@" + cls.getName() + " " + cls2.getName();
    }
}
