package defpackage;

import defpackage.vsf;
import defpackage.vsg;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class vsg<MessageType extends vsg<MessageType, BuilderType>, BuilderType extends vsf<MessageType, BuilderType>> implements vvj {
    public int M = 0;

    public int d(vvy vvyVar) {
        throw null;
    }

    @Override // defpackage.vvj
    public final vsz e() {
        try {
            int iL = l();
            vsz vszVar = vsz.b;
            byte[] bArr = new byte[iL];
            vtj vtjVarAh = vtj.ah(bArr);
            dO(vtjVarAh);
            return vxr.aa(vtjVarAh, bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final void f(OutputStream outputStream) {
        int iL = l();
        vtg vtgVar = new vtg(outputStream, vtj.T(vtj.ac(iL) + iL));
        vtgVar.D(iL);
        dO(vtgVar);
        vtgVar.j();
    }

    @Override // defpackage.vvj
    public final void g(OutputStream outputStream) {
        vtg vtgVar = new vtg(outputStream, vtj.T(l()));
        dO(vtgVar);
        vtgVar.j();
    }

    @Override // defpackage.vvj
    public final byte[] h() {
        try {
            byte[] bArr = new byte[l()];
            vtj vtjVarAh = vtj.ah(bArr);
            dO(vtjVarAh);
            vtjVarAh.ai();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
