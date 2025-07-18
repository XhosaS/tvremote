package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nij extends mii {
    public nij() {
        super(212323971, nik.class, new mim() { // from class: nih
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aefo aefoVar = new aefo();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aefoVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nbe(aefoVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nii.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nsy(upbMessage);
        }
        int i = nsy.d;
        return nsx.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nsy.e;
    }
}
