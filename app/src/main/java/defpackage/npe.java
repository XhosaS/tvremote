package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class npe extends mip implements ndx {
    public static final UpbMiniTable d;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$!4");
        d = upbMiniTableB;
        upbMiniTableB.e(ndy.a);
    }

    public npe() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ndx
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.ndx
    public final int h() {
        boolean z = UpbUnsafe.a;
        int iA = ndz.a(Memory.peekInt(this.c + 16, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public npe(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
