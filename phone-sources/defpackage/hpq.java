package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpq implements hqf {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public hpq(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Uri c(Integer num) throws Resources.NotFoundException {
        try {
            return Uri.parse("android.resource://" + ((Resources) this.b).getResourcePackageName(num.intValue()) + "/" + num);
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Objects.toString(num);
            Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e);
            return null;
        }
    }

    @Override // defpackage.hqf
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            Uri uri = (Uri) obj;
            return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
        }
        if (i != 2) {
            Uri uri2 = (Uri) obj;
            return "android.resource".equals(uri2.getScheme()) && ((Context) this.b).getPackageName().equals(uri2.getAuthority());
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [hqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [hpp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [hqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17, types: [hqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [hpe, java.lang.Object] */
    @Override // defpackage.hqf
    public final /* synthetic */ cvi e(Object obj, int i, int i2, hll hllVar) throws Resources.NotFoundException, NumberFormatException {
        int i3 = this.a;
        if (i3 == 0) {
            Integer num = (Integer) obj;
            Resources.Theme theme = (Resources.Theme) hllVar.b(hte.a);
            return new cvi(new hwa(num), new hpo(theme, theme != null ? theme.getResources() : ((Context) this.b).getResources(), this.c, num.intValue()));
        }
        if (i3 == 1) {
            Uri uri = (Uri) obj;
            return new cvi(new hwa(uri), this.c.a((AssetManager) this.b, uri.toString().substring(22)));
        }
        if (i3 == 2) {
            Uri uriC = c((Integer) obj);
            if (uriC == null) {
                return null;
            }
            return this.c.e(uriC, i, i2, hllVar);
        }
        Uri uri2 = (Uri) obj;
        List<String> pathSegments = uri2.getPathSegments();
        if (pathSegments.size() == 1) {
            try {
                int i4 = Integer.parseInt(uri2.getPathSegments().get(0));
                if (i4 != 0) {
                    return this.c.e(Integer.valueOf(i4), i, i2, hllVar);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", a.ct(uri2, "Failed to parse a valid non-0 resource id from: "));
                }
                return null;
            } catch (NumberFormatException e) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: ".concat(String.valueOf(String.valueOf(uri2))), e);
                }
                return null;
            }
        }
        if (pathSegments.size() != 2) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource uri: ".concat(String.valueOf(String.valueOf(uri2))));
            }
            return null;
        }
        List<String> pathSegments2 = uri2.getPathSegments();
        String str = pathSegments2.get(0);
        String str2 = pathSegments2.get(1);
        Context context = (Context) this.b;
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return this.c.e(Integer.valueOf(identifier), i, i2, hllVar);
        }
        if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri2))));
        }
        return null;
    }

    public hpq(Context context, hpp hppVar, int i) {
        this.a = i;
        this.b = context.getApplicationContext();
        this.c = hppVar;
    }

    public hpq(Context context, hqf hqfVar, int i) {
        this.a = i;
        this.b = context.getApplicationContext();
        this.c = hqfVar;
    }
}
