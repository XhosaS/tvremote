package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ResourceLoaderConfig;
import j$.util.Optional;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tny {
    public final Context a;
    public final tmi b;
    public final Optional c;

    public tny(Context context, tmi tmiVar, Optional optional) {
        context.getClass();
        tmiVar.getClass();
        this.a = context;
        this.b = tmiVar;
        this.c = optional;
    }

    public final ResourceLoaderConfig a() {
        agug agugVar = new agug(new agui(new File(b())));
        while (true) {
            boolean z = true;
            while (agugVar.hasNext()) {
                File file = (File) agugVar.next();
                if (!file.delete() && file.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            Context context = this.a;
            return new ResourceLoaderConfig(Integer.valueOf((int) afec.c(context)), Integer.valueOf((int) afec.b(context)), null, null, null, null, null, null, null, null, null);
        }
    }

    public final String b() {
        return this.a.getFilesDir().getAbsolutePath() + File.separator + "xuikit" + File.separator;
    }
}
