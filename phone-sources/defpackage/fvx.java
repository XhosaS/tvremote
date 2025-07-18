package defpackage;

import android.content.ComponentName;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvx {
    public final List a;
    public final boolean b = true;
    private final ComponentName c = null;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public fvx(nxb nxbVar) {
        this.a = nxbVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvx)) {
            return false;
        }
        fvx fvxVar = (fvx) obj;
        if (this.a.equals(fvxVar.a)) {
            boolean z = fvxVar.b;
            ComponentName componentName = fvxVar.c;
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, true, null);
    }
}
