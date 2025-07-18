package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class did implements dhf, dif {
    private final ContentResolver a;

    public did(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.dif
    public final daw a(Uri uri) {
        return new das(this.a, uri);
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        return new dih(this);
    }
}
