package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkr extends agah {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adkr(afen afenVar, afem afemVar) {
        super(afenVar, afemVar);
        afemVar.getClass();
    }

    public static /* synthetic */ ahgr b(adkr adkrVar, ahgr ahgrVar) {
        afih afihVar = new afih();
        agat agatVar = agat.a;
        afil afilVarB = adkq.b();
        if (afilVarB.a == afik.BIDI_STREAMING) {
            return agatVar.b(adkrVar.a, afilVarB, adkrVar.b, afihVar, new agak(ahgrVar));
        }
        Objects.toString(afilVarB);
        throw new IllegalStateException("Expected a bidi streaming method, but got ".concat(afilVarB.toString()));
    }

    @Override // defpackage.agee
    public final /* bridge */ /* synthetic */ agee a(afen afenVar, afem afemVar) {
        return new adkr(afenVar, afemVar);
    }
}
