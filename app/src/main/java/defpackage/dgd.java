package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgd implements dhf, dgh {
    private final Context a;

    public dgd(Context context) {
        this.a = context;
    }

    @Override // defpackage.dgh
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        return new dgi(this.a, this);
    }

    @Override // defpackage.dgh
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        return resources.openRawResourceFd(i);
    }

    @Override // defpackage.dgh
    public final /* synthetic */ void d(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }
}
