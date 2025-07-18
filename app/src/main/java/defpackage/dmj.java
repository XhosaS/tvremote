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
public class dmj implements dap {
    private final List a;
    private final dap b;
    private final ddx c;

    public dmj(List list, dap dapVar, ddx ddxVar) {
        this.a = list;
        this.b = dapVar;
        this.c = ddxVar;
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ ddp a(Object obj, int i, int i2, dan danVar) throws IOException {
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
        return ((dlw) this.b).a(ByteBuffer.wrap(byteArray), i, i2, danVar);
    }

    @Override // defpackage.dap
    public final /* bridge */ /* synthetic */ boolean b(Object obj, dan danVar) {
        return !((Boolean) danVar.b(dmi.b)).booleanValue() && dai.d(this.a, (InputStream) obj, this.c) == ImageHeaderParser$ImageType.GIF;
    }
}
