package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dkb implements dar {
    private final dar b;

    public dkb(dar darVar) {
        this.b = darVar;
    }

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.dar
    public final ddp b(Context context, ddp ddpVar, int i, int i2) {
        ddz ddzVar = cyg.a(context).b;
        Drawable drawable = (Drawable) ddpVar.c();
        ddp ddpVarA = dka.a(ddzVar, drawable, i, i2);
        if (ddpVarA == null) {
            throw new IllegalArgumentException(a.o(drawable, "Unable to convert ", " to a Bitmap"));
        }
        ddp ddpVarB = this.b.b(context, ddpVarA, i, i2);
        if (!ddpVarB.equals(ddpVarA)) {
            return dkn.f(context.getResources(), ddpVarB);
        }
        ddpVarB.e();
        return ddpVar;
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (obj instanceof dkb) {
            return this.b.equals(((dkb) obj).b);
        }
        return false;
    }

    @Override // defpackage.daj
    public final int hashCode() {
        return this.b.hashCode();
    }
}
