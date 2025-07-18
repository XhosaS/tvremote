package androidx.media3.decoder;

import defpackage.a;
import defpackage.ehl;
import defpackage.ehm;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SimpleDecoderOutputBuffer extends ehm {
    public ByteBuffer data;
    private final ehl<SimpleDecoderOutputBuffer> owner;

    public SimpleDecoderOutputBuffer(ehl<SimpleDecoderOutputBuffer> ehlVar) {
        this.owner = ehlVar;
    }

    @Override // defpackage.ehm, defpackage.ehe
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer grow(int i) {
        ByteBuffer byteBuffer = this.data;
        byteBuffer.getClass();
        a.H(i >= byteBuffer.limit());
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(iPosition);
        byteBufferOrder.limit(i);
        this.data = byteBufferOrder;
        return byteBufferOrder;
    }

    public ByteBuffer init(long j, int i) {
        this.timeUs = j;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i);
        return this.data;
    }

    @Override // defpackage.ehm
    public void release() {
        this.owner.a(this);
    }
}
