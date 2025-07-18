package defpackage;

import android.app.blob.BlobHandle;
import android.app.blob.BlobStoreManager;
import android.content.Context;
import android.net.Uri;
import android.os.LimitExceededException;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ues implements uhp {
    private final BlobStoreManager a;

    public ues(Context context) {
        this.a = ms$$ExternalSyntheticApiModelOutline0.m154m(context.getSystemService("blob_store"));
    }

    private final ParcelFileDescriptor o(Uri uri) throws ufu {
        ueu.a(uri);
        ueu.b(uri);
        return this.a.openBlob(BlobHandle.createWithSha256(ueu.d(uri.getPath()), "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib"));
    }

    private final void p(byte[] bArr) throws IOException {
        try {
            this.a.releaseLease(BlobHandle.createWithSha256(bArr, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib"));
        } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
            throw new IOException("Failed to release the lease", e);
        }
    }

    @Override // defpackage.uhp
    public final /* synthetic */ long a(Uri uri) {
        return uho.f(this);
    }

    @Override // defpackage.uhp
    public final /* synthetic */ uft b() {
        return uho.a(this);
    }

    @Override // defpackage.uhp
    public final /* synthetic */ File c(Uri uri) {
        return uho.b(this, uri);
    }

    @Override // defpackage.uhp
    public final InputStream d(Uri uri) {
        return new ParcelFileDescriptor.AutoCloseInputStream(o(uri));
    }

    @Override // defpackage.uhp
    public final /* synthetic */ OutputStream e(Uri uri) {
        return uho.g(this);
    }

    @Override // defpackage.uhp
    public final OutputStream f(Uri uri) throws IOException {
        ueu.a(uri);
        ueu.b(uri);
        byte[] bArrD = ueu.d(uri.getPath());
        try {
            if (!uri.getPath().endsWith(".lease")) {
                BlobHandle blobHandleCreateWithSha256 = BlobHandle.createWithSha256(bArrD, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib");
                BlobStoreManager blobStoreManager = this.a;
                BlobStoreManager.Session sessionOpenSession = blobStoreManager.openSession(blobStoreManager.createSession(blobHandleCreateWithSha256));
                sessionOpenSession.allowPublicAccess();
                return new uer(sessionOpenSession.openWrite(0L, -1L), sessionOpenSession);
            }
            BlobStoreManager blobStoreManager2 = this.a;
            if (blobStoreManager2.getRemainingLeaseQuotaBytes() <= 0) {
                throw new ufo((byte[]) null);
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            String query = uri.getQuery();
            if (TextUtils.isEmpty(query)) {
                throw new ufu(String.format("The uri query is null or empty, expected %s", "expiryDateSecs=<expiryDateSecs>"));
            }
            String queryParameter = uri.getQueryParameter("expiryDateSecs");
            if (queryParameter == null) {
                throw new ufu(String.format("The uri query is malformed, expected %s but found %s", "expiryDateSecs=<expiryDateSecs>", query));
            }
            blobStoreManager2.acquireLease(BlobHandle.createWithSha256(bArrD, "The file is shared to provide a better user experience", 0L, "File downloaded through MDDLib"), "String description needed for providing a better user experience", timeUnit.toMillis(Long.parseLong(queryParameter)));
            return null;
        } catch (LimitExceededException e) {
            throw new ufo(e);
        } catch (IllegalStateException e2) {
            throw new IOException("Failed to write into BlobStoreManager", e2);
        }
    }

    @Override // defpackage.uhp
    public final /* synthetic */ Iterable g(Uri uri) {
        return uho.c(this);
    }

    @Override // defpackage.uhp
    public final String h() {
        return "blobstore";
    }

    @Override // defpackage.uhp
    public final /* synthetic */ void i(Uri uri) {
        uho.d(this);
    }

    @Override // defpackage.uhp
    public final /* synthetic */ void j(Uri uri) {
        uho.e(this);
    }

    @Override // defpackage.uhp
    public final void k(Uri uri) throws IOException {
        ueu.a(uri);
        ueu.b(uri);
        if (!ueu.c(uri.getPath())) {
            p(ueu.d(uri.getPath()));
            return;
        }
        Iterator it = this.a.getLeasedBlobs().iterator();
        while (it.hasNext()) {
            p(ms$$ExternalSyntheticApiModelOutline0.m153m(it.next()).getSha256Digest());
        }
    }

    @Override // defpackage.uhp
    public final /* synthetic */ void l(Uri uri, Uri uri2) {
        uho.h(this);
    }

    @Override // defpackage.uhp
    public final boolean m(Uri uri) throws IOException {
        boolean z = false;
        try {
            ParcelFileDescriptor parcelFileDescriptorO = o(uri);
            if (parcelFileDescriptorO != null) {
                try {
                    if (parcelFileDescriptorO.getFileDescriptor().valid()) {
                        z = true;
                    }
                } finally {
                }
            }
            if (parcelFileDescriptorO != null) {
                parcelFileDescriptorO.close();
            }
        } catch (SecurityException unused) {
        }
        return z;
    }

    @Override // defpackage.uhp
    public final boolean n(Uri uri) {
        return false;
    }
}
