package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bge {
    public final cmz a;
    public final cli b;

    public bge() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bge) {
            bge bgeVar = (bge) obj;
            if (this.a.equals(bgeVar.a) && this.b.equals(bgeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cli cliVar = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + cliVar.toString() + "}";
    }

    public bge(cmz cmzVar, cli cliVar) {
        if (cmzVar == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = cmzVar;
        if (cliVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.b = cliVar;
    }
}
