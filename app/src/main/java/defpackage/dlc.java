package defpackage;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlc implements dld {
    @Override // defpackage.dld
    public final /* synthetic */ void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(new dlb((ByteBuffer) obj));
    }

    @Override // defpackage.dld
    public final /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(new dlb((ByteBuffer) obj));
    }
}
