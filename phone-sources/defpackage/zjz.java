package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zjz implements zid {
    private zkh a;
    private final eph b;

    public zjz(eph ephVar) {
        this.b = ephVar;
    }

    static zjy a(eph ephVar) {
        zkh zkhVar = new zkh(ephVar);
        return new zjy(vxr.aO(zkhVar), zkhVar.a);
    }

    @Override // defpackage.zid
    public final int f() {
        return this.a.a;
    }

    @Override // defpackage.zid
    public final InputStream g() {
        zkh zkhVar = new zkh(this.b);
        this.a = zkhVar;
        return zkhVar;
    }

    @Override // defpackage.zld
    public final zjh j() {
        return a(this.b);
    }

    @Override // defpackage.zih
    public final zjh p() {
        try {
            return j();
        } catch (IOException e) {
            throw new zjg("IOException converting stream to byte array: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
