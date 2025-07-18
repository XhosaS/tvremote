package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kdg extends kjz {
    private final int a;

    protected kdg(byte[] bArr) {
        kkk.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    protected static byte[] f(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.kka
    public final int d() {
        return this.a;
    }

    @Override // defpackage.kka
    public final kme e() {
        return new kmf(g());
    }

    public final boolean equals(Object obj) {
        kme kmeVarE;
        if (obj != null && (obj instanceof kka)) {
            try {
                kka kkaVar = (kka) obj;
                if (kkaVar.d() == this.a && (kmeVarE = kkaVar.e()) != null) {
                    return Arrays.equals(g(), (byte[]) kmf.c(kmeVarE));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public abstract byte[] g();

    public final int hashCode() {
        return this.a;
    }
}
