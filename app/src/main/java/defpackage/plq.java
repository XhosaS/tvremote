package defpackage;

import org.chromium.net.NetworkException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class plq implements plx {
    static final yyr a;

    static {
        yyn yynVar = new yyn(4);
        yynVar.c(-2, phb.ANDROID_DOWNLOADER_UNKNOWN);
        yynVar.c(-9, phb.ANDROID_DOWNLOADER_UNKNOWN);
        yynVar.c(-11, phb.ANDROID_DOWNLOADER_UNKNOWN);
        yynVar.c(-3, phb.ANDROID_DOWNLOADER_CANCELED);
        yynVar.c(-4, phb.ANDROID_DOWNLOADER_INVALID_REQUEST);
        yynVar.c(-300, phb.ANDROID_DOWNLOADER_INVALID_REQUEST);
        yynVar.c(-301, phb.ANDROID_DOWNLOADER_INVALID_REQUEST);
        yynVar.c(-302, phb.ANDROID_DOWNLOADER_INVALID_REQUEST);
        yynVar.c(-5, phb.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR);
        yynVar.c(-6, phb.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR);
        yynVar.c(-10, phb.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR);
        yynVar.c(-312, phb.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR);
        yynVar.c(-15, phb.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        yynVar.c(-21, phb.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        yynVar.c(-23, phb.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        yynVar.c(-100, phb.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        yynVar.c(-101, phb.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        yynVar.c(-102, phb.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        yynVar.c(-103, phb.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        yynVar.c(-104, phb.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        yynVar.c(-105, phb.ANDROID_DOWNLOADER_NETWORK_IO_ERROR);
        yynVar.c(-7, phb.ANDROID_DOWNLOADER_REQUEST_ERROR);
        yynVar.c(-27, phb.ANDROID_DOWNLOADER_REQUEST_ERROR);
        yynVar.c(-328, phb.ANDROID_DOWNLOADER_REQUEST_ERROR);
        yynVar.c(-303, phb.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        yynVar.c(-310, phb.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        yynVar.c(-311, phb.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        yynVar.c(-320, phb.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        yynVar.c(-321, phb.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        yynVar.c(-322, phb.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR);
        a = yynVar.a(true);
    }

    @Override // defpackage.plx
    public final phb a(Throwable th) {
        if (th instanceof NetworkException) {
            return phb.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
        }
        if (!(th instanceof jvb)) {
            return phb.UNKNOWN_ERROR;
        }
        return (phb) a.getOrDefault(Integer.valueOf(((jsx) ((jvb) th).a).a), phb.UNKNOWN_ERROR);
    }
}
