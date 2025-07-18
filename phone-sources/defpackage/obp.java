package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class obp extends ifk implements obq {
    private int a;

    protected obp(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        a.H(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] aA();

    @Override // defpackage.obq
    public final int aB() {
        return this.a;
    }

    @Override // defpackage.obq
    public final odd b() {
        return new odc(aA());
    }

    public final boolean equals(Object obj) {
        odd oddVarB;
        if (obj != null && (obj instanceof obq)) {
            try {
                obq obqVar = (obq) obj;
                if (obqVar.aB() == this.a && (oddVarB = obqVar.b()) != null) {
                    return Arrays.equals(aA(), (byte[]) odc.a(oddVarB));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            odd oddVarB = b();
            parcel2.writeNoException();
            ifl.e(parcel2, oddVarB);
        } else {
            if (i != 2) {
                return false;
            }
            int i2 = this.a;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        }
        return true;
    }

    public obp() {
        super("com.google.android.gms.common.internal.ICertData");
    }
}
