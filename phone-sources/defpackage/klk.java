package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klk implements dcn {
    public static final klk a = new klk();
    private static final wox b;

    static {
        wox woxVar = wox.a;
        woxVar.getClass();
        b = woxVar;
    }

    private klk() {
    }

    @Override // defpackage.dcn
    public final /* synthetic */ Object a() {
        return b;
    }

    @Override // defpackage.dcn
    public final Object b(InputStream inputStream) throws Exception {
        try {
            try {
                wox woxVar = wox.a;
                vte vteVarL = vte.L(inputStream);
                vtp vtpVar = vtp.a;
                vvs vvsVar = vvs.a;
                vtp vtpVar2 = vtp.a;
                vuc vucVarO = woxVar.o();
                try {
                    vvy vvyVarB = vvs.a.b(vucVarO);
                    vvyVarB.l(vucVarO, vtf.p(vteVarL), vtpVar2);
                    vvyVarB.g(vucVarO);
                    vuc.B(vucVarO);
                    wox woxVar2 = (wox) vucVarO;
                    woxVar2.getClass();
                    return woxVar2;
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
            } catch (Exception e5) {
                krd.a("Cannot read proto", e5);
                throw e5;
            }
        } catch (der e6) {
            throw new dav("Cannot read proto", e6);
        }
    }

    @Override // defpackage.dcn
    public final /* bridge */ /* synthetic */ Object c(Object obj, OutputStream outputStream) {
        ((wox) obj).g(outputStream);
        return ygi.a;
    }
}
