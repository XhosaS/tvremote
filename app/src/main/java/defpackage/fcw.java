package defpackage;

import android.database.Cursor;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcw implements agux {
    public static final fcw a = new fcw();

    @Override // defpackage.agux
    public final /* synthetic */ Object a(Object obj) {
        Cursor cursor = ((vsx) obj).a;
        int columnIndex = cursor.getColumnIndex("cloud_device_id");
        int columnIndex2 = cursor.getColumnIndex("cast_creds");
        String strA = "";
        if (columnIndex < 0 || columnIndex2 < 0) {
            ((zdv) fcx.b.b().q("com/google/android/apps/tvsearch/cast/info/CastContentProviderAdapter$getCastIdAndCerts$3", "invoke-JfnmSAo", 41, "CastContentProviderAdapter.kt")).z("castId (index: %d) or certificate (index: %d) column does not exist.", columnIndex, columnIndex2);
            return new fcy("", "", "content_provider");
        }
        if (cursor.isNull(columnIndex) || cursor.isNull(columnIndex2)) {
            ((zdv) fcx.b.b().q("com/google/android/apps/tvsearch/cast/info/CastContentProviderAdapter$getCastIdAndCerts$3", "invoke-JfnmSAo", 51, "CastContentProviderAdapter.kt")).u("castId or certificate is null.");
            return new fcy("", "", "content_provider");
        }
        String strA2 = vsx.a(cursor, columnIndex);
        fcx fcxVar = fcx.a;
        List listG = yrl.b(new ypz('|')).g(vsx.a(cursor, columnIndex2));
        listG.getClass();
        Object obj2 = listG.get(0);
        obj2.getClass();
        String str = (String) obj2;
        if (str.length() != 0) {
            try {
                byte[] bArrDecode = Base64.decode(str, 0);
                bArrDecode.getClass();
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                strA = fcz.a(new String(bArrDecode, charset));
            } catch (IllegalArgumentException e) {
                ((zdv) ((zdv) fcx.b.c()).p(e).q("com/google/android/apps/tvsearch/cast/info/CastContentProviderAdapter", "extractCertsFromCreds", 78, "CastContentProviderAdapter.kt")).u("extractCertsFromCreds: settings value has bad encoding");
            }
        }
        return new fcy(strA2, strA, "content_provider");
    }
}
