package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmd extends zix {
    public zjb a;
    public zih b;

    public zmd(zjb zjbVar) {
        this.a = zjbVar;
    }

    public static zmd a(Object obj) {
        if (obj instanceof zmd) {
            return (zmd) obj;
        }
        if (obj != null) {
            return new zmd(zjm.j(obj));
        }
        return null;
    }

    public static zmd b(zjr zjrVar) {
        return a(zjm.m(zjrVar, true));
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(2);
        ziiVar.b(this.a);
        zih zihVar = this.b;
        if (zihVar != null) {
            ziiVar.b(zihVar);
        }
        return new zkq(ziiVar);
    }

    public zmd(zjb zjbVar, zih zihVar) {
        this.a = zjbVar;
        this.b = zihVar;
    }

    private zmd(zjm zjmVar) {
        if (zjmVar.b() > 0 && zjmVar.b() <= 2) {
            this.a = zjb.h(zjmVar.h(0));
            this.b = zjmVar.b() == 2 ? zjmVar.h(1) : null;
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + zjmVar.b());
        }
    }
}
