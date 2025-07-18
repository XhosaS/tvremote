package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upw extends upy implements CancellationSignal.OnCancelListener {
    private final CancellationSignal b;

    public upw(upx upxVar) {
        super(upxVar);
        this.b = new CancellationSignal();
    }

    @Override // defpackage.upy
    protected final void c(upx upxVar) throws IOException {
        try {
            CancellationSignal cancellationSignal = this.b;
            cancellationSignal.setOnCancelListener(this);
            Cursor cursorA = upxVar.a(cancellationSignal);
            try {
                if (!(this.valueField instanceof zue) && cursorA != null) {
                    cursorA.getCount();
                }
                if (p(cursorA)) {
                    return;
                }
                udx.a(cursorA);
            } catch (Throwable th) {
                try {
                    q(th);
                    if (p(cursorA)) {
                        return;
                    }
                    udx.a(cursorA);
                } catch (Throwable th2) {
                    if (!p(cursorA)) {
                        udx.a(cursorA);
                    }
                    throw th2;
                }
            }
        } catch (OperationCanceledException unused) {
            super.cancel(true);
        }
    }

    @Override // defpackage.zum, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.cancel();
        return super.cancel(z);
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        super.cancel(true);
    }
}
