package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nsb extends mip implements nhf {
    public static final UpbMiniTable e;
    static final miv f;
    static final miv g;
    static final miv h;
    volatile byte[] i;
    volatile byte[] j;
    ArrayList k;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$+00/<1a/");
        e = upbMiniTableB;
        f = upbMiniTableB.d(2);
        g = upbMiniTableB.d(3);
        h = upbMiniTableB.d(6);
    }

    public nsb() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nhf
    public final int g(int i) {
        r();
        return ((Integer) this.k.get(i)).intValue();
    }

    @Override // defpackage.nhf
    public final int h() {
        r();
        return this.k.size();
    }

    @Override // defpackage.nhf
    public final long i() {
        long j = true != a ? 40L : 64L;
        boolean z = UpbUnsafe.a;
        return Memory.peekLong(this.c + j, false);
    }

    @Override // defpackage.nhf
    public final ByteBuffer j() {
        if (!s()) {
            return null;
        }
        if (this.j == null) {
            if (s()) {
                this.j = az(g.b);
            } else {
                this.j = "".getBytes(StandardCharsets.ISO_8859_1);
            }
        }
        return ByteBuffer.wrap(this.j).asReadOnlyBuffer();
    }

    @Override // defpackage.nhf
    public final ByteBuffer k() {
        if (!t()) {
            return null;
        }
        if (this.i == null) {
            if (t()) {
                this.i = az(f.b);
            } else {
                this.i = "".getBytes(StandardCharsets.ISO_8859_1);
            }
        }
        return ByteBuffer.wrap(this.i).asReadOnlyBuffer();
    }

    @Override // defpackage.nhf
    public final boolean l() {
        return av(this.c, 9);
    }

    @Override // defpackage.nhf
    public final void m() {
        av(this.c, 10);
    }

    final void r() {
        if (this.k == null) {
            this.k = as(true != a ? 12 : 72);
        }
    }

    public final boolean s() {
        return aw(8, 4);
    }

    public final boolean t() {
        return aw(8, 2);
    }

    public nsb(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
