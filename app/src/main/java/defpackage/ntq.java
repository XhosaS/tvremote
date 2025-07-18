package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ntq extends mip implements njb {
    public static final UpbMiniTable e = UpbMiniTable.b("$!!");

    public ntq() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.njb
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.njb
    public final float h() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }

    public ntq(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
