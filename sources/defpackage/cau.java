package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cau extends cav implements Serializable {
    public static final cau a = new cau(bzh.a, bzf.a);
    private static final long serialVersionUID = 0;
    public final bzi b;
    public final bzi c;

    public cau(bzi bziVar, bzi bziVar2) {
        this.b = bziVar;
        this.c = bziVar2;
        if (bziVar == bzf.a || bziVar2 == bzh.a) {
            throw new IllegalArgumentException("Invalid range: (-∞..+∞)");
        }
    }

    public final boolean a() {
        return this.b.equals(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cau) {
            cau cauVar = (cau) obj;
            if (this.b.equals(cauVar.b) && this.c.equals(cauVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.b) * 31) + System.identityHashCode(this.c);
    }

    Object readResolve() {
        cau cauVar = a;
        return equals(cauVar) ? cauVar : this;
    }

    public final String toString() {
        return "(-∞..+∞)";
    }
}
