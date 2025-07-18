package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmw extends zix {
    public zmd a;
    public zic b;

    public zmw(zjm zjmVar) {
        if (zjmVar.b() == 2) {
            Enumeration enumerationF = zjmVar.f();
            this.a = zmd.a(enumerationF.nextElement());
            this.b = zic.i(enumerationF.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + zjmVar.b());
        }
    }

    public static zmw b(Object obj) {
        if (obj instanceof zmw) {
            return (zmw) obj;
        }
        if (obj != null) {
            return new zmw(zjm.j(obj));
        }
        return null;
    }

    public final zjh a() {
        return zjh.v(this.b.n());
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(2);
        ziiVar.b(this.a);
        ziiVar.b(this.b);
        return new zkq(ziiVar);
    }

    public zmw(zmd zmdVar, zih zihVar) {
        this.b = new zkj(zihVar);
        this.a = zmdVar;
    }

    public zmw(zmd zmdVar, byte[] bArr) {
        this.b = new zkj(bArr);
        this.a = zmdVar;
    }
}
