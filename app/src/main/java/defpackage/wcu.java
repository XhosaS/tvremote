package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcu {
    public final agow a;
    public final agow b;
    public final zyg c;
    public final rfr d;
    public final wcm e;
    private final agpc f;

    public wcu(agow agowVar, agow agowVar2, zyg zygVar, rfr rfrVar, wcm wcmVar) {
        agowVar.getClass();
        zygVar.getClass();
        rfrVar.getClass();
        this.a = agowVar;
        this.b = agowVar2;
        this.c = zygVar;
        this.d = rfrVar;
        this.e = wcmVar;
        this.f = new agpn(new agum() { // from class: wcq
            @Override // defpackage.agum
            public final Object a() {
                return new ConcurrentHashMap(((Map) this.a.b.a()).size(), 0.75f, 4);
            }
        });
    }

    public final zyd a(String str, rgs rgsVar) {
        String str2 = rgsVar.c;
        str2.getClass();
        if (str2.length() == 0) {
            rfr rfrVar = this.d;
            if (!rfrVar.f.c(this.e.a(str)).d) {
                return zxy.a;
            }
        }
        wct wctVar = new wct(this, str, rgsVar);
        wct wctVar2 = (wct) ((ConcurrentHashMap) this.f.a()).put(str, wctVar);
        if (wctVar2 == null || !agvy.c(wctVar2.b.c, rgsVar.c)) {
            wctVar2 = wctVar;
        }
        zyu zyuVar = wctVar.c;
        zyuVar.eZ(wctVar2.d.b());
        return zyuVar;
    }
}
