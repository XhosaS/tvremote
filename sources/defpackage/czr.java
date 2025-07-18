package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class czr implements czb, dof {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof czb) {
            return p().w(((czb) obj).p());
        }
        return false;
    }

    public int hashCode() {
        return p().hashCode();
    }

    @Override // defpackage.czb
    public abstract dab p();

    @Override // defpackage.dof
    public byte[] s() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        p().c(new czz(byteArrayOutputStream), true);
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
