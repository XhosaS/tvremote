package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
class diq implements dhf {
    private final Context a;
    private final Class b;

    public diq(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        Class cls = this.b;
        return new diu(this.a, dhnVar.a(File.class, cls), dhnVar.a(Uri.class, cls), cls);
    }
}
