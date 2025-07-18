package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dmc implements dar {
    private final dar b;

    public dmc(dar darVar) {
        this.b = darVar;
    }

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.dar
    public final ddp b(Context context, ddp ddpVar, int i, int i2) {
        dlz dlzVar = (dlz) ddpVar.c();
        ddp djfVar = new djf(dlzVar.a(), cyg.a(context).b);
        dar darVar = this.b;
        ddp ddpVarB = darVar.b(context, djfVar, i, i2);
        if (!djfVar.equals(ddpVarB)) {
            djfVar.e();
        }
        dlzVar.a.a.e(darVar, (Bitmap) ddpVarB.c());
        return ddpVar;
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (obj instanceof dmc) {
            return this.b.equals(((dmc) obj).b);
        }
        return false;
    }

    @Override // defpackage.daj
    public final int hashCode() {
        return this.b.hashCode();
    }
}
