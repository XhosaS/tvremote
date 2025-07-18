package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkt extends mii {
    public nkt() {
        super(322066057, nku.class, new mim() { // from class: nkr
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aegg aeggVar = new aegg();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aeggVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new nby(aeggVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nks.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nvf(upbMessage);
        }
        int i = nvf.d;
        return nve.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nvf.e;
    }
}
