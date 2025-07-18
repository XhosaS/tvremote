package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class aaah implements aaat {
    public final /* synthetic */ aaai a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ aaah(aaai aaaiVar, boolean z, int i) {
        this.c = i;
        this.a = aaaiVar;
        this.b = z;
    }

    @Override // defpackage.aaat
    public final void a() throws IOException {
        if (this.c != 0) {
            aaai aaaiVar = this.a;
            aabd aabdVar = aaaiVar.c;
            long length = aabdVar.getLength();
            aaaiVar.e = length;
            if (length == 0) {
                aaaiVar.f();
                return;
            }
            if (length <= 0 || length >= 8192) {
                aaaiVar.d = ByteBuffer.allocateDirect(8192);
            } else {
                aaaiVar.d = ByteBuffer.allocateDirect(((int) length) + 1);
            }
            long j = aaaiVar.e;
            if (j > 0) {
                aaaiVar.h.setFixedLengthStreamingMode(j);
            } else {
                aaaiVar.h.setChunkedStreamingMode(8192);
            }
            if (this.b) {
                aaaiVar.c();
                return;
            } else {
                aaaiVar.a.set(1);
                aabdVar.rewind(aaaiVar);
                return;
            }
        }
        aaai aaaiVar2 = this.a;
        long j2 = aaaiVar2.e;
        if (j2 != -1 && j2 - aaaiVar2.f < aaaiVar2.d.remaining()) {
            aaaiVar2.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(aaaiVar2.f + aaaiVar2.d.remaining()), Long.valueOf(aaaiVar2.e))));
            return;
        }
        boolean z = this.b;
        if (aaaiVar2.d.remaining() == 0 && !z) {
            aaaiVar2.g(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
            return;
        }
        long j3 = aaaiVar2.f;
        ByteBuffer byteBuffer = aaaiVar2.d;
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            iWrite += aaaiVar2.i.write(byteBuffer);
        }
        aaaiVar2.j.flush();
        long j4 = j3 + iWrite;
        aaaiVar2.f = j4;
        long j5 = aaaiVar2.e;
        if (j4 >= j5) {
            if (j5 == -1) {
                if (z) {
                    j5 = -1;
                }
            }
            if (j5 == -1) {
                aaaiVar2.f();
                return;
            } else if (j5 == j4) {
                aaaiVar2.f();
                return;
            } else {
                aaaiVar2.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(aaaiVar2.f), Long.valueOf(aaaiVar2.e))));
                return;
            }
        }
        aaaiVar2.a.set(0);
        aaaiVar2.b();
    }
}
