package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clp extends ckg {
    private final clt a;

    public clp(clt cltVar) {
        this.a = cltVar;
    }

    @Override // defpackage.ckg
    public final /* bridge */ /* synthetic */ cmz c(byte[] bArr, int i, cli cliVar) {
        return clt.q(this.a, bArr, 1, i, cliVar);
    }

    @Override // defpackage.cng
    public final /* bridge */ /* synthetic */ Object d(cky ckyVar, cli cliVar) throws cmh {
        Map map = clt.t;
        clt cltVarP = this.a.p();
        try {
            cno cnoVarB = cni.a.b(cltVarP);
            cnoVarB.l(cltVarP, ckz.p(ckyVar), cliVar);
            cnoVarB.g(cltVarP);
            return cltVarP;
        } catch (cmh e) {
            if (e.a) {
                throw new cmh(e);
            }
            throw e;
        } catch (cnw e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof cmh) {
                throw ((cmh) e3.getCause());
            }
            throw new cmh(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof cmh) {
                throw ((cmh) e4.getCause());
            }
            throw e4;
        }
    }
}
