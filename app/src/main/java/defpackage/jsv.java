package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsv extends juw {
    public final int a;
    public final int b;
    private final int c;

    public jsv(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.juw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.juw
    public final int b() {
        return this.b;
    }

    @Override // defpackage.juw
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof juw) {
            juw juwVar = (juw) obj;
            if (this.a == juwVar.a() && this.c == juwVar.c() && this.b == juwVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "State{numDownloadsInFlight=" + this.a + ", numQueuedDownloads=" + this.c + ", numDownloadsPendingConnectivity=" + this.b + "}";
    }
}
