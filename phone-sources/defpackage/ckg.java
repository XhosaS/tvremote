package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ckg extends ckf {
    public ckg(InputConnection inputConnection, yjv yjvVar) {
        super(inputConnection, yjvVar);
    }

    @Override // defpackage.cke, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
