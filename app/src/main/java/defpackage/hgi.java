package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgi {
    public final void a(Bundle bundle, Bundle bundle2) {
        Object objClone = bundle2 != null ? bundle2.clone() : null;
        if (objClone instanceof Bundle) {
            bundle.putAll((Bundle) objClone);
        }
    }
}
