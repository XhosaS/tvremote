package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slc extends agtu implements agvb {
    int a;
    final /* synthetic */ Duration b;
    final /* synthetic */ String c;
    final /* synthetic */ sld d;
    final /* synthetic */ sri e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slc(Duration duration, String str, sld sldVar, sri sriVar, agsw agswVar) {
        super(2, agswVar);
        this.b = duration;
        this.c = str;
        this.d = sldVar;
        this.e = sriVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((slc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        ahbt ahbtVar;
        agtg agtgVar = agtg.a;
        if (this.a != 0) {
            ahbtVar = (ahbt) this.f;
            agpl.b(obj);
        } else {
            agpl.b(obj);
            ahbt ahbtVar2 = (ahbt) this.f;
            Duration duration = this.b;
            this.f = ahbtVar2;
            this.a = 1;
            if (zty.a(duration, this) == agtgVar) {
                return agtgVar;
            }
            ahbtVar = ahbtVar2;
        }
        zdv zdvVar = (zdv) sld.a.d().o(zfi.a, "ALT.TimeoutTracker").q("com/google/android/libraries/search/audio/core/timeout/impl/TimeoutTrackerImpl$launchNewTimeout$1", "invokeSuspend", 56, "TimeoutTrackerImpl.kt");
        String str = this.c;
        zdvVar.x("#audio# on timeout(token(%s))", str);
        sld sldVar = this.d;
        synchronized (sldVar.c) {
            if (ahbu.d(ahbtVar)) {
                sldVar.d.remove(str);
            }
        }
        sri sriVar = this.e;
        sriVar.a.f(sriVar.b, sriVar.c, rxn.TIMEOUT);
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        slc slcVar = new slc(this.b, this.c, this.d, this.e, agswVar);
        slcVar.f = obj;
        return slcVar;
    }
}
