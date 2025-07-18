package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skp implements sjp {
    private final vvq a;
    private final vtp b;

    private skp(vvq vvqVar) {
        vtp vtpVar = vtp.a;
        vvs vvsVar = vvs.a;
        this.b = vtp.a;
        this.a = vvqVar;
    }

    public static skp b(vvj vvjVar) {
        return new skp(vvjVar.u());
    }

    @Override // defpackage.sjp
    public final /* bridge */ /* synthetic */ Object a(unc uncVar) throws IOException {
        InputStream inputStreamB = skn.b(uncVar);
        try {
            Object objH = this.a.h(inputStreamB, this.b);
            if (inputStreamB != null) {
                inputStreamB.close();
            }
            return objH;
        } catch (Throwable th) {
            if (inputStreamB != null) {
                try {
                    inputStreamB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
