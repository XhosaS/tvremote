package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zsa extends zrx {
    private final zsd b;
    private final zrv c;
    private final byte[] d;
    private final byte[] e;

    public zsa(zsd zsdVar, zrv zrvVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.b = zsdVar;
        this.c = zrvVar;
        this.d = vxr.bd(bArr2);
        this.e = vxr.bd(bArr);
    }

    public static zsa a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof zsa) {
            return (zsa) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            zsd zsdVarA = zsd.a(dataInputStream2.readInt());
            zrv zrvVarA = zrv.a(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[zsdVarA.v];
            dataInputStream2.readFully(bArr2);
            return new zsa(zsdVarA, zrvVarA, bArr2, bArr);
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
            zsa zsaVarA = a(dataInputStream);
            dataInputStream.close();
            return zsaVarA;
        } catch (Throwable th2) {
            th = th2;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            throw th;
        }
    }

    final byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wef.T(this.b.u, byteArrayOutputStream);
        wef.T(this.c.q, byteArrayOutputStream);
        wef.R(this.d, byteArrayOutputStream);
        wef.R(this.e, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zsa zsaVar = (zsa) obj;
        if (this.b.equals(zsaVar.b) && this.c.equals(zsaVar.c) && Arrays.equals(this.d, zsaVar.d)) {
            return Arrays.equals(this.e, zsaVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + vxr.ba(this.d)) * 31) + vxr.ba(this.e);
    }

    @Override // defpackage.zrx, defpackage.zxn
    public final byte[] s() {
        return b();
    }
}
