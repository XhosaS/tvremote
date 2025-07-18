package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsb implements djg {
    public final drz a;
    public final drz c;
    public final drz d;
    public final drz e;
    public final drz f;
    public final drz g;

    public dsb() {
        this(null, null, null, null, 63);
    }

    @Override // defpackage.djh
    public final /* synthetic */ djh a(djh djhVar) {
        return crp.i(this, djhVar);
    }

    @Override // defpackage.djh
    public final /* synthetic */ Object b(Object obj, yjz yjzVar) {
        return crp.f(this, obj, yjzVar);
    }

    @Override // defpackage.djh
    public final /* synthetic */ boolean c(yjv yjvVar) {
        return crp.g(this, yjvVar);
    }

    @Override // defpackage.djh
    public final /* synthetic */ boolean d(yjv yjvVar) {
        return crp.h(this, yjvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsb)) {
            return false;
        }
        dsb dsbVar = (dsb) obj;
        return yks.e(this.a, dsbVar.a) && yks.e(this.c, dsbVar.c) && yks.e(this.d, dsbVar.d) && yks.e(this.e, dsbVar.e) && yks.e(this.f, dsbVar.f) && yks.e(this.g, dsbVar.g);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.a + ", start=" + this.c + ", top=" + this.d + ", right=" + this.e + ", end=" + this.f + ", bottom=" + this.g + ')';
    }

    public dsb(drz drzVar, drz drzVar2, drz drzVar3, drz drzVar4, drz drzVar5, drz drzVar6) {
        this.a = drzVar;
        this.c = drzVar2;
        this.d = drzVar3;
        this.e = drzVar4;
        this.f = drzVar5;
        this.g = drzVar6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dsb(drz drzVar, drz drzVar2, drz drzVar3, drz drzVar4, int i) {
        int i2 = 3;
        float f = 0.0f;
        this((i & 1) != 0 ? new drz(f, i2) : null, (i & 2) != 0 ? new drz(f, i2) : drzVar, (i & 4) != 0 ? new drz(f, i2) : drzVar2, (i & 8) != 0 ? new drz(f, i2) : null, (i & 16) != 0 ? new drz(f, i2) : drzVar3, (i & 32) != 0 ? new drz(f, i2) : drzVar4);
    }
}
