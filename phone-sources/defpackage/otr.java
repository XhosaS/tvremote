package defpackage;

import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class otr implements hln {
    @Override // defpackage.hln
    public final /* bridge */ /* synthetic */ hnv a(Object obj, int i, int i2, hll hllVar) throws IOException {
        Picture pictureB;
        float fG;
        InputStream inputStream = (InputStream) obj;
        try {
            int i3 = hzg.e;
            hzg hzgVarB = new iaa().b(inputStream);
            if (i != Integer.MIN_VALUE) {
                hyh hyhVar = hzgVarB.a;
                if (hyhVar == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                hyhVar.c = new hxr(i);
            }
            if (i2 != Integer.MIN_VALUE) {
                hyh hyhVar2 = hzgVarB.a;
                if (hyhVar2 == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                hyhVar2.d = new hxr(i2);
            }
            hyh hyhVar3 = hzgVarB.a;
            hxr hxrVar = hyhVar3.c;
            if (hxrVar != null) {
                float f = hzgVarB.b;
                float fG2 = hxrVar.g();
                hxf hxfVar = hyhVar3.w;
                if (hxfVar != null) {
                    fG = (hxfVar.d * fG2) / hxfVar.c;
                } else {
                    hxr hxrVar2 = hyhVar3.d;
                    fG = hxrVar2 != null ? hxrVar2.g() : fG2;
                }
                pictureB = hzgVarB.b((int) Math.ceil(fG2), (int) Math.ceil(fG));
            } else {
                pictureB = hzgVarB.b(512, 512);
            }
            return new hsz(new PictureDrawable(pictureB), 3);
        } catch (hzs e) {
            throw new IOException("Unable to decode SVG from stream.", e);
        }
    }

    @Override // defpackage.hln
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hll hllVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = new byte[256];
        int i = 0;
        while (i < 256) {
            int i2 = inputStream.read(bArr, i, 256 - i);
            if (i2 == -1) {
                break;
            }
            i += i2;
        }
        String lowerCase = new String(bArr, 0, i, StandardCharsets.UTF_8).toLowerCase(Locale.getDefault());
        return (i >= 4 && lowerCase.contains("<svg")) || (i >= 5 && lowerCase.contains(" svg "));
    }
}
