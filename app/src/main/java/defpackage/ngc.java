package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngc extends mii {
    public ngc() {
        super(158796298, ngd.class, new mim() { // from class: nga
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aeew aeewVar = new aeew();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeewVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nap(aeewVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return ngb.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nrb(upbMessage);
        }
        int i = nrb.d;
        return nra.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nrb.e;
    }
}
