package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dis implements dof {
    private final int a;
    private final din b;
    private final diu c;
    private final byte[][] d;

    public dis(int i, din dinVar, diu diuVar, byte[][] bArr) {
        this.a = i;
        this.b = dinVar;
        this.c = diuVar;
        this.d = bArr;
    }

    public static dis a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof dis) {
            return (dis) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int i = dataInputStream2.readInt();
            din dinVarA = din.a(obj);
            diu diuVarA = diu.a(dataInputStream2.readInt());
            int i2 = diuVarA.w;
            byte[][] bArr = new byte[i2][];
            for (int i3 = 0; i3 < i2; i3++) {
                byte[] bArr2 = new byte[diuVarA.v];
                bArr[i3] = bArr2;
                dataInputStream2.readFully(bArr2);
            }
            return new dis(i, dinVarA, diuVarA, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(dos.a((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
        }
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                dis disVarA = a(dataInputStream);
                dataInputStream.close();
                return disVarA;
            } catch (Throwable th) {
                th = th;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dis disVar = (dis) obj;
        if (this.a != disVar.a) {
            return false;
        }
        din dinVar = this.b;
        if (dinVar == null ? disVar.b != null : !dinVar.equals(disVar.b)) {
            return false;
        }
        diu diuVar = this.c;
        if (diuVar == null ? disVar.c == null : diuVar.equals(disVar.c)) {
            return Arrays.deepEquals(this.d, disVar.d);
        }
        return false;
    }

    public final int hashCode() {
        din dinVar = this.b;
        int iHashCode = dinVar != null ? dinVar.hashCode() : 0;
        int i = this.a;
        diu diuVar = this.c;
        return (((((i * 31) + iHashCode) * 31) + (diuVar != null ? diuVar.hashCode() : 0)) * 31) + Arrays.deepHashCode(this.d);
    }

    @Override // defpackage.dof
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dnx.Q(this.a, byteArrayOutputStream);
        dnx.O(this.b.s(), byteArrayOutputStream);
        dnx.Q(this.c.u, byteArrayOutputStream);
        try {
            for (byte[] bArr : this.d) {
                byteArrayOutputStream.write(bArr);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
