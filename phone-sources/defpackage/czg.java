package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czg extends InputConnectionWrapper {
    final /* synthetic */ czh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czg(InputConnection inputConnection, czh czhVar) {
        super(inputConnection, false);
        this.a = czhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.os.ResultReceiver] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.ResultReceiver] */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        boolean z;
        ?? r5;
        czh czhVar = this.a;
        if (bundle != null) {
            ?? A = 0;
            A = 0;
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = true;
            }
            try {
                r5 = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            } catch (Throwable th) {
                th = th;
                r5 = 0;
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    A = czhVar.a(new cvw(uri, clipDescription, uri2), i, bundle2);
                }
                if (r5 != 0) {
                    r5.send(A, null);
                }
                if (A != 0) {
                    return true;
                }
            } catch (Throwable th2) {
                th = th2;
                if (r5 != 0) {
                    r5.send(0, null);
                }
                throw th;
            }
        }
        return super.performPrivateCommand(str, bundle);
    }
}
