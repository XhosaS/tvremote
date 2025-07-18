package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsy implements hlw {
    private final ByteBuffer a;

    public hsy(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.hlw
    public final /* bridge */ /* synthetic */ Object a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.hlw
    public final void b() {
    }
}
