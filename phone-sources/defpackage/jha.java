package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jha {
    public final wfo a;

    public jha(wfo wfoVar) {
        wfoVar.getClass();
        this.a = wfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jha) && yks.e(this.a, ((jha) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AiButtonLayoutOptions(dynamicScheme=" + this.a + ")";
    }
}
