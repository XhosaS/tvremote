package defpackage;

import com.google.android.libraries.elements.interfaces.PbToFb;
import com.youtube.android.libraries.elements.StatusOr;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogj implements oap {
    public static final ogj a = new ogj();

    private ogj() {
    }

    @Override // defpackage.oap
    public final ndo a(ndo ndoVar) {
        aart aartVar = new aart(1024);
        aartVar.u(ogr.l(aartVar, aartVar.c("…"), ndoVar.g(), ndoVar.E() - 1, ndoVar.C() - 1, ogr.c(aartVar, ndoVar), ogr.k(aartVar, ndoVar), ogr.j(aartVar, ndoVar), ogr.a(aartVar, ndoVar), ndoVar.t(), ndoVar.F() - 1, ogr.d(aartVar, ndoVar), ndoVar.y() ? ogr.i(aartVar, ndoVar.p()) : 0));
        aartVar.k();
        return new mzr(aeen.l(aartVar.a));
    }

    @Override // defpackage.oap
    public final nid b(byte[] bArr) throws IOException {
        aefm aefmVar = new aefm();
        AtomicBoolean atomicBoolean = aeeg.a;
        StatusOr statusOrConvert = PbToFb.convert(ByteBuffer.wrap(bArr), aeeg.a.get());
        if (!statusOrConvert.hasValue) {
            throw new IllegalStateException("status: ".concat(String.valueOf(String.valueOf(statusOrConvert.status))));
        }
        aefm.n(ByteBuffer.wrap((byte[]) statusOrConvert.value), aefmVar);
        int iValue = statusOrConvert.status.getCode().value();
        if (iValue == 0) {
            return new nbd(aefmVar);
        }
        throw new IOException(a.b(iValue, "PbToFb failed: "));
    }
}
