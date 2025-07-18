package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zt {
    final zn a;
    final List b = new ArrayList();
    final boolean c;
    public zo d;
    private final zk e;

    public zt(zn znVar, boolean z) {
        this.a = znVar;
        this.e = znVar.g;
        this.c = z;
    }

    public final ComponentName a() {
        return this.e.a;
    }

    final zu b(String str) {
        for (zu zuVar : this.b) {
            if (zuVar.b.equals(str)) {
                return zuVar;
            }
        }
        return null;
    }

    public final String c() {
        return this.e.a();
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + c() + " }";
    }
}
