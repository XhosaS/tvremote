package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zrw implements zxn {
    private final zrv a;
    private final byte[] b;
    private final byte[] c;

    public zrw(zrv zrvVar, byte[] bArr, byte[] bArr2) {
        this.a = zrvVar;
        this.b = bArr;
        this.c = bArr2;
    }

    public static zrw a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof zrw) {
            return (zrw) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            zrv zrvVarA = zrv.a(dataInputStream2.readInt());
            int i = zrvVarA.r;
            byte[] bArr = new byte[i];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[zrvVarA.t * i];
            dataInputStream2.readFully(bArr2);
            return new zrw(zrvVarA, bArr, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(vxr.aO((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
        }
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
        } catch (Throwable th) {
            th = th;
            dataInputStream = null;
        }
        try {
            zrw zrwVarA = a(dataInputStream);
            dataInputStream.close();
            return zrwVarA;
        } catch (Throwable th2) {
            th = th2;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zrw zrwVar = (zrw) obj;
        zrv zrvVar = this.a;
        if (zrvVar == null ? zrwVar.a != null : !zrvVar.equals(zrwVar.a)) {
            return false;
        }
        if (Arrays.equals(this.b, zrwVar.b)) {
            return Arrays.equals(this.c, zrwVar.c);
        }
        return false;
    }

    public final int hashCode() {
        zrv zrvVar = this.a;
        return ((((zrvVar != null ? zrvVar.hashCode() : 0) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    @Override // defpackage.zxn
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wef.T(this.a.q, byteArrayOutputStream);
        wef.R(this.b, byteArrayOutputStream);
        wef.R(this.c, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
