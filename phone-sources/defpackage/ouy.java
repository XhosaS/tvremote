package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ouy {
    public static final tui a = tui.l("com/google/android/libraries/googletv/player/kinetoscope/data/rpc/NurRpcClientServiceImpl");
    public final ouz b;
    public final Context c;
    public String d;
    public String e;
    public ouc f;
    public final qtl g;
    private final yft h;
    private final yft i;
    private final tst j;

    public ouy(ouz ouzVar, qtl qtlVar, yft yftVar, yft yftVar2, tst tstVar, Context context) {
        yftVar.getClass();
        yftVar2.getClass();
        this.b = ouzVar;
        this.g = qtlVar;
        this.h = yftVar;
        this.i = yftVar2;
        this.j = tstVar;
        this.c = context;
        ouc oucVar = oud.a;
        this.f = oud.a;
    }

    public final vdn a() {
        String languageTag;
        vtw vtwVarM = vdn.a.m();
        vtwVarM.getClass();
        vbo vboVar = (vbo) this.h.a();
        vboVar.getClass();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vdn vdnVar = (vdn) vtwVarM.b;
        vdnVar.c = vboVar;
        vdnVar.b |= 1;
        vas vasVar = (vas) this.i.a();
        vasVar.getClass();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vdn vdnVar2 = (vdn) vtwVarM.b;
        vdnVar2.d = vasVar;
        vdnVar2.b |= 2;
        vtw vtwVarM2 = vci.a.m();
        vtwVarM2.getClass();
        tst tstVar = this.j;
        Locale localeF = crh.l(this.c.getResources().getConfiguration()).f(0);
        if (localeF == null || (languageTag = localeF.toLanguageTag()) == null) {
            languageTag = "en-US";
        }
        String str = (String) tstVar.e(languageTag);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        vuc vucVar = vtwVarM2.b;
        ((vci) vucVar).b = str;
        String str2 = this.e;
        if (str2 == null) {
            str2 = "";
        }
        if (!vucVar.A()) {
            vtwVarM2.u();
        }
        ((vci) vtwVarM2.b).c = str2;
        vuc vucVarR = vtwVarM2.r();
        vucVarR.getClass();
        vci vciVar = (vci) vucVarR;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vdn vdnVar3 = (vdn) vtwVarM.b;
        vdnVar3.e = vciVar;
        vdnVar3.b |= 4;
        vtw vtwVarM3 = vbq.a.m();
        vtwVarM3.getClass();
        vtw vtwVarM4 = vbp.a.m();
        vtwVarM4.av();
        vuc vucVarR2 = vtwVarM4.r();
        vucVarR2.getClass();
        vbp vbpVar = (vbp) vucVarR2;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vbq vbqVar = (vbq) vtwVarM3.b;
        vbqVar.c = vbpVar;
        vbqVar.b = 2;
        vuc vucVarR3 = vtwVarM3.r();
        vucVarR3.getClass();
        vbq vbqVar2 = (vbq) vucVarR3;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vdn vdnVar4 = (vdn) vtwVarM.b;
        vdnVar4.g = vbqVar2;
        vdnVar4.b |= 16;
        vuc vucVarR4 = vtwVarM.r();
        vucVarR4.getClass();
        return (vdn) vucVarR4;
    }

    public final Object b(our ourVar, yih yihVar) {
        return this.g.aA(new oux(this, ourVar, null), yihVar);
    }

    public final void c(Context context, String str, String str2, ouc oucVar) {
        context.getClass();
        oucVar.getClass();
        this.d = str;
        this.e = str2;
        this.f = oucVar;
    }
}
