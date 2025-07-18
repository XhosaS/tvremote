package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class air extends ack implements ais {
    private int a;

    protected air(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        qp.j(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.ais
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        ajy ajyVarY;
        if (obj != null && (obj instanceof ais)) {
            try {
                ais aisVar = (ais) obj;
                if (aisVar.a() == this.a && (ajyVarY = aisVar.y()) != null) {
                    return Arrays.equals(x(), (byte[]) ajx.b(ajyVarY));
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

    public abstract byte[] x();

    @Override // defpackage.ais
    public final ajy y() {
        return new ajx(x());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ajy, android.os.IBinder] */
    @Override // defpackage.ack
    protected final boolean z(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ?? Y = y();
            parcel2.writeNoException();
            int i2 = acl.a;
            parcel2.writeStrongBinder(Y);
        } else {
            if (i != 2) {
                return false;
            }
            int i3 = this.a;
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        }
        return true;
    }

    public air() {
        super("com.google.android.gms.common.internal.ICertData");
    }
}
