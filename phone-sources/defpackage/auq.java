package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auq {
    public final aeh a;
    public final aeh b;
    public final aeh c;
    public final aeh d;
    public final aeh e;
    public final aeh f;
    public final aeh g;
    public final aeh h;

    public auq(aeh aehVar, aeh aehVar2, aeh aehVar3, aeh aehVar4, aeh aehVar5, aeh aehVar6, aeh aehVar7, aeh aehVar8) {
        this.a = aehVar;
        this.b = aehVar2;
        this.c = aehVar3;
        this.d = aehVar4;
        this.e = aehVar5;
        this.f = aehVar6;
        this.g = aehVar7;
        this.h = aehVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auq)) {
            return false;
        }
        auq auqVar = (auq) obj;
        return yks.e(this.a, auqVar.a) && yks.e(this.b, auqVar.b) && yks.e(this.c, auqVar.c) && yks.e(this.d, auqVar.d) && yks.e(this.e, auqVar.e) && yks.e(this.f, auqVar.f) && yks.e(this.g, auqVar.g) && yks.e(this.h, auqVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public auq() {
        this(aup.a, aup.b, aup.c, aup.d, aup.f, aup.e, aup.g, aup.h);
        aeh aehVar = aup.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ auq(byte[] bArr) {
        this(aup.a, aup.b, aup.c, aup.d, aup.f, aup.e, aup.g, aup.h);
        aeh aehVar = aup.a;
    }
}
