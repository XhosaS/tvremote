package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqu implements hqg {
    private final Context a;
    private final Class b;

    public hqu(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.hqg
    public final hqf b(hqk hqkVar) {
        Class cls = this.b;
        return new hqw(this.a, hqkVar.a(File.class, cls), hqkVar.a(Uri.class, cls), cls);
    }
}
