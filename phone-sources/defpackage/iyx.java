package defpackage;

import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyx extends hvh {
    final /* synthetic */ File a;

    public iyx(File file) {
        this.a = file;
    }

    @Override // defpackage.hvm
    public final /* bridge */ /* synthetic */ void b(Object obj, hvv hvvVar) {
        File file = (File) obj;
        FileOutputStream fileOutputStream = new FileOutputStream(this.a);
        try {
            fileOutputStream.write(wef.t(file));
            wef.v(fileOutputStream, null);
        } finally {
        }
    }

    @Override // defpackage.hvm
    public final void a(Drawable drawable) {
    }
}
