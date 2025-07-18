package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nwi extends mip implements nmi {
    public static final UpbMiniTable d = UpbMiniTable.b("$!!");

    public nwi() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nmi
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }

    @Override // defpackage.nmi
    public final float h() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nmi
    public final boolean i() {
        return aw(8, 2);
    }

    @Override // defpackage.nmi
    public final boolean j() {
        return aw(8, 1);
    }

    public nwi(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
