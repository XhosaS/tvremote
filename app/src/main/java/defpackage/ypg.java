package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ypg implements Serializable {
    public final yoz a;
    public final Map b;

    private ypg(yoz yozVar, Map map) {
        this.a = yozVar;
        this.b = map;
    }

    static ypg a(yoz yozVar, Map map) {
        yyn yynVar = new yyn(4);
        yynVar.c("Authorization", yyk.o("Bearer ".concat(String.valueOf(yozVar.a))));
        yynVar.f(map);
        return new ypg(yozVar, yynVar.a(true));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ypg)) {
            return false;
        }
        ypg ypgVar = (ypg) obj;
        return Objects.equals(this.b, ypgVar.b) && Objects.equals(this.a, ypgVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
