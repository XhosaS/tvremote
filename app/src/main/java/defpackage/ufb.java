package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufb {
    public static final File a(Uri uri, uen uenVar, ufa ufaVar) throws ufu {
        String scheme = uri.getScheme();
        int iHashCode = scheme.hashCode();
        if (iHashCode != -861391249) {
            if (iHashCode == 3143036 && scheme.equals("file")) {
                return ufaVar.a(uri);
            }
        } else if (scheme.equals("android")) {
            return uenVar.a(uri);
        }
        throw new ufu("Couldn't convert URI to path: ".concat(String.valueOf(String.valueOf(uri))));
    }
}
