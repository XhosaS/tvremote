package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zjh extends zix {
    public static zjh v(byte[] bArr) throws IOException {
        zis zisVar = new zis(bArr);
        try {
            zjh zjhVarF = zisVar.f();
            if (zisVar.available() == 0) {
                return zjhVarF;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract int a(boolean z);

    public abstract void c(zjf zjfVar, boolean z);

    public abstract boolean d(zjh zjhVar);

    public abstract boolean e();

    @Override // defpackage.zix
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zih) && d(((zih) obj).p());
    }

    @Override // defpackage.zix
    public final void t(OutputStream outputStream) {
        new zkp(outputStream).p(this);
    }

    public final boolean w(zjh zjhVar) {
        return this == zjhVar || d(zjhVar);
    }

    public zjh k() {
        return this;
    }

    public zjh l() {
        return this;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return this;
    }
}
