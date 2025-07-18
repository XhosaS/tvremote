package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class got {
    public final Uri a;
    public final boolean b;

    public got(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yks.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        got gotVar = (got) obj;
        return yks.e(this.a, gotVar.a) && this.b == gotVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.q(this.b);
    }
}
