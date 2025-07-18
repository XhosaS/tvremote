package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agat {
    public static final agat a = new agat();

    private agat() {
    }

    public final Object a(afen afenVar, afil afilVar, Object obj, afem afemVar, afih afihVar, agsw agswVar) {
        if (afilVar.a == afik.UNARY) {
            return ahii.d(new ahio(new agav(b(afenVar, afilVar, afemVar, afihVar, new agal(obj)), afilVar, null)), agswVar);
        }
        Objects.toString(afilVar);
        throw new IllegalArgumentException("Expected a unary RPC method, but got ".concat(afilVar.toString()));
    }

    public final ahgr b(afen afenVar, afil afilVar, afem afemVar, afih afihVar, agam agamVar) {
        return new ahio(new agas(afemVar, afenVar, afilVar, afihVar, agamVar, null));
    }
}
