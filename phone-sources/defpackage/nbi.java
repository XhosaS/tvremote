package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbi implements nbk {
    private final boolean a;
    private final String b;
    private final String c;
    private final tst d;
    private final lhf e;
    private final nbj f;

    public nbi() {
        throw null;
    }

    @Override // defpackage.nbk
    public final String a() {
        return this.c;
    }

    @Override // defpackage.nbk
    public final String b() {
        return this.b;
    }

    @Override // defpackage.nbk
    public final lhf c() {
        return this.e;
    }

    @Override // defpackage.nbk
    public final nbj d() {
        return this.f;
    }

    @Override // defpackage.nbk
    public final tst e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nbi) {
            nbi nbiVar = (nbi) obj;
            if (this.a == nbiVar.a && this.b.equals(nbiVar.b) && this.c.equals(nbiVar.c) && this.d.equals(nbiVar.d) && this.e.equals(nbiVar.e) && this.f.equals(nbiVar.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nbk
    public final boolean f() {
        return this.a;
    }

    public final int hashCode() {
        return (((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        nbj nbjVar = this.f;
        lhf lhfVar = this.e;
        return "ActorInfoCardViewModel{justMissed=" + this.a + ", name=" + this.b + ", roles=" + this.c + ", imageUri=" + String.valueOf(this.d) + ", clickEvent=" + String.valueOf(lhfVar) + ", infoCardImageLoader=" + String.valueOf(nbjVar) + "}";
    }

    public nbi(boolean z, String str, String str2, tst tstVar, lhf lhfVar, nbj nbjVar) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = tstVar;
        this.e = lhfVar;
        this.f = nbjVar;
    }
}
