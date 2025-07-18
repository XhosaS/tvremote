package defpackage;

import com.google.android.gms.common.api.Scope;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ond {
    public static final npj a;
    public static final npj b;
    public static final jzs c;
    public static final ocv d;
    static final ocv e;

    static {
        npj npjVar = new npj(null);
        a = npjVar;
        npj npjVar2 = new npj(null);
        b = npjVar2;
        onb onbVar = new onb();
        d = onbVar;
        onc oncVar = new onc();
        e = oncVar;
        new Scope("profile");
        new Scope("email");
        c = new jzs("SignIn.API", (ocv) onbVar, npjVar);
        new jzs("SignIn.INTERNAL_API", (ocv) oncVar, npjVar2);
    }
}
