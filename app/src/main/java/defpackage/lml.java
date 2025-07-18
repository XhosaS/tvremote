package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lml implements uhp {
    public final yrp a;
    private final uft b;

    public lml(Context context) {
        uft uftVar = new uft();
        this.a = new yrt(new lmy(context.getApplicationContext()));
        this.b = uftVar;
    }

    private final ParcelFileDescriptor o(final Uri uri, final int i) {
        return (ParcelFileDescriptor) p("open file", new Callable() { // from class: lmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((OpenFileDescriptorResponse) lvq.d(((lmy) ((yrt) this.a.a).a).b(uri, i))).a;
            }
        });
    }

    private final Object p(String str, Callable callable) throws IOException {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Unable to ".concat(str), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof kej) {
                Status status = ((kej) cause).a;
                String str2 = status.g;
                int i = status.f;
                if (i == 33500) {
                    throw new FileNotFoundException(a.s(str2, str, "Unable to ", " because "));
                }
                if (i == 10 && !TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
                    throw new FileNotFoundException(a.s(str2, str, "Unable to ", " because "));
                }
            }
            throw new IOException("Unable to ".concat(str), e2);
        } catch (Exception e3) {
            throw new IOException("Unable to ".concat(str), e3);
        }
    }

    @Override // defpackage.uhp
    public final /* synthetic */ long a(Uri uri) {
        return uho.f(this);
    }

    @Override // defpackage.uhp
    public final uft b() {
        return this.b;
    }

    @Override // defpackage.uhp
    public final /* synthetic */ File c(Uri uri) {
        return uho.b(this, uri);
    }

    @Override // defpackage.uhp
    public final InputStream d(Uri uri) {
        return new lmj(o(uri, 0));
    }

    @Override // defpackage.uhp
    public final /* synthetic */ OutputStream e(Uri uri) {
        return uho.g(this);
    }

    @Override // defpackage.uhp
    public final OutputStream f(Uri uri) {
        return new lmk(o(uri, 1));
    }

    @Override // defpackage.uhp
    public final /* synthetic */ Iterable g(Uri uri) {
        return uho.c(this);
    }

    @Override // defpackage.uhp
    public final String h() {
        return "android";
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
    public final void k(final Uri uri) throws IOException {
        p("delete file", new Callable() { // from class: lmi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Void) lvq.d(((lmy) ((yrt) this.a.a).a).a(uri));
            }
        });
    }

    @Override // defpackage.uhp
    public final void l(final Uri uri, final Uri uri2) throws IOException {
        p("rename file", new Callable() { // from class: lmg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Void) lvq.d(((lmy) ((yrt) this.a.a).a).c(uri, uri2));
            }
        });
    }

    @Override // defpackage.uhp
    public final boolean m(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorO = o(uri, 0);
            if (parcelFileDescriptorO == null) {
                return true;
            }
            parcelFileDescriptorO.close();
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.uhp
    public final /* synthetic */ boolean n(Uri uri) throws ufx {
        throw new ufx("isDirectory not supported by android");
    }
}
