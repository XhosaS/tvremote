package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayd implements atd {
    public final byg a;
    private final int b;

    public ayd() {
        throw null;
    }

    public static final ayc d() {
        ayc aycVar = new ayc(null);
        aycVar.b = (byte) 1;
        aycVar.a = bxw.a;
        aycVar.c = 1;
        return aycVar;
    }

    @Override // defpackage.atd
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.atd
    public final boolean b() {
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ayd)) {
            return false;
        }
        ayd aydVar = (ayd) obj;
        int i = this.b;
        int i2 = aydVar.b;
        if (i != 0) {
            return i == i2 && this.a.equals(aydVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        ii.ac(i);
        return (((((i ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003;
    }

    public final String toString() {
        return "StorageConfigurations{enablement=" + ate.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + String.valueOf(this.a) + ", generalConfigurationsMetricExtension=null}";
    }

    public ayd(int i, byg bygVar) {
        this.b = i;
        this.a = bygVar;
    }

    @Override // defpackage.atd
    public final void c() {
    }
}
