package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vor extends vot {
    public final int a;
    private final boolean b;
    private final vfi c;

    public vor(int i, boolean z, vfi vfiVar) {
        this.a = i;
        this.b = z;
        this.c = vfiVar;
    }

    @Override // defpackage.vot
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.vqn
    public final vfi b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vor)) {
            return false;
        }
        vor vorVar = (vor) obj;
        return this.a == vorVar.a && this.b == vorVar.b && yks.e(this.c, vorVar.c);
    }

    public final int hashCode() {
        vfi vfiVar = this.c;
        return (((this.a * 31) + a.q(this.b)) * 31) + (vfiVar == null ? 0 : vfiVar.hashCode());
    }

    public final String toString() {
        return "ResourceImage(resourceIdentifier=" + this.a + ", shouldTint=" + this.b + ", contentDescription=" + this.c + ")";
    }
}
