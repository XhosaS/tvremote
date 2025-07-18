package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afgt {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final zkl b = afih.c;

    public static afid a(String str, afgs afgsVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        int i = afid.c;
        return new afif(str, z, afgsVar);
    }
}
