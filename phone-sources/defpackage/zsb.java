package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zsb implements zxn {
    private final int a;
    private final zrw b;
    private final zsd c;
    private final byte[][] d;

    public zsb(int i, zrw zrwVar, zsd zsdVar, byte[][] bArr) {
        this.a = i;
        this.b = zrwVar;
        this.c = zsdVar;
        this.d = bArr;
    }

    public static zsb a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof zsb) {
            return (zsb) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            int i = dataInputStream2.readInt();
            zrw zrwVarA = zrw.a(obj);
            zsd zsdVarA = zsd.a(dataInputStream2.readInt());
            int i2 = zsdVarA.w;
            byte[][] bArr = new byte[i2][];
            for (int i3 = 0; i3 < i2; i3++) {
                byte[] bArr2 = new byte[zsdVarA.v];
                bArr[i3] = bArr2;
                dataInputStream2.readFully(bArr2);
            }
            return new zsb(i, zrwVarA, zsdVarA, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(vxr.aO((InputStream) obj));
            }
            throw new IllegalArgumentException("cannot parse ".concat(String.valueOf(String.valueOf(obj))));
        }
        try {
            dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                zsb zsbVarA = a(dataInputStream);
                dataInputStream.close();
                return zsbVarA;
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
        zsb zsbVar = (zsb) obj;
        if (this.a != zsbVar.a) {
            return false;
        }
        zrw zrwVar = this.b;
        if (zrwVar == null ? zsbVar.b != null : !zrwVar.equals(zsbVar.b)) {
            return false;
        }
        zsd zsdVar = this.c;
        if (zsdVar == null ? zsbVar.c == null : zsdVar.equals(zsbVar.c)) {
            return Arrays.deepEquals(this.d, zsbVar.d);
        }
        return false;
    }

    public final int hashCode() {
        zrw zrwVar = this.b;
        int iHashCode = zrwVar != null ? zrwVar.hashCode() : 0;
        int i = this.a;
        zsd zsdVar = this.c;
        return (((((i * 31) + iHashCode) * 31) + (zsdVar != null ? zsdVar.hashCode() : 0)) * 31) + Arrays.deepHashCode(this.d);
    }

    @Override // defpackage.zxn
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wef.T(this.a, byteArrayOutputStream);
        wef.R(this.b.s(), byteArrayOutputStream);
        wef.T(this.c.u, byteArrayOutputStream);
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
