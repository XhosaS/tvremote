package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class irt extends agtu implements agvb {
    int a;
    final /* synthetic */ iru b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irt(iru iruVar, agsw agswVar) {
        super(2, agswVar);
        this.b = iruVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((irt) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agtg agtgVar = agtg.a;
        int i = this.a;
        agpl.b(obj);
        if (i == 0) {
            Duration duration = iru.b;
            this.a = 1;
            if (zty.a(duration, this) == agtgVar) {
                return agtgVar;
            }
        }
        iru iruVar = this.b;
        iruVar.c();
        if (iruVar.d(false)) {
            ((zdv) iru.a.b().q("com/google/android/apps/tvsearch/shared/screencontrol/ScreenControllerImpl$turnOnScreen$1", "invokeSuspend", 43, "ScreenControllerImpl.kt")).u("Executed screen on");
        } else {
            ((zdv) iru.a.d().q("com/google/android/apps/tvsearch/shared/screencontrol/ScreenControllerImpl$turnOnScreen$1", "invokeSuspend", 45, "ScreenControllerImpl.kt")).u("Failed to turn screen on for explicitly routed device");
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new irt(this.b, agswVar);
    }
}
