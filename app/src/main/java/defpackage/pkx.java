package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pkx {
    private final Context a;

    public pkx(Context context) {
        this.a = context;
    }

    public final String a(Uri uri) {
        return ufb.a(uri, new uen(this.a, null), ufa.a).getAbsolutePath();
    }
}
