package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyx implements gyy {
    private final /* synthetic */ int a;

    public gyx(int i) {
        this.a = i;
    }

    private static final boolean b(int i, Context context) {
        return context.getResources().getResourceEntryName(i) != null;
    }

    @Override // defpackage.gyy
    public final /* synthetic */ Object a(Object obj, gzy gzyVar) throws PackageManager.NameNotFoundException {
        String scheme;
        String str;
        String authority;
        int i = this.a;
        if (i == 0) {
            Uri uri = (Uri) obj;
            uri.getClass();
            if (!hat.d(uri) && ((scheme = uri.getScheme()) == null || yks.e(scheme, "file"))) {
                String path = uri.getPath();
                str = path != null ? path : "";
                if (str.length() > 0 && ykr.c(str.charAt(0), '/', false) && hat.b(uri) != null) {
                    String path2 = uri.getPath();
                    path2.getClass();
                    return new File(path2);
                }
            }
            return null;
        }
        if (i == 1) {
            byte[] bArr = (byte[]) obj;
            bArr.getClass();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.getClass();
            return byteBufferWrap;
        }
        if (i == 2) {
            zce zceVar = (zce) obj;
            zceVar.getClass();
            return zceVar.f;
        }
        if (i == 3) {
            int iIntValue = ((Number) obj).intValue();
            Context context = gzyVar.a;
            if (!b(iIntValue, context)) {
                return null;
            }
            return Uri.parse("android.resource://" + context.getPackageName() + "/" + iIntValue);
        }
        if (i != 4) {
            String str2 = (String) obj;
            str2.getClass();
            return Uri.parse(str2);
        }
        Uri uri2 = (Uri) obj;
        uri2.getClass();
        if (!yks.e(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || ylh.L(authority)) {
            return null;
        }
        List<String> pathSegments = uri2.getPathSegments();
        pathSegments.getClass();
        if (pathSegments.size() == 2) {
            String authority2 = uri2.getAuthority();
            str = authority2 != null ? authority2 : "";
            Resources resourcesForApplication = gzyVar.a.getPackageManager().getResourcesForApplication(str);
            resourcesForApplication.getClass();
            List<String> pathSegments2 = uri2.getPathSegments();
            pathSegments2.getClass();
            int identifier = resourcesForApplication.getIdentifier(pathSegments2.get(1), pathSegments2.get(0), str);
            if (identifier != 0) {
                return Uri.parse(a.cy(identifier, str, "android.resource://", "/"));
            }
            Objects.toString(uri2);
            throw new IllegalStateException("Invalid android.resource URI: ".concat(uri2.toString()));
        }
        return null;
    }
}
