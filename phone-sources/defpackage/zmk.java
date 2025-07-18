package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmk extends zix {
    public zna a;
    public zmd b;
    public zic c;
    boolean d = false;
    int e;

    private zmk(zjm zjmVar) {
        if (zjmVar.b() != 3) {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
        zih zihVarH = zjmVar.h(0);
        this.a = zihVarH instanceof zna ? (zna) zihVarH : zihVarH != null ? new zna(zjm.j(zihVarH)) : null;
        this.b = zmd.a(zjmVar.h(1));
        this.c = zic.i(zjmVar.h(2));
    }

    public static zmk c(Object obj) {
        if (obj instanceof zmk) {
            return (zmk) obj;
        }
        if (obj != null) {
            return new zmk(zjm.j(obj));
        }
        return null;
    }

    public final Enumeration a() {
        zjm zjmVar = this.a.f;
        return zjmVar == null ? new zmy() : new zmz(zjmVar.f());
    }

    public final zlw b() {
        return this.a.c;
    }

    @Override // defpackage.zix
    public final int hashCode() {
        if (!this.d) {
            this.e = super.hashCode();
            this.d = true;
        }
        return this.e;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(3);
        ziiVar.b(this.a);
        ziiVar.b(this.b);
        ziiVar.b(this.c);
        return new zkq(ziiVar);
    }
}
