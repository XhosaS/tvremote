package defpackage;

import android.app.ApplicationErrorReport;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kmz {
    public String a;
    public final Bundle b;
    public String c;
    public String d;
    public final List e;
    public boolean f;
    public boolean g;
    public String h;

    @Deprecated
    public kmz() {
        this.b = new Bundle();
        this.e = new ArrayList();
        new ApplicationErrorReport();
        this.h = knf.a();
    }

    public final void a(String str, String str2) {
        Bundle bundle = this.b;
        if ((!bundle.isEmpty() || !this.e.isEmpty()) && !this.g) {
            throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
        }
        this.g = true;
        bundle.putString(str, str2);
    }

    public kmz(Context context) throws lxd {
        String strA;
        lxg.a = context.getContentResolver();
        this.b = new Bundle();
        this.e = new ArrayList();
        new ApplicationErrorReport();
        try {
            lxg lxgVar = kng.a;
            String str = lxgVar.b;
            ContentResolver contentResolver = lxg.a;
            String str2 = ((lxf) lxgVar).b;
            ((Boolean) ((lxf) lxgVar).c).booleanValue();
            boolean zB = lwy.b(contentResolver, str2, false);
            Boolean.valueOf(zB).getClass();
            if (zB) {
                strA = System.currentTimeMillis() + "_" + Math.abs(new SecureRandom().nextLong());
            } else {
                strA = knf.a();
            }
            this.h = strA;
        } catch (SecurityException unused) {
            this.h = knf.a();
        }
    }
}
