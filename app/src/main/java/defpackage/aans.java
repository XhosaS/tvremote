package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aans {
    public static final String[] a = {"*", "FCM", "GCM", ""};
    public final SharedPreferences b;
    public final String c;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aans(defpackage.aahf r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.d()
            android.content.Context r0 = r4.c
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.b = r0
            r4.d()
            aahp r0 = r4.e
            java.lang.String r0 = r0.c
            if (r0 == 0) goto L1b
            goto L49
        L1b:
            r4.d()
            aahp r4 = r4.e
            java.lang.String r0 = r4.b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L32
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L49
        L32:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3f
        L3d:
            r0 = r2
            goto L49
        L3f:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L49
            goto L3d
        L49:
            r3.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aans.<init>(aahf):void");
    }

    public static String a(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & 15) + 112);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final PublicKey b(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored ".concat(e.toString()));
            return null;
        }
    }
}
