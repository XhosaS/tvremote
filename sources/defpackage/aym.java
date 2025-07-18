package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aym implements cpi {
    private final cpm a;
    private final cpm b;
    private final cpm c;

    public aym(cpm cpmVar, cpm cpmVar2, cpm cpmVar3) {
        this.a = cpmVar;
        this.b = cpmVar2;
        this.c = cpmVar3;
    }

    @Override // defpackage.crv, defpackage.cru
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final byg a() {
        byg bygVar = (byg) ((cpj) this.a).a;
        byg bygVar2 = (byg) ((cpj) this.b).a;
        if (!bygVar.f() && !bygVar2.f()) {
            return bxw.a;
        }
        cpm cpmVar = this.c;
        cpmVar.getClass();
        return byg.h(new axy(cpmVar, 2));
    }
}
