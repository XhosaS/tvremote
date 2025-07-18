package defpackage;

import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhe extends mii {
    public nhe() {
        super(484616221, nhf.class, new mim() { // from class: nhc
            @Override // defpackage.mim
            public final mil a(ByteBuffer byteBuffer) {
                aegv aegvVar = new aegv();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                aegvVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
                return new naw(aegvVar);
            }
        });
    }

    @Override // defpackage.mii
    public final long a() {
        return nhd.a;
    }

    @Override // defpackage.mii
    public final /* bridge */ /* synthetic */ mil c(UpbMessage upbMessage) {
        if (upbMessage != null) {
            return new nsa(upbMessage);
        }
        int i = nsa.d;
        return nrz.a;
    }

    @Override // defpackage.mii
    public final UpbMiniTable d() {
        return nsa.e;
    }
}
