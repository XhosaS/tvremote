package defpackage;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceProvider;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bre extends SliceProvider {
    private final brd a;

    public bre(brd brdVar, String[] strArr) {
        super(strArr);
        this.a = brdVar;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.a.attachInfo(context, providerInfo);
        super.attachInfo(context, providerInfo);
        jj$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(jj$$ExternalSyntheticApiModelOutline0.m131m()));
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        if ("androidx.remotecallback.method.PROVIDER_CALLBACK".equals(str)) {
            return null;
        }
        return super.call(str, str2, bundle);
    }

    public final Slice onBindSlice(Uri uri, Set set) {
        wg wgVar = new wg(0);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                SliceSpec sliceSpecM118m = jj$$ExternalSyntheticApiModelOutline0.m118m(it.next());
                wgVar.add(sliceSpecM118m == null ? null : new androidx.slice.SliceSpec(sliceSpecM118m.getType(), sliceSpecM118m.getRevision()));
            }
        }
        try {
            return bqy.a(this.a.b(uri));
        } catch (Exception e) {
            Log.wtf("SliceProviderWrapper", "Slice with URI " + uri.toString() + " is invalid.", e);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    public final PendingIntent onCreatePermissionRequest(Uri uri) {
        getCallingPackage();
        return super.onCreatePermissionRequest(uri);
    }

    public final Collection onGetSliceDescendants(Uri uri) {
        return this.a.c(uri);
    }

    public final Uri onMapIntentToUri(Intent intent) {
        throw new UnsupportedOperationException("This provider has not implemented intent to uri mapping");
    }

    public final void onSlicePinned(Uri uri) {
        brd brdVar = this.a;
        brdVar.e(uri);
        List listD = brdVar.d();
        if (listD.contains(uri)) {
            return;
        }
        listD.add(uri);
    }

    public final void onSliceUnpinned(Uri uri) {
        brd brdVar = this.a;
        brdVar.f(uri);
        List listD = brdVar.d();
        if (listD.contains(uri)) {
            listD.remove(uri);
        }
    }
}
