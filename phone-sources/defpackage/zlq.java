package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zlq extends zix {
    public zmd a;
    public zjo b;
    public zic c;
    private ziu d;
    private zjd e;

    private zlq(zjm zjmVar) {
        Enumeration enumerationF = zjmVar.f();
        ziu ziuVarM = ziu.m(enumerationF.nextElement());
        this.d = ziuVarM;
        int iF = ziuVarM.f();
        if (iF < 0 || iF > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        this.a = zmd.a(enumerationF.nextElement());
        this.e = zjd.f(enumerationF.nextElement());
        int i = -1;
        while (enumerationF.hasMoreElements()) {
            zjr zjrVar = (zjr) enumerationF.nextElement();
            int i2 = zjrVar.c;
            if (i2 <= i) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (i2 == 0) {
                this.b = zjo.h(zjrVar);
            } else {
                if (i2 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (iF <= 0) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.c = zic.o(zjrVar);
            }
            i = i2;
        }
    }

    public static zlq b(Object obj) {
        if (obj instanceof zlq) {
            return (zlq) obj;
        }
        if (obj != null) {
            return new zlq(zjm.j(obj));
        }
        return null;
    }

    public final zih a() {
        return zjh.v(this.e.b);
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(5);
        ziiVar.b(this.d);
        ziiVar.b(this.a);
        ziiVar.b(this.e);
        zjo zjoVar = this.b;
        if (zjoVar != null) {
            ziiVar.b(new zks(false, 0, zjoVar));
        }
        zic zicVar = this.c;
        if (zicVar != null) {
            ziiVar.b(new zks(false, 1, zicVar));
        }
        return new zkq(ziiVar);
    }

    public zlq(zmd zmdVar, zih zihVar) {
        this(zmdVar, zihVar, null, null);
    }

    public zlq(zmd zmdVar, zih zihVar, zjo zjoVar) {
        this(zmdVar, zihVar, zjoVar, null);
    }

    public zlq(zmd zmdVar, zih zihVar, zjo zjoVar, byte[] bArr) {
        this.d = new ziu(bArr != null ? zxm.b : zxm.a);
        this.a = zmdVar;
        this.e = new zkn(zihVar);
        this.b = zjoVar;
        this.c = bArr == null ? null : new zkj(bArr);
    }
}
