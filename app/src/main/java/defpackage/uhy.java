package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhy implements uhv {
    private static boolean c = false;
    private final Context e;
    private final uft f;
    private volatile boolean g = false;
    private zzy h = null;
    public static final byte[] a = new byte[0];
    private static final Object d = new Object();
    public static final uft b = new uft(new ConcurrentHashMap());

    public uhy(Context context, uft uftVar) {
        this.e = context;
        this.f = uftVar;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, zzy] */
    @Override // defpackage.uhv
    public final InputStream a(Uri uri, final InputStream inputStream) throws GeneralSecurityException, IOException {
        ufk ufkVarB = ufm.b(uri);
        g();
        try {
            List list = ufkVarB.b;
            if (DesugarCollections.unmodifiableList(list).isEmpty()) {
                return this.h.a(inputStream, a);
            }
            ufl uflVar = (ufl) DesugarCollections.unmodifiableList(list).get(0);
            String str = uflVar.a;
            if (Objects.equals(str, "aes_gcm_key")) {
                final byte[] bArrDecode = Base64.decode(uflVar.b, 2);
                return new uge(new Callable() { // from class: uhx
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws IOException {
                        byte[] bArr = uhy.a;
                        byte[] bArr2 = bArrDecode;
                        InputStream inputStream2 = inputStream;
                        try {
                            aafh aafhVar = new aafh(bArr2);
                            int i = zkn.a;
                            inputStream2.getClass();
                            return aafhVar.a(zkn.b(inputStream2, new ArrayDeque(20), 0), uhy.a);
                        } finally {
                            inputStream2.close();
                        }
                    }
                });
            }
            if (!Objects.equals(str, "aes_gcm_hkdf_key")) {
                throw new ufx(a.j(uflVar.a, "Unsupported decryption mode: "));
            }
            try {
                return zzl.a(zzk.a(Base64.decode(uflVar.b, 2))).c(aaep.a(), zzy.class).a(inputStream, a);
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to decrypt stream", e);
        }
    }

    @Override // defpackage.uhv
    public final OutputStream b(Uri uri, OutputStream outputStream) throws IOException {
        ufk ufkVarB = ufm.b(uri);
        g();
        try {
            List list = ufkVarB.b;
            if (!DesugarCollections.unmodifiableList(list).isEmpty()) {
                throw new ufx(a.j(((ufl) DesugarCollections.unmodifiableList(list).get(0)).a, "Unsupported encryption mode: "));
            }
            zzy zzyVar = this.h;
            return ((aaeq) zzyVar).a.b(outputStream, a);
        } catch (GeneralSecurityException e) {
            throw new IOException("Failed to encrypt stream", e);
        }
    }

    @Override // defpackage.uhv
    public final String c() {
        return "encrypt";
    }

    @Override // defpackage.uhv
    public final /* synthetic */ OutputStream d(OutputStream outputStream) {
        return uhu.a(this, outputStream);
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, zzy] */
    public final void g() {
        if (this.g) {
            return;
        }
        synchronized (d) {
            if (!this.g) {
                try {
                    Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
                    int i = yyk.e;
                    yyf yyfVar = new yyf(4);
                    Context context = this.e;
                    builderPath.path(uek.b(context).getAbsolutePath());
                    builderPath.appendPath("mobstore_encrypt");
                    Closeable closeable = (Closeable) new ueg(Arrays.asList(new ufc(this.f))).c(uez.a(builderPath, yyfVar), new uhe(false, false));
                    try {
                        if (!c) {
                            aaem.a();
                            c = true;
                        }
                        aaag aaagVar = new aaag();
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            throw new IllegalArgumentException("need an Android context");
                        }
                        aaagVar.a = applicationContext;
                        aaagVar.b = "aes128_gcm_hkdf_4kb";
                        aaagVar.c = "mobstore_encrypt";
                        aabs aabsVar = aady.a;
                        aaagVar.e = (zzp) aaci.a(new aach() { // from class: aadx
                            @Override // defpackage.aach
                            public final Object a() {
                                aabs aabsVar2 = aady.a;
                                return new zzp(aadz.a(16, 16, aaea.b, 4096));
                            }
                        });
                        aaagVar.d = "android-keystore://mobstore_encrypt";
                        this.h = aaagVar.a().a().c(aaep.a(), zzy.class);
                        if (closeable != null) {
                            closeable.close();
                        }
                        this.g = true;
                    } catch (Throwable th) {
                        if (closeable != null) {
                            try {
                                closeable.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (GeneralSecurityException e) {
                    throw new IOException("Failed to initialize encryption", e);
                }
            }
        }
    }

    @Override // defpackage.uhv
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.uhv
    public final /* synthetic */ void f() {
    }
}
