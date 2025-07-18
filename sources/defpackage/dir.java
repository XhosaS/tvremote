package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dir extends dio {
    private final diu b;
    private final dim c;
    private final byte[] d;
    private final byte[] e;

    public dir(diu diuVar, dim dimVar, byte[] bArr, byte[] bArr2) {
        super(false);
        this.b = diuVar;
        this.c = dimVar;
        this.d = dos.p(bArr2);
        this.e = dos.p(bArr);
    }

    public static dir a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof dir) {
            return (dir) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            diu diuVarA = diu.a(dataInputStream2.readInt());
            dim dimVarA = dim.a(dataInputStream2.readInt());
            byte[] bArr = new byte[16];
            dataInputStream2.readFully(bArr);
            byte[] bArr2 = new byte[diuVarA.v];
            dataInputStream2.readFully(bArr2);
            return new dir(diuVarA, dimVarA, bArr2, bArr);
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
            dir dirVarA = a(dataInputStream);
            dataInputStream.close();
            return dirVarA;
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
        dnx.Q(this.b.u, byteArrayOutputStream);
        dnx.Q(this.c.q, byteArrayOutputStream);
        dnx.O(this.d, byteArrayOutputStream);
        dnx.O(this.e, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dir dirVar = (dir) obj;
        if (this.b.equals(dirVar.b) && this.c.equals(dirVar.c) && Arrays.equals(this.d, dirVar.d)) {
            return Arrays.equals(this.e, dirVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + dos.m(this.d)) * 31) + dos.m(this.e);
    }

    @Override // defpackage.dio, defpackage.dof
    public final byte[] s() {
        return b();
    }
}
