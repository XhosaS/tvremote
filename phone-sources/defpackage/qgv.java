package defpackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgv {
    public Map a;
    public byte[] b;
    public int c;
    private URL d;
    private String e;

    public qgv() {
    }

    public final qgw a() {
        Map map;
        int i;
        URL url = this.d;
        if (url != null && (map = this.a) != null && (i = this.c) != 0) {
            return new qgw(url, this.e, map, this.b, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" url");
        }
        if (this.a == null) {
            sb.append(" headers");
        }
        if (this.c == 0) {
            sb.append(" purpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final Map b() {
        Map map = this.a;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"headers\" has not been set");
    }

    public final void c(qgu qguVar, String str) {
        List arrayList = b().containsKey(qguVar) ? (List) b().get(qguVar) : new ArrayList(1);
        arrayList.add(str);
        b().put(qguVar, arrayList);
    }

    public final void d() {
        this.e = "application/x-protobuf";
    }

    public final void e(URL url) {
        if (url == null) {
            throw new NullPointerException("Null url");
        }
        this.d = url;
    }

    public qgv(qgw qgwVar) {
        this.d = qgwVar.a;
        this.e = qgwVar.b;
        this.a = qgwVar.c;
        this.b = qgwVar.d;
        this.c = qgwVar.e;
    }
}
