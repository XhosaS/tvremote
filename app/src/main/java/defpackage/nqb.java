package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nqb extends mip implements nfc {
    public static final UpbMiniTable d = UpbMiniTable.b("$!");

    public nqb() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nfc
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    public nqb(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
