package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.MediaFormat;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecm {
    private ecm() {
    }

    public static ImmutableList a(tsl tslVar, List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = (Bundle) list.get(i);
            bundle.getClass();
            builder.add((ImmutableList.Builder) tslVar.apply(bundle));
        }
        return builder.build();
    }

    public static ArrayList b(Collection collection, tsl tslVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) tslVar.apply(it.next()));
        }
        return arrayList;
    }

    public static void c(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void d(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(a.cf(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void e(ees eesVar) {
        if (eesVar != null) {
            try {
                eesVar.d();
            } catch (IOException unused) {
            }
        }
    }

    public static Bitmap f(byte[] bArr, int i, int i2) throws IOException {
        BitmapFactory.Options options;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                int i3 = options.inSampleSize;
                options.inSampleSize = i3 + i3;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw new eaf("Could not decode image data", new IllegalStateException(), true, 1);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            dhw dhwVar = new dhw(byteArrayInputStream);
            byteArrayInputStream.close();
            int iA = dhwVar.a();
            if (iA == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(iA);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } finally {
        }
    }
}
