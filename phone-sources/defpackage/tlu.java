package defpackage;

import android.os.Build;
import android.view.inputmethod.ExtractedText;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlu extends tlq {
    public tlx a;
    public final zft b;

    public tlu(zft zftVar) {
        this.b = zftVar;
    }

    public static ExtractedText d(tnd tndVar) {
        ExtractedText extractedText = new ExtractedText();
        if ((tndVar.b & 2) != 0) {
            extractedText.text = tndVar.d;
        }
        extractedText.startOffset = 0;
        extractedText.selectionStart = tndVar.e;
        extractedText.selectionEnd = tndVar.f;
        extractedText.flags = tndVar.g;
        if (Build.VERSION.SDK_INT >= 28 && (tndVar.b & 32) != 0) {
            extractedText.hint = tndVar.h;
        }
        return extractedText;
    }

    @Override // defpackage.tlq
    public final Set a() {
        return EnumSet.of(tmf.IME);
    }

    @Override // defpackage.tlq
    public final tma b(tlx tlxVar) {
        this.a = tlxVar;
        return new tlt(this);
    }

    public final void e(int i) {
        tlx tlxVar = this.a;
        vtw vtwVarM = tms.a.m();
        vtw vtwVarM2 = tnf.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        tnf tnfVar = (tnf) vtwVarM2.b;
        tnfVar.b |= 1;
        tnfVar.c = i;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        tms tmsVar = (tms) vtwVarM.b;
        tnf tnfVar2 = (tnf) vtwVarM2.r();
        tnfVar2.getClass();
        tmsVar.c = tnfVar2;
        tmsVar.b = 20;
        tlxVar.a((tms) vtwVarM.r());
    }

    public final void f(String str) {
        tlx tlxVar = this.a;
        vtw vtwVarM = tms.a.m();
        vtw vtwVarM2 = tmv.a.m();
        vtw vtwVarM3 = tmy.a.m();
        vtw vtwVarM4 = tmx.a.m();
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        tmx tmxVar = (tmx) vtwVarM4.b;
        str.getClass();
        tmxVar.b |= 4;
        tmxVar.e = str;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        tmy tmyVar = (tmy) vtwVarM3.b;
        tmx tmxVar2 = (tmx) vtwVarM4.r();
        tmxVar2.getClass();
        tmyVar.c = tmxVar2;
        tmyVar.b = 2;
        vtwVarM2.bw(vtwVarM3);
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        tms tmsVar = (tms) vtwVarM.b;
        tmv tmvVar = (tmv) vtwVarM2.r();
        tmvVar.getClass();
        tmsVar.c = tmvVar;
        tmsVar.b = 21;
        tlxVar.a((tms) vtwVarM.r());
    }
}
