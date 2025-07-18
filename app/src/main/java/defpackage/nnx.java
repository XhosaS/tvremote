package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nnx extends mip implements nda {
    public static final UpbMiniTable d = UpbMiniTable.b("$((");

    public nnx() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nda
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.nda
    public final int h() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    public nnx(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
