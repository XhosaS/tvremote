package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zix implements zih, zxn {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zih) {
            return p().w(((zih) obj).p());
        }
        return false;
    }

    public int hashCode() {
        return p().hashCode();
    }

    @Override // defpackage.zih
    public abstract zjh p();

    @Override // defpackage.zxn
    public byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        p().c(new zjf(byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    public void t(OutputStream outputStream) {
        p().t(outputStream);
    }

    public final byte[] u() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        p().t(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
