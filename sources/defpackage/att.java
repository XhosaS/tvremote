package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class att {
    private static att b;
    public final Object a;

    public att(Object obj) {
        this.a = obj;
    }

    public static att c() {
        if (b == null) {
            b = new att();
        }
        return b;
    }

    public final String a(Uri uri, String str, String str2) {
        mi miVar;
        if (uri != null) {
            miVar = (mi) ((mi) this.a).get(uri.toString());
        } else {
            miVar = null;
        }
        if (miVar == null) {
            return null;
        }
        if (str != null) {
            str2 = str.concat(str2);
        }
        return (String) miVar.get(str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [crv, java.lang.Object] */
    public final ayx b(float f) {
        Random random = (Random) this.a.a();
        random.getClass();
        return new ayx(random, f);
    }

    private att() {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), new bla(this));
    }

    public att(crv crvVar) {
        crvVar.getClass();
        this.a = crvVar;
    }

    public att(dlt dltVar, byte[][] bArr) {
        if (!dnx.j(bArr)) {
            if (bArr.length == dltVar.b) {
                for (byte[] bArr2 : bArr) {
                    if (bArr2.length != dltVar.a) {
                        throw new IllegalArgumentException("wrong publicKey format");
                    }
                }
                this.a = dnx.p(bArr);
                return;
            }
            throw new IllegalArgumentException("wrong publicKey size");
        }
        throw new NullPointerException("publicKey byte array == null");
    }
}
