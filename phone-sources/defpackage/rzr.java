package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzr {
    public final String a;
    public final ttm b = new rzn(new rtb(this, 12));
    final ttm c;
    final ttm d;
    Resources e;
    public final /* synthetic */ nuh f;

    public rzr(nuh nuhVar, String str, ttm ttmVar) {
        this.f = nuhVar;
        this.a = str;
        this.c = new rzn(new rzo(this, nuhVar, str, 0));
        this.d = ttmVar;
    }

    public final Resources a() throws PackageManager.NameNotFoundException {
        Resources resources = this.e;
        if (resources != null) {
            return resources;
        }
        nuh nuhVar = this.f;
        Resources resourcesForApplication = ((PackageManager) nuhVar.c).getResourcesForApplication(this.a);
        this.e = resourcesForApplication;
        return resourcesForApplication;
    }
}
