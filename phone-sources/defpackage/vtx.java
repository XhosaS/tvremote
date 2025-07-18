package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtx extends vsi {
    private final vuc a;

    public vtx(vuc vucVar) {
        this.a = vucVar;
    }

    @Override // defpackage.vsi
    public final /* bridge */ /* synthetic */ vvj d(byte[] bArr, int i, int i2, vtp vtpVar) {
        return vuc.p(this.a, bArr, i, i2, vtpVar);
    }

    @Override // defpackage.vvq
    public final /* bridge */ /* synthetic */ Object l(vte vteVar, vtp vtpVar) throws vuq {
        Map map = vuc.N;
        vuc vucVarO = this.a.o();
        try {
            vvy vvyVarB = vvs.a.b(vucVarO);
            vvyVarB.l(vucVarO, vtf.p(vteVar), vtpVar);
            vvyVarB.g(vucVarO);
            return vucVarO;
        } catch (vuq e) {
            if (e.a) {
                throw new vuq(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof vuq) {
                throw ((vuq) e2.getCause());
            }
            throw new vuq(e2);
        } catch (vwf e3) {
            throw e3.a();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof vuq) {
                throw ((vuq) e4.getCause());
            }
            throw e4;
        }
    }
}
