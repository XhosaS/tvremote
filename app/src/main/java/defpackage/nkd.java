package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkd extends mii {
    public nkd() {
        super(158796345, nke.class, new mim() { // from class: nkb
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aege aegeVar = new aege();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aegeVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbt(aegeVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nkc.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nuq(upbMessage);
        }
        int i = nuq.d;
        return nup.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nuq.e;
    }
}
