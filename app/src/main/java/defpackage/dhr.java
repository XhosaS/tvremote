package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dhr implements dhe {
    private final dhe a;
    private final Resources b;

    public dhr(Resources resources, dhe dheVar) {
        this.b = resources;
        this.a = dheVar;
    }

    private final Uri c(Integer num) throws Resources.NotFoundException {
        try {
            return Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + "/" + num);
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Objects.toString(num);
            Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e);
            return null;
        }
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ dhd a(Object obj, int i, int i2, dan danVar) throws Resources.NotFoundException {
        Uri uriC = c((Integer) obj);
        if (uriC == null) {
            return null;
        }
        return this.a.a(uriC, i, i2, danVar);
    }

    @Override // defpackage.dhe
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
