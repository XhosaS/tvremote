package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.util.SparseArray;
import j$.nio.channels.DesugarChannels;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sio {
    public static NumberFormat a;
    public static SparseArray b;
    private static sio c;

    public static void a(ByteBuffer byteBuffer, String str) {
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new RandomAccessFile(str, "rw").getChannel());
        try {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary.write(byteBuffer);
            byteBuffer.position(0);
        } finally {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
        }
    }

    public static sir b() {
        if ((Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT > 33) && Build.VERSION.SDK_INT < 34) {
            return null;
        }
        return srx.a;
    }

    public static void c() {
        if (c == null) {
            c = new sio();
        }
    }

    public static String d(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static Context e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }
}
