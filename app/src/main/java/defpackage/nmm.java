package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmm extends mii {
    public nmm() {
        super(168774549, nmn.class, new mim() { // from class: nmk
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aegx aegxVar = new aegx();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aegxVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nck(aegxVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nml.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nwm(upbMessage);
        }
        int i = nwm.d;
        return nwl.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nwm.e;
    }
}
