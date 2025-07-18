package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nwd extends mip implements nlx {
    public static final UpbMiniTable d;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$4+");
        d = upbMiniTableB;
        upbMiniTableB.e(nly.a);
    }

    public nwd() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nlx
    public final long g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekLong(this.c + 16, false);
    }

    @Override // defpackage.nlx
    public final int h() {
        boolean z = UpbUnsafe.a;
        int iA = nlz.a(Memory.peekInt(this.c + 12, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public nwd(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
