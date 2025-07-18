package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ykq extends ykj implements ykp, ymj {
    private final int a;
    private final int b;

    public ykq(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == i2);
        this.a = i;
        this.b = 0;
    }

    @Override // defpackage.ykp
    public final int ca() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ykq)) {
            if (obj instanceof ymj) {
                return obj.equals(d());
            }
            return false;
        }
        ykq ykqVar = (ykq) obj;
        if (this.f.equals(ykqVar.f) && this.g.equals(ykqVar.g)) {
            int i = ykqVar.b;
            if (this.a == ykqVar.a && yks.e(this.e, ykqVar.e) && yks.e(e(), ykqVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ykj
    protected final void g() {
        int i = ylg.a;
    }

    public final int hashCode() {
        return (((e() == null ? 0 : e().hashCode() * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        ymg ymgVarD = d();
        if (ymgVarD != this) {
            return ymgVarD.toString();
        }
        String str = this.f;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : a.cg(str, "function ", " (Kotlin reflection is not available)");
    }

    public ykq(int i, Class cls, String str, String str2, int i2) {
        this(i, d, cls, str, str2, i2);
    }
}
