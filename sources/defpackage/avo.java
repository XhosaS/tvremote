package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avo implements atd {
    public final String a;
    private final int b;

    public avo() {
        throw null;
    }

    @Override // defpackage.atd
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.atd
    public final boolean b() {
        return this.b == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof avo)) {
            return false;
        }
        avo avoVar = (avo) obj;
        int i = this.b;
        int i2 = avoVar.b;
        if (i != 0) {
            return i2 == 1 && this.a.equals(avoVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        ii.ac(this.b);
        return (this.a.hashCode() ^ (-722379962)) * 1000003;
    }

    public final String toString() {
        return "ApplicationExitConfigurations{enablement=" + ate.a(this.b) + ", reportingProcessShortName=" + this.a + ", metricExtensionProvider=null}";
    }

    public avo(byte[] bArr) {
        this.b = 1;
        this.a = "";
    }

    @Override // defpackage.atd
    public final /* synthetic */ void c() {
    }
}
