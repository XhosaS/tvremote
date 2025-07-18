package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hlq extends hmg {
    public hlq(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.hlu
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.hmg
    protected final /* bridge */ /* synthetic */ Object b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.hmg
    protected final /* synthetic */ void c(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }
}
