package defpackage;

import android.content.Intent;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezg extends agtu implements agvb {
    int a;
    final /* synthetic */ Intent b;
    final /* synthetic */ ezh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezg(Intent intent, ezh ezhVar, agsw agswVar) {
        super(2, agswVar);
        this.b = intent;
        this.c = ezhVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ezg) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            ((zdv) ezh.a.b().q("com/google/android/apps/tvsearch/app/modeutils/art/ArtBroadcastReceiver$onReceive$1", "invokeSuspend", 34, "ArtBroadcastReceiver.kt")).u("onReceive, to set expiry for ART Mode usage.");
            Instant instantPlus = agvy.c(this.b.getAction(), "com.google.android.katniss.action.ENABLE_ART_MODE") ? this.c.c.a().plus(Duration.ofDays(3L)) : Instant.EPOCH;
            instantPlus.getClass();
            ezh ezhVar = this.c;
            this.a = 1;
            final abzy abzyVarB = acbk.b(instantPlus);
            Object objB = ((fhi) ezhVar.b.a.a()).b(new agux() { // from class: fmc
                @Override // defpackage.agux
                public final Object a(Object obj2) {
                    fnp fnpVar = (fnp) obj2;
                    fnpVar.getClass();
                    fpc fpcVar = fnpVar.n;
                    if (fpcVar == null) {
                        fpcVar = fpc.a;
                    }
                    abzy abzyVar = fpcVar.e;
                    if (abzyVar == null) {
                        abzyVar = abzy.a;
                    }
                    abzy abzyVar2 = abzyVarB;
                    if (agvy.c(abzyVar, abzyVar2)) {
                        return fnpVar;
                    }
                    fno fnoVar = new fno();
                    fnoVar.B(fnpVar);
                    fpc fpcVarJ = fnq.j(fnoVar);
                    fpb fpbVar = new fpb();
                    fpbVar.B(fpcVarJ);
                    if ((fpbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fpbVar.y();
                    }
                    fpc fpcVar2 = (fpc) fpbVar.b;
                    fpcVar2.e = abzyVar2;
                    fpcVar2.b |= 2;
                    fpc fpcVarA = fpd.a(fpbVar);
                    if ((fnoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        fnoVar.y();
                    }
                    fnp fnpVar2 = (fnp) fnoVar.b;
                    fnpVar2.n = fpcVarA;
                    fnpVar2.b |= 4096;
                    return fnq.c(fnoVar);
                }
            }, this);
            if (objB != agtgVar) {
                objB = agpu.a;
            }
            if (objB == agtgVar) {
                return agtgVar;
            }
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new ezg(this.b, this.c, agswVar);
    }
}
