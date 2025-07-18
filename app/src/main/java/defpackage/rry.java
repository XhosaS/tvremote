package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rry extends rrz {
    public final String a = "OPA_TV";
    public final yqt b;
    public final yqt c;
    public final yqt d;
    public final yqt e;
    public final yqt f;
    private final yqt g;

    public rry(yqt yqtVar, yqt yqtVar2, yqt yqtVar3, yqt yqtVar4, yqt yqtVar5, yqt yqtVar6) {
        this.b = yqtVar;
        this.c = yqtVar2;
        this.d = yqtVar3;
        this.e = yqtVar4;
        this.f = yqtVar5;
        this.g = yqtVar6;
    }

    @Override // defpackage.rrz
    public final yqt a() {
        return this.b;
    }

    @Override // defpackage.rrz
    public final yqt b() {
        return this.e;
    }

    @Override // defpackage.rrz
    public final yqt c() {
        return this.f;
    }

    @Override // defpackage.rrz
    public final yqt d() {
        return this.g;
    }

    @Override // defpackage.rrz
    public final yqt e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rrz) {
            rrz rrzVar = (rrz) obj;
            if (this.a.equals(rrzVar.g()) && this.b.equals(rrzVar.a()) && this.c.equals(rrzVar.f()) && this.d.equals(rrzVar.e()) && this.e.equals(rrzVar.b()) && this.f.equals(rrzVar.c()) && this.g.equals(rrzVar.d())) {
                rrzVar.h();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rrz
    public final yqt f() {
        return this.c;
    }

    @Override // defpackage.rrz
    public final String g() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "TransportConfiguration{logSource=" + this.a + ", accountNameFutureSupplier=" + this.b.toString() + ", zwiebackOverrideFutureSupplier=" + this.c.toString() + ", transportExecutorService=" + this.d.toString() + ", appFlowProtoWrapper=" + this.e.toString() + ", eventCode=" + this.f.toString() + ", logVerifier=Optional.absent(), sendAsSemanticEvent=false}";
    }

    @Override // defpackage.rrz
    public final void h() {
    }
}
