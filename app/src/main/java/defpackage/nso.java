package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nso extends mip implements nhn {
    public static final UpbMiniTable d;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$!4");
        d = upbMiniTableB;
        upbMiniTableB.e(nho.a);
    }

    public nso() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nhn
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nhn
    public final boolean h() {
        return aw(8, 2);
    }

    @Override // defpackage.nhn
    public final boolean i() {
        return aw(8, 1);
    }

    @Override // defpackage.nhn
    public final int j() {
        boolean z = UpbUnsafe.a;
        int iA = nhp.a(Memory.peekInt(this.c + 16, false));
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public nso(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
