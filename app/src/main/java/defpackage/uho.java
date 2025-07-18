package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class uho {
    public static uft a(uhp uhpVar) throws ufx {
        throw new ufx("lockScope not supported by ".concat(uhpVar.h()));
    }

    public static File b(uhp uhpVar, Uri uri) throws ufx {
        throw new ufx("Cannot convert uri to file " + uhpVar.h() + " " + String.valueOf(uri));
    }

    public static Iterable c(uhp uhpVar) throws ufx {
        throw new ufx("children not supported by ".concat(uhpVar.h()));
    }

    public static void d(uhp uhpVar) {
        throw new ufx("createDirectory not supported by ".concat(uhpVar.h()));
    }

    public static void e(uhp uhpVar) {
        throw new ufx("deleteDirectory not supported by ".concat(uhpVar.h()));
    }

    public static long f(uhp uhpVar) throws ufx {
        throw new ufx("fileSize not supported by ".concat(uhpVar.h()));
    }

    public static OutputStream g(uhp uhpVar) throws ufx {
        throw new ufx("openForAppend not supported by ".concat(uhpVar.h()));
    }

    public static void h(uhp uhpVar) {
        throw new ufx("rename not supported by ".concat(uhpVar.h()));
    }
}
