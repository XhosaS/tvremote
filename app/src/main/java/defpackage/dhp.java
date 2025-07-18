package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dhp implements dhf {
    private final Resources a;

    public dhp(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        return new dhr(this.a, dhnVar.a(Uri.class, InputStream.class));
    }
}
