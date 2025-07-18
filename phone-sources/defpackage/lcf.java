package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcf implements idf {
    private final idf a;
    private final idf b;
    private final idf c;

    public lcf(idf idfVar, idf idfVar2, idf idfVar3) {
        this.a = idfVar;
        this.b = idfVar2;
        this.c = idfVar3;
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        xax xaxVar = (xax) obj;
        xaz xazVar = xaxVar.c;
        if (xazVar == null) {
            xazVar = xaz.a;
        }
        int i = xaxVar.b;
        if ((i & 16) == 0 || (i & 1) == 0) {
            return ieg.b(new RuntimeException("Incomplete season asset resource: ".concat(String.valueOf(String.valueOf(xaxVar)))));
        }
        if ((xazVar.b & 8) != 0) {
            xay xayVarB = xay.b(xazVar.f);
            if (xayVarB == null) {
                xayVarB = xay.ANDROID_APP;
            }
            if (xayVarB == xay.SEASON) {
                xaz xazVar2 = xaxVar.d;
                if (xazVar2 == null) {
                    xazVar2 = xaz.a;
                }
                if ((xazVar2.b & 1) == 0) {
                    return ieg.b(new RuntimeException("Season doesn't have parent: ".concat(String.valueOf(xazVar.c))));
                }
                xar xarVar = xaxVar.g;
                if (xarVar == null) {
                    xarVar = xar.a;
                }
                String str = xazVar.c;
                xaz xazVar3 = xaxVar.d;
                if (xazVar3 == null) {
                    xazVar3 = xaz.a;
                }
                lce lceVarM = lbk.m(str, lbk.n(xazVar3.c));
                xaq xaqVar = xarVar.u;
                if (xaqVar == null) {
                    xaqVar = xaq.a;
                }
                boolean z = xaqVar.c;
                xaz xazVar4 = xaxVar.d;
                if (xazVar4 == null) {
                    xazVar4 = xaz.a;
                }
                ieg iegVar = (ieg) this.a.b(ksy.l(xazVar4.c));
                if (iegVar.k() || (((xax) iegVar.g()).b & 16) == 0) {
                    return ieg.b;
                }
                xar xarVar2 = ((xax) iegVar.g()).g;
                if (xarVar2 == null) {
                    xarVar2 = xar.a;
                }
                vtw vtwVarM = lcd.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                lcd lcdVar = (lcd) vucVar;
                lceVarM.getClass();
                lcdVar.c = lceVarM;
                lcdVar.b |= 1;
                String str2 = xarVar.c;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                vuc vucVar2 = vtwVarM.b;
                str2.getClass();
                ((lcd) vucVar2).d = str2;
                String str3 = xarVar.i;
                if (!vucVar2.A()) {
                    vtwVarM.u();
                }
                lcd lcdVar2 = (lcd) vtwVarM.b;
                str3.getClass();
                lcdVar2.h = str3;
                vtwVarM.ab(lbk.u(xaxVar.j));
                vun<xaz> vunVar = xaxVar.e;
                ArrayList arrayList = new ArrayList(vunVar.size());
                for (xaz xazVar5 : vunVar) {
                    boolean z2 = false;
                    a.H((xazVar5.b & 8) != 0);
                    xay xayVarB2 = xay.b(xazVar5.f);
                    if (xayVarB2 == null) {
                        xayVarB2 = xay.ANDROID_APP;
                    }
                    if (xayVarB2 == xay.EPISODE) {
                        z2 = true;
                    }
                    a.H(z2);
                    arrayList.add(lbk.k(xazVar5.c, lceVarM));
                }
                vtwVarM.aa(arrayList);
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar3 = vtwVarM.b;
                ((lcd) vucVar3).m = z;
                String str4 = xarVar2.c;
                if (!vucVar3.A()) {
                    vtwVarM.u();
                }
                lcd lcdVar3 = (lcd) vtwVarM.b;
                str4.getClass();
                lcdVar3.e = str4;
                lcr lcrVarP = lbk.p((Uri) this.b.b(xarVar2.h));
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lcd lcdVar4 = (lcd) vtwVarM.b;
                lcrVarP.getClass();
                lcdVar4.f = lcrVarP;
                lcdVar4.b |= 2;
                lcr lcrVarP2 = lbk.p((Uri) this.c.b(xarVar2.h));
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                lcd lcdVar5 = (lcd) vtwVarM.b;
                lcrVarP2.getClass();
                lcdVar5.g = lcrVarP2;
                lcdVar5.b |= 4;
                vtwVarM.Z(lbk.r(xaxVar.q));
                xaq xaqVar2 = xarVar.u;
                if (xaqVar2 == null) {
                    xaqVar2 = xaq.a;
                }
                String str5 = xaqVar2.b;
                if (!TextUtils.isEmpty(str5)) {
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    lcd lcdVar6 = (lcd) vtwVarM.b;
                    str5.getClass();
                    lcdVar6.l = str5;
                }
                return ieg.f((lcd) vtwVarM.r());
            }
        }
        return ieg.b(new RuntimeException("Asset resource not season: ".concat(String.valueOf(String.valueOf(xaxVar)))));
    }
}
