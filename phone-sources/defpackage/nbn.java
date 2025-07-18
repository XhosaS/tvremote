package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbn implements nbk {
    private final String a;
    private final String b;
    private final tst c;
    private final lhf d;
    private final nbj e;

    public nbn() {
        throw null;
    }

    @Override // defpackage.nbk
    public final String a() {
        return this.b;
    }

    @Override // defpackage.nbk
    public final String b() {
        return this.a;
    }

    @Override // defpackage.nbk
    public final lhf c() {
        return this.d;
    }

    @Override // defpackage.nbk
    public final nbj d() {
        return this.e;
    }

    @Override // defpackage.nbk
    public final tst e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nbn) {
            nbn nbnVar = (nbn) obj;
            if (this.a.equals(nbnVar.a) && this.b.equals(nbnVar.b) && this.c.equals(nbnVar.c) && this.d.equals(nbnVar.d) && this.e.equals(nbnVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nbk
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        nbj nbjVar = this.e;
        lhf lhfVar = this.d;
        return "SongInfoCardViewModel{title=" + this.a + ", performer=" + this.b + ", imageUri=" + String.valueOf(this.c) + ", clickEvent=" + String.valueOf(lhfVar) + ", infoCardImageLoader=" + String.valueOf(nbjVar) + "}";
    }

    public nbn(String str, String str2, tst tstVar, lhf lhfVar, nbj nbjVar) {
        this.a = str;
        this.b = str2;
        this.c = tstVar;
        this.d = lhfVar;
        this.e = nbjVar;
    }
}
