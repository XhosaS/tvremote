package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyg implements zxe {
    private static final zdy c = zdy.h("com/google/android/apps/tvsearch/suggestions/starters/OpaTvRecommendationsResponseCallback");
    final iyd a;
    final Runnable b;
    private final iyh d;
    private final ixj e;
    private final iye f;

    public iyg(iyd iydVar, Runnable runnable, iye iyeVar, iyh iyhVar, ixj ixjVar) {
        this.a = iydVar;
        this.b = runnable;
        this.f = iyeVar;
        this.d = iyhVar;
        this.e = ixjVar;
    }

    private final void c() {
        ((iyk) this.b).a.b();
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        String str;
        ((zdv) ((zdv) c.b()).q("com/google/android/apps/tvsearch/suggestions/starters/OpaTvRecommendationsResponseCallback", "onFailure", 58, "OpaTvRecommendationsResponseCallback.java")).u("#TvZsCallback : Processing failed response.");
        iyh iyhVar = this.d;
        if (iyhVar.b() != null) {
            synchronized (iyhVar.c) {
                str = iyhVar.g;
            }
            if (!TextUtils.isEmpty(str)) {
                iyh iyhVar2 = this.d;
                iyhVar2.b().a(new String[0]);
                iyhVar2.c(null, "");
            }
        }
        iyd iydVar = ((iyq) this.a).d;
        if (iydVar != null) {
            zdy zdyVar = hxr.f;
            ((hxb) iydVar).a();
        }
        c();
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        xuq xuqVar = (xuq) obj;
        int i = xuqVar.b;
        if ((i & 8) != 0 || (i & 64) != 0) {
            iye iyeVar = this.f;
            xuc xucVar = xuqVar.e;
            if (xucVar == null) {
                xucVar = xuc.a;
            }
            int size = (xucVar.b == 1 ? (xqo) xucVar.c : xqo.a).c.size();
            if (size != 0) {
                synchronized (iyeVar.e) {
                    iyeVar.d = Locale.getDefault().toLanguageTag();
                    iyeVar.c = new String[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        String[] strArr = iyeVar.c;
                        xuc xucVar2 = xuqVar.e;
                        if (xucVar2 == null) {
                            xucVar2 = xuc.a;
                        }
                        strArr[i2] = ((xqq) (xucVar2.b == 1 ? (xqo) xucVar2.c : xqo.a).c.get(i2)).b;
                        String str = iyeVar.c[i2];
                    }
                }
                iyeVar.b.notifyChange(hcn.a, null);
            }
        }
        int i3 = xuqVar.b;
        if ((i3 & 4) != 0 || (i3 & 32) != 0) {
            this.e.j(xuqVar);
        }
        int i4 = xuqVar.b;
        if ((i4 & 16) != 0 || (i4 & 128) != 0) {
            iyh iyhVar = this.d;
            synchronized (iyhVar.c) {
                if (iyhVar.j != null && !TextUtils.isEmpty(iyhVar.g)) {
                    if ((xuqVar.b & 128) != 0) {
                        iyhVar.d = iyhVar.b.a().plus(iyh.a);
                        iyhVar.e.put(iyhVar.g, iyhVar.d);
                        xuc xucVar3 = xuqVar.f;
                        if (xucVar3 == null) {
                            xucVar3 = xuc.a;
                        }
                        xqo xqoVar = xucVar3.b == 1 ? (xqo) xucVar3.c : xqo.a;
                        int size2 = xqoVar.c.size();
                        String[] strArr2 = new String[size2];
                        HashMap map = new HashMap();
                        for (int i5 = 0; i5 < size2; i5++) {
                            xqq xqqVar = (xqq) xqoVar.c.get(i5);
                            strArr2[i5] = xqqVar.b;
                            xqs xqsVar = xqqVar.d;
                            if (xqsVar == null) {
                                xqsVar = xqs.a;
                            }
                            if ((xqsVar.b & 8) != 0) {
                                xqs xqsVar2 = xqqVar.d;
                                if (xqsVar2 == null) {
                                    xqsVar2 = xqs.a;
                                }
                                map.put(xqqVar.b, xqsVar2.c);
                            }
                        }
                        if (!map.isEmpty()) {
                            iyhVar.f.put(iyhVar.g, map);
                        }
                        if ((xqoVar.b & 1) != 0) {
                            iyhVar.h.put(iyhVar.g, xqoVar.d);
                        }
                        iyhVar.j.a(strArr2);
                    } else {
                        iyhVar.j.a(new String[0]);
                    }
                }
            }
        }
        iyd iydVar = ((iyq) this.a).d;
        if (iydVar != null) {
            hxb hxbVar = (hxb) iydVar;
            hxbVar.a.F.m(gmc.V);
            hxbVar.a();
        }
        c();
    }
}
