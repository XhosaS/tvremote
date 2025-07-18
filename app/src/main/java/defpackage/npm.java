package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class npm extends mip implements nel {
    public static final UpbMiniTable d;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$4))");
        d = upbMiniTableB;
        upbMiniTableB.e(nej.a);
    }

    public npm() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nel
    public final int g() {
        boolean z = UpbUnsafe.a;
        int iA = nek.a(Memory.peekInt(this.c + 12, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public npm(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
