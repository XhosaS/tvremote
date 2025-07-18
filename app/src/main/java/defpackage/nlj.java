package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nlj extends mii {
    public nlj() {
        super(168772996, nlk.class, new mim() { // from class: nlh
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aegh aeghVar = new aegh();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeghVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nca(aeghVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nli.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nvm(upbMessage);
        }
        int i = nvm.d;
        return nvl.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nvm.e;
    }
}
