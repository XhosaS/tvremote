package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nty extends mip implements njj {
    public static final UpbMiniTable e;

    static {
        UpbMiniTable upbMiniTableB = UpbMiniTable.b("$)))!!!!!3");
        e = upbMiniTableB;
        upbMiniTableB.e(ntw.d);
    }

    public nty() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.njj
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 24, false));
    }

    @Override // defpackage.njj
    public final float h() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 40, false));
    }

    @Override // defpackage.njj
    public final float i() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 28, false));
    }

    @Override // defpackage.njj
    public final float j() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 32, false));
    }

    @Override // defpackage.njj
    public final float k() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 36, false));
    }

    @Override // defpackage.njj
    public final int l() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 20, false);
    }

    @Override // defpackage.njj
    public final int m() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.njj
    public final int n() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    public nty(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
