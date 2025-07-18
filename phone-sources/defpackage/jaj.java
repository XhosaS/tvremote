package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jaj implements dcn {
    public static final jaj a = new jaj();
    private static final wnf b;

    static {
        wnf wnfVar = wnf.a;
        wnfVar.getClass();
        b = wnfVar;
    }

    private jaj() {
    }

    @Override // defpackage.dcn
    public final /* synthetic */ Object a() {
        return b;
    }

    @Override // defpackage.dcn
    public final Object b(InputStream inputStream) throws vuq, dav {
        try {
            wnf wnfVar = wnf.a;
            vte vteVarL = vte.L(inputStream);
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            vtp vtpVar2 = vtp.a;
            vuc vucVarO = wnfVar.o();
            try {
                try {
                    try {
                        vvy vvyVarB = vvs.a.b(vucVarO);
                        vvyVarB.l(vucVarO, vtf.p(vteVarL), vtpVar2);
                        vvyVarB.g(vucVarO);
                        vuc.B(vucVarO);
                        wnf wnfVar2 = (wnf) vucVarO;
                        wnfVar2.getClass();
                        return wnfVar2;
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
            throw new dav("Cannot read MediaProviders proto.", e5);
        }
    }

    @Override // defpackage.dcn
    public final /* bridge */ /* synthetic */ Object c(Object obj, OutputStream outputStream) {
        ((wnf) obj).g(outputStream);
        return ygi.a;
    }
}
