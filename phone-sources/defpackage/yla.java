package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yla extends ykj implements ymp {
    public yla() {
        super(ykj.d, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yla) {
            yla ylaVar = (yla) obj;
            return e().equals(ylaVar.e()) && this.f.equals(ylaVar.f) && this.g.equals(ylaVar.g) && yks.e(this.e, ylaVar.e);
        }
        if (obj instanceof ymp) {
            return obj.equals(d());
        }
        return false;
    }

    protected final ymp h() {
        ymg ymgVarD = d();
        if (ymgVarD != this) {
            return (ymp) ymgVarD;
        }
        throw new yjj();
    }

    public final int hashCode() {
        return (((e().hashCode() * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        ymg ymgVarD = d();
        if (ymgVarD != this) {
            return ymgVarD.toString();
        }
        return "property " + this.f + " (Kotlin reflection is not available)";
    }

    public yla(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, 1 == i);
    }
}
