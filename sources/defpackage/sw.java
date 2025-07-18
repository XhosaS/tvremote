package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sw extends InputConnectionWrapper {
    final /* synthetic */ byj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(InputConnection inputConnection, byj byjVar) {
        super(inputConnection, false);
        this.a = byjVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        asv asvVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            asvVar = new asv(new sy(inputContentInfo), (byte[]) null);
        }
        if (this.a.F(asvVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
