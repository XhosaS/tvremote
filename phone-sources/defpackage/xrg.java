package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrg {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final tzs b = xsm.d;

    public static xsj a(String str, xrf xrfVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        int i = xsj.c;
        return new xsk(str, z, xrfVar);
    }
}
