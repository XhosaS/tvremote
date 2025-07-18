package defpackage;

import android.os.ParcelFileDescriptor;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zyj implements zyl {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public zyj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.zyl
    public final FileChannel a() throws IOException {
        if (this.b != 0) {
            return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileInputStream((File) this.a).getChannel());
        }
        Object obj = this.a;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: ".concat(String.valueOf(String.valueOf(obj))));
    }
}
