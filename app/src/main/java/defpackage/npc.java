package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class npc extends mip implements ndw {
    public static final UpbMiniTable d = UpbMiniTable.b("$))");

    public npc() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.ndw
    public final int g() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 16, false);
    }

    @Override // defpackage.ndw
    public final int h() {
        boolean z = UpbUnsafe.a;
        return Memory.peekInt(this.c + 12, false);
    }

    public npc(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
