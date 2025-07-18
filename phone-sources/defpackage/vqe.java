package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqe {
    public final vpw a;

    public vqe(vpw vpwVar) {
        this.a = vpwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqe) && yks.e(this.a, ((vqe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlatformString(content=" + this.a + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vqe(vpy vpyVar) {
        this(new vqc(vpyVar, null, 14));
        vpyVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vqe(vpz vpzVar, String str) {
        this(new vqc(vpzVar, str, 12));
        vpzVar.getClass();
    }

    public vqe(String str) {
        this(new vqd(str));
    }
}
