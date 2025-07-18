package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zlb extends zkg {
    private final boolean d;

    public zlb(int i, int i2, boolean z, eph ephVar) {
        super(i, i2, ephVar);
        this.d = z;
    }

    @Override // defpackage.zkg, defpackage.zld
    public final zjh j() {
        boolean z = this.d;
        int i = this.a;
        int i2 = this.b;
        eph ephVar = this.c;
        return !z ? zjr.h(i, i2, ((zlc) ephVar.b).a()) : zjr.g(i, i2, ephVar.F());
    }
}
