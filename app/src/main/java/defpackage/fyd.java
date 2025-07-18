package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyd extends agtu implements agvb {
    int a;
    final /* synthetic */ fyf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyd(fyf fyfVar, agsw agswVar) {
        super(2, agswVar);
        this.b = fyfVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fyd) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            fyf fyfVar = this.b;
            this.a = 1;
            obj = fyfVar.a(this);
            if (obj == agtgVar) {
                return agtgVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            fyf fyfVar2 = this.b;
            Duration duration = Duration.ZERO;
            duration.getClass();
            fyfVar2.e.a(duration);
            fyfVar2.c.jobFinished(fyfVar2.d, false);
        } else {
            ((zdv) fyf.a.d().q("com/google/android/apps/tvsearch/fcm/FcmRegistrationJobServicePeer$onStartJob$1", "invokeSuspend", 66, "FcmRegistrationJobServicePeer.kt")).u("Failed to register fcm.");
            fyf fyfVar3 = this.b;
            fyfVar3.c.jobFinished(fyfVar3.d, true);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fyd(this.b, agswVar);
    }
}
