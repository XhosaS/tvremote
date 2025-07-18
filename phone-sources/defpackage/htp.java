package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htp implements hln {
    private final List a;
    private final hln b;
    private final hok c;

    public htp(List list, hln hlnVar, hok hokVar) {
        this.a = list;
        this.b = hlnVar;
        this.c = hokVar;
    }

    @Override // defpackage.hln
    public final /* bridge */ /* synthetic */ hnv a(Object obj, int i, int i2, hll hllVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(byteArray), i, i2, hllVar);
    }

    @Override // defpackage.hln
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hll hllVar) {
        return !((Boolean) hllVar.b(hto.b)).booleanValue() && hju.f(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }
}
