package defpackage;

import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jou extends sbx {
    public final jaf a;
    private final itk b;
    private final dhq c;

    public jou(dhq dhqVar, jaf jafVar, itk itkVar) {
        jafVar.getClass();
        itkVar.getClass();
        this.c = dhqVar;
        this.a = jafVar;
        this.b = itkVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yfo] */
    @Override // defpackage.sbx
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ixi ixiVar = (ixi) obj;
        jox joxVar = new jox(this.c.a, ((wsr) ixiVar.b).c == 9 ? R.layout.generic_title_topic_page_layout : R.layout.generic_title_layout);
        joxVar.a = new jmm(this, ixiVar, 10);
        joxVar.b = new jnq(this, ixiVar, 6);
        return joxVar;
    }

    @Override // defpackage.sbx
    public final /* synthetic */ void c(Object obj, Object obj2) {
        wmb wmbVar;
        ixi ixiVar = (ixi) obj;
        jox joxVar = (jox) obj2;
        boolean z = false;
        joxVar.F(ixiVar.a, new String[0]);
        wsr wsrVar = (wsr) ixiVar.b;
        sco scoVar = new sco(wsrVar.d);
        if (!yks.e(joxVar.c, scoVar)) {
            joxVar.c = scoVar;
            joxVar.G(0);
        }
        wls wlsVar = wsrVar.h;
        if (wlsVar == null) {
            wlsVar = wls.a;
        }
        if (!yks.e(joxVar.h, wlsVar)) {
            joxVar.h = wlsVar;
            joxVar.G(5);
        }
        wlx wlxVar = wsrVar.i;
        if (wlxVar == null) {
            wlxVar = wlx.a;
        }
        if (!yks.e(joxVar.e, wlxVar)) {
            joxVar.e = wlxVar;
            joxVar.G(2);
        }
        wmb wmbVar2 = wsrVar.f;
        if (wmbVar2 == null) {
            wmbVar2 = wmb.a;
        }
        wls wlsVar2 = null;
        if ((wmbVar2.b & 1) != 0) {
            wmbVar = wsrVar.f;
            if (wmbVar == null) {
                wmbVar = wmb.a;
            }
        } else {
            wmbVar = null;
        }
        if (!yks.e(joxVar.f, wmbVar)) {
            joxVar.f = wmbVar;
            joxVar.G(3);
        }
        wlx wlxVar2 = wsrVar.e;
        if (wlxVar2 == null) {
            wlxVar2 = wlx.a;
        }
        if (!yks.e(joxVar.d, wlxVar2)) {
            joxVar.d = wlxVar2;
            joxVar.G(1);
        }
        if ((wsrVar.b & 2) != 0) {
            wlx wlxVar3 = wsrVar.e;
            if (wlxVar3 == null) {
                wlxVar3 = wlx.a;
            }
            if (!yks.e(wlxVar3, wlx.a)) {
                z = true;
            }
        }
        if (!yks.e(Boolean.valueOf(joxVar.i), Boolean.valueOf(z))) {
            joxVar.i = z;
            joxVar.G(6);
        }
        wls wlsVar3 = wsrVar.g;
        if (wlsVar3 == null) {
            wlsVar3 = wls.a;
        }
        String str = wlsVar3.b;
        str.getClass();
        if (str.length() > 0 && (wlsVar2 = wsrVar.g) == null) {
            wlsVar2 = wls.a;
        }
        if (!yks.e(joxVar.g, wlsVar2)) {
            joxVar.g = wlsVar2;
            joxVar.G(4);
        }
        itk itkVar = this.b;
        String str2 = wsrVar.d;
        str2.getClass();
        wlx wlxVar4 = wsrVar.e;
        if (wlxVar4 == null) {
            wlxVar4 = wlx.a;
        }
        wlxVar4.getClass();
        itkVar.l(str2, wlxVar4);
    }
}
