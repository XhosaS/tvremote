package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qan {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = a;
            cArr[i] = cArr2[(b & 255) >>> 4];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public static String b(ueg uegVar, Uri uri) throws IOException {
        String strA;
        try {
            InputStream inputStream = (InputStream) uegVar.c(uri, new uhi());
            try {
                MessageDigest messageDigestD = d();
                if (messageDigestD == null) {
                    strA = "";
                } else {
                    byte[] bArr = new byte[8192];
                    for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                        messageDigestD.update(bArr, 0, i);
                    }
                    strA = a(messageDigestD.digest());
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return strA;
            } finally {
            }
        } catch (IOException unused) {
            qce.d("%s: Failed to open file, uri = %s", "FileValidator", uri);
            return "";
        }
    }

    public static void c(ueg uegVar, phu phuVar, Uri uri, String str) throws phc {
        long jA;
        try {
            if (!uegVar.h(uri)) {
                qce.e("%s: Downloaded file %s is not present at %s", "FileValidator", qeg.e(phuVar), uri);
                pha phaVarA = phc.a();
                phaVarA.a = phb.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                throw phaVarA.a();
            }
            int iA = pht.a(phuVar.f);
            if (iA != 0 && iA == 2) {
                return;
            }
            if (b(uegVar, uri).equals(str)) {
                return;
            }
            try {
                jA = uegVar.a(uri);
            } catch (IOException unused) {
                jA = -1;
            }
            qce.e("%s: Downloaded file at uri = %s, checksum = %s, size = %s verification failed", "FileValidator", uri, str, Long.valueOf(jA));
            pha phaVarA2 = phc.a();
            phaVarA2.a = phb.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            throw phaVarA2.a();
        } catch (IOException e) {
            qce.g(e, "%s: Failed to validate download file %s", "FileValidator", qeg.e(phuVar));
            pha phaVarA3 = phc.a();
            phaVarA3.a = phb.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            phaVarA3.c = e;
            throw phaVarA3.a();
        }
    }

    public static MessageDigest d() throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (messageDigest != null) {
                return messageDigest;
            }
            return null;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
