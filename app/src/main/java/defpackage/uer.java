package defpackage;

import android.app.blob.BlobStoreManager;
import android.os.ParcelFileDescriptor;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uer extends ParcelFileDescriptor.AutoCloseOutputStream {
    private final BlobStoreManager.Session a;
    private boolean b;

    public uer(ParcelFileDescriptor parcelFileDescriptor, BlobStoreManager.Session session) {
        super(parcelFileDescriptor);
        this.b = false;
        this.a = session;
    }

    private final void a() throws IOException {
        int iIntValue;
        Throwable th = null;
        if (this.b) {
            iIntValue = 0;
        } else {
            this.b = true;
            try {
                final CompletableFuture completableFuture = new CompletableFuture();
                this.a.commit(zwk.a, new Consumer() { // from class: ueq
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        completableFuture.complete((Integer) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                iIntValue = ((Integer) completableFuture.get()).intValue();
            } catch (InterruptedException | RuntimeException | ExecutionException e) {
                th = e;
                iIntValue = -1;
            }
        }
        BlobStoreManager.Session session = this.a;
        if (iIntValue == 0) {
            if (session != null) {
                session.close();
            }
        } else {
            try {
                throw new IOException("Commit operation failed", th);
            } catch (Throwable th2) {
                if (session != null) {
                    try {
                        session.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // android.os.ParcelFileDescriptor.AutoCloseOutputStream, java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            super.close();
        } finally {
            a();
        }
    }
}
