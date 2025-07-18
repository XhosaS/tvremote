package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class otx implements afer {
    private final yrp a;

    public otx(yrp yrpVar) {
        this.a = yrpVar;
    }

    @Override // defpackage.afer
    public final afeq a(afil afilVar, afem afemVar, afen afenVar) {
        otw otwVar;
        if (!((Boolean) this.a.eV()).booleanValue()) {
            return afenVar.a(afilVar, afemVar);
        }
        qpi qpiVar = (qpi) afemVar.h(oto.a);
        if (qpiVar == null) {
            otwVar = new otw(new qzv(null, "https://" + afenVar.b() + "/" + afilVar.b, false, SystemClock.elapsedRealtime()));
        } else {
            otwVar = new otw(new qzv(afenVar.b(), qpiVar.a, true, SystemClock.elapsedRealtime()));
        }
        return new ott(afenVar.a(afilVar, afemVar.g(otwVar)), otwVar);
    }
}
