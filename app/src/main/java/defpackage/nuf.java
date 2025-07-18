package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nuf extends mip implements njo {
    public static final UpbMiniTable d;
    static final miv e;
    volatile String f;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$11)");
        d = upbMiniTableB;
        upbMiniTableB.d(1);
        e = upbMiniTableB.d(2);
    }

    public nuf() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.njo
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.njo
    public final String h() {
        if (!i()) {
            return null;
        }
        if (this.f == null) {
            this.f = aq(e.b);
        }
        return this.f;
    }

    @Override // defpackage.njo
    public final boolean i() {
        return aw(8, 2);
    }

    public nuf(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
