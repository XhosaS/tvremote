package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlh implements hlp {
    private final Collection b;

    @SafeVarargs
    public hlh(hlp... hlpVarArr) {
        this.b = Arrays.asList(hlpVarArr);
    }

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((hlp) it.next()).a(messageDigest);
        }
    }

    @Override // defpackage.hlp
    public final hnv b(Context context, hnv hnvVar, int i, int i2) {
        Iterator it = this.b.iterator();
        hnv hnvVar2 = hnvVar;
        while (it.hasNext()) {
            hnv hnvVarB = ((hlp) it.next()).b(context, hnvVar2, i, i2);
            if (hnvVar2 != null && !hnvVar2.equals(hnvVar) && !hnvVar2.equals(hnvVarB)) {
                hnvVar2.e();
            }
            hnvVar2 = hnvVarB;
        }
        return hnvVar2;
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        if (obj instanceof hlh) {
            return this.b.equals(((hlh) obj).b);
        }
        return false;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        return this.b.hashCode();
    }
}
