package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ntl extends mip implements niw {
    public static final UpbMiniTable d = UpbMiniTable.b("$//))!/");

    public ntl() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.niw
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 20, false));
    }

    @Override // defpackage.niw
    public final int h() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.niw
    public final int i() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    @Override // defpackage.niw
    public final boolean j() {
        return av(this.c, 9);
    }

    @Override // defpackage.niw
    public final boolean k() {
        return av(this.c, 11);
    }

    @Override // defpackage.niw
    public final boolean l() {
        return av(this.c, 10);
    }

    @Override // defpackage.niw
    public final boolean m() {
        return aw(8, 8);
    }

    @Override // defpackage.niw
    public final boolean n() {
        return aw(8, 16);
    }

    @Override // defpackage.niw
    public final boolean o() {
        return aw(8, 4);
    }

    public ntl(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
