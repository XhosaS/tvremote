package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyp {
    public final Application a;
    public final ffp b;
    public int c = 0;
    public String d = "";

    public eyp(Context context, ffp ffpVar) {
        this.a = (Application) context;
        this.b = ffpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ezc a(Activity activity) {
        ezc ezcVar = activity instanceof ezc ? (ezc) activity : feo.b(activity, ezc.class) ? (ezc) feo.a(activity) : null;
        this.d = ezcVar != null ? ezcVar.c() : "";
        return ezcVar;
    }

    public final boolean b() {
        return this.c > 0;
    }
}
