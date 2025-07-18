package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.common.collect.Lists;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lda implements xcm {
    private final xcq a;

    public lda(xcq xcqVar) {
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uir b() throws IOException {
        uir uirVar;
        String string = ((SharedPreferences) this.a.b()).getString("phenotype_experiment_token_key", "");
        if (string.isEmpty()) {
            uirVar = uir.a;
        } else {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(string, 0)));
            try {
                int i = dataInputStream.readInt();
                if (i != 1 && i != 2 && i != 3) {
                    throw new RuntimeException(a.cf(i, "Unexpected version "));
                }
                String utf = dataInputStream.readUTF();
                byte[] bArrD = oly.d(dataInputStream);
                byte[][] bArrH = oly.h(dataInputStream);
                byte[][] bArrH2 = oly.h(dataInputStream);
                byte[][] bArrH3 = oly.h(dataInputStream);
                byte[][] bArrH4 = oly.h(dataInputStream);
                int[] iArrE = oly.e(dataInputStream);
                int i2 = dataInputStream.readInt();
                oly olyVar = new oly(utf, bArrD, bArrH, bArrH2, bArrH3, bArrH4, iArrE, i2 == 0 ? null : oly.g(dataInputStream, i2), i >= 2 ? oly.e(dataInputStream) : null, i >= 3 ? oly.h(dataInputStream) : null);
                int[] iArr = new int[0];
                vtw vtwVarM = uir.a.m();
                int[] iArr2 = olyVar.h;
                if (!npj.u(iArr2) || !npj.u(iArr)) {
                    vtw vtwVarM2 = uiq.a.m();
                    if (iArr2 != null) {
                        for (int i3 : iArr2) {
                            vtwVarM2.ap(i3);
                        }
                    }
                    vsz vszVarE = ((uiq) vtwVarM2.r()).e();
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    uir uirVar2 = (uir) vtwVarM.b;
                    uirVar2.b |= 1;
                    uirVar2.c = vszVarE;
                }
                byte[] bArr = olyVar.c;
                if (bArr != null && bArr.length != 0) {
                    vtwVarM.aq(vsz.q(bArr));
                }
                byte[][] bArr2 = olyVar.i;
                if (bArr2 != null) {
                    for (byte[] bArr3 : bArr2) {
                        if (bArr3 != null && bArr3.length != 0) {
                            vtwVarM.aq(vsz.q(bArr3));
                        }
                    }
                }
                byte[][] bArr4 = olyVar.k;
                if (bArr4 != null) {
                    for (byte[] bArr5 : bArr4) {
                        if (bArr5 != null && bArr5.length != 0) {
                            vtwVarM.aq(vsz.q(bArr5));
                        }
                    }
                }
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                uir uirVar3 = (uir) vtwVarM.b;
                uirVar3.b |= 4;
                uirVar3.e = true;
                byte[][][] bArr6 = {olyVar.d, olyVar.e, olyVar.f, olyVar.g};
                for (int i4 = 0; i4 < 4; i4++) {
                    byte[][] bArr7 = bArr6[i4];
                    if (bArr7 != null) {
                        List listTransform = Lists.transform(Arrays.asList(bArr7), vws.a.reverse());
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        uir uirVar4 = (uir) vtwVarM.b;
                        uirVar4.b();
                        vsf.h(listTransform, uirVar4.d);
                    }
                }
                uirVar = (uir) vtwVarM.r();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        uirVar.getClass();
        return uirVar;
    }
}
