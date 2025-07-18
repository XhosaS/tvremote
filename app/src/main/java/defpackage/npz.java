package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class npz extends mip implements nez {
    public static final UpbMiniTable e = UpbMiniTable.b("$))");

    public npz() {
        super(UpbMessage.a(e));
    }

    @Override // defpackage.nez
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.nez
    public final int h() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    public npz(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
