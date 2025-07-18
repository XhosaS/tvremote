package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class din implements dof {
    private final dim a;
    private final byte[] b;
    private final byte[] c;

    public din(dim dimVar, byte[] bArr, byte[] bArr2) {
        this.a = dimVar;
        this.b = bArr;
        this.c = bArr2;
    }

    public static din a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof din) {
            return (din) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            dim dimVarA = dim.a(dataInputStream2.readInt());
            int i = dimVarA.r;
            byte[] bArr = new byte[i];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[dimVarA.t * i];
            dataInputStream2.readFully(bArr2);
            return new din(dimVarA, bArr, bArr2);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(dos.a((InputStream) obj));
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
            din dinVarA = a(dataInputStream);
            dataInputStream.close();
            return dinVarA;
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
        din dinVar = (din) obj;
        dim dimVar = this.a;
        if (dimVar == null ? dinVar.a != null : !dimVar.equals(dinVar.a)) {
            return false;
        }
        if (Arrays.equals(this.b, dinVar.b)) {
            return Arrays.equals(this.c, dinVar.c);
        }
        return false;
    }

    public final int hashCode() {
        dim dimVar = this.a;
        return ((((dimVar != null ? dimVar.hashCode() : 0) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    @Override // defpackage.dof
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dnx.Q(this.a.q, byteArrayOutputStream);
        dnx.O(this.b, byteArrayOutputStream);
        dnx.O(this.c, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
