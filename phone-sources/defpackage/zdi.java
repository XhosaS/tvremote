package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdi {
    public final zbi a;
    public List b;
    public int c;
    public List d;
    public final List e;
    public final upq f;

    public zdi(zbi zbiVar, upq upqVar) {
        List listM;
        this.a = zbiVar;
        this.f = upqVar;
        yhb yhbVar = yhb.a;
        this.b = yhbVar;
        this.d = yhbVar;
        this.e = new ArrayList();
        URI uriF = zbiVar.h.f();
        if (uriF.getHost() == null) {
            listM = zcr.m(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = zbiVar.g.select(uriF);
            listM = (listSelect == null || listSelect.isEmpty()) ? zcr.m(Proxy.NO_PROXY) : zcr.n(listSelect);
        }
        this.b = listM;
        this.c = 0;
        listM.getClass();
    }

    public final boolean a() {
        return b() || !this.e.isEmpty();
    }

    public final boolean b() {
        return this.c < this.b.size();
    }
}
