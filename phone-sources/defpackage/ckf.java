package defpackage;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ckf extends cke {
    public ckf(InputConnection inputConnection, yjv yjvVar) {
        super(inputConnection, yjvVar);
    }

    @Override // defpackage.cke
    protected final void a(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // defpackage.cke, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        InputConnection inputConnection = this.a;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // defpackage.cke, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}
