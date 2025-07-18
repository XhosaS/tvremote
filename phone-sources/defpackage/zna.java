package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zna extends zix {
    public ziu a;
    public zmd b;
    zlw c;
    public znc d;
    public znc e;
    zjm f;
    public zmp g;

    public zna(zjm zjmVar) {
        if (zjmVar.b() < 3 || zjmVar.b() > 7) {
            throw new IllegalArgumentException("Bad sequence size: " + zjmVar.b());
        }
        int i = 0;
        if (zjmVar.h(0) instanceof ziu) {
            this.a = ziu.m(zjmVar.h(0));
            i = 1;
        } else {
            this.a = null;
        }
        this.b = zmd.a(zjmVar.h(i));
        this.c = zlw.b(zjmVar.h(i + 1));
        int i2 = i + 3;
        this.d = znc.c(zjmVar.h(i + 2));
        if (i2 < zjmVar.b() && ((zjmVar.h(i2) instanceof zjt) || (zjmVar.h(i2) instanceof zio) || (zjmVar.h(i2) instanceof znc))) {
            this.e = znc.c(zjmVar.h(i2));
            i2 = i + 4;
        }
        if (i2 < zjmVar.b() && !(zjmVar.h(i2) instanceof zjr)) {
            this.f = zjm.j(zjmVar.h(i2));
            i2++;
        }
        if (i2 >= zjmVar.b() || !(zjmVar.h(i2) instanceof zjr)) {
            return;
        }
        this.g = zmp.c(zjm.m((zjr) zjmVar.h(i2), true));
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(7);
        ziu ziuVar = this.a;
        if (ziuVar != null) {
            ziiVar.b(ziuVar);
        }
        ziiVar.b(this.b);
        ziiVar.b(this.c);
        ziiVar.b(this.d);
        znc zncVar = this.e;
        if (zncVar != null) {
            ziiVar.b(zncVar);
        }
        zjm zjmVar = this.f;
        if (zjmVar != null) {
            ziiVar.b(zjmVar);
        }
        zmp zmpVar = this.g;
        if (zmpVar != null) {
            ziiVar.b(new zks(zmpVar));
        }
        return new zkq(ziiVar);
    }
}
