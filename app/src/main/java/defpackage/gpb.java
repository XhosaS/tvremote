package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gpb extends ContentObserver {
    private static final zdy d = zdy.h("com/google/android/apps/tvsearch/observers/DeviceProvisionObserver");
    public final ContentResolver a;
    public final Set b;
    public boolean c;
    private Optional e;

    public gpb(ContentResolver contentResolver) {
        super(new Handler(Looper.getMainLooper()));
        this.b = new HashSet();
        this.c = false;
        this.a = contentResolver;
        this.e = Optional.empty();
    }

    private static boolean b(ContentResolver contentResolver) {
        return Settings.Secure.getInt(contentResolver, "device_provisioned", 0) != 0;
    }

    public final boolean a() {
        if (this.e.isEmpty()) {
            this.e = Optional.of(Boolean.valueOf(b(this.a)));
        }
        return ((Boolean) this.e.get()).booleanValue();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        boolean zB = b(this.a);
        zdv zdvVar = (zdv) ((zdv) d.b()).q("com/google/android/apps/tvsearch/observers/DeviceProvisionObserver", "onChange", 56, "DeviceProvisionObserver.java");
        Boolean boolValueOf = Boolean.valueOf(zB);
        zdvVar.x("Device provision changed to %b", boolValueOf);
        this.e = Optional.of(boolValueOf);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            lyp lypVar = ((lxv) it.next()).a;
            lypVar.l.g("device provision");
            lypVar.f.W();
        }
    }
}
