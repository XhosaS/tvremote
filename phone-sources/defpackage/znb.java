package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class znb extends zix {
    zjm a;
    public ziu b;
    public ziu c;
    public zmd d;
    zlw e;
    znc f;
    znc g;
    zlw h;
    public zmw i;
    public zic j;
    public zic k;
    public zmp l;

    private znb(zjm zjmVar) {
        int i;
        boolean z;
        boolean z2;
        this.a = zjmVar;
        if (zjmVar.h(0) instanceof zjr) {
            this.b = ziu.n((zjr) zjmVar.h(0), true);
            i = 0;
        } else {
            this.b = new ziu(0L);
            i = -1;
        }
        if (this.b.o(0)) {
            z2 = false;
            z = true;
        } else if (this.b.o(1)) {
            z = false;
            z2 = true;
        } else {
            if (!this.b.o(2)) {
                throw new IllegalArgumentException("version number not recognised");
            }
            z = false;
            z2 = false;
        }
        this.c = ziu.m(zjmVar.h(i + 1));
        this.d = zmd.a(zjmVar.h(i + 2));
        this.e = zlw.b(zjmVar.h(i + 3));
        zjm zjmVar2 = (zjm) zjmVar.h(i + 4);
        this.f = znc.c(zjmVar2.h(0));
        this.g = znc.c(zjmVar2.h(1));
        this.h = zlw.b(zjmVar.h(i + 5));
        int i2 = i + 6;
        this.i = zmw.b(zjmVar.h(i2));
        int iB = (zjmVar.b() - i2) - 1;
        if (iB != 0 && z) {
            throw new IllegalArgumentException("version 1 certificate contains extra data");
        }
        while (iB > 0) {
            zjr zjrVar = (zjr) zjmVar.h(i2 + iB);
            int i3 = zjrVar.c;
            if (i3 == 1) {
                this.j = zic.o(zjrVar);
            } else if (i3 == 2) {
                this.k = zic.o(zjrVar);
            } else {
                if (i3 != 3) {
                    throw new IllegalArgumentException(a.cf(i3, "Unknown tag encountered in structure: "));
                }
                if (z2) {
                    throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                }
                this.l = zmp.c(zjm.m(zjrVar, true));
            }
            iB--;
        }
    }

    public static znb a(Object obj) {
        if (obj instanceof znb) {
            return (znb) obj;
        }
        if (obj != null) {
            return new znb(zjm.j(obj));
        }
        return null;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        if (zxp.a("org.bouncycastle.x509.allow_non-der_tbscert") == null || zxp.b("org.bouncycastle.x509.allow_non-der_tbscert")) {
            return this.a;
        }
        zii ziiVar = new zii();
        if (!this.b.o(0)) {
            ziiVar.b(new zks(true, 0, this.b));
        }
        ziiVar.b(this.c);
        ziiVar.b(this.d);
        ziiVar.b(this.e);
        zii ziiVar2 = new zii(2);
        ziiVar2.b(this.f);
        ziiVar2.b(this.g);
        ziiVar.b(new zkq(ziiVar2));
        zlw zlwVar = this.h;
        if (zlwVar != null) {
            ziiVar.b(zlwVar);
        } else {
            ziiVar.b(new zkq());
        }
        ziiVar.b(this.i);
        zic zicVar = this.j;
        if (zicVar != null) {
            ziiVar.b(new zks(false, 1, zicVar));
        }
        zic zicVar2 = this.k;
        if (zicVar2 != null) {
            ziiVar.b(new zks(false, 2, zicVar2));
        }
        zmp zmpVar = this.l;
        if (zmpVar != null) {
            ziiVar.b(new zks(true, 3, zmpVar));
        }
        return new zkq(ziiVar);
    }
}
