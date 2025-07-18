package defpackage;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aamj {
    public final aahf a;
    public final aaml b;
    public final kcp c;
    public final aamy d;
    public final aamy e;
    public final aang f;

    public aamj(aahf aahfVar, aaml aamlVar, aamy aamyVar, aamy aamyVar2, aang aangVar) {
        aahfVar.d();
        kcp kcpVar = new kcp(aahfVar.c);
        this.a = aahfVar;
        this.b = aamlVar;
        this.c = kcpVar;
        this.d = aamyVar;
        this.e = aamyVar2;
        this.f = aangVar;
    }

    public final String a() {
        aahf aahfVar = this.a;
        aahfVar.d();
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(aahfVar.d.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }
}
