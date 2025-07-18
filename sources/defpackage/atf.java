package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atf implements atd {
    private final int a;
    private final atg b;

    public atf() {
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
        if (!(obj instanceof atf)) {
            return false;
        }
        atf atfVar = (atf) obj;
        int i = this.a;
        int i2 = atfVar.a;
        if (i != 0) {
            return i == i2 && this.b.equals(atfVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        ii.ac(i);
        return ((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "BatteryConfigurations{enablement=" + ate.a(this.a) + ", chargeCounterEnabled=false, metricExtensionProvider=" + String.valueOf(this.b) + "}";
    }

    public atf(atg atgVar) {
        this.a = 2;
        this.b = atgVar;
    }

    @Override // defpackage.atd
    public final /* synthetic */ void c() {
    }
}
