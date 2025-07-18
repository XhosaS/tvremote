package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfm extends mii {
    public nfm() {
        super(160982084, nfn.class, new mim() { // from class: nfk
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aeer aeerVar = new aeer();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeerVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nak(aeerVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nfl.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nqo(upbMessage);
        }
        int i = nqo.d;
        return nqn.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nqo.e;
    }
}
