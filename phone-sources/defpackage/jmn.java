package defpackage;

import android.content.Context;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmn extends sbx {
    public final jaf a;
    private final ihg b;
    private final kja c;
    private final Context d;
    private final kwy e;

    public jmn(kwy kwyVar, jaf jafVar, ihg ihgVar, kja kjaVar, Context context) {
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
        jmk jmkVar = (jmk) obj;
        kle kleVarB = this.e.b();
        kleVarB.a = new jmm(this, jmkVar, 0);
        kleVarB.b = new jev(this, jmkVar, 18);
        return kleVarB;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jmk jmkVar = (jmk) obj;
        Object obj3 = jmkVar.b;
        isr isrVar = jmkVar.e;
        kle kleVar = (kle) obj2;
        wvf wvfVar = (wvf) obj3;
        wll wllVar = wvfVar.b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        m(isrVar.b(wllVar));
        yva yvaVar = ((kiz) this.c).a;
        o(yvaVar);
        String str = ((ixi) jmkVar).a;
        kleVar.F(str, new String[0]);
        kleVar.v(this.d.getResources().getString(R.string.toggle_watched_content_description));
        kleVar.y(str);
        boolean zJ = jmkVar.j();
        kleVar.w(jmkVar.i());
        String str2 = jmkVar.j() ? wvfVar.d : wvfVar.c;
        str2.getClass();
        kleVar.s(str2);
        kleVar.x(jmkVar.j());
        kleVar.t(R.drawable.ic_check_circle_24dp_selector);
        if (this.b.a()) {
            wfo wfoVar = (wfo) yvaVar.d();
            kleVar.z(Integer.valueOf(hju.J(wfoVar.l(), 0.8f)));
            if (jmkVar.j()) {
                kleVar.u(Integer.valueOf(wfoVar.f()));
            } else {
                kleVar.u(Integer.valueOf(wfoVar.l()));
            }
        }
        kleVar.r(new jhz(jmkVar, this, zJ, 3));
    }
}
