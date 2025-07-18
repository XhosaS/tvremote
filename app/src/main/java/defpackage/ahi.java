package defpackage;

import android.view.ContentInfo;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahi {
    public static afv a(View view, afv afvVar) {
        ContentInfo contentInfoD = afvVar.a.d();
        contentInfoD.getClass();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoD);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoD ? afvVar : new afv(new afs(contentInfoPerformReceiveContent));
    }

    public static String[] b(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
