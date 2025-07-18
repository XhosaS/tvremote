package defpackage;

import android.content.Context;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jna extends sbx {
    public final jaf a;
    private final ihg b;
    private final kja c;
    private final Context d;
    private final kwy e;

    public jna(kwy kwyVar, jaf jafVar, ihg ihgVar, kja kjaVar, Context context) {
        jafVar.getClass();
        kjaVar.getClass();
        this.e = kwyVar;
        this.a = jafVar;
        this.b = ihgVar;
        this.c = kjaVar;
        this.d = context;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jui juiVar = (jui) obj;
        kle kleVarB = this.e.b();
        kleVarB.a = new jmm(this, juiVar, 2);
        kleVarB.b = new jev(this, juiVar, 19);
        return kleVarB;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jui juiVar = (jui) obj;
        Object obj3 = juiVar.b;
        Object obj4 = juiVar.e;
        kle kleVar = (kle) obj2;
        wvg wvgVar = (wvg) obj3;
        wll wllVar = wvgVar.c;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        m(((iqs) obj4).b(new iog(wllVar, ((ksn) ((ldy) juiVar.d).a().g()).a)));
        yva yvaVar = ((kiz) this.c).a;
        o(yvaVar);
        String str = ((ixi) juiVar).a;
        kleVar.F(str, new String[0]);
        kleVar.v(this.d.getResources().getString(R.string.toggle_watchlist_content_description));
        kleVar.y(str);
        boolean zK = juiVar.k();
        kleVar.w(juiVar.j());
        String str2 = juiVar.k() ? wvgVar.e : wvgVar.d;
        str2.getClass();
        kleVar.s(str2);
        kleVar.x(juiVar.k());
        kleVar.t(R.drawable.ic_bookmark_24dp_selector);
        if (this.b.a()) {
            wfo wfoVar = (wfo) yvaVar.d();
            kleVar.z(Integer.valueOf(hju.J(wfoVar.l(), 0.8f)));
            if (juiVar.k()) {
                kleVar.u(Integer.valueOf(wfoVar.f()));
            } else {
                kleVar.u(Integer.valueOf(wfoVar.l()));
            }
        }
        kleVar.r(new jhz(juiVar, this, zK, 4));
    }
}
