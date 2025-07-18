package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wdy implements uef {
    @Override // defpackage.uef
    public final /* bridge */ /* synthetic */ Object a(uee ueeVar) {
        InputStream inputStreamA = new uhi().a(ueeVar);
        try {
            rho rhoVarB = rho.b(abvt.K(inputStreamA, 4096));
            aguc.a(inputStreamA, null);
            return rhoVarB;
        } finally {
        }
    }
}
