package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agvv extends agvo implements agvu, agxf {
    private final int a;
    private final int f;

    public agvv(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == i2);
        this.a = i;
        this.f = 0;
    }

    @Override // defpackage.agvo
    protected final void e() {
        agwj agwjVar = agwi.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agvv)) {
            if (obj instanceof agxf) {
                return obj.equals(b());
            }
            return false;
        }
        agvv agvvVar = (agvv) obj;
        if (this.d.equals(agvvVar.d) && this.e.equals(agvvVar.e)) {
            int i = agvvVar.f;
            if (this.a == agvvVar.a && agvy.c(this.c, agvvVar.c) && agvy.c(c(), agvvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((c() == null ? 0 : c().hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @Override // defpackage.agvu
    public final int i() {
        return this.a;
    }

    public final String toString() {
        agxc agxcVarB = b();
        if (agxcVarB != this) {
            return agxcVarB.toString();
        }
        String str = this.d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : a.e(str, "function ", " (Kotlin reflection is not available)");
    }
}
