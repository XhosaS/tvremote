package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nuo extends mip implements njw {
    public static final UpbMiniTable d;
    static final miv e;
    static final miv f;
    volatile String g;
    volatile byte[] h;
    volatile nue i;
    volatile nug j;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$103))3^!|#|$|(");
        d = upbMiniTableB;
        upbMiniTableB.e(nue.d, nug.d);
        e = upbMiniTableB.d(1);
        f = upbMiniTableB.d(2);
    }

    public nuo() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.njw
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.njw
    public final int h() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.njw
    public final /* bridge */ /* synthetic */ njo i() {
        if (!m()) {
            return null;
        }
        if (this.i != null) {
            return this.i;
        }
        nue nueVar = new nue(ap(24, nue.d));
        this.i = nueVar;
        return nueVar;
    }

    @Override // defpackage.njw
    public final /* bridge */ /* synthetic */ njr j() {
        if (this.j == null && !ay(20, 6)) {
            return null;
        }
        if (this.j != null) {
            return this.j;
        }
        nug nugVar = new nug(ap(24, nug.d));
        this.j = nugVar;
        return nugVar;
    }

    @Override // defpackage.njw
    public final String k() {
        if (!o()) {
            return null;
        }
        if (this.g == null) {
            this.g = aq(e.b);
        }
        return this.g;
    }

    @Override // defpackage.njw
    public final ByteBuffer l() {
        if (!n()) {
            return null;
        }
        if (this.h == null) {
            if (n()) {
                this.h = az(f.b);
            } else {
                this.h = "".getBytes(StandardCharsets.ISO_8859_1);
            }
        }
        return ByteBuffer.wrap(this.h).asReadOnlyBuffer();
    }

    @Override // defpackage.njw
    public final boolean m() {
        return this.i != null || ay(20, 3);
    }

    @Override // defpackage.njw
    public final boolean n() {
        return ay(20, 2);
    }

    @Override // defpackage.njw
    public final boolean o() {
        return ay(20, 1);
    }

    public nuo(UpbMessage upbMessage) {
        super(upbMessage);
    }

    @Override // defpackage.mip
    protected final void ax() {
    }
}
