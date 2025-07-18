package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ntt extends mip implements njf {
    public static final UpbMiniTable e = UpbMiniTable.b("$(");

    public ntt() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.njf
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    public ntt(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
