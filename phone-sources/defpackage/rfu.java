package defpackage;

import android.content.Context;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfu extends qub {
    public boolean b;
    public Object c;
    private final qth d;
    private final qua e;
    private ImmutableMap f = ImmutableMap.of();

    public rfu(Context context, qth qthVar, ttm ttmVar, dvk dvkVar, tst tstVar) {
        this.d = qthVar;
        this.e = new qua(tst.i(new qtz(rrx.aE(context, context.getResources().getColor(R.color.google_grey900), ric.c(context, tstVar).a(ria.DARK_YELLOW)), context.getString(R.string.og_important_account_alert_badge_a11y_label), 2)), trk.a);
        ((dvs) ttmVar.get()).d(dvkVar, new req(this, 6));
    }

    @Override // defpackage.qub
    public final void a(Object obj) {
        sjl.c();
        this.c = obj;
        Object objI = trk.a;
        if (obj != null) {
            ofe ofeVar = (ofe) rrx.aC(this.d, obj, this.f, ofe.a);
            if (ofeVar != null && !this.b) {
                uzo uzoVar = ofeVar.b;
                if (uzoVar == null) {
                    uzoVar = uzo.a;
                }
                uzp uzpVar = uzoVar.b;
                if (uzpVar == null) {
                    uzpVar = uzp.a;
                }
                int iBm = a.bm(uzpVar.b);
                if (iBm != 0 && iBm == 3) {
                    objI = tst.i(this.e);
                }
            }
        }
        this.a.k(objI);
    }

    public final void b(ImmutableMap immutableMap) {
        this.f = immutableMap;
        rrx.ac(new qxp(this, 5));
    }
}
