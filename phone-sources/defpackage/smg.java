package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smg {
    public final vvj a;
    private final vtp b;

    public smg() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, vvj] */
    public final vvj a(InputStream inputStream) {
        return this.a.u().h(inputStream, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smg) {
            smg smgVar = (smg) obj;
            if (this.a.equals(smgVar.a) && this.b.equals(smgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        vtp vtpVar = this.b;
        return "ProtoSerializer{defaultValue=" + this.a.toString() + ", extensionRegistryLite=" + vtpVar.toString() + "}";
    }

    public smg(vvj vvjVar, vtp vtpVar) {
        if (vvjVar == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = vvjVar;
        if (vtpVar == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.b = vtpVar;
    }
}
