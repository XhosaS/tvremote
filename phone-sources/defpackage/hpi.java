package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hpi implements hpg {
    private final /* synthetic */ int a;

    public hpi(int i) {
        this.a = i;
    }

    @Override // defpackage.hpg
    public final Class a() {
        return this.a != 0 ? ByteBuffer.class : InputStream.class;
    }

    @Override // defpackage.hpg
    public final /* synthetic */ Object b(byte[] bArr) {
        return this.a != 0 ? ByteBuffer.wrap(bArr) : new ByteArrayInputStream(bArr);
    }
}
