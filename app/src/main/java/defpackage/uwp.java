package defpackage;

import android.view.View;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwp extends dxv {

    @eau(a = eav.NONE)
    @eat(a = 3)
    int a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    uws b;

    @eau(a = eav.NONE)
    @eat(a = 10)
    drq c;

    public uwp() {
        super("GridAccessibilityItem");
    }

    @Override // defpackage.dxv
    protected final drq ay(dru druVar) {
        drq drqVar = this.c;
        dzs dzsVarAA = dzt.aA(druVar);
        dzsVarAA.c(drqVar);
        dzsVarAA.S(o(uwp.class, "GridAccessibilityItem", druVar, -1933296085, new Object[]{druVar}));
        return dzsVarAA.a();
    }

    @Override // defpackage.drq
    public final /* bridge */ /* synthetic */ drq l() {
        uwp uwpVar = (uwp) super.l();
        drq drqVar = uwpVar.c;
        uwpVar.c = drqVar != null ? drqVar.l() : null;
        return uwpVar;
    }

    @Override // defpackage.drq
    protected final Object y(dtu dtuVar, Object obj) {
        int iO;
        int iA;
        int i = dtuVar.c;
        if (i != -1933296085) {
            if (i != -1048037474) {
                return null;
            }
            dsq.b((dru) dtuVar.d[0], (dto) obj);
            return null;
        }
        dwy dwyVar = (dwy) obj;
        dui duiVar = dtuVar.b;
        afn afnVar = dwyVar.c;
        View view = dwyVar.a;
        ajr ajrVar = dwyVar.b;
        uwp uwpVar = (uwp) duiVar;
        uws uwsVar = uwpVar.b;
        int i2 = uwpVar.a;
        super/*alk*/.c(view, ajrVar);
        if (uwsVar.b == 1) {
            iO = uwq.a(i2, uwsVar.n());
            iA = i2 % uwsVar.n();
        } else {
            iO = i2 % uwsVar.o();
            iA = uwq.a(i2, uwsVar.o());
        }
        ajrVar.e(ajq.a(iO, iA));
        return null;
    }
}
