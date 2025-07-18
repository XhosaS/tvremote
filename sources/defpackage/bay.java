package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bay extends bba {
    public bay(bzt bztVar, String str, Object obj) {
        super(bztVar, str, obj);
    }

    @Override // defpackage.bba
    public final Object a(Object obj) {
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 3);
            cou couVar = cou.a;
            int length = bArrDecode.length;
            cli cliVar = cli.a;
            cni cniVar = cni.a;
            clt cltVarQ = clt.q(couVar, bArrDecode, 0, length, cli.a);
            clt.B(cltVarQ);
            return (cou) cltVarQ;
        } catch (IOException | IllegalArgumentException unused) {
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.c() + ": " + ((String) obj));
            return null;
        }
    }
}
