package defpackage;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.ext.vp9.VpxDecoder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nef implements ehl {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nef(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ehl
    public final void a(ehm ehmVar) {
        int i = this.b;
        if (i == 0) {
            ((eho) this.a).o((SimpleDecoderOutputBuffer) ehmVar);
        } else if (i != 1) {
            ((VpxDecoder) this.a).s((VideoDecoderOutputBuffer) ehmVar);
        } else {
            fju fjuVar = (fju) ehmVar;
            fjuVar.clear();
            ((fjv) this.a).b.add(fjuVar);
        }
    }
}
