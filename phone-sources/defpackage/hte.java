package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hte implements hln {
    public static final hlk a = new hlk("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, hlk.a);
    private final Context b;

    public hte(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.hln
    public final /* bridge */ /* synthetic */ hnv a(Object obj, int i, int i2, hll hllVar) {
        return c((Uri) obj, hllVar);
    }

    @Override // defpackage.hln
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hll hllVar) {
        String scheme = ((Uri) obj).getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final hnv c(Uri uri, hll hllVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException(a.cw(uri, "Package name for ", " is null or empty"));
        }
        Context contextCreatePackageContext = this.b;
        if (!authority.equals(contextCreatePackageContext.getPackageName())) {
            try {
                contextCreatePackageContext = contextCreatePackageContext.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                Context context = this.b;
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e2);
            }
        }
        hju.p(authority);
        Context context2 = this.b;
        Resources.Theme theme = authority.equals(context2.getPackageName()) ? (Resources.Theme) hllVar.b(a) : null;
        return htd.g(theme == null ? hta.a(context2, contextCreatePackageContext, identifier, null) : hta.a(context2, context2, identifier, theme));
    }
}
