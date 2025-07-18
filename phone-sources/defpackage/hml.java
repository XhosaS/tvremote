package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hml implements hmn {
    private static final String[] a = {"_data"};
    private final ContentResolver b;

    public hml(ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    @Override // defpackage.hmn
    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }
}
