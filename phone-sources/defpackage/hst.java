package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hst implements hsu {
    private final /* synthetic */ int a;

    public hst(int i) {
        this.a = i;
    }

    @Override // defpackage.hsu
    public final /* synthetic */ void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
        int i = this.a;
        if (i == 0) {
            mediaExtractor.setDataSource(new hss((ByteBuffer) obj));
        } else if (i != 1) {
            mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        } else {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @Override // defpackage.hsu
    public final /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        int i = this.a;
        if (i == 0) {
            mediaMetadataRetriever.setDataSource(new hss((ByteBuffer) obj));
        } else if (i != 1) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        } else {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }
}
