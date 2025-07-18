package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsf implements rpf {
    private final int a;
    private final int b;

    public rsf() {
        throw null;
    }

    public static final sds d() {
        sds sdsVar = new sds();
        sdsVar.b = 10;
        sdsVar.a = 1;
        sdsVar.c = (byte) 3;
        return sdsVar;
    }

    @Override // defpackage.rpf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        return this.b == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rsf)) {
            return false;
        }
        rsf rsfVar = (rsf) obj;
        int i = this.b;
        int i2 = rsfVar.b;
        if (i != 0) {
            return i == i2 && this.a == rsfVar.a;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        a.bl(i);
        return ((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "JankConfigurations{enablement=" + rpg.a(this.b) + ", rateLimitPerSecond=" + this.a + ", perfettoMustBeExplicitlyTriggered=false}";
    }

    public rsf(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ void c() {
    }
}
