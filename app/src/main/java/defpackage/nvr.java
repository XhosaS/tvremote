package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.adl.UpbUnsafe;
import libcore.io.Memory;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nvr extends mip implements nlp {
    public static final UpbMiniTable d = UpbMiniTable.b("$!!");

    public nvr() {
        super(UpbMessage.a(d));
    }

    @Override // defpackage.nlp
    public final float g() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 12, false));
    }

    @Override // defpackage.nlp
    public final float h() {
        boolean z = UpbUnsafe.a;
        return Float.intBitsToFloat(Memory.peekInt(this.c + 16, false));
    }

    @Override // defpackage.nlp
    public final boolean i() {
        return aw(8, 1);
    }

    @Override // defpackage.nlp
    public final boolean j() {
        return aw(8, 2);
    }

    public nvr(UpbMessage upbMessage) {
        super(upbMessage);
    }
}
