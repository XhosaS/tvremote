package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tej {
    public final int a;

    public tej() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof tej) && this.a == ((tej) obj).a;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.a + ", allowAssetPackDeletion=false}";
    }

    public tej(int i) {
        this.a = i;
    }
}
