package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ohw implements elp {
    private final oco a;

    public ohw(oco ocoVar) {
        this.a = ocoVar;
    }

    @Override // defpackage.elp
    public final void a(int i, String str, Throwable th, Map map) {
        String str2;
        oal oalVarG;
        int i2 = i - 1;
        acsw acswVar = (i2 == 1 || i2 == 2) ? acsw.LOG_TYPE_INTERNAL_ERROR : acsw.LOG_LEVEL_WARN;
        if (th == null) {
            th = new RuntimeException(str);
        }
        Throwable th2 = th;
        oco ocoVar = this.a;
        if (map == null || !map.containsKey("Component name") || (str2 = (String) map.get("Component name")) == null) {
            oalVarG = oal.A;
        } else {
            oak oakVarO = oal.O();
            ((nyw) oakVarO).h = new StringBuilder(str2);
            oalVarG = oakVarO.g();
        }
        ocoVar.d(acswVar, oalVarG, th2, "Error reporter: %s", str);
    }
}
