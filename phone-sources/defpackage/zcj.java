package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcj {
    public final zce a;
    public final String b;
    public final zcc c;
    public final Map d;
    private zbm e;

    public zcj(zce zceVar, String str, zcc zccVar, Map map) {
        str.getClass();
        map.getClass();
        this.a = zceVar;
        this.b = str;
        this.c = zccVar;
        this.d = map;
    }

    public final String a(String str) {
        return this.c.b(str);
    }

    public final zbm b() {
        zbm zbmVar = this.e;
        if (zbmVar != null) {
            return zbmVar;
        }
        zcc zccVar = this.c;
        zbm zbmVar2 = zbm.a;
        zbm zbmVarY = wbb.Y(zccVar);
        this.e = zbmVarY;
        return zbmVarY;
    }

    public final boolean c() {
        return this.a.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        zcc zccVar = this.c;
        if (zccVar.a() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : zccVar) {
                int i2 = i + 1;
                if (i < 0) {
                    yfm.w();
                }
                yfw yfwVar = (yfw) obj;
                String str = (String) yfwVar.a;
                String str2 = (String) yfwVar.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map map = this.d;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
