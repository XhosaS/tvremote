package defpackage;

import android.content.Context;
import com.google.android.videos.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkj extends sbx {
    public final jaf a;
    private final Context b;
    private final ihg c;
    private final kja d;
    private final cxe e;

    public jkj(cxe cxeVar, jaf jafVar, Context context, ihg ihgVar, kja kjaVar) {
        jafVar.getClass();
        kjaVar.getClass();
        this.e = cxeVar;
        this.a = jafVar;
        this.b = context;
        this.c = ihgVar;
        this.d = kjaVar;
    }

    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        jkh jkhVar = (jkh) obj;
        jkn jknVar = new jkn();
        jknVar.a = new jeu(this, jkhVar, 16);
        jknVar.b = new jev(this, jkhVar, 13);
        return jknVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [iof, java.lang.Object] */
    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        jkh jkhVar = (jkh) obj;
        Object obj3 = jkhVar.b;
        ?? r1 = jkhVar.d;
        jkn jknVar = (jkn) obj2;
        wll wllVar = ((wtg) obj3).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        wllVar.getClass();
        m(r1.a(wllVar));
        jknVar.F(((ixi) jkhVar).a, new String[0]);
        boolean z = jkhVar.i() != 0;
        if (jknVar.f != z) {
            jknVar.f = z;
            Iterator it = jknVar.g.iterator();
            while (it.hasNext()) {
                ((sdd) it.next()).a();
            }
        }
        sco scoVar = new sco(jwq.J(jkhVar.i(), this.b.getResources(), false));
        if (!yks.e(jknVar.c, scoVar)) {
            jknVar.c = scoVar;
            jknVar.G(0);
        }
        if (!a.r(jknVar.d, R.drawable.ic_timer_24dp)) {
            jknVar.d = R.drawable.ic_timer_24dp;
            jknVar.G(1);
        }
        if (this.c.a()) {
            yva yvaVar = ((kiz) this.d).a;
            o(yvaVar);
            wfo wfoVar = (wfo) yvaVar.d();
            if (yks.e(jknVar.e, wfoVar)) {
                return;
            }
            jknVar.e = wfoVar;
            jknVar.G(2);
        }
    }
}
