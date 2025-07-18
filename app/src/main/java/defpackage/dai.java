package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dai {
    public static int a(List list, InputStream inputStream, ddx ddxVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new dkq(inputStream, ddxVar);
        }
        inputStream.mark(5242880);
        return b(list, new daa(inputStream, ddxVar));
    }

    public static int b(List list, dag dagVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = dagVar.a((czv) list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType c(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser$ImageType.UNKNOWN : e(list, new czx(byteBuffer));
    }

    public static ImageHeaderParser$ImageType d(List list, InputStream inputStream, ddx ddxVar) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new dkq(inputStream, ddxVar);
        }
        inputStream.mark(5242880);
        return e(list, new czw(inputStream));
    }

    public static ImageHeaderParser$ImageType e(List list, dah dahVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = dahVar.a((czv) list.get(i));
            if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                return imageHeaderParser$ImageTypeA;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static boolean f(List list, daf dafVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (dafVar.a((czv) list.get(i))) {
                return true;
            }
        }
        return false;
    }
}
