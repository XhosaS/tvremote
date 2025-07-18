package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aath extends aatk {
    public final String a;
    public final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final String g;
    private final int h;

    public aath(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, String str2, int i2) {
        this.a = str;
        this.c = z;
        this.d = z2;
        this.b = z3;
        this.e = z4;
        this.f = i;
        this.g = str2;
        this.h = i2;
    }

    @Override // defpackage.aatk
    public final int a() {
        return this.f;
    }

    @Override // defpackage.aatk
    public final int b() {
        return this.h;
    }

    @Override // defpackage.aatk
    public final String c() {
        return this.g;
    }

    @Override // defpackage.aatk
    public final String d() {
        return this.a;
    }

    @Override // defpackage.aatk
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aatk) {
            aatk aatkVar = (aatk) obj;
            aatkVar.k();
            String str = this.a;
            if (str != null ? str.equals(aatkVar.d()) : aatkVar.d() == null) {
                if (this.c == aatkVar.h() && this.d == aatkVar.e() && this.b == aatkVar.f()) {
                    aatkVar.i();
                    if (this.e == aatkVar.g() && this.f == aatkVar.a()) {
                        aatkVar.j();
                        aatkVar.m();
                        String str2 = this.g;
                        if (str2 != null ? str2.equals(aatkVar.c()) : aatkVar.c() == null) {
                            aatkVar.l();
                            if (this.h == aatkVar.b()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aatk
    public final boolean f() {
        return this.b;
    }

    @Override // defpackage.aatk
    public final boolean g() {
        return this.e;
    }

    @Override // defpackage.aatk
    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = (((((((((((iHashCode ^ (-721379959)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        int i2 = this.f;
        String str2 = this.g;
        return ((((i ^ i2) * 583896283) ^ (str2 != null ? str2.hashCode() : 0)) * (-721379959)) ^ this.h;
    }

    public final String toString() {
        return "CronetConfig{context=null, storagePath=" + this.a + ", enableQuic=" + this.c + ", enableBrotli=" + this.d + ", enableCertificateCache=" + this.b + ", enableHttpCache=false, enableNetworkQualityEstimator=" + this.e + ", diskCacheSizeBytes=" + this.f + ", inMemoryFallbackCacheSizeBytes=0, libraryLoader=null, experimentalOptions=" + this.g + ", cronetEngineBuilderFactory=null, threadPriority=" + this.h + "}";
    }

    @Override // defpackage.aatk
    public final void i() {
    }

    @Override // defpackage.aatk
    public final void j() {
    }

    @Override // defpackage.aatk
    public final void k() {
    }

    @Override // defpackage.aatk
    public final void l() {
    }

    @Override // defpackage.aatk
    public final void m() {
    }
}
