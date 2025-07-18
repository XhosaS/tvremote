package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dbq implements daw {
    private final Uri a;
    private final dbs b;
    private InputStream c;

    public dbq(Uri uri, dbs dbsVar) {
        this.a = uri;
        this.b = dbsVar;
    }

    public static dbq b(Context context, Uri uri, dbr dbrVar) {
        return new dbq(uri, new dbs(cyg.a(context).c.a().a(), dbrVar, cyg.a(context).d, context.getContentResolver()));
    }

    @Override // defpackage.daw
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.daw
    public final void d() throws IOException {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: FileNotFoundException -> 0x00e5, PHI: r5
  0x0025: PHI (r5v10 android.database.Cursor) = (r5v3 android.database.Cursor), (r5v12 android.database.Cursor) binds: [B:23:0x003f, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {FileNotFoundException -> 0x00e5, blocks: (B:3:0x0005, B:10:0x001d, B:25:0x0042, B:40:0x0096, B:61:0x00d1, B:62:0x00d7, B:58:0x00cd, B:28:0x004a, B:30:0x0055, B:32:0x005f, B:33:0x0063, B:36:0x006b, B:37:0x0092, B:14:0x0025, B:67:0x00e1, B:68:0x00e4, B:41:0x009a, B:50:0x00b3, B:52:0x00b9), top: B:80:0x0005, inners: #6, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[Catch: FileNotFoundException -> 0x00e5, TryCatch #1 {FileNotFoundException -> 0x00e5, blocks: (B:3:0x0005, B:10:0x001d, B:25:0x0042, B:40:0x0096, B:61:0x00d1, B:62:0x00d7, B:58:0x00cd, B:28:0x004a, B:30:0x0055, B:32:0x005f, B:33:0x0063, B:36:0x006b, B:37:0x0092, B:14:0x0025, B:67:0x00e1, B:68:0x00e4, B:41:0x009a, B:50:0x00b3, B:52:0x00b9), top: B:80:0x0005, inners: #6, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[Catch: FileNotFoundException -> 0x00e5, TRY_LEAVE, TryCatch #1 {FileNotFoundException -> 0x00e5, blocks: (B:3:0x0005, B:10:0x001d, B:25:0x0042, B:40:0x0096, B:61:0x00d1, B:62:0x00d7, B:58:0x00cd, B:28:0x004a, B:30:0x0055, B:32:0x005f, B:33:0x0063, B:36:0x006b, B:37:0x0092, B:14:0x0025, B:67:0x00e1, B:68:0x00e4, B:41:0x009a, B:50:0x00b3, B:52:0x00b9), top: B:80:0x0005, inners: #6, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d1 A[Catch: FileNotFoundException -> 0x00e5, TryCatch #1 {FileNotFoundException -> 0x00e5, blocks: (B:3:0x0005, B:10:0x001d, B:25:0x0042, B:40:0x0096, B:61:0x00d1, B:62:0x00d7, B:58:0x00cd, B:28:0x004a, B:30:0x0055, B:32:0x005f, B:33:0x0063, B:36:0x006b, B:37:0x0092, B:14:0x0025, B:67:0x00e1, B:68:0x00e4, B:41:0x009a, B:50:0x00b3, B:52:0x00b9), top: B:80:0x0005, inners: #6, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1 A[Catch: FileNotFoundException -> 0x00e5, TryCatch #1 {FileNotFoundException -> 0x00e5, blocks: (B:3:0x0005, B:10:0x001d, B:25:0x0042, B:40:0x0096, B:61:0x00d1, B:62:0x00d7, B:58:0x00cd, B:28:0x004a, B:30:0x0055, B:32:0x005f, B:33:0x0063, B:36:0x006b, B:37:0x0092, B:14:0x0025, B:67:0x00e1, B:68:0x00e4, B:41:0x009a, B:50:0x00b3, B:52:0x00b9), top: B:80:0x0005, inners: #6, #11 }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [dav] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // defpackage.daw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.cyn r11, defpackage.dav r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbq.f(cyn, dav):void");
    }

    @Override // defpackage.daw
    public final int g() {
        return 1;
    }

    @Override // defpackage.daw
    public final void cz() {
    }
}
