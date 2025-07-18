package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ufa {
    public static final ufa a = new ufa();

    private ufa() {
    }

    public final File a(Uri uri) throws ufu {
        if (!uri.getScheme().equals("file")) {
            throw new ufu("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new ufu("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new ufu("Did not expect uri to have authority");
    }
}
