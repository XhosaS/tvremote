package defpackage;

import android.app.slice.SliceManager;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public class brc extends brb {
    public final SliceManager a;

    public brc(Context context) {
        this.a = jj$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(jj$$ExternalSyntheticApiModelOutline0.m131m()));
    }

    @Override // defpackage.brb
    public final void a(Uri uri) {
        this.a.grantSlicePermission("com.android.tv.settings", uri);
    }
}
