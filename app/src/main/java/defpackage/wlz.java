package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class wlz {
    public abstract wma a();

    public abstract void b(aasp aaspVar);

    public final wma c() {
        wma wmaVarA = a();
        wlx wlxVar = (wlx) wmaVarA;
        String str = wlxVar.a;
        boolean z = false;
        yqw.M((str == null) == (wlxVar.b == null), "If host is set, port must be set (and vice-versa)");
        if (str != null) {
            if (str.matches("[a-zA-Z0-9-.]+")) {
            }
            yqw.R(z, "Host string is invalid: %s", str);
            return wmaVarA;
        }
        str = null;
        z = true;
        yqw.R(z, "Host string is invalid: %s", str);
        return wmaVarA;
    }
}
