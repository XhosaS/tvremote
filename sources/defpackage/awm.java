package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awm implements atd {
    private final int a;
    private final int b;

    public awm() {
        throw null;
    }

    @Override // defpackage.atd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.atd
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awm)) {
            return false;
        }
        awm awmVar = (awm) obj;
        int i = this.b;
        int i2 = awmVar.b;
        if (i != 0) {
            return i == i2 && this.a == awmVar.a;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        ii.ac(i);
        return ((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "JankConfigurations{enablement=" + ate.a(this.b) + ", rateLimitPerSecond=" + this.a + ", perfettoMustBeExplicitlyTriggered=false}";
    }

    public awm(byte[] bArr) {
        this.b = 2;
        this.a = 10;
    }

    @Override // defpackage.atd
    public final /* synthetic */ void c() {
    }
}
