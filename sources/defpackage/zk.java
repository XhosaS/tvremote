package defpackage;

import android.content.ComponentName;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zk {
    public final ComponentName a;

    public zk(ComponentName componentName) {
        this.a = componentName;
    }

    public final String a() {
        return this.a.getPackageName();
    }

    public final String toString() {
        return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
    }
}
