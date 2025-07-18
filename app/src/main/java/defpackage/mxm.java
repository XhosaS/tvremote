package defpackage;

import android.text.TextPaint;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxm extends ehg {
    public final String a;
    private final oaa b;
    private final ocj c;
    private final ogq d;
    private final ogq e;

    public mxm(ndr ndrVar, oaa oaaVar, ogr ogrVar, ocj ocjVar, oal oalVar) {
        this.b = oaaVar;
        this.c = ocjVar;
        this.d = ndrVar.n() ? ogrVar.o(ndrVar.j(), oalVar) : null;
        this.a = (ndrVar.o() && ndrVar.k().h() && ndrVar.k().g().h()) ? ndrVar.k().g().g() : null;
        this.e = ndrVar.m() ? ogrVar.o(ndrVar.i(), oalVar) : null;
    }

    @Override // defpackage.ehg
    public final boolean a(View view) {
        ogq ogqVar = this.e;
        if (ogqVar == null) {
            return false;
        }
        oaa oaaVar = this.b;
        CommandOuterClass$Command commandOuterClass$CommandA = ogqVar.a();
        nzv nzvVarP = nzx.p();
        nzvVarP.f(view);
        ((nyu) nzvVarP).e = this.c;
        oaaVar.a(commandOuterClass$CommandA, nzvVarP.e()).k();
        return true;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ogq ogqVar = this.d;
        if (ogqVar != null) {
            oaa oaaVar = this.b;
            CommandOuterClass$Command commandOuterClass$CommandA = ogqVar.a();
            nzv nzvVarP = nzx.p();
            nzvVarP.f(view);
            ((nyu) nzvVarP).e = this.c;
            oaaVar.a(commandOuterClass$CommandA, nzvVarP.e()).k();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
