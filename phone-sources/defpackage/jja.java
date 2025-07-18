package defpackage;

import android.content.Context;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jja extends sbx {
    public final jaf a;
    private final ihg b;
    private final kja c;
    private final Context d;
    private final kwy e;

    public jja(kwy kwyVar, jaf jafVar, ihg ihgVar, kja kjaVar, Context context) {
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
        jiy jiyVar = (jiy) obj;
        kle kleVarB = this.e.b();
        kleVarB.a = new jeu(this, jiyVar, 11);
        kleVarB.b = new jev(this, jiyVar, 9);
        return kleVarB;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jiy jiyVar = (jiy) obj;
        Object obj3 = jiyVar.b;
        irn irnVar = jiyVar.f;
        kle kleVar = (kle) obj2;
        wuq wuqVar = (wuq) obj3;
        wll wllVar = wuqVar.b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        m(irnVar.b(wllVar));
        yva yvaVar = ((kiz) this.c).a;
        o(yvaVar);
        String str = ((ixi) jiyVar).a;
        kleVar.F(str, new String[0]);
        kleVar.y(str);
        kleVar.v(this.d.getResources().getString(R.string.toggle_liked_content_description));
        boolean zK = jiyVar.k();
        kleVar.w(jiyVar.j());
        String str2 = jiyVar.k() ? wuqVar.d : wuqVar.c;
        str2.getClass();
        kleVar.s(str2);
        kleVar.x(jiyVar.k());
        kleVar.t(R.drawable.ic_thumb_up_24dp_selector);
        if (this.b.a()) {
            wfo wfoVar = (wfo) yvaVar.d();
            kleVar.z(Integer.valueOf(hju.J(wfoVar.l(), 0.8f)));
            if (jiyVar.k()) {
                kleVar.u(Integer.valueOf(wfoVar.f()));
            } else {
                kleVar.u(Integer.valueOf(wfoVar.l()));
            }
        }
        kleVar.r(new jhz(jiyVar, this, zK, 2));
    }
}
