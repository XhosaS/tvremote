package defpackage;

import com.google.android.tv.remote.virtual.audio.compression.Lc3Encoder;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmi extends tlq {
    public static final tui a = tui.l("com/google/android/tv/remote/virtual/client/VoiceService");
    public final boolean b;
    public tlo c;
    public tlx d;
    public int e;
    public int f;
    public final tlm g;
    private final boolean h;

    public tmi(tlm tlmVar, boolean z, tno tnoVar) {
        this.g = tlmVar;
        this.h = z;
        boolean z2 = false;
        if (new vul(tnoVar.e, tno.a).contains(tnt.LC3) && Lc3Encoder.a) {
            z2 = true;
        }
        this.b = z2;
    }

    @Override // defpackage.tlq
    public final Set a() {
        return this.h ? EnumSet.of(tmf.VOICE, tmf.PTT_ASSISTANT) : EnumSet.of(tmf.VOICE);
    }

    @Override // defpackage.tlq
    public final tma b(tlx tlxVar) {
        this.d = tlxVar;
        return new tmh(this, tlxVar);
    }

    public final void e() {
        int i = this.f;
        if (i == 0) {
            ((tug) ((tug) a.g()).j("com/google/android/tv/remote/virtual/client/VoiceService", "voiceStop", 143, "VoiceService.java")).s("No active voice sessions to close");
            return;
        }
        if (i > 0 && this.e != i) {
            ((tug) ((tug) a.b()).j("com/google/android/tv/remote/virtual/client/VoiceService", "voiceStop", 147, "VoiceService.java")).s("No requested voice sessions to close");
            return;
        }
        tlx tlxVar = this.d;
        vtw vtwVarM = tms.a.m();
        vtw vtwVarM2 = tnu.a.m();
        int i2 = this.f;
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        tnu tnuVar = (tnu) vtwVarM2.b;
        tnuVar.b |= 1;
        tnuVar.c = i2;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        tms tmsVar = (tms) vtwVarM.b;
        tnu tnuVar2 = (tnu) vtwVarM2.r();
        tnuVar2.getClass();
        tmsVar.c = tnuVar2;
        tmsVar.b = 32;
        tlxVar.a((tms) vtwVarM.r());
        this.f = 0;
        this.c = null;
    }
}
