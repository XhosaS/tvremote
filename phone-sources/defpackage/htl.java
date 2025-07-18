package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htl implements hlp {
    private final hlp b;

    public htl(hlp hlpVar) {
        hju.p(hlpVar);
        this.b = hlpVar;
    }

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.hlp
    public final hnv b(Context context, hnv hnvVar, int i, int i2) {
        hti htiVar = (hti) hnvVar.c();
        hnv hsjVar = new hsj(htiVar.a(), hjr.b(context).a, 1);
        hlp hlpVar = this.b;
        hnv hnvVarB = hlpVar.b(context, hsjVar, i, i2);
        if (!hsjVar.equals(hnvVarB)) {
            hsjVar.e();
        }
        htiVar.a.a.e(hlpVar, (Bitmap) hnvVarB.c());
        return hnvVar;
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        if (obj instanceof htl) {
            return this.b.equals(((htl) obj).b);
        }
        return false;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        return this.b.hashCode();
    }
}
