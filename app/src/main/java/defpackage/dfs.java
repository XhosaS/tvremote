package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
class dfs implements dfq {
    @Override // defpackage.dfq
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.dfq
    public final /* synthetic */ Object b(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }
}
