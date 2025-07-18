package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esk extends ehk {
    public long g;
    public int h;
    private int i;

    public esk() {
        super(2);
        this.i = 32;
    }

    @Override // defpackage.ehk, defpackage.ehe
    public final void clear() {
        super.clear();
        this.h = 0;
    }

    public final void d(int i) {
        a.H(true);
        this.i = i;
    }

    public final boolean e(ehk ehkVar) {
        ByteBuffer byteBuffer;
        a.H(!ehkVar.c());
        a.H(!ehkVar.hasSupplementalData());
        a.H(!ehkVar.isEndOfStream());
        if (f()) {
            if (this.h >= this.i) {
                return false;
            }
            ByteBuffer byteBuffer2 = ehkVar.c;
            if (byteBuffer2 != null && (byteBuffer = this.c) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.h;
        this.h = i + 1;
        if (i == 0) {
            this.e = ehkVar.e;
            if (ehkVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = ehkVar.c;
        if (byteBuffer3 != null) {
            a(byteBuffer3.remaining());
            this.c.put(byteBuffer3);
        }
        this.g = ehkVar.e;
        return true;
    }

    public final boolean f() {
        return this.h > 0;
    }
}
