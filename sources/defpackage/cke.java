package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cke implements cmz {
    public int s = 0;

    public final void aI(OutputStream outputStream) {
        int iN = n();
        cla claVar = new cla(outputStream, cld.S(cld.ab(iN) + iN));
        claVar.C(iN);
        e(claVar);
        claVar.i();
    }

    public int c(cno cnoVar) {
        throw null;
    }

    @Override // defpackage.cmz
    public final ckv d() {
        try {
            int iN = n();
            ckv ckvVar = ckv.b;
            byte[] bArr = new byte[iN];
            cld cldVarAg = cld.ag(bArr);
            e(cldVarAg);
            return dnx.bH(cldVarAg, bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // defpackage.cmz
    public final void f(OutputStream outputStream) {
        cla claVar = new cla(outputStream, cld.S(n()));
        e(claVar);
        claVar.i();
    }

    @Override // defpackage.cmz
    public final byte[] g() {
        try {
            byte[] bArr = new byte[n()];
            cld cldVarAg = cld.ag(bArr);
            e(cldVarAg);
            cldVarAg.ah();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
