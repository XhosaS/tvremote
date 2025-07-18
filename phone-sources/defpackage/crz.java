package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crz implements Iterable {
    public final ArrayList a = new ArrayList();
    public final Context b;

    public crz(Context context) {
        this.b = context;
    }

    public final void a() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.b.startActivities(intentArr, null);
    }

    public final void b(Intent intent) {
        this.a.add(intent);
    }

    public final void c(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.b.getPackageManager());
        }
        if (component != null) {
            d(component);
        }
        b(intent);
    }

    public final void d(ComponentName componentName) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        try {
            Context context = this.b;
            for (Intent intentE = crh.e(context, componentName); intentE != null; intentE = crh.e(context, intentE.getComponent())) {
                arrayList.add(size, intentE);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.a.iterator();
    }
}
