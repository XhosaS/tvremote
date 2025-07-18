package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.ahyf;
import defpackage.ahyg;
import defpackage.ahyh;
import defpackage.ahyj;
import defpackage.ahyk;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new ahyj(new ahyg(parcelFileDescriptor));
    }

    public static UploadDataProvider create(File file) {
        return new ahyj(new ahyf(file));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new ahyh(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return ahyk.a(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return ahyk.a(bArr, i, i2);
    }
}
