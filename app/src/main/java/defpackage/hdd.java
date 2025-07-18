package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdd implements usc {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/providers/slice/AssistantSearchableAppsDataProvider");
    public final hda a;
    private final hdr c;
    private final Context d;
    private final ahbt e;
    private final PackageManager f;

    public hdd(hda hdaVar, hdr hdrVar, Context context, ahbt ahbtVar, PackageManager packageManager) {
        hdaVar.getClass();
        hdrVar.getClass();
        context.getClass();
        ahbtVar.getClass();
        this.a = hdaVar;
        this.c = hdrVar;
        this.d = context;
        this.e = ahbtVar;
        this.f = packageManager;
    }

    @Override // defpackage.usc
    public final Slice a(Uri uri) throws PackageManager.NameNotFoundException {
        Drawable drawable;
        cxf cxfVar = new cxf(uri);
        List listB = this.a.b();
        if (listB.isEmpty()) {
            cxfVar.a.c();
            return cxfVar.d();
        }
        Context context = this.d;
        cxe cxeVar = new cxe();
        cxeVar.e = context.getString(R.string.title_searchable_apps);
        cxeVar.d = 303247360;
        cxfVar.a.b(cxeVar, "TYPE_PREFERENCE_SCREEN_TITLE");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (!((hcz) obj).c) {
                arrayList.add(obj);
            }
        }
        int iB = agrj.b(agqq.i(arrayList, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((hcz) obj2).a, obj2);
        }
        for (hcz hczVar : agqq.w(linkedHashMap.values(), new hdb())) {
            String str = hczVar.a;
            Intent intent = new Intent("ACTION_SEARCHABLE_APPS_CHANGED");
            ComponentName componentName = irm.a;
            Intent data = intent.setComponent(irm.d).putExtra("display_id", uri.getLastPathSegment()).setData(uri.buildUpon().appendQueryParameter("package_name", str).build());
            data.getClass();
            PendingIntent pendingIntentB = tpf.b(context, data, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0, 5);
            boolean z = hczVar.b;
            cxe cxeVar2 = new cxe();
            cxeVar2.p = str;
            cxeVar2.e = hczVar.d;
            cxeVar2.a(pendingIntentB, "", z);
            try {
                int i = hczVar.e;
                Resources resourcesForApplication = this.f.getResourcesForApplication(str);
                resourcesForApplication.getClass();
                if (i != 0 && (drawable = resourcesForApplication.getDrawable(i)) != null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmapCreateBitmap.getClass();
                    cxeVar2.a = IconCompat.d(bitmapCreateBitmap);
                }
            } catch (PackageManager.NameNotFoundException e) {
                ((zdv) ((zdv) b.d()).p(e).q("com/google/android/apps/tvsearch/providers/slice/AssistantSearchableAppsDataProvider", "getSourceRow", 107, "AssistantSearchableAppsDataProvider.kt")).x("App icon for %s was not found.", hczVar.d);
            }
            if (this.c.k()) {
                Context context2 = this.d;
                cxeVar2.g = context2.getString(R.string.shared_settings_info_title_text);
                cxeVar2.h = context2.getString(R.string.shared_settings_info_summary_text);
                cxeVar2.i = IconCompat.e(context2, R.drawable.quantum_ic_info_outline_white_18);
            }
            cxfVar.a.b(cxeVar2, "TYPE_PREFERENCE");
        }
        return cxfVar.d();
    }

    @Override // defpackage.usc
    public final void b(Uri uri) {
        ahal.e(this.e, null, 0, new hdc(this, uri, null), 3);
    }

    @Override // defpackage.usc
    public final void c(Uri uri) {
        this.a.c();
    }
}
