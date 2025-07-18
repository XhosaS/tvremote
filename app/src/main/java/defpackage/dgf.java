package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgf implements dhf, dgh {
    private final Context a;

    public dgf(Context context) {
        this.a = context;
    }

    @Override // defpackage.dgh
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        return new dgi(this.a, this);
    }

    @Override // defpackage.dgh
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        return resources.openRawResource(i);
    }

    @Override // defpackage.dgh
    public final /* synthetic */ void d(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
