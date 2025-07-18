package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkh extends mii {
    public nkh() {
        super(334827261, nki.class, new mim() { // from class: nkf
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aeey aeeyVar = new aeey();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeeyVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbu(aeeyVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nkg.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nut(upbMessage);
        }
        int i = nut.d;
        return nus.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nut.e;
    }
}
