package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class agwd extends agvo implements agxi {
    public agwd() {
        super(agvo.b, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agwd) {
            agwd agwdVar = (agwd) obj;
            return c().equals(agwdVar.c()) && this.d.equals(agwdVar.d) && this.e.equals(agwdVar.e) && agvy.c(this.c, agwdVar.c);
        }
        if (obj instanceof agxi) {
            return obj.equals(b());
        }
        return false;
    }

    public final int hashCode() {
        return (((c().hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        agxc agxcVarB = b();
        if (agxcVarB != this) {
            return agxcVarB.toString();
        }
        return "property " + this.d + " (Kotlin reflection is not available)";
    }

    public agwd(Object obj, Class cls) {
        super(obj, cls, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
    }
}
