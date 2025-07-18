package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nqm extends mip implements nfj {
    public static final UpbMiniTable d;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$)4");
        d = upbMiniTableB;
        upbMiniTableB.e(nfa.a);
    }

    public nqm() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nfj
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.nfj
    public final int h() {
        boolean z = UpbUnsafe.a;
        int iA = nfb.a(Memory.peekInt(this.c + 16, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public nqm(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
