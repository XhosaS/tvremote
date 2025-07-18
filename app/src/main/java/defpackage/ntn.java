package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ntn extends mip implements nix {
    public static final UpbMiniTable d = UpbMiniTable.b("$!!!");

    public ntn() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nix
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 20, false));
    }

    @Override // defpackage.nix
    public final float h() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nix
    public final float i() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }

    @Override // defpackage.nix
    public final boolean j() {
        return aw(8, 4);
    }

    @Override // defpackage.nix
    public final boolean k() {
        return aw(8, 1);
    }

    @Override // defpackage.nix
    public final boolean l() {
        return aw(8, 2);
    }

    public ntn(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
