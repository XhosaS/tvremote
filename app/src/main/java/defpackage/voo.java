package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class voo {
    private final wmz a;

    public voo(wmz wmzVar) {
        this.a = wmzVar;
    }

    public final Uri a() {
        wmz wmzVar = this.a;
        wna wnaVar = wmzVar.a;
        int i = ((wmx) wnaVar).a;
        wmy wmyVar = wmzVar.b;
        File fileB = wmyVar.b(1, i);
        String str = wmzVar.c;
        new File(fileB, str).getParentFile().mkdirs();
        return wmyVar.c(wnaVar, str);
    }
}
