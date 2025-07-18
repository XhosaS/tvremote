package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsa implements hlp {
    private final hlp b;
    private final boolean c;

    public hsa(hlp hlpVar, boolean z) {
        this.b = hlpVar;
        this.c = z;
    }

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.hlp
    public final hnv b(Context context, hnv hnvVar, int i, int i2) {
        hod hodVar = hjr.b(context).a;
        Drawable drawable = (Drawable) hnvVar.c();
        hnv hnvVarA = hrz.a(hodVar, drawable, i, i2);
        if (hnvVarA == null) {
            if (this.c) {
                throw new IllegalArgumentException(a.cw(drawable, "Unable to convert ", " to a Bitmap"));
            }
            return hnvVar;
        }
        hnv hnvVarB = this.b.b(context, hnvVarA, i, i2);
        if (!hnvVarB.equals(hnvVarA)) {
            return hsj.f(context.getResources(), hnvVarB);
        }
        hnvVarB.e();
        return hnvVar;
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        if (obj instanceof hsa) {
            return this.b.equals(((hsa) obj).b);
        }
        return false;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        return this.b.hashCode();
    }
}
