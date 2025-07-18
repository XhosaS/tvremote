package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkl extends mii {
    public nkl() {
        super(336816453, nkm.class, new mim() { // from class: nkj
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aefg aefgVar = new aefg();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aefgVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbv(aefgVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nkk.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nuw(upbMessage);
        }
        int i = nuw.d;
        return nuv.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nuw.e;
    }
}
