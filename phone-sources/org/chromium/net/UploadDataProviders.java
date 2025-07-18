package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.vxr;
import defpackage.zyj;
import defpackage.zyk;
import defpackage.zym;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new zym(new zyj(parcelFileDescriptor, 0));
    }

    public static UploadDataProvider create(File file) {
        return new zym(new zyj(file, 1));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new zyk(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return vxr.aM(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return vxr.aM(bArr, i, i2);
    }
}
