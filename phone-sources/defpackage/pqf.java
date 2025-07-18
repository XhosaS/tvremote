package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pqf implements cik {
    public static final pqf a = new pqf();
    public static final Paint b = new Paint();
    private static final Map c = new LinkedHashMap();

    private pqf() {
    }

    public static final File c(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // defpackage.cik
    public final Typeface a(Context context, cil cilVar) {
        context.getClass();
        cilVar.getClass();
        Objects.toString(cilVar);
        throw new IllegalStateException("GoogleFont only support async loading: ".concat(cilVar.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.cik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r19, defpackage.cil r20, defpackage.yih r21) throws android.content.res.Resources.NotFoundException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqf.b(android.content.Context, cil, yih):java.lang.Object");
    }
}
