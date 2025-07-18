package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrn extends nwq {
    public static final /* synthetic */ int a = 0;
    private static final npj b;
    private static final jzs c;
    private static final ocv d;

    static {
        npj npjVar = new npj(null);
        b = npjVar;
        nrj nrjVar = new nrj();
        d = nrjVar;
        c = new jzs("CastApi.API", (ocv) nrjVar, npjVar);
    }

    public nrn(Context context) {
        super(context, c, nwi.q, nwp.a);
    }

    public final onz a(String[] strArr) {
        oaf oafVar = new oaf();
        oafVar.a = new nig(strArr, 5);
        oafVar.b = new nvg[]{nks.d};
        oafVar.b();
        oafVar.c = 8425;
        return r(oafVar.a());
    }
}
