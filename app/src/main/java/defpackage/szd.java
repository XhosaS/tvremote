package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szd implements sya {
    final /* synthetic */ sze a;
    private final sza b;

    public szd(sze szeVar, ryr ryrVar) {
        this.a = szeVar;
        eue eueVar = szeVar.c;
        StringBuilder sb = new StringBuilder();
        abxc abxcVar = slt.a;
        abxcVar.getClass();
        int iB = sgn.b(((sgo) acay.a(ryrVar, abxcVar)).b);
        if (iB == 0) {
            throw null;
        }
        sb.append(sze.a(String.valueOf(iB - 1)));
        abxc abxcVar2 = slt.c;
        abxcVar2.getClass();
        sb.append("-".concat(sze.a((String) acay.a(ryrVar, abxcVar2))));
        abxc abxcVar3 = slt.b;
        abxcVar3.getClass();
        sb.append("-".concat(sze.a((String) acay.a(ryrVar, abxcVar3))));
        syv syvVar = new syv(sb.toString(), ryrVar.e, ryrVar.d, ryrVar.c);
        eup eupVar = eueVar.a.a;
        this.b = new sza((Context) eupVar.n.a(), (ahbt) eupVar.lw.a(), (mcw) eupVar.i.a(), ((waa) eupVar.P.a()).a("com.google.android.libraries.search.audio.device", "45639054").d(), ((waa) eupVar.P.a()).a("com.google.android.libraries.search.audio.device", "45639056").a(), ((waa) eupVar.P.a()).a("com.google.android.libraries.search.audio.device", "45639055").a(), (szs) eupVar.qh.a(), syvVar);
    }

    @Override // defpackage.sya
    public final zyd a() {
        return this.b.a();
    }

    @Override // defpackage.sya
    public final zyd b(rsu rsuVar) {
        abvo abvoVar = (rsuVar.c == 1 ? (rss) rsuVar.d : rss.a).c;
        abvoVar.getClass();
        return this.b.b(abvoVar, (rsuVar.b & 4) != 0 ? Integer.valueOf(rsuVar.g) : null, (rsuVar.b & 2) != 0 ? Long.valueOf(rsuVar.f) : null);
    }

    @Override // defpackage.sya
    public final zyd c(abvo abvoVar) {
        return this.b.b(abvoVar, null, null);
    }
}
