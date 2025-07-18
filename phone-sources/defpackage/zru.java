package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zru extends zrx {
    public final int b;
    public final zsa c;

    public zru(int i, zsa zsaVar) {
        super(false);
        if (zsaVar == null) {
            throw new NullPointerException("lmsPublicKey");
        }
        this.b = i;
        this.c = zsaVar;
    }

    public static zru a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof zru) {
            return (zru) obj;
        }
        if (obj instanceof DataInputStream) {
            return new zru(((DataInputStream) obj).readInt(), zsa.a(obj));
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
            zru zruVarA = a(dataInputStream);
            dataInputStream.close();
            return zruVarA;
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
        zru zruVar = (zru) obj;
        if (this.b != zruVar.b) {
            return false;
        }
        return this.c.equals(zruVar.c);
    }

    public final int hashCode() {
        return (this.b * 31) + this.c.hashCode();
    }

    @Override // defpackage.zrx, defpackage.zxn
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wef.T(this.b, byteArrayOutputStream);
        wef.R(this.c.b(), byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
