package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czf extends InputConnectionWrapper {
    final /* synthetic */ czh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czf(InputConnection inputConnection, czh czhVar) {
        super(inputConnection, false);
        this.a = czhVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        cvw cvwVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            cvwVar = new cvw(new czj(inputContentInfo));
        }
        if (this.a.a(cvwVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
