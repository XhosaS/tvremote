package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dil extends dio {
    public final int b;
    public final dir c;

    public dil(int i, dir dirVar) {
        super(false);
        if (dirVar == null) {
            throw new NullPointerException("lmsPublicKey");
        }
        this.b = i;
        this.c = dirVar;
    }

    public static dil a(Object obj) throws Throwable {
        DataInputStream dataInputStream;
        if (obj instanceof dil) {
            return (dil) obj;
        }
        if (obj instanceof DataInputStream) {
            return new dil(((DataInputStream) obj).readInt(), dir.a(obj));
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
            dil dilVarA = a(dataInputStream);
            dataInputStream.close();
            return dilVarA;
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
        dil dilVar = (dil) obj;
        if (this.b != dilVar.b) {
            return false;
        }
        return this.c.equals(dilVar.c);
    }

    public final int hashCode() {
        return (this.b * 31) + this.c.hashCode();
    }

    @Override // defpackage.dio, defpackage.dof
    public final byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        dnx.Q(this.b, byteArrayOutputStream);
        dnx.O(this.c.b(), byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
