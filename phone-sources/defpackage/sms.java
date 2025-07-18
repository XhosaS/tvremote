package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sms extends smt implements CancellationSignal.OnCancelListener {
    private final CancellationSignal b;

    public sms(uoo uooVar) {
        super(uooVar);
        this.b = new CancellationSignal();
    }

    @Override // defpackage.ufb, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.cancel();
        return super.cancel(z);
    }

    @Override // defpackage.smt
    protected final void f(uoo uooVar) throws IOException {
        try {
            CancellationSignal cancellationSignal = this.b;
            cancellationSignal.setOnCancelListener(this);
            Object obj = uooVar.a;
            Object obj2 = ((zft) ((sml) obj).d).a;
            synchronized (((smq) obj2).h) {
                int i = ((smq) obj2).k;
                if (i == 0) {
                    throw new CancellationException("database is closed");
                }
                sij.y(i > 0, "Refcount went negative!", i);
                ((smq) obj2).k++;
            }
            try {
                Cursor cursorRawQueryWithFactory = ((SQLiteDatabase) ((sml) obj).b).rawQueryWithFactory(new urn((Object[]) uooVar.b, 1), (String) uooVar.c, null, null, cancellationSignal);
                try {
                    if (!isCancelled() && cursorRawQueryWithFactory != null) {
                        cursorRawQueryWithFactory.getCount();
                    }
                    if (b(cursorRawQueryWithFactory)) {
                        return;
                    }
                    sip.a(cursorRawQueryWithFactory);
                } catch (Throwable th) {
                    try {
                        e(th);
                        if (b(cursorRawQueryWithFactory)) {
                            return;
                        }
                        sip.a(cursorRawQueryWithFactory);
                    } catch (Throwable th2) {
                        if (b(cursorRawQueryWithFactory)) {
                            throw th2;
                        }
                        sip.a(cursorRawQueryWithFactory);
                        throw th2;
                    }
                }
            } finally {
                ((zft) ((sml) uooVar.a).d).p();
            }
        } catch (OperationCanceledException unused) {
            super.cancel(true);
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        super.cancel(true);
    }
}
