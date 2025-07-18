package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dig implements dhf, dif {
    private final ContentResolver a;

    public dig(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.dif
    public final daw a(Uri uri) {
        return new dbm(this.a, uri);
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        return new dih(this);
    }
}
