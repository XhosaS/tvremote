package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mis {
    private final lio a;
    public final liq b;

    protected mis(liq liqVar, lio lioVar) {
        this.b = liqVar;
        this.a = lioVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mis misVar = (mis) obj;
        if (this.b.equals(misVar.b)) {
            return false;
        }
        return ((lif) this.a).e(misVar.a);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + ((lif) this.a).a();
    }
}
