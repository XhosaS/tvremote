package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrd implements hlo {
    public static final hlk a = new hlk("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90, hlk.a);
    public static final hlk b = new hlk("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, hlk.a);
    private final hok c;

    @Deprecated
    public hrd() {
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.hkw
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, hll hllVar) throws Throwable {
        boolean z = (Bitmap) ((hnv) obj).c();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hllVar.b(b);
        if (compressFormat == null) {
            compressFormat = z.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        z.getWidth();
        z.getHeight();
        double d = hwk.a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) hllVar.b(a)).intValue();
        OutputStream hlsVar = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    hok hokVar = this.c;
                    hlsVar = hokVar != null ? new hls(fileOutputStream, hokVar) : fileOutputStream;
                    z.compress(compressFormat, iIntValue, hlsVar);
                    hlsVar.close();
                    hlsVar.close();
                    return true;
                } catch (IOException unused) {
                    hlsVar = fileOutputStream;
                    z = 0;
                    z = 0;
                    if (hlsVar != null) {
                        hlsVar.close();
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    hlsVar = fileOutputStream;
                    if (hlsVar != null) {
                        try {
                            hlsVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused4) {
        }
    }

    @Override // defpackage.hlo
    public final int b() {
        return 2;
    }

    public hrd(hok hokVar) {
        this.c = hokVar;
    }
}
