package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nqp extends mip implements nfn {
    public static final UpbMiniTable e = UpbMiniTable.b("$a)");

    public nqp() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nfn
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    public nqp(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
