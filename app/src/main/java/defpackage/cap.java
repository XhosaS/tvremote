package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cap {
    public final Uri a;
    public final boolean b;

    public cap(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!agvy.c(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        cap capVar = (cap) obj;
        return agvy.c(this.a, capVar.a) && this.b == capVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }
}
