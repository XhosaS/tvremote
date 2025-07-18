package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwy extends rxa {
    public rwy(aafi aafiVar, String str, Object obj) {
        super(aafiVar, str, obj);
    }

    @Override // defpackage.rxa
    public final Object a(Object obj) {
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 3);
            whq whqVar = whq.a;
            int length = bArrDecode.length;
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            vuc vucVarP = vuc.p(whqVar, bArrDecode, 0, length, vtp.a);
            vuc.B(vucVarP);
            return (whq) vucVarP;
        } catch (IOException | IllegalArgumentException unused) {
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.c() + ": " + ((String) obj));
            return null;
        }
    }
}
