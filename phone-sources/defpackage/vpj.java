package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpj {
    public final vps a;
    private final vqe b = null;
    private final int c = 0;

    public vpj(vps vpsVar) {
        this.a = vpsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpj)) {
            return false;
        }
        vpj vpjVar = (vpj) obj;
        if (!yks.e(this.a, vpjVar.a)) {
            return false;
        }
        vqe vqeVar = vpjVar.b;
        if (!yks.e(null, null)) {
            return false;
        }
        int i = vpjVar.c;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }

    public final String toString() {
        return "BadgeData(image=" + this.a + ", accessibilityLabel=null, badgeType=null)";
    }
}
