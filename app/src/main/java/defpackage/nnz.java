package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nnz extends mip implements ndb {
    public static final UpbMiniTable d = UpbMiniTable.b("$!!");

    public nnz() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ndb
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }

    @Override // defpackage.ndb
    public final float h() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    public nnz(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
