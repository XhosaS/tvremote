package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jld extends agtu implements agvb {
    int a;
    final /* synthetic */ jlp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jld(jlp jlpVar, agsw agswVar) {
        super(2, agswVar);
        this.b = jlpVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jld) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        aeai aeaiVarA;
        agtg agtgVar = agtg.a;
        try {
            if (this.a != 0) {
                agpl.b(obj);
            } else {
                agpl.b(obj);
                Duration duration = jlp.b;
                jlc jlcVar = new jlc(this.b, null);
                this.a = 1;
                obj = zty.b(duration, jlcVar, this);
                if (obj == agtgVar) {
                    return agtgVar;
                }
            }
            aeaiVarA = (aeai) obj;
        } catch (Exception e) {
            ((zdv) ((zdv) jlp.a.d()).p(e).q("com/google/android/apps/tvsearch/voice/libassistant/handlers/UiClientOpHandler$buildVoiceSearchRequestParams$2", "invokeSuspend", 713, "UiClientOpHandler.kt")).u("Failed to retrieve VoiceSearchRequest param.");
            aeai aeaiVar = aeai.a;
            aeaiVarA = new aeaj(new aeag()).a();
        }
        if (this.b.d.Z() != jlv.INVOCATION_TYPE_ESCAPE_HATCH_REISSUE_QUERY) {
            return aeaiVarA;
        }
        aeag aeagVar = new aeag();
        aeagVar.B(aeaiVarA);
        aeaj aeajVar = new aeaj(aeagVar);
        aeajVar.b(10);
        return aeajVar.a();
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new jld(this.b, agswVar);
    }
}
