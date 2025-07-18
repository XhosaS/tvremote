package defpackage;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qes {
    public static Uri a(Context context, Uri uri) throws IOException, ErrnoException {
        try {
            String str = Os.readlink(new uen(context, null).a(uri).getAbsolutePath());
            if (str == null) {
                throw new IOException("Unable to read symlink");
            }
            int i = uem.b;
            uel uelVar = new uel(context);
            uelVar.c(str, null);
            return uelVar.a();
        } catch (ErrnoException | ufu e) {
            throw new IOException("Unable to read symlink", e);
        }
    }

    public static void b(Context context, Uri uri, Uri uri2) throws IOException, ErrnoException {
        try {
            uen uenVar = new uen(context, null);
            Os.symlink(uenVar.a(uri2).getAbsolutePath(), uenVar.a(uri).getAbsolutePath());
        } catch (ErrnoException | ufu e) {
            throw new IOException("Unable to create symlink", e);
        }
    }
}
