package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aje extends InputConnectionWrapper {
    public aje(ajf ajfVar) {
        super(ajfVar, false);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return true;
    }
}
