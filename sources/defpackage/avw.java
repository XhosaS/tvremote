package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avw implements atd {
    private final int a;

    public avw() {
        throw null;
    }

    @Override // defpackage.atd
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.atd
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof avw)) {
            return false;
        }
        int i = this.a;
        int i2 = ((avw) obj).a;
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        ii.ac(i);
        return i ^ (-721379959);
    }

    public final String toString() {
        return "CuiConfigurations{metricExtensionProvider=null, enablement=" + ate.a(this.a) + "}";
    }

    public avw(byte[] bArr) {
        this.a = 2;
    }

    @Override // defpackage.atd
    public final /* synthetic */ void c() {
    }
}
