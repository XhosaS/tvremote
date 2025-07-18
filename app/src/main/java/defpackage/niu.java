package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class niu extends mii {
    public niu() {
        super(386544496, niv.class, new mim() { // from class: nis
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aefq aefqVar = new aefq();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aefqVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbh(aefqVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nit.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nti(upbMessage);
        }
        int i = nti.d;
        return nth.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nti.e;
    }
}
