package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfx extends mii {
    public nfx() {
        super(444964488, nfy.class, new mim() { // from class: nfv
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aeev aeevVar = new aeev();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeevVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nan(aeevVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nfw.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nqw(upbMessage);
        }
        int i = nqw.d;
        return nqv.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nqw.e;
    }
}
