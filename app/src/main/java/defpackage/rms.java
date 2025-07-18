package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rms implements uef {
    @Override // defpackage.uef
    public final /* bridge */ /* synthetic */ Object a(uee ueeVar) throws IOException {
        InputStream inputStreamA = new uhi().a(ueeVar);
        try {
            rho rhoVarB = rho.b(abvt.K(inputStreamA, 4096));
            if (inputStreamA != null) {
                inputStreamA.close();
            }
            return rhoVarB;
        } catch (Throwable th) {
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
