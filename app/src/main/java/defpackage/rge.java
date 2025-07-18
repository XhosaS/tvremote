package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rge extends rgi {
    final /* synthetic */ rgf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rge(rgg rggVar, String str, String str2, rgf rgfVar) {
        super(rggVar, str, str2);
        this.a = rgfVar;
    }

    @Override // defpackage.rgi
    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return this.a.a(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.d() + ": " + String.valueOf(obj));
        return null;
    }
}
