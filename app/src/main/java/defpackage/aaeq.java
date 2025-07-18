package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaeq implements zzy {
    public final zzy a;
    private final List b;

    public aaeq(List list, zzy zzyVar) {
        this.b = list;
        this.a = zzyVar;
    }

    @Override // defpackage.zzy
    public final InputStream a(InputStream inputStream, byte[] bArr) {
        return new aaec(this.b, inputStream, bArr);
    }

    @Override // defpackage.zzy
    public final OutputStream b(OutputStream outputStream, byte[] bArr) {
        throw null;
    }
}
