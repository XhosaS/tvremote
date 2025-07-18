package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqr implements hqg {
    public static final hqr a = new hqr(1, null);
    private final /* synthetic */ int b;

    public hqr(int i) {
        this.b = i;
    }

    @Override // defpackage.hqg
    public final hqf b(hqk hqkVar) {
        int i = this.b;
        return i != 0 ? i != 1 ? new hpv(hqkVar.a(hpw.class, InputStream.class), 6) : hqj.a : new hqs(hqkVar.a(hpw.class, InputStream.class));
    }

    @Deprecated
    public hqr(int i, byte[] bArr) {
        this.b = i;
    }
}
