package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class wxm {
    public abstract long a();

    public abstract yyk b();

    public abstract yyk c();

    public abstract UUID d();

    public final String toString() {
        return TextUtils.join(" -> ", c());
    }
}
