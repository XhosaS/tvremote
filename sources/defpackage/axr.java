package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axr implements atd {
    public final byg a;
    private final int b;
    private final int c;

    public axr() {
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
        if (!(obj instanceof axr)) {
            return false;
        }
        axr axrVar = (axr) obj;
        int i = this.c;
        int i2 = axrVar.c;
        if (i != 0) {
            return i == i2 && this.b == axrVar.b && this.a.equals(axrVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        ii.ac(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.b) * (-721379959)) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "NetworkConfigurations{enablement=" + ate.a(this.c) + ", batchSize=" + this.b + ", urlSanitizer=null, enableUrlAutoSanitization=false, metricExtensionProvider=" + String.valueOf(this.a) + "}";
    }

    public axr(byg bygVar) {
        this.c = 2;
        this.b = 50;
        this.a = bygVar;
    }

    @Override // defpackage.atd
    public final /* synthetic */ void c() {
    }
}
