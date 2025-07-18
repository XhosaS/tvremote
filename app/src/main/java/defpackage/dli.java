package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dli implements day {
    private final ByteBuffer a;

    public dli(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.day
    public final /* bridge */ /* synthetic */ Object a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // defpackage.day
    public final void b() {
    }
}
