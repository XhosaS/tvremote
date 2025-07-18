package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qei {
    public static piy a(String str) throws qeh {
        abyy abwxVar;
        try {
            piy piyVar = piy.a;
            abyy abyyVar = piy.b;
            if (abyyVar == null) {
                synchronized (piy.class) {
                    abwxVar = piy.b;
                    if (abwxVar == null) {
                        abwxVar = new abwx(piy.a);
                        piy.b = abwxVar;
                    }
                }
                abyyVar = abwxVar;
            }
            return (piy) qer.b(str, abyyVar);
        } catch (abxv | NullPointerException e) {
            throw new qeh("Failed to deserialize key:".concat(String.valueOf(str)), e);
        }
    }

    public static File b(Context context, yqt yqtVar) {
        String strConcat = "gms_icing_mdd_garbage_file";
        if (yqtVar != null && yqtVar.g()) {
            strConcat = "gms_icing_mdd_garbage_file".concat((String) yqtVar.c());
        }
        return new File(context.getFilesDir(), strConcat);
    }

    public static String c(piy piyVar) {
        int iA;
        try {
            int i = piyVar.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(piyVar.getClass()).a(piyVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(piyVar.getClass()).a(piyVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    piyVar.memoizedSerializedSize = (Integer.MIN_VALUE & piyVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(piyVar.getClass()).m(piyVar, abwa.a(abvwVar));
            abvwVar.K();
            return Base64.encodeToString(bArr, 3);
        } catch (IOException e) {
            throw new RuntimeException(a.u(piyVar, " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
