package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dbp implements dbr {
    private static final String[] a = {"_data"};
    private final ContentResolver b;

    public dbp(ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    @Override // defpackage.dbr
    public final Cursor a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }
}
