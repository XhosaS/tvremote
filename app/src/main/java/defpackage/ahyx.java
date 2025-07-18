package defpackage;

import android.net.http.BidirectionalStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ahyx extends ExperimentalBidirectionalStream {
    private final BidirectionalStream a;
    private final ahzd b;
    private final String c;
    private final Collection d;

    public ahyx(BidirectionalStream bidirectionalStream, ahzd ahzdVar, String str, Collection collection) {
        this.a = bidirectionalStream;
        this.b = ahzdVar;
        this.c = str;
        this.d = collection;
    }

    final void a(int i, ahzq ahzqVar, CronetException cronetException) {
        ahzh.a(this.b, this.c, this.d, null, i, ahzqVar, cronetException);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        this.a.flush();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        this.a.start();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        this.a.write(byteBuffer, z);
    }
}
