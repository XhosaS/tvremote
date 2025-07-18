package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tls extends tlq {
    private static final tui a = tui.l("com/google/android/tv/remote/virtual/client/FmrService");
    private tlx b;

    @Override // defpackage.tlq
    public final Set a() {
        return EnumSet.of(tmf.FIND_MY_REMOTE);
    }

    @Override // defpackage.tlq
    public final tma b(tlx tlxVar) {
        this.b = tlxVar;
        return new tma() { // from class: tlr
            @Override // defpackage.tma
            public final void a(tnq tnqVar) {
                if (tnqVar.b == 70) {
                    ((tug) iwu.a.e().h(tvo.a, "VIRTUAL_REMOTE").j("com/google/android/apps/googletv/app/device/virtualremote/impl/VirtualRemoteImpl$fmrListener$1", "onFmrTriggered", 284, "VirtualRemoteImpl.kt")).v("FMR triggered with success: %s", true);
                }
            }

            @Override // defpackage.tma
            public final /* synthetic */ void b() {
            }

            @Override // defpackage.tma
            public final /* synthetic */ void c(int i) {
            }
        };
    }

    public final void d(Boolean bool) {
        ((tug) ((tug) a.e()).j("com/google/android/tv/remote/virtual/client/FmrService", "triggerFindMyRemote", 45, "FmrService.java")).v("Trigger FMR %s", bool);
        tlx tlxVar = this.b;
        vtw vtwVarM = tms.a.m();
        vtw vtwVarM2 = tmu.a.m();
        int i = true != bool.booleanValue() ? 3 : 2;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        tmu tmuVar = (tmu) vtwVarM2.b;
        tmuVar.c = i - 1;
        tmuVar.b |= 1;
        tmu tmuVar2 = (tmu) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        tms tmsVar = (tms) vtwVarM.b;
        tmuVar2.getClass();
        tmsVar.c = tmuVar2;
        tmsVar.b = 70;
        tlxVar.a((tms) vtwVarM.r());
    }
}
