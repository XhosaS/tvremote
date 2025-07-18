package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ioe implements dcn {
    public static final ioe a = new ioe();
    private static final iod b;

    static {
        iod iodVar = iod.a;
        iodVar.getClass();
        b = iodVar;
    }

    private ioe() {
    }

    @Override // defpackage.dcn
    public final /* synthetic */ Object a() {
        return b;
    }

    @Override // defpackage.dcn
    public final Object b(InputStream inputStream) throws vuq, dav {
        try {
            iod iodVar = iod.a;
            vte vteVarL = vte.L(inputStream);
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            vtp vtpVar2 = vtp.a;
            vuc vucVarO = iodVar.o();
            try {
                try {
                    try {
                        vvy vvyVarB = vvs.a.b(vucVarO);
                        vvyVarB.l(vucVarO, vtf.p(vteVarL), vtpVar2);
                        vvyVarB.g(vucVarO);
                        vuc.B(vucVarO);
                        iod iodVar2 = (iod) vucVarO;
                        iodVar2.getClass();
                        return iodVar2;
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
                    }
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof vuq) {
                        throw ((vuq) e3.getCause());
                    }
                    throw e3;
                }
            } catch (vwf e4) {
                throw e4.a();
            }
        } catch (vuq e5) {
            throw new dav("Cannot read UserSettings proto from file.", e5);
        }
    }

    @Override // defpackage.dcn
    public final /* bridge */ /* synthetic */ Object c(Object obj, OutputStream outputStream) {
        ((iod) obj).g(outputStream);
        return ygi.a;
    }
}
