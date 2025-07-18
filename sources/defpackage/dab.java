package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dab extends czr {
    public static dab v(byte[] bArr) throws IOException {
        czm czmVar = new czm(bArr);
        try {
            dab dabVarF = czmVar.f();
            if (czmVar.available() == 0) {
                return dabVarF;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract int a(boolean z);

    public abstract void c(czz czzVar, boolean z);

    public abstract boolean d(dab dabVar);

    public abstract boolean e();

    @Override // defpackage.czr
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czb) && d(((czb) obj).p());
    }

    @Override // defpackage.czr
    public final void t(OutputStream outputStream) {
        new dbj(outputStream).p(this);
    }

    public final boolean w(dab dabVar) {
        return this == dabVar || d(dabVar);
    }

    public dab k() {
        return this;
    }

    public dab l() {
        return this;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return this;
    }
}
