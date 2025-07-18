package defpackage;

import android.content.Context;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jia extends sbx {
    public final jaf a;
    private final ihg b;
    private final kja c;
    private final Context d;
    private final kwy e;

    public jia(kwy kwyVar, jaf jafVar, ihg ihgVar, kja kjaVar, Context context) {
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
        jhx jhxVar = (jhx) obj;
        kle kleVarB = this.e.b();
        kleVarB.a = new jeu(this, jhxVar, 8);
        kleVarB.b = new jev(this, jhxVar, 7);
        return kleVarB;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jhx jhxVar = (jhx) obj;
        Object obj3 = jhxVar.b;
        irn irnVar = jhxVar.f;
        kle kleVar = (kle) obj2;
        wuo wuoVar = (wuo) obj3;
        wll wllVar = wuoVar.b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        m(irnVar.b(wllVar));
        yva yvaVar = ((kiz) this.c).a;
        o(yvaVar);
        String str = ((ixi) jhxVar).a;
        int i = 0;
        kleVar.F(str, new String[0]);
        kleVar.v(this.d.getResources().getString(R.string.toggle_disliked_content_description));
        kleVar.y(str);
        boolean zK = jhxVar.k();
        kleVar.w(jhxVar.j());
        String str2 = jhxVar.k() ? wuoVar.d : wuoVar.c;
        str2.getClass();
        kleVar.s(str2);
        kleVar.x(jhxVar.k());
        kleVar.t(R.drawable.ic_thumb_down_24dp_selector);
        if (this.b.a()) {
            wfo wfoVar = (wfo) yvaVar.d();
            kleVar.z(Integer.valueOf(hju.J(wfoVar.l(), 0.8f)));
            if (jhxVar.k()) {
                kleVar.u(Integer.valueOf(wfoVar.f()));
            } else {
                kleVar.u(Integer.valueOf(wfoVar.l()));
            }
        }
        kleVar.r(new jhz(jhxVar, zK, this, i));
    }
}
