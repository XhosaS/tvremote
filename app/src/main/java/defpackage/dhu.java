package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhu implements dhe {
    private final Context a;
    private final dhe b;

    public dhu(Context context, dhe dheVar) {
        this.a = context.getApplicationContext();
        this.b = dheVar;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) throws NumberFormatException {
        Uri uri = (Uri) obj;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            try {
                int i3 = Integer.parseInt(uri.getPathSegments().get(0));
                if (i3 != 0) {
                    return this.b.a(Integer.valueOf(i3), i, i2, danVar);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", a.p(uri, "Failed to parse a valid non-0 resource id from: "));
                }
                return null;
            } catch (NumberFormatException e) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: ".concat(String.valueOf(String.valueOf(uri))), e);
                }
                return null;
            }
        }
        if (pathSegments.size() != 2) {
            if (!Log.isLoggable("ResourceUriLoader", 5)) {
                return null;
            }
            Log.w("ResourceUriLoader", "Failed to parse resource uri: ".concat(String.valueOf(String.valueOf(uri))));
            return null;
        }
        List<String> pathSegments2 = uri.getPathSegments();
        String str = pathSegments2.get(0);
        String str2 = pathSegments2.get(1);
        Context context = this.a;
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return this.b.a(Integer.valueOf(identifier), i, i2, danVar);
        }
        if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
        }
        return null;
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "android.resource".equals(uri.getScheme()) && this.a.getPackageName().equals(uri.getAuthority());
    }
}
