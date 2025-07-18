package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dho implements dhf {
    private final Resources a;

    public dho(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.dhf
    public final dhe b(dhn dhnVar) {
        return new dhr(this.a, dhnVar.a(Uri.class, AssetFileDescriptor.class));
    }
}
