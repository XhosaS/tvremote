package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nuz extends mip implements nkp {
    public static final UpbMiniTable d;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$!4");
        d = upbMiniTableB;
        upbMiniTableB.e(nkn.a);
    }

    public nuz() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nkp
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nkp
    public final int h() {
        boolean z = UpbUnsafe.a;
        int iA = nko.a(Memory.peekInt(this.c + 16, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public nuz(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
